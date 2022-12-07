/**
 * 
 */
package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

/**
 * @author mahen
 *
 */
public class LoginSteps {

	WebDriver driver=null;

	@Given("user is on signup page")
	public void user_is_on_signup_page() {
		String projectpath=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",projectpath+"/src/test/resources/Drivers/chromedriver.exe");
		
		
		driver=new ChromeDriver();
		
		driver.navigate().to("https://www.facebook.com/");
		
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
	}

	@And("user enters valid details")
	public void user_enters_valid_details() throws InterruptedException {
		
		/*WebElement saveElement=driver.findElement(By.id("u_0_0_pn"));
		JavascriptExecutor singup=(JavascriptExecutor)driver;
		singup.executeScript("arguments[0].click();", saveElement);
	*/
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[5]/a")).click();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.name("firstname")).sendKeys("Mahen");
		driver.findElement(By.name("lastname")).sendKeys("bandara");
		driver.findElement(By.name("reg_email__")).sendKeys("Test@gmail.com");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("Test@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("CucumberBasicSampleByMahendra1234");
		
		Select dateOfbirth=new Select(driver.findElement(By.id("day")));
		dateOfbirth.selectByValue("1");
		Select month=new Select(driver.findElement(By.id("month")));
		month.selectByValue("1");
		Select year=new Select(driver.findElement(By.id("year")));
		year.selectByValue("1998");
		
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[7]/span/span[2]/input")).click();
		Thread.sleep(2000);
		
		
	}

	@When("clicks on signup button")
	public void clicks_on_signup_button() throws InterruptedException {
		
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[11]/button")).sendKeys(Keys.ENTER);
		driver.getPageSource().contains("Sign");
		driver.close();
		driver.quit();
		
	}
}
