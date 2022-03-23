package com.pom;

import org.openqa.selenium.WebDriver;

public class Automation_Page_Object_Manager {

public WebDriver driver;
	private Tshirt_page ts;
	private Tshirt_s sz;       
	private Proceeds pc;
	private login_page lp;
	private sigin_p sp;
	private Bank_details bd;
	private Terms_service agbox;
	private Payment_details pch;
	private Add_cart ad;
	

	public Automation_Page_Object_Manager(WebDriver driver1) {
		this.driver = driver1;
	}
	public Tshirt_page get_Instance_Ts() {
		if(ts==null) {
			ts = new Tshirt_page(driver);
		}
		return ts;
	}
	
	public Tshirt_s get_Instance_Sz() {
		if(sz==null) {
			sz = new Tshirt_s(driver);
	   }
		return sz;
	}
	public Add_cart get_Instance_Ad() {
		if(ad==null) {
			ad = new Add_cart(driver);
		}
		return ad;
	}
	public Proceeds get_Instance_Pc() {
		if(pc==null) {
			pc = new Proceeds(driver);
		}
		return pc;
	}
	public login_page get_Instance_Lp() {
		if(lp==null) {
			lp = new login_page(driver);
		}
		return lp;
	}
	public sigin_p get_Instance_Sp() {
		if(sp==null) {
			sp = new sigin_p(driver);
		}
		return sp;
	}
	public Bank_details get_Instance_Bd() {
		if(bd==null) {
			bd = new Bank_details(driver);
		}
		return bd;
	}
	public Terms_service get_Instance_Agbox() {
		if(agbox==null) {
			agbox = new Terms_service(driver);
		}
		return agbox;
	}
	public Payment_details get_Instance_Pch() {
		if(pch==null) {
			pch = new Payment_details(driver);
		}
		return pch;
	}
	public WebDriver getDriver() {
		return driver;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
