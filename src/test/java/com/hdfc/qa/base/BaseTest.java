package com.hdfc.qa.base;

import java.io.File;
import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.qa.utils.Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	
	
 public WebDriver driver;	 public Properties prop; public Properties dataprop;

public  BaseTest() {
	
 prop = new Properties();	
File propfile = new File(System.getProperty("user.dir")+"\\src\\main\\java\\com\\qa\\config\\config.properties")
;
dataprop = new Properties();
File datapropfile = new File(System.getProperty("user.dir")+"\\src\\main\\java\\com\\qa\\config\\testdata.properties");
try {
FileInputStream datafis = new FileInputStream(datapropfile);
dataprop.load(datafis);
}catch(Throwable e ) {
	e.printStackTrace();
}


try {
FileInputStream fis = new FileInputStream(propfile);
prop.load(fis);
	
}catch(Throwable e ) {
	e.printStackTrace();
}
}
	
	
	
public WebDriver initiliseBrowser()	{
	
	WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
    driver.get(prop.getProperty("url"));
    driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(Utilities.PAGE_WAIT_TIME));
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Utilities.IMPLICIT_WAIT_TIME));
   driver.manage().window().maximize();
  System.out.println(driver.getTitle());
	
	
	return driver;
}
	
	
	
	
	
	

}
