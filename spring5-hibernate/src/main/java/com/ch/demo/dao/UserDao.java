package com.ch.demo.dao;

import java.util.List;

import com.ch.demo.model.User;

public interface UserDao {
	void save(User user);

	List<User> list();
}
