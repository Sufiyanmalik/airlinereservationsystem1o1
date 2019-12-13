package com.capgemini.airlinereservationsystem.runnertest;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)				
@CucumberOptions(features="Features",glue={"RegisterSteps, LoginStepDefinition"}, plugin={"pretty", "html:target/cucumber-reports"})
public class UserDAOImplRunnerTest {

}
