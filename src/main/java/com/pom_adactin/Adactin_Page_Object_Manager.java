package com.pom_adactin;

import org.openqa.selenium.WebDriver;

public class Adactin_Page_Object_Manager {
	public WebDriver driver;
   private Signin_btn sbn;
   private Search_hotel sh;
   private Book_hotel bh;
   
   
   public Adactin_Page_Object_Manager(WebDriver driver2) {
	this.driver= driver2;
	
}


public Signin_btn get_instance_sbn() {
	   if (sbn==null) {
		
	     sbn = new Signin_btn(driver);
   }
return sbn;
   }
public Search_hotel get_instance_sh() {
	if (sh==null) {
	sh = new Search_hotel(driver);
	}
	return sh;
	
}
 public Book_hotel get_instance_bh() {
	 if(bh==null)
	 bh = new Book_hotel(driver);
	return bh;
 }

public WebDriver getDriver() {
	return driver;

}
}