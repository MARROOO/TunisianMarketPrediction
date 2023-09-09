package tn.educanet.stockmarket;

import java.util.List;



import java.util.Locale;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import tn.educanet.stockmarket.persistence.AllMarkets;
import tn.educanet.stockmarket.persistence.Market;
import tn.educanet.stockmarket.persistence.User;
import tn.educanet.stockmarket.service.AllMarketsService;
import tn.educanet.stockmarket.service.DashboardService;
import tn.educanet.stockmarket.service.UserService;
import tn.educanet.stockmarket.serviceimpl.StockDataTask;
import tn.educanet.stockmarket.service.DashboardService;

@Controller
//public class DashboardController {
//
//	@Autowired
//    private DashboardService dashboardService;
//	
//	 @RequestMapping("/bourse")
//	 
//	    public String listStocks(Model model) {
//		 System.out.println(dashboardService==null);
//		  Market markets = dashboardService.getMarkets();
//	   
//	        model.addAttribute(" AllMarkets", markets);
//	        System.out.println("bourse");
//	        System.out.println(markets);
//	        return "bourse"; 
//
//	 }
//	 

public class DashboardController {

    @Autowired
    private DashboardService dashboardService;

    @RequestMapping("/bourse")
    public String listStocks(Model model) {
        // Fetch market data from the service
        AllMarkets markets = dashboardService.getMarkets();
        System.out.println(markets);
        model.addAttribute("markets", markets); 
        return "bourse"; 
    }
}
   