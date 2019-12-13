package com.capgemini.airlinereservationsystem.userstepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefinition {
	
	@Given("^Open the Chrome and launch the application$")				
    public void open_the_Chrome_and_launch_the_application() throws Throwable							
    {		
        System.out.println("This Step open the Chrome and launch the application.");					
    }		

    @When("^Enter the valid username and password and click on submit button$")					
    public void enter_the_valid_username_and_password_and_click_on_submit_button() throws Throwable 							
    {		
       System.out.println("This step validates the username and password on the login page.");					
    }		

    @Then("^Login the user$")					
    public void login_the_user() throws Throwable 							
    {    		
        System.out.println("This step click on the login button.");					
    }

}
