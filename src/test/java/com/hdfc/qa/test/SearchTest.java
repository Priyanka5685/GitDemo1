package com.hdfc.qa.test;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.hdfc.qa.base.BaseTest;
import com.qa.pages.SearchPage;

public class SearchTest extends BaseTest {
	SearchPage search;
	
public SearchTest() {
	super();
}
	
@BeforeMethod
public void setUp() {
	driver=	initiliseBrowser();
 search= new SearchPage(driver);
}
	
@AfterMethod
public void tearDown() {
	driver.quit();
}
	
@Test(priority=-1)
public void verifyThatEnteredSearchOptionsDisplyed() throws IOException {
	 search	.SearchFeild1(dataprop.getProperty("SearchOptions"));
	 
}
	@Test(priority=1)
public void verifyThatEnteredSearchOptionsareDispledProperly() throws IOException {
	search.SearchFeild2(dataprop.getProperty("searchOption2"));
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
