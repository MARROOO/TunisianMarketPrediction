package tn.educanet.stockmarket.serviceimpl;

import java.io.IOException;

import java.util.List;

import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.quartz.QuartzJobBean;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;


import com.google.gson.Gson;

import tn.educanet.stockmarket.dao.AllMarketsDao;
import tn.educanet.stockmarket.persistence.AllIntradays;
import tn.educanet.stockmarket.persistence.AllLimits;
import tn.educanet.stockmarket.persistence.AllMarkets;
import tn.educanet.stockmarket.persistence.Intraday;
import tn.educanet.stockmarket.persistence.Limit;
import tn.educanet.stockmarket.persistence.Market;
import tn.educanet.stockmarket.service.AllIntradaysService;
import tn.educanet.stockmarket.service.AllMarketsService;
import tn.educanet.stockmarket.service.LimitService;

@Component
public class StockDataTask  extends QuartzJobBean {
	private CloseableHttpClient httpClient;
	@Autowired
	private  AllMarketsService allMarketsService;
	@Autowired
	private LimitService limitService;
	@Autowired
	private AllMarketsDao allMarketsDao;
	@Autowired
	private  AllIntradaysService allIntradaysService;
	
	public void setMarketsService(AllMarketsService allMarketsService) {
		this.allMarketsService= allMarketsService;
	}

	@Override
public void executeInternal(JobExecutionContext context) throws JobExecutionException {
SpringBeanAutowiringSupport.processInjectionBasedOnCurrentContext(this);
//   System.out.println("hello");
	httpClient=HttpClients.createDefault();
	
	HttpGet request = new HttpGet("https://www.bvmt.com.tn/rest_api/rest/market/groups/11,12,52,95,99");
	CloseableHttpResponse response;
	try {
		response = httpClient.execute(request);
		HttpEntity entity = response.getEntity();
		String data=EntityUtils.toString(entity);
		
		Gson gson = new Gson();
		AllMarkets  markets=gson.fromJson(data, AllMarkets .class);
//		System.out.println(data);
//		System.out.println(markets.getSequance());
		
//		System.out.println(allMarketsService==null);
		markets=allMarketsService.saveMarkets(markets);
		
		 for (Market market : markets.getMarkets()) { // Corrected iteration over markets
	            String isin = market.getIsin();
	            // Process each market here
//	            System.out.println(isin);
	            String apiUrl = "https://www.bvmt.com.tn/rest_api/rest/limits/"+isin;
//	       		System.out.println("hola");
	       		
	       		
	       		
	       		RestTemplate restTemplate = new RestTemplate();
				AllLimits response2 = restTemplate.getForObject(apiUrl,AllLimits.class);	
	       		List<Limit> limits = response2.getLimits();
		   		

	       		for (Limit limit2 : limits) {
	       		    String id = limit2.getId();
	       		    String seance = limit2.getSeance();
	       		    String isin2 = limit2.getIsin();
	       		    String time = limit2.getTime();

	       		    List<Market> markets2 = allMarketsDao.findByMarketsLimitIdAndMarketsSeanceAndMarketsIsinAndMarketsLimitTime(id, seance, isin2, time);
	       		    if (markets2.isEmpty()) {
	       		        limitService.saveLimit(limit2);
	       		    }
	       		}
	       	  
	       	  String url="https://www.bvmt.com.tn/rest_api/rest/intraday/"+isin;
	       		RestTemplate restTemplate2 = new RestTemplate();
              AllIntradays response3=restTemplate2.getForObject(url, AllIntradays.class);
              
              List<Intraday> intradays=response3.getIntradays();
				for (Intraday intraday: intradays) {
              String id = intraday.getId();
              String seance =intraday.getSeance();
              String isin3 =intraday.getIsin();
              String time =intraday.getTime();
              
              List<Market> market3 = allMarketsDao.findByMarketsIdAndMarketsSeanceAndMarketsIsinAndMarketsLimitTime(id, seance, isin3, time);
//              if (market3.isEmpty()) {
//            	  allIntradaysService.saveIntradays(intraday);
//            	  System.out.println("not exist");
//              }
//              else {
//				System.out.println("exist");
//			}
	        }

		 }}
		 catch (ClientProtocolException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

}}