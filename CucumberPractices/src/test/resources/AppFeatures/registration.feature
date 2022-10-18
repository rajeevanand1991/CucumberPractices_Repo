Feature: User Registration

Scenario: user registration with different data
Given User is on registration page
When User enters following user details
	|	rajeev	|	anand	|	rajeevanand1991@gmail.com	|	9940939289	|	Madurai	|
	|	tom	|	peter	|	tom@gmail.com	|	9370932247	|	London	|
	|	lisa	|	dsouza	|	lisa@gmail.com	|	8970930242	|	San Francisco	|
Then User registration should be successful

Scenario: user registration with different data with columns
Given User is on registration page
When User enters following user details with columns
	|	firstname	|	lastname	|	email	|	phone	|	city	|
	|	rajeev	|	anand	|	rajeevanand1991@gmail.com	|	9940939289	|	Madurai	|
	|	tom	|	peter	|	tom@gmail.com	|	9370932247	|	London	|
	|	lisa	|	dsouza	|	lisa@gmail.com	|	8970930242	|	San Francisco	|
Then User registration should be successful