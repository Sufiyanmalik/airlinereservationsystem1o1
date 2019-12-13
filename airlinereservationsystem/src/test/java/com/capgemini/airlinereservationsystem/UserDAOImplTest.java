package com.capgemini.airlinereservationsystem;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.capgemini.airlinereservationsystem.dao.UserDAO;
import com.capgemini.airlinereservationsystem.dto.LoginBean;
import com.capgemini.airlinereservationsystem.dto.UserInformation;

@SpringBootTest
class UserDAOImplTest {

	@Autowired
	private UserDAO userDAO;

	/*------------------------- REGISTER USER TEST CASES -----------------------------------------*/
	@Test
	public void testRegisterUser() {
		UserInformation information = new UserInformation();
		// userDAO.registerUser(information);
		/* UserInformation information = new UserInformation();
		 *  */
		information.setUserId("i103");
		information.setFirstName("Antul");
		information.setLastName("Kumar");
		information.setEmailId("antul@gmail.com");
		information.setPassword("antul@123");
		information.setContact(1254854629);
		information.setRole("User");
		information.setGender('M');
		information.setSecurityQuestion("Red");

		// List<UserInformation> list = userDAO.getAllUsers();
		Assert.assertEquals(true, userDAO.registerUser(information));

	}

	/*-----------------------  LOGIN TEST CASES ---------------------------------------*/
	@Test
	public void testLogin() {
		//UserInformation information = new UserInformation();
		LoginBean login1 = new LoginBean();
		login1.setUsername("imsfiyan@gmail.com");
		login1.setPassword("qwert");
		UserInformation information = userDAO.login(login1.getUsername(),login1.getPassword());
		Assert.assertEquals(null, information);
		//UserInformation information = UserDA
		//String email = "imsuiyan@gmail.com";
		//UserDAO userDAO = new UserDAOImpl();
		//Assert.assertEquals(pass, login.getPassword());
		//String pass = "qwert";
		//Assert.assertEquals(null, userDAO.login("imsuiyan@gmail.com", "qwert"));
	 }  

	@Test
	public void testLogin2() {
		LoginBean login2 = new LoginBean("imsufiyan@gmail.com","qwer");
		login2.setUsername("imsufiyan@gmail.com");
		UserInformation information = userDAO.login(login2.getUsername(),login2.getPassword());
		Assert.assertEquals(null, information); 
	}
	
	@Test
	public void testLogin3() {
		LoginBean login3 = new LoginBean("imsufiy@gmail.com","qwer");
		UserInformation information = userDAO.login(login3.getUsername(),login3.getPassword());
		Assert.assertEquals(null, information); 
		
	}
	
	@Test
	public void testLogin4() {
		LoginBean login3 = new LoginBean("imsufiyan@gmail.com","qwert");
		UserInformation information = userDAO.login(login3.getUsername(),login3.getPassword());
		
		Assert.assertNotNull(information);
		
	}



}
