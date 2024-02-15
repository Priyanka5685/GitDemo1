package com.qa.utils;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utilities {
public	WebDriver driver;


public static final  int IMPLICIT_WAIT_TIME=10;	
public static final  int PAGE_WAIT_TIME=30;	


	
public Utilities(WebDriver driver) {
	
	this.driver=driver;
}



public void WaitForElementToAppear(By findBy) {	
WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(20));
wait.until(ExpectedConditions.visibilityOfElementLocated(findBy));

	
	
}
	
public File takeScreenShots() throws IOException {
	TakesScreenshot ts=	((TakesScreenshot)driver);
	File srcScreenshot=ts.getScreenshotAs(OutputType.FILE);
	File file = new File(System.getProperty("user.dir")+"\\src\\test\\resources\\scrennshots.png");
FileUtils.copyFile(srcScreenshot, file);
return 	file;
}
	
	
	

}
