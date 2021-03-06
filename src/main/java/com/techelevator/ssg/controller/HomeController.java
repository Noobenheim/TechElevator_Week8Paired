package com.techelevator.ssg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String displayHomePage() {
		return "homePage";
	}
	
	@RequestMapping("/forum")
	public String showForum() {
		return "redirect:/forum/";
	}
	
	@RequestMapping("/store")
	public String showStore() {
		return "redirect:/store/";
	}

}
