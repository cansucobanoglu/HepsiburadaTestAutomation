package com.hepsiburada.qa.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hepsiburada.qa.base.TestBase;

public class Homepage extends TestBase {

	// initializing the page objects
	public Homepage() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='productSearch']")
	WebElement textbox_search;

	@FindBy(id = "buttonProductSearch")
	WebElement search_button;

	@FindBy(className = "logo-hepsiburada")
	WebElement hbLogo;

	@FindBy(xpath = "//img[@title='iPhone 7 32 GB']")
	WebElement img_product;

	// Actions
	public String getHomePageTitle() {

		return driver.getTitle();
	}

	public boolean validateHBlogo() {

		return hbLogo.isDisplayed();
	}

	public void setTextInSearchBox(String text) {

		textbox_search.sendKeys(text);
	}

	public void clickOnSearchButton() {

		search_button.sendKeys(Keys.RETURN);
	}

	public ProductPage clickOnProduct() 
	{
		img_product.click();
		return new ProductPage();

	}


}