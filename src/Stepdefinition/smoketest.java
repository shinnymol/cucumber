package Stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class smoketest {
	
	WebDriver driver;
	
	@Given("^Open firefox and start application$")
	public void Open_firefox_and_start_application() throws Throwable 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\surya\\chromedriver.exe");
		   driver=new ChromeDriver();
		//driver.manage().window().maximize();
			driver.get("http://facebook.com");
	}

	@When("^I enter valid \"([^\"]*)\" and \"([^\"]*)\"$")
	public void I_enter_valid_username_and_password(String username, String password) throws Throwable
	{
		
	    driver.findElement(By.xpath("//*[@id='email']")).sendKeys(username);
	    driver.findElement(By.id("pass")).sendKeys(password);
	}

	@Then("^user can login successful$")
	public void user_can_login_successful() throws Throwable
	{
	    
		driver.findElement(By.id("loginbutton")).click();;
	}


}
