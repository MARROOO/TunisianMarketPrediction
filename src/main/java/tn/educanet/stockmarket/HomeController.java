package tn.educanet.stockmarket;

import java.text.DateFormat;


import java.util.Date;
import java.util.Locale;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.util.EntityUtils;
import org.quartz.JobExecutionContext;
import org.quartz.SchedulerException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import com.google.gson.Gson;

import tn.educanet.stockmarket.persistence.AllLimits;
import tn.educanet.stockmarket.persistence.AllMarkets;

import tn.educanet.stockmarket.service.AllMarketsService;
import tn.educanet.stockmarket.service.DashboardService;
import tn.educanet.stockmarket.service.LimitService;

import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	@Autowired
    private DashboardService dashboardService;
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	@Autowired
	private LimitService limitService;

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
	
		System.out.println(simpleGet("https://www.bvmt.com.tn/rest_api/rest/limits/TN0003100609"));
		String api=simpleGet("https://www.bvmt.com.tn/rest_api/rest/limits/TN0003100609");
		Gson gson = new Gson();
        AllLimits limit = gson.fromJson(api, AllLimits.class);
//        limitService.saveLimit(limit);
//     
        System.out.println(limit.getLimits().get(0).getId());
		
	return "home";
	
	}
	
	public static String simpleGet(String X) {
		CloseableHttpClient httpClient = HttpClients.createDefault();
		try {
			HttpGet request = new HttpGet(X);
			
			CloseableHttpResponse response = httpClient.execute(request);
			HttpEntity entity = response.getEntity();
			return EntityUtils.toString(entity);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return "An error Happened";
		}
	}


  

}
	



	
	

