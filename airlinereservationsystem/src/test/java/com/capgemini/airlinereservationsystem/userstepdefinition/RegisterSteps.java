package com.capgemini.airlinereservationsystem.userstepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RegisterSteps {
	
	@Given("^Open the Chrome and launch the application$")				
    public void open_the_Chrome_and_launch_the_application() throws Throwable							
    {		
        System.out.println("This Step open the Chrome and launch the application.");					
    }		

    @When("^Enter all the valid details asked$")					
    public void enter_all_the_valid_details_asked() throws Throwable 							
    {		
       System.out.println("This step validates all the fields on the register page.");					
    }		

    @Then("^Register the user$")					
    public void Register_the_user() throws Throwable 							
    {    		
        System.out.println("This step click on the Register button.");					
    }	

}
