Feature: Repository Page Test


Background:
Given user is on loginpage
When user enters "EnterYourUsername" and "EnterYourPassword"
And user clicks on login button
Then Home page of the application should open
Given user is on home page
When user clicks on Plus button in the top right side of the page
And user opens the New Repository page
Then New Repository page should open


Scenario: Repository Page Feature
Given user is on Repository page
When user enters "Repository name"
And user clicks on createRepository
Then New Repository should be created