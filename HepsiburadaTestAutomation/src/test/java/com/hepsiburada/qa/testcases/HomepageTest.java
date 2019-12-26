
package com.hepsiburada.qa.testcases;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.hepsiburada.qa.base.TestBase;
import com.hepsiburada.qa.pages.Homepage;
import com.hepsiburada.qa.pages.LoginPage;
import com.hepsiburada.qa.pages.ProductPage;

public class HomepageTest extends TestBase {

	Homepage homePage;
	LoginPage loginPage;
	ProductPage product;

	public HomepageTest() {
		super();
	}

	@BeforeTest
	public void setUp() throws IOException {

		initialization();
		loginPage = new LoginPage();
		loginPage.goLoginPage();
		homePage = loginPage.login(prop.getProperty("email"), prop.getProperty("password"));

	}

	@Test(priority = 1)
	public void enterSearchandClick() {
		
		homePage.setTextInSearchBox(prop.getProperty("searchText"));
		homePage.clickOnSearchButton();
	}
	
	@Test(priority = 2)
	public void clickOnProduct() {

		homePage.clickOnProduct();
	}
	

	@AfterTest
	public void tearDown() {

		driver.close();
	}

}
