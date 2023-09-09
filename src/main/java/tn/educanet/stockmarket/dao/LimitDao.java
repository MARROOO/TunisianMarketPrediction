package tn.educanet.stockmarket.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import tn.educanet.stockmarket.persistence.Limit;

@Repository
public interface LimitDao extends MongoRepository<Limit, String> {
    // Add custom query methods if needed
}
