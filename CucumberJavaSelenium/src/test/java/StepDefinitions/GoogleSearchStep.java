/**
 * 
 */
package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;


/**
 * @author mahen
 *
 */
public class GoogleSearchStep {

	WebDriver driver=null;
	@Given("browser is open")
	public void browser_is_open() {
		System.out.println("Browser is open");
		
		String projectpath=System.getProperty("user.dir");
		
		System.setProperty("webdriver.chrome.driver",projectpath+"/src/test/resources/Drivers/chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver","E:/Internship(QA Engineer)/CucumberJavaSelenium/src/test/resources/Drivers/chromedriver.exe");
		
		driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		
		//driver.manage().window().maximize();
		
	}

	@And("user is on google search")
	public void user_is_on_google_search() {
		System.out.println("User is on google search");
		
		driver.navigate().to("https://www.google.com/");
	
		
		
	}

	@When("user enters  text in search box")
	public void user_enters_text_in_search_box() {
		System.out.println("User enters text in search box");
		
		driver.findElement(By.name("q")).sendKeys("Mahendra Etampawala");
		
	}

	@And("hist enter")
	public void hist_enter() {
		System.out.println("User hits the enter");
		
		
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}

	@Then("user is navigated to results")
	public void user_is_navigated_to_results() {
		System.out.println("User navigated to results");
		
		driver.getPageSource().contains("Mahendra Etampawala");
		driver.close();
		driver.quit();
		
	}
}
