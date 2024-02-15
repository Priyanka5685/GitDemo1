package com.qa.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.utils.Utilities;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class SearchPage extends Utilities {
	
WebDriver driver;	
//objects
@FindBy(xpath="//input[@id='search_box'] ")
WebElement search;
@FindBy(xpath="//h1[contains(text(),'Baby Diapers')]")
WebElement babyDipers;
@FindBy(xpath="//span[contains(text(),'Abracadabra  Canvas Diaper Bag- Green')]")
WebElement diperBag;
@FindBy(xpath="//select[@class='diaper-dropdown M16_42']")
WebElement addtocart;
//By Locators 	
By canvasDiperBag= By.xpath("//span[contains(text(),'Abracadabra  Canvas Diaper Bag- Green')]");

	public SearchPage (WebDriver driver) {
		super(driver);
		this.driver =driver;
		PageFactory.initElements(driver, this);	
		
		
		
	}	
	
//Actions
	public void SearchFeild1(String SearchOption) throws IOException {
		search.sendKeys(SearchOption);
		search.click();
		String searchedOptions="Baby Diapers";
		if(searchedOptions.equalsIgnoreCase(SearchOption)) {
			System.out.println(" user is getting entered search options "+" passed");
		}else {
			System.out.println(" searchFeild is not working properly ");
			takeScreenShots();
		}
		
	}

	public void SearchFeild2(String searchOption1) throws IOException {
		search.click();	
	search.sendKeys( searchOption1);
	Actions act = new Actions(driver);
	try {
	act.click(diperBag).build().perform();
	}catch(StaleElementReferenceException e) {
		// Refresh the page
		  driver.navigate().refresh();
		// Try to locate the element again
		WebElement  element = driver.findElement(By.xpath("//span[contains(text(),'Abracadabra  Canvas Diaper Bag- Green')]"));
		  element.click();
	}
	
	
	
	}
	
	
	
	
	
	

}
