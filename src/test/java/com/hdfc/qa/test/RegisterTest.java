package com.hdfc.qa.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.hdfc.qa.base.BaseTest;
import com.qa.pages.RegisterPage;
import com.qa.pages.RegisterSuccessPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RegisterTest extends BaseTest {
	WebDriver driver;RegisterPage reg;
	
	
public RegisterTest() {
	super();
}
@BeforeMethod	
public  void setUp() {
driver=	initiliseBrowser();
reg = new RegisterPage(driver);
reg.regiser();
  
}
	
@AfterMethod
public void tearDown() {
	 driver.close();
}



@Test(enabled =true,priority=-1)
public void VerifyRegisterWithValidCredentials() {
 reg = new RegisterPage(driver);	
reg.registerWithValidCredentilas(prop.getProperty("Name"), prop.getProperty("ValidEmailId"), prop.getProperty("ValidMobile"));	
	  
}



	@Test(enabled =true,priority=1)
public void VerifyRegisterWithInvalidCredentilas() {
		reg = new RegisterPage(driver);	
		reg.registerWithInvalidCredentilas(prop.getProperty("Name"), dataprop.getProperty("InvalidEmail"), dataprop.getProperty("InvalidMobile"));

		  SoftAssert sa = new SoftAssert();
		  RegisterSuccessPage rsp = new RegisterSuccessPage(driver);

		 String actualValidEmailerror= rsp.getActualEmailError();
		  sa.assertEquals(actualValidEmailerror, dataprop.getProperty(actualValidEmailerror));
		  
		  System.out.println("VerifyRegisterWithInvalidCredentilas is passed ");
		  	
		

  
 
}
	
	
	
	@Test(enabled =true,priority=2)
public void verifyRegisterWithInvalidMobileNumber() {
reg = new RegisterPage(driver);		
reg.registerWithInvalidMobileNumber(prop.getProperty("Name"), dataprop.getProperty("InvalidEmail"), dataprop.getProperty("InvalidMobile"));
  

  SoftAssert sa = new SoftAssert();
  RegisterSuccessPage rsp = new RegisterSuccessPage(driver);

 String actualValidMobileerror=rsp.retriveActualMobError();
 
  sa.assertEquals(actualValidMobileerror, dataprop.getProperty(actualValidMobileerror));
  System.out.println("VerifyRegisterWithInvalidCredentilas is passed ");
  
  
  
		
}
	
@Test	(enabled =true,priority=3)
public void verifyRegisterWithBlankCredentilas() throws InterruptedException {
	reg = new RegisterPage(driver);		
	reg.registerWithBlankCredentils("", "", "");
 
String fullnameError=driver.findElement(By.xpath("//p[contains(text(),'Please enter your Full Name')]"))	.getText();
String actualMobileerror=driver.findElement(By.xpath("//p[contains(text(),'Please enter valid Mobile No.')]")).getText();
String actualEmailerror= driver.findElement(By.xpath("//p[contains(text(),'Please enter valid Email ID')]")).getText();	

SoftAssert sa = new SoftAssert();
RegisterSuccessPage rsp = new RegisterSuccessPage(driver);

sa.assertEquals(fullnameError, dataprop.getProperty(fullnameError));
sa.assertEquals(actualMobileerror, dataprop.getProperty("mobileFeildError"));
sa.assertEquals(actualEmailerror, dataprop.getProperty("emailFeildError"));

}
	
	
	
	
	
	
	
}
