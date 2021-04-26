package com.im.ge.userAdmin.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.im.ge.userAdmin.entities.User;
import com.im.ge.userAdmin.service.UserService;

@Controller
public class UserController {

	@Autowired
	UserService service;

	@RequestMapping("/registerUser")
	public String showCreate() {
		return "registerUser";
	}

	@RequestMapping("/saveUser")
	public String saveUser(@ModelAttribute("user") User user, ModelMap modelMap) {
		User userSaved = service.UsesaveUser(user);
		String msg = "User Registerd with id : " + userSaved.getId();
		modelMap.addAttribute("msg", msg);
		return "registerUser";

	}

	@RequestMapping("/savedUser")
	public String displayAllUsers(ModelMap modelmap) {
		List<User> allUsers = service.getAllUsers();
		modelmap.addAttribute("users", allUsers);
		return "allUsers";
	}
	
	@RequestMapping("/loginUser")
	public String login(ModelMap modelmap) {
		List<User> allUsers = service.getAllUsers();
		modelmap.addAttribute("users", allUsers);
		return "login";
	}
	
	@RequestMapping("/")
	public String home(ModelMap modelmap) {
		List<User> allUsers = service.getAllUsers();
		modelmap.addAttribute("users", allUsers);
		return "index";
	}


}
