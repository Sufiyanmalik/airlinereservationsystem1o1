package com.capgemini.airlinereservationsystem.adminstepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

public class ScheduleFlight {
  @Given("^A set of flight information is avaliable$")
  public void given() throws Throwable {
	  System.out.println("This step show all the information of available flight");
  }

  @When("^A user requests$")
  public void when() throws Throwable {
	  System.out.println("This step accept the request of user");
  }

  @Then("^I schedule flight for the user$")
  public void then() throws Throwable {
	  System.out.println("This step makes a reservation for a user by admin");
  }

}
