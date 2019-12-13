package com.capgemini.airlinereservationsystem.dao;


import java.sql.ResultSet;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

import com.capgemini.airlinereservationsystem.dto.AirportDetails;
import com.capgemini.airlinereservationsystem.dto.FlightDetails;
import com.capgemini.airlinereservationsystem.dto.FlightSchedule;

@Repository
public class AdminDaoImplementation implements AdminDao {
	
	@PersistenceUnit
	private EntityManagerFactory entityManagerFactory;
	
	/* ----------------------- ADD-AIRPORTS DETAILS -------------------------------- */
	@Override
	public boolean addAirportInformation(AirportDetails airportDetails) { 
		EntityManager manager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		boolean isAdded = false;

		try {
			
			transaction.begin();
			manager.persist(airportDetails);
			transaction.commit();
			isAdded = true;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		manager.close();

		return isAdded;
	} // end of registerUser() method

	
	/* ----------------------- ADD-FLIGHT DETAILS -------------------------------- */
	@Override
	public boolean addFlightDetails(@RequestBody FlightDetails flightDetails) {
		EntityManager manager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		boolean isAdded = false;

		try {
			transaction.begin();
			FlightDetails details = manager.find(FlightDetails.class, flightDetails.getId());
			manager.persist(flightDetails);
			isAdded = true;
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		manager.close();

		return isAdded;
	}// end of addFlightDetails() method 


	/* ----------------------- UPDATE-FLIGHT DETAILS -------------------------------- */
	@Override
	public boolean updateFlightDetails(FlightDetails flightDetails) {
		EntityManager manager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		boolean isUpdated = false;

		try {
			transaction.begin();
			FlightDetails details = manager.find(FlightDetails.class, flightDetails.getId());
			details.setFlightNumber(flightDetails.getFlightNumber());
			details.setAirline(flightDetails.getAirline());
			details.setFirstClassSeats(flightDetails.getFirstClassSeats());
			details.setFirstClassFare(flightDetails.getFirstClassFare());
			details.setBusinessClassSeats(flightDetails.getBusinessClassSeats());
			details.setBusinessClassFare(flightDetails.getBusinessClassFare()); 
			//manager.persist(details);
			transaction.commit();
			isUpdated = true;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		manager.close();

		return isUpdated;
	}// end of addFlightDetails() method 


	/* ----------------------- DELETE-FLIGHT DETAILS -------------------------------- */
	@Override
	public boolean deleteFlightDetail(FlightDetails flightDetails) { 
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		
		boolean isDeleted = false;

		try {
			transaction.begin();
			FlightDetails details = entityManager.find(FlightDetails.class, flightDetails.getId());
			entityManager.remove(details);
			transaction.commit();
			isDeleted = true;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		entityManager.close(); 
		return isDeleted;
		
	}// end of deleteFlightDetail() method 


	@Override
	
	public List<AirportDetails> getAllAirports() {
		EntityManager manager = entityManagerFactory.createEntityManager();
		String jpql = "from AirportDetails";
		Query query = manager.createQuery(jpql);

		List<AirportDetails> airportsList = null;
		try {
			airportsList = query.getResultList();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return airportsList;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<FlightDetails> getFlightDetails() {
		EntityManager manager = entityManagerFactory.createEntityManager(); 
		String jpql = "from FlightDetails";
		Query query = manager.createQuery(jpql);
		 

		List<FlightDetails> flightDetails = null;
		try { 
			
			flightDetails = (List<FlightDetails>) query.getResultList();
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		manager.close();
		return flightDetails;
	}


	@Override
	public boolean scheduleFlight(FlightSchedule flightSchedule) {
		
		EntityManager manager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		boolean isAdded = false;

		try {
			transaction.begin();
			manager.persist(flightSchedule);
			isAdded = true;
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		manager.close(); 
		return isAdded;
	}// end of addFlightDetails() method 


	@Override
	public FlightSchedule findById( int i) {
		return null;
	
	}
	
	

}
