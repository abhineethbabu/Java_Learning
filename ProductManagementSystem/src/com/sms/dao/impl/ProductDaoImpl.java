package com.sms.dao.impl;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.sms.dao.ProductDao;
import com.sms.model.Product;

public class ProductDaoImpl implements ProductDao{
	
	Scanner sc = new Scanner(System.in);
	List<Product> productList = new ArrayList<>();
	public static int curPid = 100;
	
	@Override
	public void addProducts() {
		
		System.out.println("Enter no of new products to add =>");
		int num = sc.nextInt();
		
		for(int i=0 ; i<num; i++) {
			
			int pid = curPid++;
			
			System.out.println("Enter Product Name =>");
			String pname = sc.next();
			
			System.out.println("Enter Quantity =>");
			int quantity = sc.nextInt();
			
			System.out.println("Enter Price =>");
			float price = sc.nextFloat();
			
			Product p = new Product(pid, pname, quantity, price);
			productList.add(p);
			
			System.out.println("Product added Successfully with PID "+pid+" !!");
		}
		
	}
	
	@Override
	public List<Product> viewAllProducts() {
		return productList;
	}
	
	@Override
	public Product viewProduct(int pid) {
		for(Product p : productList) {
			if(p.getpId() == pid) {
				return p;
			}
		}
		return null;
	}
	
	@Override
	public boolean updateProduct(int pid) {
		Product p = viewProduct(pid);
		if(p==null) return false;
		System.out.println("\nDetails => ");
		System.out.println("\t PID : "+p.getpId());
		System.out.println("\t Product Name : "+p.getpName());
		System.out.println("\t Quantity : "+p.getQty());
		System.out.println("\t Price : "+p.getPrice());
		

		System.out.println("Enter Updated Name =>");
		p.setpName(sc.next());
		System.out.println("Enter Updated Quantity =>");
		p.setQty(sc.nextInt());
		System.out.println("Enter Updated Price =>");
		p.setPrice(sc.nextFloat());
		
		
		return true;
	}
	
	@Override
	public boolean deleteProduct(int pid) {

		for(Product p : productList) {
			if(p.getpId() == pid) {
				productList.remove(p);
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean buyProduct(int pid) {
		Product p = viewProduct(pid);
		if(p==null) {
			System.out.println("Product not found");
			return false;
		}
		System.out.println("\n Product Details => ");
		System.out.println("\t PID : "+p.getpId());
		System.out.println("\t Product Name : "+p.getpName());
		System.out.println("\t Quantity : "+p.getQty());
		System.out.println("\t Price : "+p.getPrice());
		
		if(p.getQty()==0) {
			System.out.println("Product OUT OF STOCK!");
			return false;
		}
		else {
			System.out.println("Enter quantity => ");
			int qty = sc.nextInt();
			if(qty>p.getQty()) {
				System.out.println("Unavailable Quantity");
				return false;
			}
			else {
				p.setQty(p.getQty()-qty);
			}
		}
		return true;
	}
	

}
