# Basic steps to create cucumber java selenium project
1.As the irst step you need to create a meven java project
Then add cucumber java dependancies to the pom.xml.
Create a folder features under src/test/resources.
Then under features folder create a new feature file "login.feature".
Create content under feature file (step definitions /Glue code)
  
    Feature: feature to test login functionality
    Scenario: Check login is successful with valid credentials
    Given user is on login page
    When user enters username and password
    And clicks on login button
    Then user is navigated to the home page

    #scenario to show how to pass parameters 
    Scenario Outline: Check login is successful with valid credentials
    Given user is on login page
    When user enters <username> and <password>
    And clicks on login button
    Then user is navigated to the home page

    Examples: 
      | username | password |
      | user1    | pass1    |
      | user2    | pass2    |
      
      
Then add step definitions/ Glue code under src/test/java


  public class LoginSteps {

	@Given("user is on login page")
	public void user_is_on_login_page() {
		System.out.println("User is on login page");
	}
	@When("user enters username and password")
	public void user_enters_username_and_password() {
		System.out.println("User enters  username and password");
	}
	@And("clicks on login button")
	public void clicks_on_login_button() {
		System.out.println("User clicks on login button");
	}
	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
		System.out.println("User navigated to the home page");
	}
}


Then create a runner class(Main Class(If there are multiple classess))

Then add 

  @RunWith(Cucumber.class)
  @CucumberOptions(features="src/test/resources/Features",glue= {"StepDefinitions"})

Then add dependancies for JUnit and Cucumber JUnit mevan dependancies
