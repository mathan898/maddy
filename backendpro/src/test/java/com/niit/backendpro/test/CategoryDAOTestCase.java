package com.niit.backendpro.test;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.backendpro.DAO.CategoryDAO;
import com.niit.backendpro.model.Category;

@RunWith(JUnit4.class)
public class CategoryDAOTestCase {
	static CategoryDAO categoryDAO;
	@BeforeClass
	public static void executeFirst()
	{
	AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
	context.scan("com.niit.backendpro");
	context.refresh();
  categoryDAO=(CategoryDAO)context.getBean("CategoryDAO");
	}
	@Test
	@Ignore
	public void addCategoryTest()
	{
	Category category=new Category();
	category.setCategoryid(2);
	category.setCategoryname("apple");
	assertTrue("Problem in Adding Category:",categoryDAO.addCategory(category));
	}
	@Test
	//@Ignore
	public void listCategoriesTest()
	{
		List<Category> listcategories=categoryDAO.listCategories();
		assertTrue("problem in listing categoies",listcategories.size()>0);
		for(Category category:listcategories)
		{
			System.out.println(category.getCategoryid());
			System.out.println(category.getCategoryname());
			
		}
	}


}
