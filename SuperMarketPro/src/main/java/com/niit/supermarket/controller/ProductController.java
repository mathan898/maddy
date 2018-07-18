package com.niit.supermarket.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.LinkedHashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.niit.backendpro.DAO.CategoryDAO;
import com.niit.backendpro.DAO.ProductDAO;
import com.niit.backendpro.model.Category;
import com.niit.backendpro.model.Product;

@Controller
public class ProductController 
{
	@Autowired
	ProductDAO productDAO;
	@Autowired
	CategoryDAO categoryDAO;
	@RequestMapping("/product")
	public String showProductPage(Model m)
	{
		Product product=new Product();
		m.addAttribute(product);
		m.addAttribute("categoryList",this.getCategories());
		m.addAttribute("productList",productDAO.listProduct());
		return "ManageProduct";
	}
	@RequestMapping("/totalProductInfo/{productId}")
	public String showTotalProductDisplay(@PathVariable("productId") int productId,Model m)
	{
		Product product=productDAO.getProduct(productId);
		m.addAttribute("product",product);
		
		return "TotalProductDisplay";
		
	}
	@RequestMapping("/productDisplay")
	public String displayAllProducts(Model m)
	{
		Product product=new Product();
		m.addAttribute(product);
		m.addAttribute("categoryList",this.getCategories());
		m.addAttribute("productList",productDAO.listProduct());
		return "ProductDisplay";
	}
	@RequestMapping(value="/ProductInsert",method=RequestMethod.POST)
	public String insertProduct(@ModelAttribute("product")Product product,@RequestParam("pimage") MultipartFile filedet,Model m)
	{
		productDAO.addProduct(product);
		//System.out.println("Product Added");
		//m.addAttribute("categoryList",this.getCategories());
		Product product1=new Product();
		m.addAttribute(product1);
		m.addAttribute("categoryList",this.getCategories());
		m.addAttribute("productList",productDAO.listProduct());
		String path="C:\\Users\\hp\\workspace\\SuperMarketPro\\src\\main\\webapp\\images\\";
		path=path+String.valueOf(product.getProductId())+".jpg";
		File file=new File(path);
		
		if(!filedet.isEmpty())
		{
			try
			{
				byte[] buffer=filedet.getBytes();
				FileOutputStream fos=new FileOutputStream(file);
				BufferedOutputStream bs=new BufferedOutputStream(fos);
				bs.write(buffer);
				bs.close();
			}
			catch(Exception e)
			{
				m.addAttribute("errorInfo","Exception Arised:"+e.getMessage());
			}
		}
		else
		{
			m.addAttribute("errorInfo","There is System Problem No Image Insertion");
		}

		return "ManageProduct";
	}
	@RequestMapping(value="/deleteProduct/{productId}")
	public String deleteProduct(@PathVariable("productId") int productId,Model m)
	{
		Product product=productDAO.getProduct(productId);
		productDAO.deleteProduct(product);
		Product product1=new Product();
		m.addAttribute(product1);
		m.addAttribute("categoryList",this.getCategories());
		m.addAttribute("productList",productDAO.listProduct());
		return "ManageProduct";
	}
	@RequestMapping(value="editProduct/{productId}")
	public String editProduct(@PathVariable("productId")int productId,Model m)
	{
		Product product=productDAO.getProduct(productId);
		m.addAttribute(product);
		m.addAttribute("categoryList",this.getCategories());
		/*m.addAttribute("productList",productDAO.listProduct());*/
		return "EditProduct";
	}
	@RequestMapping(value="/updateproduct",method=RequestMethod.POST)
	public String updateProduct(@ModelAttribute("product")Product product,Model m)
	{
		productDAO.updateProduct(product);
		/*Product product1=new Product();
		m.addAttribute(product1);
		m.addAttribute("categoryList",this.getCategories());
		m.addAttribute("productList",productDAO.listProduct());*/
		return "redirect:/product";
	}
	public LinkedHashMap<Integer,String> getCategories()
	{
		List<Category> listCategories=categoryDAO.listCategories();
		LinkedHashMap<Integer,String> categoryData=new LinkedHashMap<Integer,String>();
		for(Category category:listCategories)
		{
			categoryData.put(category.getCategoryid(),category.getCategoryname());
		}
		return categoryData;
	}
	

}
