package tn.educanet.stockmarket.service;

import java.util.List;


import tn.educanet.stockmarket.persistence.User;


public interface UserService {

	User createUser(String name, String surname, String email, int age);
	User findUserById();
	List <User> findUserByName(String name);
	List <User> findUserByNameAndAge(String name,int age);
	List<User> getUsers();


}
