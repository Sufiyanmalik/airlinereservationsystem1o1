package com.capgemini.airlinereservationsystem.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.capgemini.airlinereservationsystem.dto.FlightSchedule;

@Repository
public class ExecutiveDaoImplementation implements ExecutiveDao{

	
	@PersistenceUnit
	private EntityManagerFactory entityManagerFactory;
	
	@Override
	public List<FlightSchedule> showTodaysFlight(String todayDate) {
		
		EntityManager manager = entityManagerFactory.createEntityManager();
		String jpql = "from FlightSchedule where departureDate=:todayDate";
		Query query = manager.createQuery(jpql);
		query.setParameter("todayDate", todayDate);

		List<FlightSchedule> flightSchedules = null;
		try {

			flightSchedules = (List<FlightSchedule>) query.getResultList();

		} catch (Exception e) {
			e.printStackTrace();
		}
		manager.close();
		return flightSchedules;
		
	}//end of showTodaysFlight() method...

}// end of ExecutiveDaoImplementation class
