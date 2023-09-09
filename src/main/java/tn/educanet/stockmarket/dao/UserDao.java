package tn.educanet.stockmarket.dao;

import java.util.List;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import tn.educanet.stockmarket.persistence.User;
@Repository
public interface UserDao extends MongoRepository<User, String> {
	
	List<User> findUserByName(String name);
	List <User> findUserByNameAndAge(String name,int age);
	
}
