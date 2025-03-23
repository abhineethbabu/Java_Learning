package com.sms.dao.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.sms.dao.UserDao;
import com.sms.model.User;

public class UserDaoImpl implements UserDao {
	

	Scanner sc = new Scanner(System.in);
	List<User> userList = new ArrayList<>();
	public static int curUid = 100;

	@Override
	public void addRegister() {
		// TODO Auto-generated method stub
		System.out.println("\n\n\tWelcome to the application!");
		boolean isAdmin;
		
		while(true) {
			System.out.println("\nSelect Access Role\n\t(1) Admin\n\t(2) User\n");
			System.out.println("Choice (1 or 2) =>");
			int choice = sc.nextInt();
			if(choice==1) {
				isAdmin = true;
				break;
			}
			else if(choice==2) {
				isAdmin = false;
				break;
			}
			else {
				System.out.println("\nInvalid Choice!! ");
			}
		}
		
		System.out.println("\n\nEnter First Name => ");
		String fName = sc.next();
		
		System.out.println("\nEnter Last Name => ");
		String lName = sc.next();
		
		System.out.println("\nEnter Email => ");
		String email = sc.next();
		
		System.out.println("\nEnter Mobile Number => ");
		String number = sc.next();
		
		System.out.println("\nEnter Username => ");
		String username = sc.next();
		
		System.out.println("\nEnter Password => ");
		String password = sc.next();
		
		int uid = curUid++;
		
		User newUser = new User(uid, fName, lName, email, number, username, password,isAdmin);
		userList.add(newUser);
		
		System.out.println("\n\n\tUser Registration Successfully!\n\n");
				
	}

	@Override
	public int verifyUser(String username, String password) {
		// TODO Auto-generated method stub
		// return 0 if fail, 1 if admin, 2 if user	
		int verify = 0;
		for(User obj : userList) {
			System.out.println(obj.getUsername() +" - "+obj.getPassword());
			if(obj.getUsername().equals(username) && obj.getPassword().equals(password)) {
				if(obj.isAdmin()) verify = 1;
				else verify = 2;
				System.out.println("\n\nLogin Successful!!");
				System.out.println("================================================================");
				System.out.println("                  WELCOME "+obj.getFirstName().toUpperCase()+" "+obj.getLastName().toUpperCase());
				System.out.println("================================================================");
				return verify;
			}
		}
		return verify;
	}

	@Override
	public String forgotPassword(String email) {
		// TODO Auto-generated method stub
		String password = "";
		for(User obj : userList) {
			if(obj.getEmail()==email) {
				password = obj.getPassword();
				break;
			}
		}
		return password;
	}

}
