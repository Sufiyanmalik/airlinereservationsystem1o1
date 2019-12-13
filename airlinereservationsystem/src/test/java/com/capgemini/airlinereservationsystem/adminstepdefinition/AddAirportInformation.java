package com.capgemini.airlinereservationsystem.adminstepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddAirportInformation {
	@Given("^A set of new airport information details$")
	public void given() throws Throwable {
		System.out.println("This step gievs a new set of airport information avaliable");
	}

	@When("^I add all the new airport details $")
	public void when() throws Throwable {
		System.out.println("This step adds the new set of airport details");
	}

	@Then("^I add a new airport information$")
	public void then() throws Throwable {
		System.out.println("This step adds a new airport information");
	}

}
