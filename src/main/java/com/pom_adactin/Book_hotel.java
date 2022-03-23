package com.pom_adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book_hotel {
public WebDriver driver;

@FindBy(id = "first_name")
private WebElement fname;
@FindBy(id = "last_name")
private WebElement lname;
@FindBy(id = "address")
private WebElement add;
@FindBy(id = "cc_num")
private WebElement cardnum;
@FindBy(id = "cc_type")
private WebElement cardtype;
@FindBy(id = "cc_cvv")
private WebElement cardcvvnum;
@FindBy(id = "cc_exp_month")
private WebElement expdate;
@FindBy(id = "cc_exp_year")
private WebElement expyear;
@FindBy(id = "book_now")
private WebElement book;
public Book_hotel(WebDriver driver2) {
	this.driver=driver2;
	PageFactory.initElements(driver2, this);
}
public WebDriver getDriver() {
	return driver;
}
public WebElement getFname() {
	return fname;
}
public WebElement getLname() {
	return lname;
}
public WebElement getAdd() {
	return add;
}
public WebElement getCardnum() {
	return cardnum;
}
public WebElement getCardtype() {
	return cardtype;
}
public WebElement getCardcvvnum() {
	return cardcvvnum;
}
public WebElement getExpdate() {
	return expdate;
}
public WebElement getExpyear() {
	return expyear;
}
public WebElement getBook() {
	return book;
}
}
