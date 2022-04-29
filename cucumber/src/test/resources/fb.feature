Feature: Validate the FaceBook Page

Scenario: Validate Login with correct userName and correct password

Given  user is on Facebook page on chrome Browser
When  user enter username and password
And user shouls click on login butoon 
Then user should verify the Homepage is displayed or not
