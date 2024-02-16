package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
@FindBy(xpath="")	
	WebElement login;
	
public LoginPage(WebDriver driver) {
	
	this.driver =driver;
	PageFactory.initElements(driver, this);	
	
	
	
}
	
	
//Actions
public void clickOnLogin() {
	login.click();
}
	
	
	
	
	
	

}
