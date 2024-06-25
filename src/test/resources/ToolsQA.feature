Feature: Automation practice with the DemoQA site


	Background: Open Page
		Given User is on demo qa site "https://demoqa.com/"
		
		Scenario: Web Table
			When User chooses "Elements" card
			When User enters "Web Tables" menu
			And User adds new user
			And User deletes a newly added user
			Then User successfully performs actions on the web table page
