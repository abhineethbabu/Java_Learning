package com.sms.dao;

public interface UserDao {
	void addRegister();
	int verifyUser(String username, String password);
	String forgotPassword(String email);
}
