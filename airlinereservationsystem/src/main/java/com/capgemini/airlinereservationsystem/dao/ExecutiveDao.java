package com.capgemini.airlinereservationsystem.dao;

import java.util.List;

import com.capgemini.airlinereservationsystem.dto.FlightSchedule;

public interface ExecutiveDao {

	public List<FlightSchedule> showTodaysFlight(String todayDate);
	
}//end of ExecutiveDao interace...
