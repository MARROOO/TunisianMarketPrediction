package tn.educanet.stockmarket.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import tn.educanet.stockmarket.persistence.AllIntradays;
import tn.educanet.stockmarket.persistence.Intraday;

	@Repository
	public interface AllIntradaysDao  extends MongoRepository<Intraday, String>{

		

		Intraday save(Intraday intraday);
}
