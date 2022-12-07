/**
 * 
 */
package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

/**
 * @author mahen
 *
 */
public class LoginSteps {


	@Given("user us on login page")
	public void user_us_on_login_page() {
		System.out.println("inside step- user is on login page");
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
		System.out.println("inside step- user enters username and password");
	}

	@And("clicks on login button")
	public void clicks_on_login_button() {
		System.out.println("inside step- user clicks on");
	}

	@Then("user is nevigated to the home page")
	public void user_is_nevigated_to_the_home_page() {
		System.out.println("inside step- user login to the home page");
	}

}
