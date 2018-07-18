package com.niit.backendpro.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.backendpro.DAO.CategoryDAO;
import com.niit.backendpro.DAO.ProductDAO;
import com.niit.backendpro.DAO.SupplierDAO;

public class HibernateTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		context.scan("com.niit.backendpro");
		//context.scan("com.niit.supermarket");
		context.refresh();
		CategoryDAO categoryDAO=(CategoryDAO)context.getBean("CategoryDAO");
		ProductDAO productDAO=(ProductDAO)context.getBean("ProductDAO");
		SupplierDAO supplierDAO=(SupplierDAO)context.getBean("SupplierDAO");
		//Category category=new Category();
		//category.setCategoryname("mobile");
		//categoryDAO.addCategory(category);
			}

}
