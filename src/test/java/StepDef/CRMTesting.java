package StepDef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class CRMTesting 
{
	WebDriver driver;
	@Given("open sigin page in Crm App")
	public void open_sigin_page_in_crm_app() 
	{
		
	 driver=new ChromeDriver();	
	 driver.get("https://automationplayground.com/crm/login.html");
	  
	}

	@When("User Enter Valid EmailId {string} and valid {string} password")
	public void user_enter_valid_email_id_and_valid_password(String email, String pwd) 
	{
		driver.findElement(By.id("email-id")).sendKeys(email);
		driver.findElement(By.id("password")).sendKeys(pwd);
	   
	}
    
	@When("click on submit button")
	public void click_on_submit_button() 
	{
	   driver.findElement(By.id("submit-id")).click(); 
	}

	@Then("user should successfully Login")
	public void user_should_successfully_login() 
	{
		
		System.out.println("u R successfully Login"  +driver.getCurrentUrl());
	   
	}



	
	
}
