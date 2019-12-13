package com.capgemini.airlinereservationsystem.adminstepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

public class DeleteFlightDetails {
  @Given("^A set of flight details$")
  public void given() throws Throwable {
	  System.out.println("This step gets a particular flight detail to be deleted.");
  }

  @When("^A user cancels a flight$")
  public void when() throws Throwable {
	  System.out.println("This step cancels a flight when the user requests.");
  }

  @Then("^I delete the user detail present in database$")
  public void then() throws Throwable {
	  System.out.println("This step deletes the flight details.");
  }

}
