package xyzcompany.qa.teama1.pages;

import org.openqa.selenium.WebDriver;

import xyzcompany.qa.coe_web.utils.ElementUtil;

public class YourCartPage {

	private WebDriver driver;
	private ElementUtil eleUtil;
	
	//By Locators
	
	
	
	public YourCartPage(WebDriver driver) {
		this.driver = driver;
		eleUtil = new ElementUtil(driver);
	}
}