package com.capgemini.airlinereservationsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.airlinereservationsystem.dao.UserDAO;
import com.capgemini.airlinereservationsystem.dto.FlightSchedule;
import com.capgemini.airlinereservationsystem.dto.UserInformation;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserDAO dao;

	@Override
	public boolean registerUser(UserInformation userInformation) {
		return dao.registerUser(userInformation);
	}

	@Override
	public UserInformation login(String emailId, String password) {
		return dao.login(emailId, password);
	}
	
	@Override
	public  List<FlightSchedule> showAvailableFlight(FlightSchedule flightSchedule) {
		return  dao.showAvailableFlight(flightSchedule);
	}


}
