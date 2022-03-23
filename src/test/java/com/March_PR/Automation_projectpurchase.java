package com.March_PR;

	import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.pom.Add_cart;
import com.pom.Automation_Page_Object_Manager;
import com.pom.Bank_details;
import com.pom.Payment_details;
import com.pom.Proceeds;
import com.pom.Terms_service;
import com.pom.Tshirt_page;
import com.pom.Tshirt_s;
import com.pom.login_page;
import com.pom.sigin_p;

	public class Automation_projectpurchase extends Base_class {
	public static WebDriver driver = browser_Configuration("chrome");
	public static Automation_Page_Object_Manager pom = new Automation_Page_Object_Manager(driver);
	public static Logger log = Logger.getLogger(Automation_projectpurchase.class);
	
    public static void main(String[] args)throws Throwable {
	PropertyConfigurator.configure("log4j.properties");
    	geturl("http://automationpractice.com/index.php");
    	log.info("url launched");
			implicitwait(10, TimeUnit.SECONDS);
			
			clickOnElement(pom.get_Instance_Ts().getTshirt());
			log.info("tshrit page entered");
		    clickOnElement(pom.get_Instance_Sz().getSize());			
		    clickOnElement( pom.get_Instance_Sz().getCot());	
			clickOnElement(pom.get_Instance_Sz().getStyle());
		    clickOnElement(pom.get_Instance_Sz().getStock());			
			clickOnElement(pom.get_Instance_Sz().getNew1());			
			clickOnElement(pom.get_Instance_Sz().getDress());			
			clickOnElement(pom.get_Instance_Sz().getSizes());
			log.info("customization done by user");
			clickOnElement(pom.get_Instance_Ad().getCart());
			log.info("dress added to cart");
			clickOnElement(pom.get_Instance_Pc().getProceed());
			clickOnElement(pom.get_Instance_Pc().getProceed2());
			//inputValueElement(pom.get_Instance_Lp().getLogin(),"praveenraj0508@gmail.com");
         	String username = particular_cell_value("C:\\Users\\Admin\\eclipse-workspace\\March_PR\\test case automation.xlsx",2,5);
			inputValueElement(pom.get_Instance_Lp().getLogin(),username);
			inputValueElement(pom.get_Instance_Lp().getPassword(),particular_cell_value("C:\\Users\\Admin\\eclipse-workspace\\March_PR\\test case automation.xlsx",3,5));
			clickOnElement(pom.get_Instance_Sp().getSigin());
			log.info("sigin sucess");
			clickOnElement(pom.get_Instance_Pc().getProceed3());
			clickOnElement(pom.get_Instance_Agbox().getAgreebox());
			clickOnElement(pom.get_Instance_Pc().getProceed4());
			clickOnElement(pom.get_Instance_Bd().getBank());
			clickOnElement(pom.get_Instance_Pch().getCheckout());
			log.info("checked out");
			
	
		}

		

		public static WebDriver getDriver() {
			return driver;
		}
	}
	


