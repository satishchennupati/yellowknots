package com.yellowknots.rest.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yellowknots.rest.model.User;
import com.yellowknots.rest.repo.UserRepo;

@Service
public class UserService {
	
	@Autowired
	UserRepo repo;
	
	public List<User> findAllUsers(){
		return repo.findAllUsers();
	}
	
	public User findUserWithId(String uid){
		return repo.findUserWithId(uid);
	}
	
	public void deleteUser(String userId){
		repo.deleteUser(userId);
	}
	
	public User createOrUpdateUser(User user) throws Exception{
		return repo.createOrUpdateUser(user);
	}

}
