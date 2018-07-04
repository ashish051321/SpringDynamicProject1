package com.ashish.core;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

//@RequestMapping("/funny")
@Controller
public class HomeController {

	@RequestMapping("/")
	public String getHomePage(){
		return "hello-world-form";
	}
	
	@RequestMapping("/processForm")
	public String getConfirmationPage(HttpServletRequest req, Model model){
		model.addAttribute("message", req.getParameter("fullName"));
		return "confirmPage";
	}

	
	@RequestMapping("/processFormV2")
	public String shoutPage(HttpServletRequest req,Model model ){
		model.addAttribute("message", req.getParameter("fullName").toUpperCase());
		return "confirmPage";
	}
	
	
	@RequestMapping("/processFormV3")
	public String returnAnotherPage(@RequestParam("studentName") String nameStud , Model model ){
		model.addAttribute("studentName",nameStud);
		return "confirmPage";
	}
	
	
	
	
}
