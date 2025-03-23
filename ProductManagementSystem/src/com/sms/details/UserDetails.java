package com.sms.details;

import java.util.List;
import java.util.Scanner;

import com.sms.dao.*;
import com.sms.dao.impl.*;
import com.sms.model.*;

public class UserDetails {
	
	Scanner sc = new Scanner(System.in);
	ProductDao daoImpl = new ProductDaoImpl();
	
	
	public void adminMenu() {
		while(true) {

			System.out.println("================================================================");
			System.out.println("                            Admin Menu                          ");
			System.out.println("================================================================");
			

			System.out.println("\t [1] Add Products");
			System.out.println("\t [2] View All Products");
			System.out.println("\t [3] View Specific Product");
			System.out.println("\t [4] Update Product");
			System.out.println("\t [5] Delete Product");
			System.out.println("\t [6] Logout");
			
			System.out.println("Choice =>");
			int choice=sc.nextInt();
			boolean isExit = false;
			switch(choice) {
			
			case 1:
				daoImpl.addProducts();
				break;
				
			case 2:
				List<Product> productList = daoImpl.viewAllProducts();
				if(productList.size() == 0 ) {
					System.out.println("No records found! Try adding new records");
					break;
				}
				for(Product p : productList) {
					System.out.println("\n");
					System.out.print("PID : "+p.getpId());
					System.out.print(", Product Name : "+p.getpName());
					System.out.print(", Quantity : "+p.getQty());
					System.out.println(", Price : "+p.getPrice());
				}
				break;
			
			case 3:
				System.out.println("Enter PID =>");
				int pid = sc.nextInt();
				Product p = daoImpl.viewProduct(pid);
				if(p == null) {
					System.out.println("No records found!");
					break;
				}
				System.out.println("\nProduct Found!\n");
				System.out.print("PID : "+p.getpId());
				System.out.print(", Product Name : "+p.getpName());
				System.out.print(", Quantity : "+p.getQty());
				System.out.println(", Price : "+p.getPrice());
				
				break;
				
			case 4:
				System.out.println("Enter PID =>");
				boolean status = daoImpl.updateProduct(sc.nextInt());
				if(status) {
					System.out.println("Product Updated Successfully !!");
				}
				else {
					System.out.println("Product not Found!! Enter Valid PID");
				}
				break;
				
			case 5:
				System.out.println("Enter PID =>");
				boolean flag = daoImpl.deleteProduct(sc.nextInt());
				if(flag) {
					System.out.println("Product Deleted Successfully !!");
				}
				else {
					System.out.println("Invalid PID!!");
				}
				break;
				
			case 6:
				System.out.println("Thank you!! Bye Bye!!");
				isExit = true;
				
			default:
				System.out.println("Invalid Choice!! Choose between 1-6");
			}
			
			if(isExit) break;
		}
	}
	
	public void userMenu() {
		
		while(true) {
			System.out.println("================================================================");
			System.out.println("                            User Menu                           ");
			System.out.println("================================================================");
			

			System.out.println("\t [1] View All Products");
			System.out.println("\t [2] View Specific Product");
			System.out.println("\t [3] Buy Product");
			System.out.println("\t [4] Logout");
			
			System.out.println("Choice =>");
			int choice=sc.nextInt();
			boolean isExit = false;
			switch(choice) {
			
			case 1:
				List<Product> productList = daoImpl.viewAllProducts();
				if(productList.size() == 0 ) {
					System.out.println("All Products OUT OF STOCK!! Try again Later");
					break;
				}
				for(Product p : productList) {
					System.out.println("\n");
					System.out.print("PID : "+p.getpId());
					System.out.print(", Product Name : "+p.getpName());
					System.out.print(", Quantity : "+p.getQty());
					System.out.println(", Price : "+p.getPrice());
				}
				break;
			
			case 2:
				System.out.println("Enter PID =>");
				int pid = sc.nextInt();
				Product p = daoImpl.viewProduct(pid);
				if(p == null) {
					System.out.println("No records found!");
					break;
				}
				System.out.println("\nProduct Found!\n");
				System.out.print("PID : "+p.getpId());
				System.out.print(", Product Name : "+p.getpName());
				System.out.print(", Quantity : "+p.getQty());
				System.out.println(", Price : "+p.getPrice());
				
				break;
				
			case 3:
				System.out.println("Enter PID =>");
				int buyPid = sc.nextInt();
				boolean status = daoImpl.buyProduct(buyPid);
				if(status) System.out.println("Purchase Successfull!");
				else System.out.println("Purchase Unsuccessfull!");
				break;
				
			case 4:
				System.out.println("Thank you!! Bye Bye!!");
				isExit = true;
				break;
				
			default:
				System.out.println("Invalid Choice!! Choose between 1-6");
				break;
			}
			
			if(isExit) break;
			
		}
		
	}
}
