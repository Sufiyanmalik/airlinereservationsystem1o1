package com.capgemini.airlinereservationsystem.runnertest;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Features", glue = { "AddAirportInformation", "AddFlightDetails", "DeleteFlightDetails",
		"GetFlightDetails", "ScheduleFlight",
		"UpdateFlightDetails" }, plugin = { "pretty", "html:target/cucumber-reports" })
public class AdminDaoImplRunnerTest {

}
