package com.nexttechitc.Stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Macys {
	
	WebDriver driver;
	@Given("^user visit Macy's homepage$")
	public void user_visit_Macy_s_homepage() throws Throwable {
	 System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe"); 
	driver=new ChromeDriver();
	
	driver.get("https://www.macys.com/");
	Thread.sleep(3000);
	
	 
	}

	@When("^user click on gifts option$")
	public void user_click_on_gifts_option() throws Throwable {
	   
	}

	@Then("^user able to see gifts page$")
	public void user_able_to_see_gifts_page() throws Throwable {
	   
	}



}
