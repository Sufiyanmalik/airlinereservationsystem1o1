package com.capgemini.airlinereservationsystem.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.airlinereservationsystem.dao.AdminDao;
import com.capgemini.airlinereservationsystem.dto.AirportDetails;
import com.capgemini.airlinereservationsystem.dto.FlightDetails;
import com.capgemini.airlinereservationsystem.dto.FlightSchedule;

@Service
public class AdminServiceImplementation implements AdminService {

	@Autowired
	private AdminDao adminDao;

	@Override
	public boolean addAirportInformation(AirportDetails airportDetails) { 
		return adminDao.addAirportInformation(airportDetails);

	} // end of addAirportInformation() method 
	
	@Override
	public boolean addFlightDetails(FlightDetails flightDetails) {
		return adminDao.addFlightDetails(flightDetails);
	}// end of addFlightDetails() method 

	@Override
	public boolean updateFlightDetails(FlightDetails flightDetails) {
		return adminDao.updateFlightDetails(flightDetails);
	}// end of updateFlightDetails() method 

	@Override
	public boolean deleteFlightDetail(FlightDetails flightDetails) {
		return adminDao.deleteFlightDetail(flightDetails);
	}// end of deleteFlightDetail() method 
	
	@Override
	public List<FlightDetails> getFlightDetails(){
		return adminDao.getFlightDetails();
	}// end of getFlightDetails() method 

	@Override
	public boolean scheduleFlight(FlightSchedule flightSchedule) { 
		return adminDao.scheduleFlight(flightSchedule);
	}// end of scheduleFlight() method 

	
}// end of AdminServiceImplementation class
