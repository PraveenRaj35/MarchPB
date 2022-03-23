package com.pom;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Tshirt_page {
	public WebDriver driver;
	
	@FindBy(xpath = "(//a[@href=\"http://automationpractice.com/index.php?id_category=5&controller=category\"])[2]")
	
	private WebElement tshirt;
	public Tshirt_page(WebDriver driver2) {
	this.driver = driver2;
	PageFactory.initElements(driver, this);
	}
	
	public WebDriver getDriver() {
		return driver;
	}


	public WebElement getTshirt() {
		return tshirt;
	}
}
	 
	


