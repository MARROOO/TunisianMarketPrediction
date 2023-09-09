package tn.educanet.stockmarket.serviceimpl;



	import java.awt.print.PrinterIOException;
	import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpEntity;
	import org.apache.http.client.ClientProtocolException;
	import org.apache.http.client.methods.CloseableHttpResponse;
	import org.apache.http.client.methods.HttpGet;
	import org.apache.http.impl.client.CloseableHttpClient;
	import org.apache.http.impl.client.HttpClients;
	import org.apache.http.util.EntityUtils;
	import org.springframework.stereotype.Service;

	import com.google.gson.Gson;

	import tn.educanet.stockmarket.persistence.AllMarkets;
import tn.educanet.stockmarket.persistence.Market;
import tn.educanet.stockmarket.service.DashboardService;
    import tn.educanet.stockmarket.service.DashboardService;
	@Service
	public class DashboardServiceImpl implements DashboardService{
		private CloseableHttpClient httpClient;
		
		public String callApi(String api) {
			httpClient=HttpClients.createDefault();
			String data="";
			HttpGet request = new HttpGet(api);
			CloseableHttpResponse response;
			try {
				response = httpClient.execute(request);
				HttpEntity entity = response.getEntity();
				data=EntityUtils.toString(entity);
			} catch (ClientProtocolException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return data;
		}
		public AllMarkets getMarkets() {
			AllMarkets markets=new AllMarkets();
			String data=callApi("https://www.bvmt.com.tn/rest_api/rest/market/groups/11,12,52,95,99");
			if(!data.isEmpty())	
			{
				Gson gson = new Gson();
				markets=gson.fromJson(data, AllMarkets.class);
			}
			 return markets;
		}
	


}
