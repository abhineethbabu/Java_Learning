package com.sms.client;

import java.util.Scanner;
import com.sms.dao.impl.*;
import com.sms.dao.*;
import com.sms.details.*;

public class ProductClient {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		UserDetails obj = new UserDetails();
		UserDao daoImpl = new UserDaoImpl();
		
		while(true) {
			System.out.println("***********************************************");
			System.out.println("                [1] LOGIN                      ");
			System.out.println("                [2] REGISTER                   ");
			System.out.println("                [3] FORGOT PASSWORD            ");
			System.out.println("                [4] EXIT                       ");
			System.out.println("***********************************************");
			System.out.println("\nEnter The Choice =>");
			int choice=sc.nextInt();
			
			switch(choice) {
			
			case 1:
				System.out.println("===============================================");
				System.out.println("Username => ");
				String username = sc.next();
				System.out.println("Password => ");
				String password = sc.next();
				int status = daoImpl.verifyUser(username, password);
				if(status==1) obj.adminMenu();
				else if(status==2) obj.userMenu();
				else System.out.println("Invalid Username or Password!");
				break;
				
			case 2:
				daoImpl.addRegister();
				break;
			
			case 3:
				System.out.println("Enter email =>");
				String email = sc.next();
				String pass = daoImpl.forgotPassword(email);
				System.out.println("Your Password => "+pass);
				
				
				break;
				
			case 4:
				System.out.println("Thank you!! Bye Bye!!");
				sc.close();
				System.exit(0);
				
			default:
				System.out.println("Invalid Choice!! Choose between 1-6");
				
			}
		}
		
	}
}
