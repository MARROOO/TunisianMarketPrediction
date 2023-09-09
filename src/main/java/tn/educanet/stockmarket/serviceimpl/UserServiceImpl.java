package tn.educanet.stockmarket.serviceimpl;

import java.util.ArrayList;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import tn.educanet.stockmarket.dao.UserDao;
import tn.educanet.stockmarket.persistence.User;
import tn.educanet.stockmarket.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Resource
	private UserDao userDao;

	@Override
	public User createUser(String name, String surname, String email, int age) {
		User user = new User();
		try {
			user.setEmail(email);
			user.setAge(age);
			user.setName(name);
			user.setSurname(surname);
			
			user = userDao.save(user);
			
		} catch (Exception e) {
			e.printStackTrace();
			user = new User();
			
		}
		return user;
	}
	public User findUserById() {
		User user = new User();
		try {
			user.getId();
			user = userDao.save(user);
			
		} catch (Exception e) {
			e.printStackTrace();
			user =new User();
		}
		return user;
	}
	 @Override
	  
	
	    public List<User> findUserByName(String name) {
	        List<User> userListName=new ArrayList<User>() ;
	        try {
	        	userListName = userDao.findUserByName(name);
	            
	        } catch (Exception e) {
	            e.printStackTrace();
	            userListName = null;
	        }
	        return userListName;
	    }
	
	 @Override
	  
		
	    public List <User> findUserByNameAndAge(String name,int age){
	        List<User> userListNameAndAge =new ArrayList<User>();
	        try {
	        	userListNameAndAge = userDao.findUserByNameAndAge(name,age);
	            
	        } catch (Exception e) {
	            e.printStackTrace();
	            userListNameAndAge =new ArrayList<User>() ;
	        }
	        return userListNameAndAge;
	    }
	@Override
	public List<User> getUsers() {
		List<User> usersList =new ArrayList<User>();
        try {
        	usersList = userDao.findAll();
            
        } catch (Exception e) {
            e.printStackTrace();
            usersList =new ArrayList<User>() ;
        }
        return usersList;
 
	}
	
	

}
