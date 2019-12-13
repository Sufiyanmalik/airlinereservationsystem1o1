package com.capgemini.airlinereservationsystem.adminstepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

public class UpdateFlightDetails {
  @Given("^A set of updated information avaliable for a given flight$")
  public void given() throws Throwable {
	  System.out.println("This step gives a new set of flight");
  }

  @When("^I update all the new flight details$")
  public void when() throws Throwable {
	  System.out.println("This step updates the flight details");
  }

  @Then("^I update a new flight information$")
  public void then() throws Throwable {
	  System.out.println("This step update a new flight details");
  }

}
