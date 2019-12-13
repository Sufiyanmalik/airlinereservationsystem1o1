package com.capgemini.airlinereservationsystem;



import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.capgemini.airlinereservationsystem.dao.AdminDao;
import com.capgemini.airlinereservationsystem.dto.AirportDetails;
import com.capgemini.airlinereservationsystem.dto.FlightDetails;
import com.capgemini.airlinereservationsystem.dto.FlightSchedule;

@SpringBootTest
class AdminDAOImplTest {

	@Autowired
	private AdminDao adminDao;

	/*------------------------ ADD AIRPORT TEST CASES ----------------------------------*/
	@Test
	public void testAddAirportInformation()
	{
		AirportDetails airportDetails = new AirportDetails();
		airportDetails.setAbbreviation("RJS");
		airportDetails.setAirportName("Raja Maan Singh Airport");
		airportDetails.setCity("Jaipur");
		airportDetails.setState("Rajasthan");
		airportDetails.setZipCode(555555);
		Assert.assertEquals(true, adminDao.addAirportInformation(airportDetails));
	}

	@Test
	public void testAddAirportInformation2()
	{
		AirportDetails airportDetails = new AirportDetails();
		airportDetails.setAbbreviation("LKO");
		airportDetails.setAirportName("Kaalicharan Airport");
		airportDetails.setCity("Lucknow");
		airportDetails.setState("Uttar Pradesh");
		airportDetails.setZipCode(226010);
		Assert.assertEquals(true, adminDao.addAirportInformation(airportDetails));
	}

	@Test
	public void testAddAirportInformation3()
	{
		AirportDetails airportDetails = new AirportDetails();
		airportDetails.setAbbreviation("RJS");
		airportDetails.setAirportName("Raja Maan Singh Airport");
		airportDetails.setCity("Jaipur");
		airportDetails.setState("Rajasthan");
		airportDetails.setZipCode(555555);
		Assert.assertEquals(false, adminDao.addAirportInformation(airportDetails));

	}
	@Test
	public void testAddAirportInformation4()
	{
		AirportDetails airportDetails = new AirportDetails();
		airportDetails.setAbbreviation("LKO");
		airportDetails.setAirportName("Kaalicharan Airport");
		airportDetails.setCity("Lucknow");
		airportDetails.setState("Uttar Pradesh");
		airportDetails.setZipCode(226010);
		Assert.assertEquals(false, adminDao.addAirportInformation(airportDetails));
	}
	
	
	/*------------------------------ADD FLIGHT DETAILS TEST CASES------------------------------*/	
	@Test
	public void addFlightDetails() {
		FlightDetails flightDetails = new FlightDetails();
		//flightDetails.setId(4);
		flightDetails.setAirline("100");
		flightDetails.setFlightNumber("SF625A");
		flightDetails.setFirstClassSeats(33);
		flightDetails.setFirstClassFare(3000);
		flightDetails.setBusinessClassSeats(38);
		flightDetails.setBusinessClassFare(5600);
		Assert.assertEquals(true, adminDao.addFlightDetails(flightDetails));

	}

	@Test
	public void addFlightDetails2() {
		FlightDetails flightDetails = new FlightDetails();
		//flightDetails.setId(5);
		flightDetails.setAirline("102");
		flightDetails.setFlightNumber("AM115F");
		flightDetails.setFirstClassSeats(43);
		flightDetails.setFirstClassFare(8000);
		flightDetails.setBusinessClassSeats(56);
		flightDetails.setBusinessClassFare(12000);
		Assert.assertEquals(true, adminDao.addFlightDetails(flightDetails));

	}

	@Test
	public void addFlightDetails3() {
		FlightDetails flightDetails = new FlightDetails();
		flightDetails.setId(4);
		flightDetails.setAirline("101");
		flightDetails.setFlightNumber("MA125F");
		flightDetails.setFirstClassSeats(40);
		flightDetails.setFirstClassFare(6000);
		flightDetails.setBusinessClassSeats(52);
		flightDetails.setBusinessClassFare(9000);
		Assert.assertEquals(false, adminDao.addFlightDetails(flightDetails));

	}

