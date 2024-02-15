package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterSuccessPage {
WebDriver driver;	
@FindBy(xpath="//p[contains(text(),'Please enter valid Email ID')]")	
WebElement actualValidEmailerror;
@FindBy(xpath="//p[contains(text(),'Please enter valid Mobile No.')]")
WebElement actualValidMobileerror;
@FindBy(xpath="//p[contains(text(),'Please enter your Full Name')]")
WebElement fullnameError;
@FindBy(xpath="//p[contains(text(),'Please enter valid Mobile No.')]")
WebElement actualMobileerror;
@FindBy(xpath="//p[contains(text(),'Please enter valid Email ID')]")
WebElement actualEmailerror;


	
public RegisterSuccessPage(WebDriver driver) {
	this .driver = driver ;
	PageFactory.initElements(driver, this);
}
	
	
//	Actions 

public String getActualEmailError() {
String error1=	actualValidEmailerror.getText();
return error1;
}
	
public String retriveActualMobError() {
	String error2=actualValidMobileerror.getText();
	return error2;
}
	


}
