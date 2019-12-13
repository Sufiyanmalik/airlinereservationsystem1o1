package com.capgemini.airlinereservationsystem.service;

import java.util.List;

import com.capgemini.airlinereservationsystem.dto.FlightSchedule;
import com.capgemini.airlinereservationsystem.dto.UserInformation;

public interface UserService {
	
	public boolean registerUser(UserInformation userInformation);
	 
	public UserInformation login(String emailId, String password);
	
	public List<FlightSchedule> showAvailableFlight(FlightSchedule flightSchedule);
}
