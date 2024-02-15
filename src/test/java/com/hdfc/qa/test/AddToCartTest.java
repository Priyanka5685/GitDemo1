package com.hdfc.qa.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.hdfc.qa.base.BaseTest;
import com.qa.pages.AddToCartPage;
import com.qa.pages.RegisterPage;

public class AddToCartTest extends BaseTest {
	
	AddToCartPage cart;
	public AddToCartTest() {
		super();
	}
	
	@BeforeMethod	
	public  void setUp() {
	driver=	initiliseBrowser();
	cart = new AddToCartPage(driver);
	
	}
		
	@AfterMethod
	public void tearDown() {
		 driver.close();
	}
	
	@Test(priority=-1)
	public void verifyUserIsAbleToGetEmptyCartMessageWhenCartIsEmpty() throws InterruptedException {
		cart.Cart();
	}
	
	@Test(priority=1)
	public void verifyThatallvaulesAreAddedIntoAllCategories() {
		cart.RetriveAllCategoriesList();
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
