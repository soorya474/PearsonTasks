#Author: your.email@your.domain.com


Feature: Login feature

Scenario: I want to login to the application using valid credentials
Given: I want to launch the browser
And: I enter the url
When: Login page  is displayed and I enter the valid username and password and click on login
Then: Dashboard of the platform should be displayed

Scenario Outline: I want to login to the application with multiple invalid creddentials
Given: I want to launch the browser
And: I enter the url
When: Login page  is displayed enter "<username>" and "<password>" and click on login button
Then: Home page of the platform should not be displayed

Examples:
|username|password|
|Admin1@|Manage1@|  				  //according to the acceptance criteria*/
|Admin|Manag|									//Both credentials less than 7 characters*/
|Admin1@amin|managMang1@|			//Both credentials accept more than 14characters*/			
|Admin1@|manager|							//Password field do not accept withoot an uppercase,lowercase  and number*/
|Admin1@|Manager|							//Password field do not accept without a number*/
|Admin1@|MANAGEr|							//password field do not accept without a lowercase*/