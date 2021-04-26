package com.im.ge.userAdmin;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import com.im.ge.userAdmin.entities.User;
import com.im.ge.userAdmin.repos.UserRepository;

@SpringBootTest
class UserAdminApplicationTests {

	@Autowired
	private UserRepository repo;
	
	 
	@Test
	void testCreateUser() {
		User user = new User();
		user.setUsername("lk003");
		user.setFirstname("Lahiru");
		repo.save(user);
		
	}

}
