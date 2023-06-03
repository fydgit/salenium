package com.nexttechitc.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class my_cvsPOM {

	WebDriver driver;
	public my_cvsPOM (WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id=\"HP00001\"]/div[2]/div[1]/div/button[1]")
	WebElement click_Shop ;
	public WebElement Shop() { 
	return click_Shop;
	}
	@FindBy(xpath="tabindex=\"0\"")
	WebElement act_Shop_All_categories ;
	public WebElement Shop_All_categories() { 
	return act_Shop_All_categories;
	}
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[2]/div/div[1]/div/main/div[2]/div/div[1]/nav/div[2]/div[2]/a/div/div")
	WebElement act_Beauty ;
	public WebElement Beauty() { 
	return act_Beauty;
	}
}