	@Test
	public void addFlightDetails4() {
		FlightDetails flightDetails = new FlightDetails();
		flightDetails.setId(1);
		flightDetails.setAirline("111");
		flightDetails.setFlightNumber("KF332S");
		flightDetails.setFirstClassSeats(23);
		flightDetails.setFirstClassFare(9000);
		flightDetails.setBusinessClassSeats(30);
		flightDetails.setBusinessClassFare(12000);
		Assert.assertEquals(false, adminDao.addFlightDetails(flightDetails));

	}
	/*------------------------ UPDATE FLIGHT DETAILS TEST CASES---------------------------*/
	@Test
	public void testUpdateFlightDetails() {
		FlightDetails updatedFlightDetails = new FlightDetails();
		updatedFlightDetails.setId(3);
		updatedFlightDetails.setFlightNumber("BD115A");
		updatedFlightDetails.setAirline("320");
		updatedFlightDetails.setFirstClassSeats(20);
		updatedFlightDetails.setFirstClassFare(5000);
		updatedFlightDetails.setBusinessClassSeats(30);
		updatedFlightDetails.setBusinessClassFare(3200); 
		Assert.assertEquals(true, adminDao.updateFlightDetails(updatedFlightDetails));

	}

	@Test
	public void testUpdateFlightDetails2() {
		FlightDetails updatedFlightDetails = new FlightDetails();
		updatedFlightDetails.setId(5);
		updatedFlightDetails.setFlightNumber("BD115A");
		updatedFlightDetails.setAirline("320");
		updatedFlightDetails.setFirstClassSeats(20);
		updatedFlightDetails.setFirstClassFare(5000);
		updatedFlightDetails.setBusinessClassSeats(30);
		updatedFlightDetails.setBusinessClassFare(3200); 
		Assert.assertEquals(true, adminDao.updateFlightDetails(updatedFlightDetails));

	}
	/*----------------------DELETE FLIGHT DETAILS TEST CASES---------------------------*/

	@Test
	public void testDeleteFlightDetails() {
		FlightDetails flightDetails = new FlightDetails();
		flightDetails.setId(20);
		Assert.assertEquals(true, adminDao.deleteFlightDetail(flightDetails));
	}

	@Test
	public void testDeleteFlightDetails3() {
		FlightDetails flightDetails = new FlightDetails();
		flightDetails.setId(5);
		Assert.assertEquals(false, adminDao.deleteFlightDetail(flightDetails));
	}

	/*----------------------GET FLIGHT DETAILS TEST CASES--------------------------------*/

	@Test
	public void testGetFlightDetails() {
		Assert.assertEquals(12, adminDao.getFlightDetails().size());
		//Assert.fail("wrong input");

	}

	/*------------------------SCHEDULE FLIGHT TEST CASES--------------------------------*/

	@Test
	public void testScheduleFlight() {
		FlightSchedule flightSchedule = new FlightSchedule();
		flightSchedule.setScheduleId(1);
		flightSchedule.setDepartureDate("10/12/2019");
		flightSchedule.setDepartureTime("13:00");
		flightSchedule.setArrivalCity("Lucknow");
		flightSchedule.setArrivalDate("10/12/2019");
		flightSchedule.setArrivalTime("16:00");
		flightSchedule.setAirline("Indigo");
		flightSchedule.setBusinessClassFare(4000);
		flightSchedule.setBusinessClassSeats(41);
		flightSchedule.setFirstClassFare(6000);
		flightSchedule.setFirstClassSeats(50);
		flightSchedule.setFlightNumber("BA1006");
		Assert.assertEquals(true, adminDao.scheduleFlight(flightSchedule));
	}

	@Test
	public void testScheduleFlight2() {
		FlightSchedule flightSchedule = new FlightSchedule();
		flightSchedule.setScheduleId(1);
		flightSchedule.setDepartureDate("15/12/2019");
		flightSchedule.setDepartureTime("10:00");
		flightSchedule.setArrivalCity("Delhi");
		flightSchedule.setArrivalDate("15/12/2019");
		flightSchedule.setArrivalTime("14:00");
		flightSchedule.setAirline("Indigo");
		flightSchedule.setBusinessClassFare(5200);
		flightSchedule.setBusinessClassSeats(66);
		flightSchedule.setFirstClassFare(8500);
		flightSchedule.setFirstClassSeats(70);
		flightSchedule.setFlightNumber("LN4050");

		FlightSchedule schedule = adminDao.findById(1);
		Assert.assertEquals(false, adminDao.scheduleFlight(flightSchedule));
	}


}
