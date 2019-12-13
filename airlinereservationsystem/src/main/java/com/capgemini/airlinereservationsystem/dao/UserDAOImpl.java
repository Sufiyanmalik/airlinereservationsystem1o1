package com.capgemini.airlinereservationsystem.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.capgemini.airlinereservationsystem.dto.FlightSchedule;
import com.capgemini.airlinereservationsystem.dto.UserInformation;

@Repository
public class UserDAOImpl implements UserDAO {

	@PersistenceUnit
	private EntityManagerFactory emf;
	
	

	/* ----------------------- REGISTRATION -------------------------------- */
	@Override
	public boolean registerUser(UserInformation userInformation) {
		EntityManager manager = emf.createEntityManager();
		EntityTransaction ts = manager.getTransaction();
		boolean isRegistered = false;

		try {
			ts.begin();
			manager.persist(userInformation);
			ts.commit();
			isRegistered = true;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		manager.close();

		return isRegistered;
	} // end of registerUser() method

	/*----------------------- LOGIN-------------------------------- */
	@Override
	public UserInformation login(String emailId, String password) {

		EntityManager manager = emf.createEntityManager(); 
		String jpql = "from UserInformation where emailId=:emailId and password=:password";
		Query query = manager.createQuery(jpql);
		query.setParameter("emailId", emailId);
		query.setParameter("password", password);

		UserInformation userInformation = null;
		try { 
			
			userInformation = (UserInformation) query.getSingleResult();
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		manager.close();
		return userInformation;
	}

	@Override
	public List<UserInformation> getAllUsers() {
		EntityManager manager = emf.createEntityManager();
		String jpql = "from UserInformation";
		Query query = manager.createQuery(jpql);

		List<UserInformation> usersList = null;
		try {
			usersList = query.getResultList();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return usersList;
	}
	
	/*---------- SHOWING-AVAILABLE-FLIGHTS-BASED-ON-REQUEST ------------ */
	@Override
	public List<FlightSchedule> showAvailableFlight(FlightSchedule flightSchedule) {
		String sourceCity = flightSchedule.getDepartureCity();
		String destinationCity = flightSchedule.getArrivalCity();
		String departureDate = flightSchedule.getDepartureDate();
		EntityManager manager = emf.createEntityManager(); 
		String jpql = "from FlightSchedule where departureCity=:deptCity and arrivalCity=:arrCity and departureDate=:deptDate";
		Query query = manager.createQuery(jpql);
		query.setParameter("deptCity", sourceCity);
		query.setParameter("arrCity", destinationCity);
		query.setParameter("deptDate", departureDate);

		List<FlightSchedule> flightSchedules = null;
		try {  
			
			flightSchedules = (List<FlightSchedule>) query.getResultList();
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		manager.close();
		return flightSchedules;
	}// end of showAvailableFlight() method 



}// end of class--
