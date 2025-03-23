package com.sms.dao;

import java.util.List;

import com.sms.model.Product;

public interface ProductDao {
	void addProducts();
	List<Product> viewAllProducts();
	Product viewProduct(int pId);
	boolean updateProduct(int pid);
	boolean deleteProduct(int pid);
	boolean buyProduct(int pid);
}
