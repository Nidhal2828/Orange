#Author: Nidhal

Feature: Orange HRM Login Pages
Background:
Given admin is in login page


Scenario: Login With Valid Credentials


When admin enter correct username "Admin" and correct password "admin123"
 
Then admin is directed to the home page 


Scenario: Login With Invalid Credentials
  
 
 When admin enter incorrect username "Nidhal" and incorrect password "nidhal123"
 
 Then an error message "Invalid credentials" is displayed
 
 