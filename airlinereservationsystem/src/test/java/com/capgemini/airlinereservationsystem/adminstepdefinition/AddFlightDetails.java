package com.capgemini.airlinereservationsystem.adminstepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

public class AddFlightDetails {
  @Given("^A set of information avaliable for a given flight.$")
  public void given() throws Throwable {
	  System.out.println("This step gives a new set of flight information");
  }

  @When("^I add all the flight information avaliable $")
  public void when() throws Throwable {
	  System.out.println("This step adds the flight information");
  }

  @Then("^I add the present flight details$")
  public void then() throws Throwable {
	  System.out.println("This step adds the new flight details");
  }

}
