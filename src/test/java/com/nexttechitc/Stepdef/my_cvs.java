package com.nexttechitc.Stepdef;

import java.awt.Desktop.Action;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.nexttechitc.pageobjectmodel.my_cvsPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class my_cvs {
	WebDriver driver;
	@Given("^User landing cvs homepage$")
	public void user_landing_cvs_homepage() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe"); 
		driver=new ChromeDriver();
		
		driver.get("https://www.cvs.com/");
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize(); 
	}

	@When("^User click on Shop$")
	public void user_click_on_Shop() throws Throwable {
	  my_cvsPOM obj=new my_cvsPOM(driver);
	  obj.Shop().click();
	}

	@When("^User click on Shop All Categories$")
	public void user_click_on_Shop_All_Categories() throws Throwable {
		Actions act= new Actions(driver);
		 my_cvsPOM obj=new my_cvsPOM(driver);
		 obj.Shop_All_categories().click();
		 
		
	}

	@When("^User click on beauty$")
	public void user_click_on_beauty() throws Throwable {
	   
	}

	@Then("^User will able to see beauty page$")
	public void user_will_able_to_see_beauty_page() throws Throwable {
	
	}



}
