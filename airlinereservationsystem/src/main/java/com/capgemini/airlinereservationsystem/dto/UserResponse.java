package com.capgemini.airlinereservationsystem.dto;

import java.util.List;

public class UserResponse {
	private int statusCode;
	private String message;
	private UserInformation userInformation;
	private String description;
	private List<FlightSchedule> flightSchedules;


	public List<FlightSchedule> getFlightSchedules() {
		return flightSchedules;
	}

	public void setFlightSchedules(List<FlightSchedule> flightSchedules) {
		this.flightSchedules = flightSchedules;
	}

	public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public UserInformation getUserInformation() {
		return userInformation;
	}

	public void setUserInformation(UserInformation userInformation) {
		this.userInformation = userInformation;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}//end of class
