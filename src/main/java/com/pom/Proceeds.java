package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Proceeds {
	public WebDriver driver;
	
	@FindBy(xpath = ("//a[@title=\"Proceed to checkout\"]"))
	private WebElement proceed;
	@FindBy(xpath = ("(//a[@title=\"Proceed to checkout\"])[2]"))
	private WebElement proceed2;
	@FindBy(name = "processAddress")
	private WebElement proceed3;
	@FindBy(xpath = ("//button[@name=\"processCarrier\"]"))
	private WebElement proceed4;

	public WebElement getProceed3() {
		return proceed3;
	}

	public WebElement getProceed4() {
		return proceed4;
	}

	public WebElement getProceed2() {
		return proceed2;
	}

	public Proceeds(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getProceed() {
		return proceed;
	}
	

}
