#This feature file contains few test scenarios to verify Rest API services
#Author: Rama Krishna
Feature: To verify getCountries with Rest Assured
@API_Test
Scenario: To verify Rest service - GET Method
Given To initiate Rest service to get country details with code as "https://api.first.org/data/v1/countries"
Then Respose status code should be "200"
And response should includes the following
| CountryId  | CountryName | CountryFlag |
|3|Canada| https://apaylo-bucket.s3.ca-central-1.amazonaws.com/Canada+Flag.png         |