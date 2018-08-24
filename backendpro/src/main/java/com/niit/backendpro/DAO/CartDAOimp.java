package com.niit.backendpro.DAO;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.backendpro.model.Cart;

@Repository("cartDAO")
@Transactional
public class CartDAOimp implements CartDAO {
	@Autowired
	SessionFactory sessionFactory;
	public Cart getCart(int cartid) {
		// TODO Auto-generated method stub
		try
		{
			Session session=sessionFactory.openSession();
			Cart cart=(Cart)session.get(Cart.class, cartid);
			return cart;
		}
		catch (Exception e)
		{
		return null;
	}
	}
	
	public boolean addCart(Cart cart) {
		// TODO Auto-generated method stub
		try
		{
			sessionFactory.getCurrentSession().save(cart);
			return true;
		}
		catch(Exception e)
		{
		return false;
	}
	}

	public boolean updateCart(Cart cart) {
		// TODO Auto-generated method stub
		try
		{
			sessionFactory.getCurrentSession().update(cart);
			return true;
		}
		catch(Exception e)
		{
		return false;
	}
	}

	public boolean deleteCart(Cart cart) {
		// TODO Auto-generated method stub
		try
		{
			sessionFactory.getCurrentSession().delete(cart);
			return true;
		}
		catch(Exception e)
		{
		return false;
	}
	}
	public List<Cart> listCart(String username) {
		// TODO Auto-generated method stub
		try
		{
			Session session=sessionFactory.openSession();
			Query query=session.createQuery("from Cart where username=:myusername and status=:'NA'");
			query.setParameter("myusername", username);
			List<Cart> listCart=(List<Cart>)query.getResultList();
			session.close();
			return listCart;
		}
		catch(Exception e)
		{
		return null;
	}
	}

}
