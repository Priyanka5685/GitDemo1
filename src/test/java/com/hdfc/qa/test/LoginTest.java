package com.hdfc.qa.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.hdfc.qa.base.BaseTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest extends BaseTest{
	
	WebDriver driver;
	@BeforeMethod	
	public  void setUp() {
	driver=	initiliseBrowser();
	  driver.findElement(By.xpath("//span[contains(text(),'Register')]")).click();
	  driver.findElement(By.xpath("//a[contains(text(),'Register Here')]")).click();
	}
		
	@AfterMethod
	public void tearDown() {
		 driver.close();
	}	
	
	
	
	
	
	
	
	
@Test
public void verifyLoginWithValidCredentilas() throws InterruptedException {



driver.findElement(By.xpath("//span[contains(text(),'Login /')]")).click();
}









}
