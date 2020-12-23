Feature: Login Page feature
   
Scenario: Login with correct username and password
Given user is on loginpage
When user enters "EnterYourUsername" and "EnterYourPassword"
And user clicks on login button
Then Home page of the application should open


Scenario: Login with Incorrect username and Incorrect password
Given user is on loginpage
When user enters "TestK5050" and "Abcde321"
And user clicks on login button
Then it should shows the error msg


Scenario: Login with correct EmailAddress and password
Given user is on loginpage
When user enters "EnterYourEmailAddress" and "EnterYourPassword"
And user clicks on login button
Then Home page of the application should open

Scenario: Login with Incorrect EmailAddress and Incorrect password
Given user is on loginpage
When user enters "Tech@gmail.com" and "Devtect@631"
And user clicks on login button
Then it should shows the error msg


   

   
