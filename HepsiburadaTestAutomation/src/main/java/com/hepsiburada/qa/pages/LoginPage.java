package com.hepsiburada.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.hepsiburada.qa.base.TestBase;

public class LoginPage extends TestBase {
	


	// initializing the page objects
	public LoginPage()  {
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(id="myAccount")
	WebElement girisYap1;
	
	@FindBy(xpath = "//li[contains(@data-bind,'Giriş Yap')]")
	WebElement girisYap2;

	@FindBy(id = "email")
	WebElement email;
	
	@FindBy(id = "password")
	WebElement password;
	
	@FindBy(xpath = "//button[@class='btn full btn-login-submit']")
	WebElement giris;

	@FindBy(className = "hepsiburada-logo")
	WebElement hbLogo;

	// Actions
	
	public void goLoginPage() {
		girisYap1.click();
		girisYap2.click();
			
	}
	
	public String getLoginpageTitle() {
		
		 return driver.getTitle();
		
	}
		
	public Homepage login(String un, String pwd) throws IOException 	 {
		
		
		email.sendKeys(un);
		password.sendKeys(pwd);
		giris.click();
		
		return new Homepage();
		
	}
}
