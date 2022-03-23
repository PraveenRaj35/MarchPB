package com.pom_adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_hotel {
	public WebDriver driver;
	
	@FindBy(id = "location")
	private WebElement location;
	@FindBy(id = "hotels")
	private WebElement hotname;
	@FindBy(id = "room_type")
	private WebElement roomtype;
	@FindBy(id = "room_nos")
     private WebElement roonno;
	@FindBy(id = "adult_room")
	private WebElement acroom;
	@FindBy(id = "child_room")
	private WebElement chroom;
	@FindBy(id = "Submit")
	private WebElement hotelsearch;
	@FindBy(id = "radiobutton_0")
	private WebElement s;
	@FindBy(id = "continue")
	private WebElement cont;
	
		
	
	public WebElement getCont() {
		return cont;
	}
	public WebElement getS() {
		return s;
	}
	public WebElement getAcroom() {
		return acroom;
	}
	public WebElement getChroom() {
		return chroom;
	}
	public WebElement getHotelsearch() {
		return hotelsearch;
	}
	public Search_hotel(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getLocation() {
		return location;
	}
	public WebElement getHotname() {
		return hotname;
	}
	public WebElement getRoomtype() {
		return roomtype;
	}
	public WebElement getRoonno() {
		return roonno;
	}
	
	}

