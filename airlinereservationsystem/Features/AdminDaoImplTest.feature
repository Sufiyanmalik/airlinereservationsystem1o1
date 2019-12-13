Feature: User functionality on the page of Application 
@tag1 
Scenario: Add airport information. 
	Given A set of new airport information details. 
	When I add all the new airport details 
	Then I add a new airport information
	
@tag2
Scenario: Add flight details. 
	Given A set of information avaliable for a given flight. 
	When I add all the flight information avaliable 
	Then I add the present flight details

@tag3	
Scenario: Update flight details 
	Given A set of updated information avaliable for a given flight 
	When I update all the new flight details 
	Then I update a new flight information
	
@tag4	
Scenario: Delete flight details 
	Given A set of flight details 
	When A user cancels a flight
	Then I delete the user detail present in database
	
@tag5	
Scenario: Get flight details  //to be cheaked
	Given A set of information present for the avaliable flights 
	When A new flight needs to be scheduled 
	Then I get all the information present
	
@tag6	
Scenario: Schedule flight  
	Given A set of flight information is avaliable
	When A user requests 
	Then I schedule flight for the user
	