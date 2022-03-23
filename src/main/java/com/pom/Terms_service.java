package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Terms_service {
	public WebDriver driver;
	@FindBy(id = "cgv")
	private WebElement agreebox;
	public Terms_service(WebDriver driver2) {
		this.driver= driver2;
		PageFactory.initElements(driver, this);
	}
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getAgreebox() {
		return agreebox;
	}

}
