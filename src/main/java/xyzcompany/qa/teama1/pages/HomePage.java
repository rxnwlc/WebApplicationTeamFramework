package xyzcompany.qa.teama1.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import xyzcompany.qa.coe_web.utils.ElementUtil;

public class HomePage {
	
	private WebDriver driver;
	private ElementUtil eleUtil;
	
	//By Locators
	
	
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		eleUtil = new ElementUtil(driver);
	}
	
	
	

}
