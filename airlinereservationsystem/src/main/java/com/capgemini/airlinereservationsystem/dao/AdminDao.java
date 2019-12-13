package com.capgemini.airlinereservationsystem.dao;

import java.util.List;

import com.capgemini.airlinereservationsystem.dto.AirportDetails;
import com.capgemini.airlinereservationsystem.dto.FlightDetails;
import com.capgemini.airlinereservationsystem.dto.FlightSchedule;

public interface AdminDao{
	public boolean addAirportInformation(AirportDetails airportDetails);

	public boolean addFlightDetails(FlightDetails flightDetails);

	public boolean updateFlightDetails(FlightDetails flightDetails);

	public boolean deleteFlightDetail(FlightDetails flightDetails);

	public List<AirportDetails> getAllAirports();

	public List<FlightDetails> getFlightDetails();

	public boolean scheduleFlight(FlightSchedule flightSchedule);
	
	public FlightSchedule findById(int i);


}//end of AdminDao interface
