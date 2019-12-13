package com.capgemini.airlinereservationsystem.adminstepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

public class GetFlightDetails {
  @Given("^A set of information present for the avaliable flights$")
  public void given() throws Throwable {
	  System.out.println("This step show the available seats");
  }

  @When("^A new flight needs to be scheduled $")
  public void when() throws Throwable {
	  System.out.println("This step accepts a request for new flight");
  }

  @Then("^I get all the information present$")
  public void then() throws Throwable {
	  System.out.println("This step show all the seats available after booking.");
  }

}
