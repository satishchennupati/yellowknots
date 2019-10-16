package com.yellowknots.rest.repo;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;

import com.yellowknots.rest.model.User;

@Repository
public class UserRepo {
	
	Logger logger = Logger.getLogger(UserRepo.class);

	public List<User> findAllUsers(){
		logger.info("findAllUsers method invoked");
		return new ArrayList<User>();
	}
	
	public User findUserWithId(String uid){
		logger.info("findUserWithId method invoked");
		return new User();
		
		
	}
	
	public void deleteUser(String userId){
		logger.info("delete method invoked");
	}
	
	public User createOrUpdateUser(User user) throws Exception{
		logger.info("createOrUpdateUser method invoked");
		return new User();
	}
	
	public List<User> findFirst10Users(){
		logger.info("findAllUsers method invoked");
		return new ArrayList<User>();
	}
	
}
