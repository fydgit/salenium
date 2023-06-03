package com.nexttechitc.Stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CVSsearch {
	
	
	WebDriver driver;
@Given("^user go to CVS homepage$")
public void user_go_to_CVS_homepage() throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");  
    driver=new ChromeDriver(); 
    
    // how to open URL
	   driver.get("https://www.cvs.com/");
	               Thread.sleep(3000);
}

@When("^user click on CVS search option$")
public void user_click_on_CVS_search_option() throws Throwable {
    
}

@Then("^user will able to type on Search option$")
public void user_will_able_to_type_on_Search_option() throws Throwable {
   
}



}
