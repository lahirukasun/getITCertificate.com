package com.im.ge.userAdmin.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.im.ge.userAdmin.entities.User;
import com.im.ge.userAdmin.repos.UserRepository;
import com.im.ge.userAdmin.service.UserService;
import com.im.ge.userAdmin.util.EmailUtil;

@Controller
public class UserController {

	@Autowired
	private UserService service;

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	EmailUtil emailUtil;
	
	@RequestMapping("/showReg")
	public String showRegisterPage() {
		return "reg2";
	}
	
	@RequestMapping(value = "/login")
	public String showLogin () {
		return "login";
	}
	
	
	@RequestMapping(value = "/saveUser" , method = RequestMethod.POST)
	private String register(@ModelAttribute("user") User user) {
		User saved_user = userRepository.save(user);
		String msg = "You have scusessfully regersterd for getitcertication.com.";
		emailUtil.sendEmail(saved_user.getEmail(), "User Account is Created for "+saved_user.getFirstname(), msg);
		return "login2";

	}
	
	@RequestMapping(value = "/login" , method = RequestMethod.POST)
	public String login(@RequestParam("email") String email, @RequestParam("userpassword") String password,
			ModelMap modelMap) {
		System.out.println("t1");
		User user = userRepository.findByEmail(email);
		String user_firstname = user.getFirstname();
		if (user.getUserpassword().equals(password)) {
			System.out.println("t2");
			modelMap.addAttribute("user_firstname", user_firstname);
			return "dashboad";
		} else {
			modelMap.addAttribute("msg", "Invalid Email or Password. Please Try Agin.");
			
		}
		System.out.println("t3");
		return "index";

	}
}
