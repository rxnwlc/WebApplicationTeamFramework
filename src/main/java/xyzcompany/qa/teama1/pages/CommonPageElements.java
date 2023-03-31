package xyzcompany.qa.teama1.pages;

import org.openqa.selenium.WebDriver;

import xyzcompany.qa.coe_web.constants.WaitConstants;
import xyzcompany.qa.coe_web.utils.ElementUtil;


public class CommonPageElements {
	
	private WebDriver driver;
	private ElementUtil eleUtil;
	
	
	public CommonPageElements(WebDriver driver) {
		this.driver = driver;
		eleUtil = new ElementUtil(driver);
	}
	
	public String getPageTitle (String pageTitle, String pageName) {		
		String titleVal = eleUtil.waitForTitleIsAndFetch(WaitConstants.DEFAULT_SHORT_TIME_OUT, pageTitle);
		System.out.println(pageName + " page title is: " + titleVal);
		return titleVal;
	}
	
	public String getPageURL(String pageURL, String pageName) {
		String url = eleUtil.waitForURLIsAndFetch(WaitConstants.DEFAULT_SHORT_TIME_OUT, pageURL);
		System.out.println(pageName + " page url is: " + url);
		return url;
	}

}
