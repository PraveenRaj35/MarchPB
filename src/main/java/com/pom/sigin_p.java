package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class sigin_p {
 public WebDriver driver;
  
 @FindBy(id = "SubmitLogin")
 private WebElement sigin;

public sigin_p(WebDriver driver2) {
	this.driver= driver2;
	PageFactory.initElements(driver, this);
}

public WebDriver getDriver() {
	return driver;
}

public WebElement getSigin() {
	return sigin;
}
}
