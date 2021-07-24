@smokeTest@regressionTest
Feature: verify login feature in orange HRM website 

Scenario: User able to successfully login Hrm home page 
	Given User go to orange hrm home page 
	When user enter valid username and password 
	And user click on the login button 
	Then user navigate to the welcome page 
	And user verify the page title as "OrangeHRM" 
	And user verify user name is displays at top right 
	Then user log out 
	And user close browser 