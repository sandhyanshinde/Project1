package StepDef;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleStep1 {
	
	WebDriver driver;
	@Given("open Google applicatio")
	public void open_google_applicatio() 
	{
	    System.out.println("Google Application Is open");
	    driver=new ChromeDriver();
	    driver.get("https://www.google.com/");
	}

	@When("iget Actual Tiitle of the Application")
	public void iget_actual_tiitle_of_the_application() 
	{
		System.out.println("Actual tittle is Captured");
		System.out.println(driver.getTitle());
		
	}

	@Then("actual title Should be Equal expected tittle")
	public void actual_title_should_be_equal_expected_tittle() 
	{
		System.out.println("Tittle validation is confirmd");
		Assert.assertTrue(driver.getTitle().equals("Google"),"tittle is not match");
		System.out.println("Yes tittle is matched... testcase is passed!!!");
		//driver.close();
	}
	@When("i search valid keyword {string}")
	public void i_search_valid_keyword(String data)
	{
		driver.findElement(By.name("q")).sendKeys(data,Keys.ENTER);
	   
	}

	@Then("i should get valid result")
	public void i_should_get_valid_result() 
	{
		System.out.println("valid title captured" +driver.getCurrentUrl());
	   
	}





}
