Feature: Amazon Search

@Smoke
Scenario: Search a Product MacBook Air
Given I have a search field on Amazon Page
When I search for a product with name "Apple MacBook Air" and price 1000
Then Product with name "Apple Macbook Air" should be displayed
Then Order id is 12345 and username is "Rajeev"

@Regression
Scenario: Search a Product Iphone
Given I have a search field on Amazon Page
When I search for a product with name "Apple iPhone 12" and price 1200
Then Product with name "Apple iPhone 12" should be displayed
Then Order id is 5677 and username is "Rajeev Anand"