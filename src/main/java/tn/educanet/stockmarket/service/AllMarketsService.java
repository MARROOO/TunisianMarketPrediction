package tn.educanet.stockmarket.service;

import java.util.List;

import tn.educanet.stockmarket.persistence.AllMarkets;
import tn.educanet.stockmarket.persistence.Market;

public interface AllMarketsService {
AllMarkets saveMarkets(AllMarkets allMarkets);
List<Market> findByMarketsLimitIdAndByMarketsSeanceAndByMarketsIsinAndByMarketsLimitTime(String id,
		String seance, String isin2, String time);
List<AllMarkets> findAll();
//List<Market> findMarket();
}
