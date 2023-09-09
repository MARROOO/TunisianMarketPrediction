
package tn.educanet.stockmarket.service;

import java.util.List;

import tn.educanet.stockmarket.dao.LimitDao;
import tn.educanet.stockmarket.persistence.AllLimits;
import tn.educanet.stockmarket.persistence.Limit;
import tn.educanet.stockmarket.persistence.User;

import com.google.gson.Gson;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;
	import org.springframework.web.client.RestTemplate;

	
	public interface LimitService {
//		AllLimits saveLimit(AllLimits limit);
		
		Limit saveLimit(Limit limit);

 
    
	    }
	


