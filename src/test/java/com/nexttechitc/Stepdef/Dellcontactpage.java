package com.nexttechitc.Stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Dellcontactpage {

	WebDriver driver;
	@Given("^user visit dell homepage$")
	public void user_visit_dell_homepage() throws Throwable {
	 System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");  
	       driver=new ChromeDriver(); 
	       
	       // how to open URL
		   driver.get("https://www.dell.com/");
		               Thread.sleep(3000);
	}

	@When("^user click on dell contact page$")
	public void user_click_on_dell_contact_page() throws Throwable {
	    
	}

	@Then("^user should be able to rediract contact page$")
	public void user_should_be_able_to_rediract_contact_page() throws Throwable {
	    
	}


}
