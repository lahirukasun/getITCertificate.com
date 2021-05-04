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
	
		User user = userRepository.findByEmail(email);
		String user_firstname = user.getFirstname();
		int isAdmin= user.getIsadmin();
		if (user.getUserpassword().equals(password)) {
			modelMap.addAttribute("user_firstname", user_firstname);
			if(isAdmin==1) {
				return "admin_dashboad";	
			}
			return "dashboad";
		} else {
			modelMap.addAttribute("msg", "Invalid Email or Password. Please Try Agin.");
			
		}

		return "index";

	}
	
	@RequestMapping(value = "/forgotPW")
	public String showPwReset () {
		return "forgotPW";
	}
	
	@RequestMapping(value = "/forgotPW" , method = RequestMethod.POST)
	public String forgotPassword(@RequestParam("email") String email,ModelMap modelMap) {
		User user = userRepository.findByEmail(email);
		emailUtil.sendEmail(user.getEmail(), "Your Account Password", user.getUserpassword()+" : is your curent password");
		modelMap.addAttribute("msg", "Please Check your registerd email ("+user.getEmail()+") address.");
		return "login";
	}
	
	public User users() {
		return null;
		
	}
	
	
}
