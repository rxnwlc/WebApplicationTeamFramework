package xyzcompany.qa.teama1.pages;

import org.openqa.selenium.WebDriver;

import xyzcompany.qa.coe_web.constants.WaitConstants;
import xyzcompany.qa.coe_web.utils.ElementUtil;
import xyzcompany.qa.coe_web.utils.JavaScriptUtil;
import xyzcompany.qa.teama1.constants.AppConstants;

public class ProXtraTermsAndConditionsPage {
	
	private WebDriver driver;
	private ElementUtil eleUtil;
	private JavaScriptUtil jsUtil;

	public ProXtraTermsAndConditionsPage(WebDriver driver) {
		this.driver = driver;
		eleUtil = new ElementUtil(driver);
		jsUtil = new JavaScriptUtil(driver);
	}
	
	public void closeTab() {
		driver.close();
		eleUtil.switchToParentWindowID();
	}

}
