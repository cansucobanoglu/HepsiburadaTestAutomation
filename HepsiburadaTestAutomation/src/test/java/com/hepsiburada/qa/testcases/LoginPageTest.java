package com.hepsiburada.qa.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.hepsiburada.qa.base.TestBase;
import com.hepsiburada.qa.pages.Homepage;
import com.hepsiburada.qa.pages.LoginPage;

public class LoginPageTest extends TestBase {

	LoginPage loginPage;
	Homepage home;

	public LoginPageTest() {
		super();
	}

	@BeforeTest
	public void setUp() {

		initialization();
		loginPage = new LoginPage();
		loginPage.goLoginPage();
	}

	@Test
	public void loginTest() throws InterruptedException, IOException {

		home = loginPage.login(prop.getProperty("email"), prop.getProperty("password"));
		Thread.sleep(2000);

	}

	@AfterTest

	public void tearDown() {

		driver.close();
	}

}
