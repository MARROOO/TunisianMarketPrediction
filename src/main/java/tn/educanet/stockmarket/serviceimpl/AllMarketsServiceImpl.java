package tn.educanet.stockmarket.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import tn.educanet.stockmarket.dao.AllMarketsDao;

import tn.educanet.stockmarket.persistence.AllMarkets;
import tn.educanet.stockmarket.persistence.Market;
import tn.educanet.stockmarket.persistence.User;
import tn.educanet.stockmarket.service.AllMarketsService;

@Service
public class AllMarketsServiceImpl implements AllMarketsService {
	
   @Resource
   private AllMarketsDao allMarketsDao;

   @Override
   public AllMarkets saveMarkets (AllMarkets allMarkets) {
	   
	   try {
			allMarkets = allMarketsDao.save(allMarkets);
		} catch (Exception e) {
			e.printStackTrace();
			allMarkets=new AllMarkets();



	}
	return allMarkets;
	
	  
}

@Override
public List<Market> findByMarketsLimitIdAndByMarketsSeanceAndByMarketsIsinAndByMarketsLimitTime(String id,
		String seance, String isin2, String time) {
	List <Market>MarketsLimitIdAndByMarketsSeanceAndByMarketsIsinAndByMarketsLimitTime=new ArrayList<Market>();
	
	  try {
	    MarketsLimitIdAndByMarketsSeanceAndByMarketsIsinAndByMarketsLimitTime = allMarketsDao.findByMarketsLimitIdAndMarketsSeanceAndMarketsIsinAndMarketsLimitTime(id, seance, isin2, time);
	            
	      
	} catch (Exception e) {
		e.printStackTrace();
		MarketsLimitIdAndByMarketsSeanceAndByMarketsIsinAndByMarketsLimitTime = new ArrayList<Market>();

	}
	return MarketsLimitIdAndByMarketsSeanceAndByMarketsIsinAndByMarketsLimitTime;
}

@Override
public List<AllMarkets> findAll() {
	List<AllMarkets>AllMarkets2=new ArrayList<AllMarkets>();
	try {
		AllMarkets2=allMarketsDao.findAll();
	} catch (Exception e) {
		e.printStackTrace();
		AllMarkets2=new ArrayList<AllMarkets>();
		}
	return AllMarkets2;
}

//@Override
//public List<Market> findMarket() {
//	List<Market> market=new ArrayList<Market>();
//	try {
//		market=allMarketsDao.findMarket();
//	} catch (Exception e) {
//		e.printStackTrace();
//		market=new ArrayList<Market>();}
//	return market;
//}
//
//

}

