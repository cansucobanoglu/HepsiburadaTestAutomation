package com.hepsiburada.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hepsiburada.qa.base.TestBase;

public class ProductPage extends TestBase {

	public ProductPage() {
		PageFactory.initElements(driver, this);
	}


	@FindBy(id = "addToCart")
	WebElement addToCart;

	@FindBy(id = "shoppingCart")
	WebElement shoppingCart;

	public void addToCart()
	{
		addToCart.click();
	}

	public void clickOnshoppingCart()
	{
		shoppingCart.click();
	}
}
