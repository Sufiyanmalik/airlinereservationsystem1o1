package com.capgemini.airlinereservationsystem.controller;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.airlinereservationsystem.dto.AdminResponse;
import com.capgemini.airlinereservationsystem.dto.AirportDetails;
import com.capgemini.airlinereservationsystem.dto.FlightDetails;
import com.capgemini.airlinereservationsystem.dto.FlightSchedule;
import com.capgemini.airlinereservationsystem.dto.UserInformation;
import com.capgemini.airlinereservationsystem.dto.UserResponse;
import com.capgemini.airlinereservationsystem.service.AdminService;
import com.capgemini.airlinereservationsystem.service.UserService;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*", allowCredentials = "true")
public class AirlineController {

	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
	LocalDate date = LocalDate.now();
	String todayDate = formatter.format(date);

	@Autowired
	private UserService userService;
	
	@Autowired 
	private AdminService adminService; 

	/* --------------------------REGISTRATION-------------------------- */
	@PostMapping(path = "/register", produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_JSON_VALUE })
	public UserResponse registerUser(@RequestBody UserInformation userInformation) {
		String role = "user";
		userInformation.setRole(role);
		userInformation.setDate(todayDate);
		boolean isRegister = userService.registerUser(userInformation);
		UserResponse response = new UserResponse();

		if (isRegister) {
			response.setStatusCode(200);
			response.setMessage("Success");
			response.setDescription("User is registered successfully...");
			response.setUserInformation(userInformation);

		} else {
			response.setStatusCode(301);
			response.setMessage("Failed");
			response.setDescription("Unable to register the User..");
		}
		return response;
	}// end of registerUser() method ...

	/* -------------------------- LOGIN -------------------------- */
	@PostMapping(path = "/login", produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_JSON_VALUE })
	public UserResponse login(@RequestBody UserInformation userInformation) {
		String emailId = userInformation.getEmailId();
		String password = userInformation.getPassword();
		UserInformation information = userService.login(emailId, password);
		UserResponse response = new UserResponse();

		if (information != null) {
			response.setStatusCode(200);
			response.setMessage("Login Success");
			response.setDescription("User is Logged-In successfully...");
			response.setUserInformation(information);
			
		} else {
			response.setStatusCode(301);
			response.setMessage("Login Failed");
			response.setDescription("Invalid Credential...");
		}
		return response;
	}// end of login() method ...
	
	
	/* --------------------------ADD-AIRPORTS DETAILS-------------------------- */
	@PostMapping(path = "/addAirport", produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_JSON_VALUE })
	public AdminResponse addAirportDetails(@RequestBody AirportDetails airportDetails) {
		 
		boolean isAdded = adminService.addAirportInformation(airportDetails);
		AdminResponse adminResponse = new AdminResponse();
		 
		if (isAdded) {
			adminResponse.setStatusCode(200);
			adminResponse.setMessage("Success");
			adminResponse.setDescription("Airport details is added successfully...");

		} else {
			adminResponse.setStatusCode(301);
			adminResponse.setMessage("Failed!!!");
			adminResponse.setDescription("Unable to add aiport details...");
		}
		return adminResponse;
	}// end of addAirportDetails() method ...
	
	
	/* --------------------------ADD-Flight-Detail-------------------------- */
	@PostMapping(path = "/addFlightDetails", produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_JSON_VALUE })
	public AdminResponse addFlightDetails(@RequestBody FlightDetails flightDetails) {
		 
		boolean isAdded = adminService.addFlightDetails(flightDetails);
		AdminResponse adminResponse = new AdminResponse();
		 
		if (isAdded) {
			adminResponse.setStatusCode(200);
			adminResponse.setMessage("Success");
			adminResponse.setDescription("Flight details has been added successfully...");

		} else {
			adminResponse.setStatusCode(301);
			adminResponse.setMessage("Failed!!!");
			adminResponse.setDescription("Unable to add Flight details...");
		}
		return adminResponse;
	}// end of addFlightDetails() method ...
	
	
	/* --------------------------UPDATE-Flight-Detail-------------------------- */
	@PutMapping(path = "/updateFlightDetails", produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_JSON_VALUE })
	public AdminResponse updateFlightDetails(@RequestBody FlightDetails flightDetails) {
		boolean isUpdated = adminService.updateFlightDetails(flightDetails);
		AdminResponse adminResponse = new AdminResponse();
		if (isUpdated) {
			adminResponse.setStatusCode(200);
			adminResponse.setMessage("Update Success");
			adminResponse.setDescription("Flight details has been updated successfully...");

		} else {
			adminResponse.setStatusCode(301);
			adminResponse.setMessage("Update Failed!!!");
			adminResponse.setDescription("Unable to update Flight details...");
		} 
		return adminResponse;
	}// end of updateFlightDetails() method ...
	
	
	/* --------------------------DELETE-FLIGHT-DETAILS-------------------------- */
	@DeleteMapping(path = "/deleteFlightDetails", produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_JSON_VALUE })
	public AdminResponse deleteFlightDetail(@RequestBody FlightDetails flightDetails) {
		boolean isUpdated = adminService.deleteFlightDetail(flightDetails);
		AdminResponse adminResponse = new AdminResponse();
		if (isUpdated) {
			adminResponse.setStatusCode(200);
			adminResponse.setMessage("Delete Success");
			adminResponse.setDescription("Flight details has been deleted successfully...");

		} else {
			adminResponse.setStatusCode(301);
			adminResponse.setMessage("Delete Failed!!!");
			adminResponse.setDescription("Unable to delete Flight details...");
		} 
		return adminResponse;
	}// end of deleteFlightDetail() method ...
	
	
	/* --------------------------GET-FLIGHT-DETAILS-------------------------- */
	@GetMapping(path = "/getFlightDetails", produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_JSON_VALUE })
	public AdminResponse getFlightDetails() {
		List<FlightDetails> flightDetail= adminService.getFlightDetails();
		AdminResponse adminResponse = new AdminResponse();
		if (flightDetail != null) {
			adminResponse.setStatusCode(200);
			adminResponse.setMessage("Success");
			adminResponse.setDescription("Flight details found...");
			adminResponse.setFlightDetails(flightDetail);

		} else {
			adminResponse.setStatusCode(301);
			adminResponse.setMessage("Failed!!!");
			adminResponse.setDescription("Somethig went wrong,Unable to find...");
		} 
		return adminResponse;
	}// end of deleteFlightDetail() method ...
	
	
	/* --------------------------SCHEDULE-FLIGHT-DETAILS -------------------------- */
	@PostMapping(path = "/scheduledFlight", produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_JSON_VALUE })
	public AdminResponse scheduleFlight(@RequestBody FlightSchedule flightSchedule) {
		 
		boolean isAdded = adminService.scheduleFlight(flightSchedule);
		AdminResponse adminResponse = new AdminResponse();
		 
		if (isAdded) {
			adminResponse.setStatusCode(200);
			adminResponse.setMessage("Success");
			adminResponse.setDescription("Flight details has been added successfully...");

		} else {
			adminResponse.setStatusCode(301);
			adminResponse.setMessage("Failed!!!");
			adminResponse.setDescription("Unable to add Flight details...");
		}
		return adminResponse;
	}// end of addFlightDetails() method ...
	
	
	/* --------------------------SCHEDULE-FLIGHT-DETAILS-------------------------- */
	@PostMapping(path = "/showScheduledFlight", produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_JSON_VALUE })
	public UserResponse showAvailableFlight(@RequestBody FlightSchedule flightSchedule) {
		 List<FlightSchedule> flightSchedules = userService.showAvailableFlight(flightSchedule);
		UserResponse userResponse = new UserResponse(); 
		
		if (flightSchedules != null && !flightSchedules.isEmpty()) {
			userResponse.setStatusCode(200);
			userResponse.setMessage("Success");
			userResponse.setDescription("Available Flights based on your serach...");
			userResponse.setFlightSchedules(flightSchedules);

		} else {
			userResponse.setStatusCode(301);
			userResponse.setMessage("Failed!!!");
			userResponse.setDescription("Sorry!!! No Flight Available...");
		}
		return userResponse;
	}// end of addFlightDetails() method ...
	
	
}// End of class...
