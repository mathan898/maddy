package com.niit.backendpro.DAO;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.backendpro.model.Product;

@Repository("productDAO")
@Transactional
public class ProductDAOimp implements ProductDAO {

	@Autowired
	SessionFactory sessionFactory;
	public boolean addProduct(Product product) {
		// TODO Auto-generated method stub
		try
		{
			sessionFactory.getCurrentSession().save(product);
			return true;
		}
		catch(Exception e)
		{
		return false;
		}
	}

	public boolean deleteProduct(Product product) {
		// TODO Auto-generated method stub
		try
		{
			sessionFactory.getCurrentSession().delete(product);
			return true;
		}
		catch(Exception e)
		{
		return false;
		}
	}

	public boolean updateProduct(Product product) {
		// TODO Auto-generated method stub
		try
		{
			sessionFactory.getCurrentSession().update(product);
			return true;
		}
		catch(Exception e)
		{
		return false;
		}
	}

	public Product getProduct(int productid) {
		// TODO Auto-generated method stub
		try
		{
			Session session=sessionFactory.getCurrentSession();
			Product product=(Product)session.get(Product.class,productid);
			return product;		
		}
		catch(Exception e)
		{
		return null;
		}
	}

	public List<Product> listProduct() {
		// TODO Auto-generated method stub
		try
		{
			Session session=sessionFactory.openSession();
			Query query=session.createQuery("from Product");
			List<Product> listProduct=query.list();
			session.close();
			return listProduct;
		}
		catch(Exception e)
		{
		// TODO Auto-generated method stub
		return null;
		}
	}

	public List<Product> listProductsByCategory(int categoryId) {
		// TODO Auto-generated method stub
		try
		{
			Session session=sessionFactory.openSession();
			Query query=session.createQuery("from Product Where categoryid:catid");
			query.setParameter("catid",categoryId);
			List<Product> listProduct=query.list();
			session.close();
			return listProduct;
		}
		catch(Exception e)
		{
		return null;
		}
	}

}
