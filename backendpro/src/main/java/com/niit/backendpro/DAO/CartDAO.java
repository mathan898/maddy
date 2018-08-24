package com.niit.backendpro.DAO;

import java.util.List;

import com.niit.backendpro.model.Cart;

public interface CartDAO {
	public Cart getCart(int cartid);
	public boolean addCart(Cart cart);
	public boolean updateCart(Cart cart);
	public boolean deleteCart(Cart cart);
	public List<Cart> listCart(String username);

}
