package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Tshirt_s {
	

	public WebDriver driver;
	
	@FindBy(id = "layered_id_attribute_group_3")
	private WebElement size;
	@FindBy(id = "layered_id_feature_5")
	private WebElement cot;
	@FindBy(id = "layered_id_feature_11")
	private WebElement style;
	@FindBy(id = "layered_quantity_1")
	private WebElement stock;
	@FindBy(id = "layered_condition_new")
	private WebElement new1;
	@FindBy(xpath = ("(//img[@class=\"replace-2x img-responsive\"])[2]"))
    private WebElement dress;
	@FindBy(id = "group_1")
	private WebElement sizes;

	public Tshirt_s(WebDriver driver2) {
		 this.driver=driver2;
		 PageFactory.initElements(driver, this);
		}
	
	public WebElement getDress() {
		return dress;
	}

	public WebElement getSizes() {
		return sizes;
	}

	

	public WebElement getNew1() {
		return new1;
	}


	public WebElement getStock() {
		return stock;
	}


	public WebDriver getDriver() {
		return driver;
	}

	
	
	public WebElement getStyle() {
		return style;
	}

	public WebElement getCot() {
		return cot;
	}

	public WebElement getSize() {
		return size;
	}

}







