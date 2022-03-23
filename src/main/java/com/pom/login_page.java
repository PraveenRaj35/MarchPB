package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login_page {
public login_page(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
				
	}
public WebDriver driver;

@FindBy(id = "email")
private WebElement login;
@FindBy(id = "passwd")
private WebElement password;
public WebDriver getDriver() {
	return driver;
}
public WebElement getLogin() {
	return login;
}
public WebElement getPassword() {
	return password;
}

}


