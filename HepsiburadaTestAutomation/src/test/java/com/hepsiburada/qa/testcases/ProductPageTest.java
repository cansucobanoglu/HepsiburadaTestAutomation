package com.hepsiburada.qa.testcases;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.hepsiburada.qa.base.TestBase;
import com.hepsiburada.qa.pages.Homepage;
import com.hepsiburada.qa.pages.LoginPage;
import com.hepsiburada.qa.pages.ProductPage;

public class ProductPageTest extends TestBase {

	public ProductPageTest() {
		super();
	}
	
	LoginPage loginPage;
	Homepage homePage;
	ProductPage productPage;
	
	@BeforeTest
	public void setUp() throws IOException {

		initialization();
		loginPage = new LoginPage();
		loginPage.goLoginPage();
		homePage = loginPage.login(prop.getProperty("email"), prop.getProperty("password"));
		homePage.setTextInSearchBox(prop.getProperty("searchText"));
		homePage.clickOnSearchButton();
		productPage = homePage.clickOnProduct();
	}

	@Test(priority = 1)
	public void addToCart() throws InterruptedException {
		
		productPage.addToCart();
		Thread.sleep(2000);
	}
	
	@Test(priority = 2)
	public void clickOnShoppingCart() {
		productPage.clickOnshoppingCart();
	}
	
	@AfterTest
	public void tearDown() {
		driver.close();
	}
	
}
