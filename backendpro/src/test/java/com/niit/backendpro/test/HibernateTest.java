package com.niit.backendpro.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.backendpro.DAO.CartDAO;
import com.niit.backendpro.DAO.CategoryDAO;
import com.niit.backendpro.DAO.ProductDAO;
import com.niit.backendpro.DAO.SupplierDAO;
import com.niit.backendpro.DAO.UserDAO;
import com.niit.backendpro.model.Category;
import com.niit.backendpro.model.User;

public class HibernateTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		context.scan("com.niit.backendpro");
		//context.scan("com.niit.supermarket");
		context.refresh();
		CategoryDAO categoryDAO=(CategoryDAO)context.getBean("categoryDAO");
		ProductDAO productDAO=(ProductDAO)context.getBean("productDAO");
		SupplierDAO supplierDAO=(SupplierDAO)context.getBean("supplierDAO");
		UserDAO userDAO=(UserDAO)context.getBean("userDAO");
		CartDAO cartDAO=(CartDAO)context.getBean("cartDAO");
		Category category=new Category();
		category.setCategoryname("mobile");
		categoryDAO.addCategory(category);
		System.out.println("Category object created");
		User user=new User();
		user.setAddress("chennai");
		//userDetail.setCustomername("madurai");
		user.setEmail("mathansri898@gmail.com");
		//userDetail.setMobile("9952278512");
		user.setPassword("123");
		user.setRole("ROLE_USER");
		user.setUsername("mathan123");
		user.setEnabled(true);
		userDAO.registerUser(user);
		
		//userDAO.registerUser(user);
		
		System.out.println(user+"user object saved");
			}

}
