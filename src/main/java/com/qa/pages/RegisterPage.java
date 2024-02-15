package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	WebDriver driver;
@FindBy(xpath="//span[contains(text(),'Register')]")	
private WebElement Register;	
@FindBy(xpath="//a[contains(text(),'Register Here')]")	
private WebElement RegisterHere;	
@FindBy(xpath="//input[@id='usrname']")	
private WebElement username;	
@FindBy(xpath="//input[@id='usremail']")	
private WebElement uesrEmail;
@FindBy(xpath="//input[@id='usrmb']")
private WebElement usermob;
@FindBy(xpath="//span[contains(text(),'GET OTP')]")
private WebElement getOTP;


public RegisterPage(WebDriver driver) {
this.driver =driver;
PageFactory.initElements(driver, this);
}






	//Actions
public void regiser() {
	Register.click();
	RegisterHere.click();
}
	
public void registerWithValidCredentilas(String UserName, String Email ,String Mobile)	{
	username.sendKeys(UserName);
	uesrEmail.sendKeys(Email);
	usermob.sendKeys(Mobile);
	getOTP.click();
}
	
public void registerWithInvalidCredentilas(String UserName, String Email ,String Mobile) {
	username.sendKeys(UserName);
	uesrEmail.sendKeys(Email);
	usermob.sendKeys(Mobile);
	getOTP.click();
}
	
public void registerWithInvalidMobileNumber(String UserName, String Email ,String Mobile) {
	username.sendKeys(UserName);
	uesrEmail.sendKeys(Email);
	usermob.sendKeys(Mobile);
	getOTP.click();	
}
	
public void registerWithBlankCredentils(String UserName, String Email ,String Mobile) {
	username.sendKeys(UserName);
	uesrEmail.sendKeys(Email);
	usermob.sendKeys(Mobile);
	Actions actions = new Actions(driver);
	actions.moveToElement(getOTP).click().perform();
		
}
	
	
	
	
	
	
	
	
	
	

}
