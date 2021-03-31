
  package com.app.service;
  
  import java.util.List;

import com.app.pojos.Cart;
import com.app.pojos.Product;
  
  public interface ICartService {
  
  List<Product> getProductByCart(int cart);
  
//  Product getById(Integer id); 
  static void insertCart(Cart cart ) {
	// TODO Auto-generated method stub
	
}

static List<Cart> selectAllCart() {
	// TODO Auto-generated method stub
	return null;
}
  
  }
 