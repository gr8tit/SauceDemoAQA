# Selenium Java TestNG Project for Login and Sort Test of Saucelabs #

This project is a sample Selenium Java TestNG project for performing login and sort tests on the Saucelabs demo website (https://www.saucedemo.com/). The project uses the Page Object Model (POM) design pattern for maintaining a clear separation of concerns between the test code and the page elements.

# Tools and Technologies Used #
Selenium WebDriver: For automating browser interactions
TestNG: For writing and executing tests
Log4j: For generating logs and reports
Maven: For project management and dependency resolution
IntelliJ IDEA: As the development IDE

# Prerequisites #
Java JDK 8 or above
Maven 3.0 or above
Firefox or Chrome browser

## Getting Started ##
Clone the project from the GitHub repository.
Import the project into IntelliJ IDEA as a Maven project.
Download the dependencies specified in the pom.xml file.
Run the tests by running each testng test class from config mvn test command.

# Project Structure #
src/main/java/pages: This package contains the page classes for the different pages on the Saucelabs demo website.
src/main/java/utils: This package contains the utility classes for reading the config.properties file and for setting up the logger.
src/test/java/tests: This package contains the test classes for the login and sort tests.
src/test/resources: This directory contains the config.properties and log4j2.xml files, as well as the testng.xml file for configuring the test suite and test cases to run.
target: This directory contains the generated reports and logs.

# Test Cases #
Login Test: This test case logs into the Saucelabs demo website using valid credentials and verifies that the correct products are displayed on the inventory page.
Sort Test: This test case logs into the Saucelabs demo website using valid credentials, sorts the products by name in ascending order, and verifies that the products are displayed in the correct order. It then sorts the products by name in descending order and verifies that the products are displayed in the correct order.

# Reports and Logs #
The project uses Log4j for generating logs and reports. The logs are generated in the target/logs directory, while the HTML reports are generated in the target/surefire-reports directory. The HTML reports provide detailed information about the tests that were run, including test results, test duration, and any error or failure messages.

Contributors
Temitope Oyedemi

#License
This project is an Interbiew Assessment Test.
