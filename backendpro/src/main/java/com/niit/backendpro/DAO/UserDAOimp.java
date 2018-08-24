package com.niit.backendpro.DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.backendpro.model.User;

@Repository("userDAO")
@Transactional
public class UserDAOimp implements UserDAO {
	@Autowired
	SessionFactory sessionFactory;
		public boolean registerUser(User user){
			try
			{
				sessionFactory.getCurrentSession().save(user);
				return true;
			}
			catch (Exception e)
			{
			return false;
		}
		}
		public boolean updateUser(User user) {
			try
			{
				sessionFactory.getCurrentSession().update(user);
				return true;
			}
			catch(Exception e)
			{
				return false;
			}
			}	
		public User getUser(String username) {
			try
			{
				Session session= sessionFactory.getCurrentSession();
				User user=(User)session.get(User.class,username);
				return user;
			}
			catch(Exception e)
			{
				return null;
			}
		}


}
