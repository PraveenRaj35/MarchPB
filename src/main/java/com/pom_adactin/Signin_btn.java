package com.pom_adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signin_btn {
public WebDriver driver;

public Signin_btn(WebDriver driver2)
{
	this.driver=driver2;
	PageFactory.initElements(driver2, this);	
}

public WebDriver getDriver() {
	return driver;
}
@FindBy(id = "username")
private WebElement user;

@FindBy(name = "password")
private WebElement pass;

@FindBy(id = "login")
private WebElement login;

public WebElement getLogin() {
	return login;
}
public WebElement getUser() {
	return user;
}
public WebElement getPass() {
	return pass;
}
}