package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Bank_details {
public WebDriver driver;
@FindBy(xpath = ("//a[@title=\"Pay by bank wire\"]"))
private WebElement bank;
public Bank_details(WebDriver driver2) {
	this.driver= driver2;
	PageFactory.initElements(driver, this);
}
public WebDriver getDriver() {
	return driver;
}
public WebElement getBank() {
	return bank;
}
}
