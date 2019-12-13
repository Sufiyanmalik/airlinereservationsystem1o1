package com.capgemini.airlinereservationsystem.dto;

import java.util.List;

public class AdminResponse {

	private int statusCode;
	private String message;
	private String description;
	private List<FlightDetails> flightDetails;
	
	
	//Setters && Getters
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<FlightDetails> getFlightDetails() {
		return flightDetails;
	}
	public void setFlightDetails(List<FlightDetails> flightDetails) {
		this.flightDetails = flightDetails;
	} 
	
}
