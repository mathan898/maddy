package com.niit.supermarket.controller;

import java.util.Collection;

import javax.servlet.http.HttpSession;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
	@RequestMapping("/login_success")
	public String loginSuccess(Model m,HttpSession session)
	{
		String page="";
		
		boolean loggedIn=false;
		SecurityContext securityContext=SecurityContextHolder.getContext();
		Authentication authentication=securityContext.getAuthentication();
		
		String username=authentication.getName();
		Collection<GrantedAuthority> roles=(Collection<GrantedAuthority>)authentication.getAuthorities();
		//System.out.println("Login Success");
		for(GrantedAuthority role:roles)
		{
			session.setAttribute("role", role.getAuthority());
			if (role.getAuthority().equals("ROLE_USER"))
			{
				loggedIn=true;
				page="ProductDisplay";
				session.setAttribute("loggedIn", loggedIn);
				session.setAttribute("username", username);
			}
			else
			{
				loggedIn=true;
				page="AdminHome";
				session.setAttribute("loggedIn",loggedIn);
				session.setAttribute("username", username);
			}
		}
		return page;
	}

}
