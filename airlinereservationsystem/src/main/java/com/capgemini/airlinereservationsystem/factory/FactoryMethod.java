package com.capgemini.airlinereservationsystem.factory;

import com.capgemini.airlinereservationsystem.service.UserService;
import com.capgemini.airlinereservationsystem.service.UserServiceImpl;

public class FactoryMethod {
		
	public static UserService getInstance() {
		UserService userService = new UserServiceImpl();
		return userService;
	} 
	
}
