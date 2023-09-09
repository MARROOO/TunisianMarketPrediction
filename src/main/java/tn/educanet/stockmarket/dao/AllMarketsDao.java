package tn.educanet.stockmarket.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import tn.educanet.stockmarket.persistence.AllMarkets;
import tn.educanet.stockmarket.persistence.Market;
@Repository
public interface AllMarketsDao extends MongoRepository<AllMarkets, String> {
    List<Market> findByMarketsLimitIdAndMarketsSeanceAndMarketsIsinAndMarketsLimitTime(String id, String seance, String isin, String time);
	List<Market> findByMarketsIdAndMarketsSeanceAndMarketsIsinAndMarketsLimitTime(String id, String seance,String isin3, String time);
//	List<Market> findMarket();
}
