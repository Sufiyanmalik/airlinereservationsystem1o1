package com.capgemini.airlinereservationsystem.dto;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user_information")
public class UserInformation {
	
	@Id
	@Column
	private String userId;
	
	@Column
	private String firstName;
	
	@Column
	private String lastName; 
	
	@Column
	private String emailId; 
	
	@Column
	private String password; 
	
	@Column
	private long contact;
	
	@Column
	private String role ;
	
	@Column
	private String date;
	
	@Column
	private char gender;
	
	@Column
	private String securityQuestion; 


	
	public UserInformation(String userId, String firstName, String lastName, String emailId, String password,
			long contact, String role, char gender, String securityQuestion) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
		this.password = password;
		this.contact = contact;
		this.role = role;
		this.gender = gender;
		this.securityQuestion = securityQuestion;
	}
	
	public UserInformation() {
	}

	//Setters && Getters 
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	} 
	 
	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public long getContact() {
		return contact;
	}

	public void setContact(long contact) {
		this.contact = contact;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getSecurityQuestion() {
		return securityQuestion;
	}

	public void setSecurityQuestion(String securityQuestion) {
		this.securityQuestion = securityQuestion;
	}

}
