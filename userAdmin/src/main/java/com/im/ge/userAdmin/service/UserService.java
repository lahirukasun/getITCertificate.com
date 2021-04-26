package com.im.ge.userAdmin.service;

import java.util.List;

import com.im.ge.userAdmin.entities.User;

public interface UserService {

	User UsesaveUser(User user);
	User updateUser (User user);
	void deleteUser (User user);
	User getUserById (int id);
	List<User> getAllUsers();
	
}
