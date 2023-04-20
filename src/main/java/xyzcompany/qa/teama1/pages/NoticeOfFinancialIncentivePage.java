package xyzcompany.qa.teama1.pages;

import org.openqa.selenium.WebDriver;

import xyzcompany.qa.coe_web.utils.ElementUtil;
import xyzcompany.qa.coe_web.utils.JavaScriptUtil;

public class NoticeOfFinancialIncentivePage {
	
	private WebDriver driver;
	private ElementUtil eleUtil;
	private JavaScriptUtil jsUtil;

	public NoticeOfFinancialIncentivePage (WebDriver driver) {
		this.driver = driver;
		eleUtil = new ElementUtil(driver);
		jsUtil = new JavaScriptUtil(driver);
	}
	
	public void closeTab() {
		driver.close();
		eleUtil.switchToParentWindowID();
	}

}
