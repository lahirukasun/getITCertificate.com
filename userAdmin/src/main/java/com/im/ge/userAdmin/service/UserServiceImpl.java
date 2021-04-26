package com.im.ge.userAdmin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.im.ge.userAdmin.entities.User;
import com.im.ge.userAdmin.repos.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository repo;

	@Override
	public User UsesaveUser(User user) {

		return repo.save(user);
	}

	@Override
	public User updateUser(User user) {

		return repo.save(user);
	}

	@Override
	public void deleteUser(User user) {
		repo.delete(user);

	}

	@Override
	public User getUserById(int id) {

		return repo.findById(id).get();
	}

	@Override
	public List<User> getAllUsers() {

		return repo.findAll();
	}

}
