package com.niit.supermarket.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.niit.backendpro.model.Category;

@Controller
public class HomeController {
	@RequestMapping(value="/")
	public String RootPage()
	{
		return "index";
	}
	@RequestMapping(value="login")
	public String loginpage()
	{
		return "Login";
	}
	@RequestMapping(value="/register")
	public String RegisterPage(Model m)
	{
		m.addAttribute("msg","welcome to RegisterPage");
		return "RegisterPage";
	}
	@RequestMapping(value="/contactus")
	public String showContactUs()
	{
		return "ContactUs";
	}
	@RequestMapping(value="/aboutus")
	public String showAboutUs()
	{
		return "AboutUs";
	}
	@RequestMapping(value="/home")
	public String showHome()
	{
		return "Home";
	}

	

}
