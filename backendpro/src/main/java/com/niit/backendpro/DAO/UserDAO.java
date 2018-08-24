package com.niit.backendpro.DAO;

import com.niit.backendpro.model.User;

public interface UserDAO {
	public boolean registerUser(User user);
	public boolean updateUser(User user);
	public User getUser(String username);

}
