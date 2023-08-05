package xyzcompany.qa.teama1.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import xyzcompany.qa.coe_web.constants.WaitConstants;
import xyzcompany.qa.coe_web.utils.ElementUtil;


public class ProXtraTermsAndConditionsPage {
	
	private WebDriver driver;
	private ElementUtil eleUtil;


	
	//by locators
	private By breadcrumbs = By.xpath("//div[@data-component='Breadcrumbs']//a");
	private By pageHeader = By.xpath("//div[@class='col__12-12 col__12-12--xs col__12-12--sm col__12-12--md col__12-12--lg col__12-12--xl']//span");
	private By pageHeaderSectionText = By.xpath("(//div[@class='col__12-12 col__12-12--xs col__12-12--sm col__12-12--md col__12-12--lg col__12-12--xl'])[3]");
	private By sectionIHeader = By.xpath("(//div[@class='col__12-12 col__12-12--xs col__12-12--sm col__12-12--md col__12-12--lg col__12-12--xl'])[4]");
	private By sectionIText = By.xpath("(//div[@class='col__12-12 col__12-12--xs col__12-12--sm col__12-12--md col__12-12--lg col__12-12--xl'])[5]");
	private By sectionIIHeader = By.xpath("(//div[@class='col__12-12 col__12-12--xs col__12-12--sm col__12-12--md col__12-12--lg col__12-12--xl'])[6]");
	private By sectionIIText = By.xpath("(//div[@class='col__12-12 col__12-12--xs col__12-12--sm col__12-12--md col__12-12--lg col__12-12--xl'])[7]");
	private By sectionIIIHeader = By.xpath("(//div[@class='col__12-12 col__12-12--xs col__12-12--sm col__12-12--md col__12-12--lg col__12-12--xl'])[8]");
	private By sectionIIIText = By.xpath("(//div[@class='col__12-12 col__12-12--xs col__12-12--sm col__12-12--md col__12-12--lg col__12-12--xl'])[position()>8 and position()<15]");
	private By sectionIVHeader = By.xpath("(//div[@class='col__12-12 col__12-12--xs col__12-12--sm col__12-12--md col__12-12--lg col__12-12--xl'])[15]");
	private By sectionIVText = By.xpath("(//div[@class='col__12-12 col__12-12--xs col__12-12--sm col__12-12--md col__12-12--lg col__12-12--xl'])[16]");
	private By sectionVHeader = By.xpath("(//div[@class='col__12-12 col__12-12--xs col__12-12--sm col__12-12--md col__12-12--lg col__12-12--xl'])[17]");
	private By sectionVText = By.xpath("(//div[@class='col__12-12 col__12-12--xs col__12-12--sm col__12-12--md col__12-12--lg col__12-12--xl'])[18]");
	private By tableTierImage = By.id("EtchImage_thd_1159");
	private By tableMemberBenefitsImage = By.id("EtchImage_thd_38f2");
	private By tableMembershipLevelImage = By.id("EtchImage_thd_1743");
	
	
	
	
	//constructor
	public ProXtraTermsAndConditionsPage(WebDriver driver) {
		this.driver = driver;
		eleUtil = new ElementUtil(driver);
	}
	
	public void closeTab() {
		driver.close();
		eleUtil.switchToParentWindowID();
	}
	
	public List<String> getBreadcrumbs() {
		eleUtil.waitForElementsPresence(breadcrumbs, WaitConstants.DEFAULT_SHORT_TIME_OUT);
		return eleUtil.getElementsTextList(breadcrumbs);
	}
	
	public String getPageHeader() {
		return eleUtil.doElementGetText(pageHeader);
	}
	
	public String getPageHeaderText() {
		return eleUtil.doElementGetText(pageHeaderSectionText);
	}
	
	public String getSectionIHeader() {
		return eleUtil.doElementGetText(sectionIHeader);
	}
	
	public String getSectionIText() {
		return eleUtil.doElementGetText(sectionIText);
	}
	
	public String getSectionIIHeader() {
		return eleUtil.doElementGetText(sectionIIHeader);
	}
	
	public String getSectionIIText() {
		return eleUtil.doElementGetText(sectionIIText).replaceAll("[\\[\\]]", "");
	}
	
	public String getSectionIIIHeader() {
		return eleUtil.doElementGetText(sectionIIIHeader);
	}
		
	public String getSectionIIIText() {
		return eleUtil.getElementsTextList(sectionIIIText).toString().replaceAll("[\\[\\]]", "");
	}
	
	public String getSectionIVHeader() {
		return eleUtil.doElementGetText(sectionIVHeader);
	}
	
	public String getSectionIVText() {
		return eleUtil.doElementGetText(sectionIVText);
	}
	
	public String getSectionVHeader() {
		return eleUtil.doElementGetText(sectionVHeader);
	}
	
	public String getSectionVText() {
		return eleUtil.doElementGetText(sectionVText).replaceAll("[\\[\\]]", "");
	}
	
	public boolean isTierTableImageDisplayed() {
		return eleUtil.doElementIsDisplayed(tableTierImage);
	}
	
	public boolean isMemberBenifitsTableImageDisplayed() {
		return eleUtil.doElementIsDisplayed(tableMemberBenefitsImage);
	}
	
	public boolean isMembershipLevelTableImageDisplayed() {
		return eleUtil.doElementIsDisplayed(tableMembershipLevelImage);
	}

}
