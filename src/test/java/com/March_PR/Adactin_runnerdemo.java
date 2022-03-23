package com.March_PR;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.pom.Automation_Page_Object_Manager;
import com.pom_adactin.Adactin_Page_Object_Manager;
import com.pom_adactin.Book_hotel;
import com.pom_adactin.Search_hotel;
import com.pom_adactin.Signin_btn;

public class Adactin_runnerdemo extends Base_class{
	public static WebDriver driver = browser_Configuration("chrome");
		public static Adactin_Page_Object_Manager apom  = new Adactin_Page_Object_Manager(driver);
		public static Logger log = Logger.getLogger(Adactin_runnerdemo.class);
		 public static void main(String[] args) throws Throwable{
			 PropertyConfigurator.configure("log4j.properties");
			geturl("https://adactin.com/HotelApp/index.php");
			log.info("url sucessfully launched");
			
			inputValueElement(apom.get_instance_sbn().getUser(),
					particular_cell_value("C:\\Users\\Admin\\eclipse-workspace\\March_PR\\Test Case Adactin.xlsx",12,5));
			inputValueElement(apom.get_instance_sbn().getPass(),
					particular_cell_value("C:\\Users\\Admin\\eclipse-workspace\\March_PR\\Test Case Adactin.xlsx",13,5));
			clickOnElement(apom.get_instance_sbn().getLogin());
			log.info("login sucess");
			inputValueElement(apom.get_instance_sh().getLocation(),
					particular_cell_value("C:\\Users\\Admin\\eclipse-workspace\\March_PR\\Test Case Adactin.xlsx", 15, 5));
			inputValueElement(apom.get_instance_sh().getHotname(), 
					particular_cell_value("C:\\Users\\Admin\\eclipse-workspace\\March_PR\\Test Case Adactin.xlsx", 16, 5));
			inputValueElement(apom.get_instance_sh().getRoomtype(),
					particular_cell_value("C:\\Users\\Admin\\eclipse-workspace\\March_PR\\Test Case Adactin.xlsx", 17,5));
			inputValueElement(apom.get_instance_sh().getRoonno(),
					particular_cell_value("C:\\Users\\Admin\\eclipse-workspace\\March_PR\\Test Case Adactin.xlsx", 18, 5));
			inputValueElement(apom.get_instance_sh().getAcroom(),
					particular_cell_value("C:\\Users\\Admin\\eclipse-workspace\\March_PR\\Test Case Adactin.xlsx", 21,5 ));
			inputValueElement(apom.get_instance_sh().getChroom(),
					particular_cell_value("C:\\Users\\Admin\\eclipse-workspace\\March_PR\\Test Case Adactin.xlsx", 22, 5));
			clickOnElement(apom.get_instance_sh().getHotelsearch());
			clickOnElement(apom.get_instance_sh().getS());
			clickOnElement(apom.get_instance_sh().getCont());
			log.info("search hotel completed");
			inputValueElement(apom.get_instance_bh().getFname(),
					particular_cell_value("C:\\Users\\Admin\\eclipse-workspace\\March_PR\\Test Case Adactin.xlsx", 26,5));
			inputValueElement(apom.get_instance_bh().getLname(),
					particular_cell_value("C:\\Users\\Admin\\eclipse-workspace\\March_PR\\Test Case Adactin.xlsx", 27, 5));
			inputValueElement(apom.get_instance_bh().getAdd(),
					particular_cell_value("C:\\Users\\Admin\\eclipse-workspace\\March_PR\\Test Case Adactin.xlsx",28,5));
			System.out.println("entered");
			inputValueElement(apom.get_instance_bh().getCardnum(),
					particular_cell_value("C:\\Users\\Admin\\eclipse-workspace\\March_PR\\Test Case Adactin.xlsx",29,5));
			System.out.println("enter");
			inputValueElement(apom.get_instance_bh().getCardtype(),
					particular_cell_value("C:\\Users\\Admin\\eclipse-workspace\\March_PR\\Test Case Adactin.xlsx", 30, 5));
			inputValueElement(apom.get_instance_bh().getCardcvvnum(),
					particular_cell_value("C:\\Users\\Admin\\eclipse-workspace\\March_PR\\Test Case Adactin.xlsx", 33,5));
			inputValueElement(apom.get_instance_bh().getExpdate(),
					particular_cell_value("C:\\Users\\Admin\\eclipse-workspace\\March_PR\\Test Case Adactin.xlsx",31,5));
			inputValueElement(apom.get_instance_bh().getExpyear(),
					particular_cell_value("C:\\Users\\Admin\\eclipse-workspace\\March_PR\\Test Case Adactin.xlsx", 32, 5));	
			log.info("personal details entered");
			clickOnElement(apom.get_instance_bh().getBook());
			log.info("hotel booked");
		}
		//private static void inputValueElement(WebElement user) {
		}
			
		
		





