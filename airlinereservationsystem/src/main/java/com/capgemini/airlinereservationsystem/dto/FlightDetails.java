package com.capgemini.airlinereservationsystem.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class FlightDetails {
	
	@Id
	@Column 
	
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column
	private String flightNumber;
	
	@Column
	private String airline;
	
	
	@Column
	private int firstClassSeats;
	
	@Column
	private int  firstClassFare;
	
	@Column
	private int businessClassSeats;
	
	@Column
	private int businessClassFare;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getAirline() {
		return airline;
	}

	public void setAirline(String airline) {
		this.airline = airline;
	}

	public int getFirstClassSeats() {
		return firstClassSeats;
	}

	public void setFirstClassSeats(int firstClassSeats) {
		this.firstClassSeats = firstClassSeats;
	}

	public int getFirstClassFare() {
		return firstClassFare;
	}

	public void setFirstClassFare(int firstClassFare) {
		this.firstClassFare = firstClassFare;
	}

	public int getBusinessClassSeats() {
		return businessClassSeats;
	}

	public void setBusinessClassSeats(int businessClassSeats) {
		this.businessClassSeats = businessClassSeats;
	}

	public int getBusinessClassFare() {
		return businessClassFare;
	}

	public void setBusinessClassFare(int businessClassFare) {
		this.businessClassFare = businessClassFare;
	}

	
	
	/*
	 * public FlightDetails(int id, String flightNumber, String airline, int
	 * firstClassSeats, int firstClassFare, int businessClassSeats, int
	 * businessClassFare) { super(); this.id = id; this.flightNumber = flightNumber;
	 * this.airline = airline; this.firstClassSeats = firstClassSeats;
	 * this.firstClassFare = firstClassFare; this.businessClassSeats =
	 * businessClassSeats; this.businessClassFare = businessClassFare; }
	 */

	 
}//end of class...
