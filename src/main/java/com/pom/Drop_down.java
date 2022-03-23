package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Drop_down {
	public WebDriver driver;
	
	@FindBy(xpath = ("//a[@title=\"Proceed to checkout\"]"))
	public WebElement sort;

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getSort() {
		return sort;
	}

	public Drop_down(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

}
