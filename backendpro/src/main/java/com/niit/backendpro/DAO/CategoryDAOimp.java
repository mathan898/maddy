package com.niit.backendpro.DAO;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.backendpro.model.Category;
@Repository("categoryDAO")
@Transactional
public class CategoryDAOimp implements CategoryDAO {

	@Autowired
	SessionFactory sessionFactory;
	public boolean addCategory(Category category) {
		// TODO Auto-generated method stub
		try
		{
			sessionFactory.getCurrentSession().save(category);
			return true;
		}
		catch(Exception e)
		{
		return false;
		}
	}

	public boolean updateCategory(Category category) {
		// TODO Auto-generated method stub
		try
		{
			sessionFactory.getCurrentSession().update(category);
			return true;
		}
		catch(Exception e)
		{
		return false;
		}
	}

	public boolean deleteCategory(Category category) {
		// TODO Auto-generated method stub
		try
		{
			sessionFactory.getCurrentSession().delete(category);
			return true;
		}
		catch(Exception e)
		{
		return false;
		}
	}

	public Category getCategory(int categoryid) {
		// TODO Auto-generated method stub
		try
		{
			Session session=sessionFactory.getCurrentSession();
			Category category=(Category)session.get(Category.class,categoryid);
			return category;		
		}
		catch(Exception e)
		{
		return null;
		}
	}

	public List<Category> listCategories() {
		try
		{
			Session session=sessionFactory.openSession();
			Query query=session.createQuery("from Category");
			List<Category> listCategories=query.list();
			session.close();
			return listCategories;
		}
		catch(Exception e)
		{
		// TODO Auto-generated method stub
		return null;
		}
	}

}
