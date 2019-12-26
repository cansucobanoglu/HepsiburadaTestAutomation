package com.hepsiburada.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class ListOfProductsPage {

	public ListOfProductsPage(WebDriver driver) {

		this.driver = driver;
	}

	WebDriver driver = null;
	
	

	By img_product = By.xpath("//img[@title='iPhone 7 32 GB']");
	

	public void clickOnProduct() {
		
		driver.findElement(img_product).click();
	}

	
}
