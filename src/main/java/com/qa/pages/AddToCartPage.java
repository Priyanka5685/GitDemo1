package com.qa.pages;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.utils.Utilities;

public class AddToCartPage extends Utilities {
	
	
WebDriver driver;
	
	@FindBy(id="cart_TotalCount")
	WebElement cart;
	@FindBy(xpath="//p[contains(text(),'Hey! No items in your cart')]")
	WebElement emptyCart;
	@FindBy(xpath="//div[@class='menu-container']//ul//li[5]")
	WebElement toys;
	
	@FindBys(@FindBy(xpath="//div[@class='menu-container']//li[1]"))
	List<WebElement> allCategories;
	
	@FindBy(xpath="//ul[@class='optionav lft']//li[6]")
	WebElement Dipering;
	@FindBy(xpath="//a[contains(text(),'Babyhug Froggy Potty Seat - Green')]")
	WebElement BabyHugFroggyPottySeats;
	@FindBy(xpath="//div[@class='div-add-to-cart']//div//span//select")
	WebElement addToCArts;
	@FindBy(xpath="//div[@class='quantity']")
	WebElement quantity;
	//By Locators 
	By productBy=By.xpath("//a[contains(text(),'Babyhug Froggy Potty Seat - Green')]");
	By addCarts=By.xpath("//div[@class='div-add-to-cart']//div//span//select");
	By Diper=By.xpath("//ul[@class='optionav lft']//li[6]");
	By allCategorie=By.xpath("//div[@class='menu-container']//li[1]");
	
	
public AddToCartPage(WebDriver driver) {
	super(driver);
	this.driver =driver;
	PageFactory.initElements(driver, this);	
	
}
	
public void Cart() throws InterruptedException {
	cart.click();
	Thread.sleep(2000);
	String emptyCartText=emptyCart.getText();
	String expectedEmptyCArtText="Hey! No items in your cart";
	
	if(expectedEmptyCArtText.equalsIgnoreCase(emptyCartText)) {
		System.out.println(" The Expected emptyCartText and ActualEmptyCartText matches......."+"Passed");
	}else {
		System.out.println(" The Expected emptyCartText and ActualEmptyCartText does not  matches......."+"Failed");
	}
}
	
public void RetriveAllCategoriesList() {
	Iterator<WebElement> itr=	allCategories.iterator();
	while(itr.hasNext()) {
	    System.out.println(itr.next().getText());
	}
	
}
	
	
	
	
	
	
	
	
	
	
	
	

}
