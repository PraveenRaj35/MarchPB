package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Payment_details {
public WebDriver driver;
@FindBy(xpath = ("//button[@class=\"button btn btn-default button-medium\"]"))
private WebElement checkout;


public Payment_details(WebDriver driver2) {
	this.driver=driver2;
	PageFactory.initElements(driver, this);
}
public WebDriver getDriver() {
	return driver;
}
public WebElement getCheckout() {
	return checkout;
}
}
