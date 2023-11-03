@SCRUM-1249
Feature: Default

	Background:
		#@SCRUM-1248
		Given Users should go to the Authorization page
		And Users should enter valid user name
		* Users should enter valid password
		* Users should click the Log in button
		Then Users are on the Portal page
		When Users click profile dropdown should see Log out option
		And Users click Log out option
		Then Users should be on the Authorization page
		
		
		

	#User should not able to go back to homepage by clicking step back button
	@SCRUM-1245
	Scenario: Log out function 2
		Users should not able to go back to homepage by clicking step back button
		When Users click the step back button
		Then Users should stay on the same page
		Then users