package tn.educanet.stockmarket.service;

import java.util.List;

import tn.educanet.stockmarket.persistence.AllMarkets;
import tn.educanet.stockmarket.persistence.Market;

public interface DashboardService {
	String callApi(String api);
	AllMarkets getMarkets();
	
}
