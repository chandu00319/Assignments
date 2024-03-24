package in.ashokit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import in.ashokit.entity.User;
import in.ashokit.service.Userservice;
@Controller
public class UserController {

	@Autowired
	private Userservice service;
	
	@GetMapping("/")
	public String login(Model model) {
		model.addAttribute("user",new User());		
		return "login";
	}
	@PostMapping("/login")
	public String Loginbutton(Model model,User user) {
		User user2 = service.getusers(user.getEmail(), user.getPwd());
		if(user2 == null) 
		{	
			model.addAttribute("emsg","Invalid details");
			return "login";
		}else
		{
			model.addAttribute("smsg",user2.getName()+",Welcome to Ashok it");
			return "dashboard";
		}
		
		
	}
	
	@GetMapping("/registration")
	public String registration(Model model) {
		
		model.addAttribute("register",new User());		
		return "registration";
	
	}
	
	@PostMapping("/registation")
	public String registerbutton(Model model,User user) {
		
	boolean saveusers = service.saveusers(user);
	model.addAttribute("register",new User());
	if(saveusers) {
		model.addAttribute("smsg","Register sucessfull");
	}
	else {
		model.addAttribute("msg","Registration failed");
	}
	
	return "registration";
		
	}
	
	@GetMapping("/signout")
	public String signout(Model model) {
		
		model.addAttribute("login",new User());		
		return "login";
	}
		
	}

