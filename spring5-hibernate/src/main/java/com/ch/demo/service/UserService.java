package com.ch.demo.service;

import java.util.List;

import com.ch.demo.model.User;


public interface UserService {
	void save(User user);
	 
	List<User> list();
}
