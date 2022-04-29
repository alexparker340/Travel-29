package fb.stepdef;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class stepdef{
	
	
 static WebDriver driver;
	@Given("user is on Facebook page on chrome Browser")
	public void user_is_on_Facebook_page_on_chrome_Browser() {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
	}

	

	@When("user enter username and password")
	public void user_enter_username_and_password() {
		WebElement userName = driver.findElement(By.id("email"));
		userName.sendKeys("AlexRahul");
	  WebElement pass = driver.findElement(By.id("pass"));
	  pass.sendKeys("alex@123");
	}

	@When("user shouls click on login butoon")
	public void user_shouls_click_on_login_butoon() {
		WebElement btn = driver.findElement(By.name("login"));
		btn.click();
	  driver.quit();
	}

	@Then("user should verify the Homepage is displayed or not")
	public void user_should_verify_the_Homepage_is_displayed_or_not() {
	   System.out.println("Invalid UserName and Password");
	}}

