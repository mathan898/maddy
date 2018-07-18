package com.niit.supermarket.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.niit.backendpro.DAO.CategoryDAO;
import com.niit.backendpro.model.Category;

@Controller
public class CategoryController {
	@Autowired
	CategoryDAO categoryDAO;
	boolean flag=false;
	
	@RequestMapping(value="/category")
	public String ShowCategoryPage(Model m)
	{
		flag=false;
		List<Category> listCategories=categoryDAO.listCategories();
		m.addAttribute("categorylist",listCategories);
	    m.addAttribute("flag",flag);
		return "Category";
	}
	@RequestMapping(value="InsertCategory",method=RequestMethod.POST)
	public String insertCategory(@RequestParam("cname")String categoryname,@RequestParam("catdesc")String categorydesc,Model m)
	{
		flag=false;
		Category category=new Category();
		category.setCategoryname(categoryname);
		category.setCategorydesc(categorydesc);
		
		categoryDAO.addCategory(category);
		List<Category>listCategories=categoryDAO.listCategories();
		m.addAttribute("categorylist",listCategories);
		m.addAttribute("flag",flag);
		return "Category";
	}
	@RequestMapping(value="/deleteCategory/{categoryid}")
	public String deleteCategory(@PathVariable("categoryid")int categoryid,Model m)
	{
		flag=false;
		Category category=categoryDAO.getCategory(categoryid);
		categoryDAO.deleteCategory(category);
		List<Category>listCategories=categoryDAO.listCategories();
		m.addAttribute("categorylist",listCategories);
		m.addAttribute("flag",flag);
		return "Category";
	}
	@RequestMapping(value="/editCategory/(CategoryID)")
	public String editCategory(@PathVariable("categoryID")int categoryId,Model m)
	{
		flag=false;
		Category category=categoryDAO.getCategory(categoryId);
		m.addAttribute("categoryData",category);
		m.addAttribute("flag",flag);
		return "Category";
	}
	@RequestMapping(value="/UpdateCategory",method=RequestMethod.POST)
	public String updateCategory(@RequestParam("catid")int categoryid,@RequestParam("catname")String categoryname,Model m)
	{
		flag=false;
		Category category=categoryDAO.getCategory(categoryid);
		category.setCategoryid(categoryid);
		category.setCategoryname(categoryname);
		
		categoryDAO.updateCategory(category);
		
		List<Category> listCategories=categoryDAO.listCategories();
		m.addAttribute("categorylist", listCategories);
		m.addAttribute("flag",flag);
		return "Category";
	}

}
