package xyzcompany.qa.teama1.pages;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import xyzcompany.qa.coe_web.utils.ElementUtil;
import xyzcompany.qa.coe_web.utils.JavaScriptUtil;
import xyzcompany.qa.teama1.constants.AppConstants;
import xyzcompany.qa.coe_web.constants.WaitConstants;




public class CreateAnAccountPage {
	
	
	private WebDriver driver;
	private ElementUtil eleUtil;
	private JavaScriptUtil jsUtil;
	
	
	
	//By Locators
	private By pageLogo = By.xpath("//img[@data-automation-id='signInHomeDepotLogo']");
	private By pageHeader = By.xpath("//p[@data-automation-id='signInHeader']");
	private By pageMessage = By.xpath("//p[@class=' u__text-align--center u__medium u--paddingLarge-bottom']");
	private By backBtn = By.id("back-link");
	
	private By personalSectionLogo = By.xpath("//div[@data-automation-id='diy-type-button']//img[@alt='thd-logo']");
	private By personalSectionHeader = By.xpath("(//div[@data-automation-id='diy-type-button']//p)[1]");
	private By personalSectionMessage = By.xpath("(//div[@data-automation-id='diy-type-button']//p)[2]");
	private By personalIncentiveList = By.xpath("(//div[@data-automation-id='diy-type-button']//li)");
	private By personalAccountBtn = By.xpath("(//div[@data-automation-id='diy-type-button']//button)");
	
	private By professionalSectionLogo = By.xpath("//div[@data-automation-id='proxtra-type-button']//img[@alt='pro-xtra-logo']");
	private By professionalSectionHeader = By.xpath("(//div[@data-automation-id='proxtra-type-button']//p)[1]");
	private By professionalSectionMessage = By.xpath("(//div[@data-automation-id='proxtra-type-button']//p)[2]");
	private By professionalIncentiveList = By.xpath("(//div[@data-automation-id='proxtra-type-button']//li)");
	private By professionalAccountBtn = By.xpath("(//div[@data-automation-id='proxtra-type-button']//button)");
	
	private By personalAccountFormFields = By.xpath("(//form/div/label)");
	private By personalAccountCheckBoxLabels = By.xpath("(//div[@class='checkbox-btn']/following-sibling::label)");
	private By emailField = By.id("email");
	private By passwordField = By.id("password-input-field");
	private By passwordStrengthRequirements = By.xpath("//div[@class='u__bold'] | //div[contains(@class,'password-req-entry')]");
	private By showPasswordLink = By.id("showPasswordCheck");
	private By zipCodeField = By.id("zipCode");
	private By phoneNumberField = By.id("phone");
	private By keepMeSignedInCheckBox = By.xpath("//label[@for='kmsi-checkbox']");
	private By keepMeSignedInToolTipIcon = By.className("kmsi-tooltip");
	private By keepMeSignedInToolTipText = By.xpath("//div[@class='tippy-content']//span");
	private By keepMeSignedInToolTipCloseBtn = By.xpath("//div[@class='tippy-content']//button");
	private By verifyPhoneNumberCheckBox = By.xpath("//label[@for='verify-phone-checkbox']");
	private By captchaMessage = By.xpath("//div[@class='form-input-error__message u--marginXsmall-top']");
	private By personalAccountCreateBtn = By.xpath("//button[@data-automation-id='registrationCreateAnAccountButton']");
	private By currentAccountHolderQuestion = By.xpath("//div[@class='col__12-12 u__text-align--center u--paddingNormal-vertical']");
	private By signInLink = By.xpath("//span[@data-automation-id='registrationSignInButton']");
	private By legalLinksText = By.className("modal-legal-links");
	private By legalLinks = By.xpath("(//div[@class='modal-legal-links u--paddingSmall-top u__text-align--center u__small']/a)");
	private By proXtraTermsAndConditionsLink = By.linkText("Pro Xtra Terms and Conditions");
	private By privacyAndSecurityStatementLink = By.linkText("Privacy and Security Statement");
	private By myAccountTermsAndConditionsLink = By.linkText("My Account Terms and Conditions");
	
	private By signInFormMessage = By.className("u--paddingNormal-bottom");
	
	
	public CreateAnAccountPage(WebDriver driver) {
		this.driver = driver;
		eleUtil = new ElementUtil(driver);
		jsUtil = new JavaScriptUtil(driver);
	}
	
	public boolean doesPageLogoExist() {
		return eleUtil.doElementIsDisplayed(pageLogo);
	}
	
	public String getPageHeader() {
		return eleUtil.doElementGetText(pageHeader);
	}
	
	public String getPageMessage() {
		return eleUtil.doElementGetText(pageMessage);
	}
	
	public boolean doesBackBtnExist() {
		return eleUtil.doElementIsDisplayed(backBtn);
	}
	
	public boolean doesPersonalSectionLogoExist() {
		return eleUtil.doElementIsDisplayed(personalSectionLogo);
	}
	
	public String getPersonalSectionHeader() {
		return eleUtil.doElementGetText(personalSectionHeader);
	}
	
	public String getPersonalSectionMessage() {
		return eleUtil.doElementGetText(personalSectionMessage);
	}
	
	public List<String> getPersonalIncentiveList() {
		List<String> actualList = eleUtil.getElementsTextList(personalIncentiveList);
		System.out.println(actualList);
		return actualList;
	}
	
	public String getPersonalSectionButtonText() {
		return eleUtil.doElementGetText(personalAccountBtn);
	}
	
	public boolean doesProfessionalSectionLogoExist() {
		return eleUtil.doElementIsDisplayed(professionalSectionLogo);
	}
	
	public String getProfessionalSectionHeader() {
		return eleUtil.doElementGetText(professionalSectionHeader);
	}
	
	public String getProfessionalSectionMessage() {
		return eleUtil.doElementGetText(professionalSectionMessage);
	}
	
	public List<String> getProfessionalIncentiveList() {
		List<String> actualList = eleUtil.getElementsTextList(professionalIncentiveList);
		System.out.println(actualList);
		return actualList;
	}
	
	public String getProfessionalSectionButtonText() {
		return eleUtil.doElementGetText(professionalAccountBtn);
	}
	
	public int getTotalPersonalFormFields() {
		eleUtil.doClick(personalAccountBtn);
		eleUtil.waitForElementsPresence(personalAccountFormFields, WaitConstants.DEFAULT_SHORT_TIME_OUT);
		int totalFields = eleUtil.getTotalElementsCount(personalAccountFormFields);
		eleUtil.doClick(backBtn);
		return totalFields;
	}
	
	public List<String> getPersonalFormFieldLabels() {
		eleUtil.doClick(personalAccountBtn);
		eleUtil.waitForElementsPresence(personalAccountFormFields, WaitConstants.DEFAULT_SHORT_TIME_OUT);
		List<String> actualList = eleUtil.getElementsTextList(personalAccountFormFields);
		System.out.println(actualList);
		eleUtil.doClick(backBtn);
		return actualList;
	}
	
	public List<String> getPersonalFormCheckBoxLabels() {
		eleUtil.doClick(personalAccountBtn);
		eleUtil.waitForElementsPresence(personalAccountFormFields, WaitConstants.DEFAULT_SHORT_TIME_OUT);
		List<String> actualList = eleUtil.getElementsTextList(personalAccountCheckBoxLabels);
		System.out.println(actualList);
		eleUtil.doClick(backBtn);
		return actualList;
	}
	
	public boolean doesKeepMeSignedInToolTipIconExist() {
		eleUtil.doClick(personalAccountBtn);
		eleUtil.waitForElementPresence(personalAccountFormFields, WaitConstants.DEFAULT_SHORT_TIME_OUT);
		boolean iconFlag =  eleUtil.doElementIsDisplayed(keepMeSignedInToolTipIcon);
		eleUtil.doClick(backBtn);
		return iconFlag;
	}
	
	public String getKeepMeSignedInToolTipText() {
		eleUtil.doClick(personalAccountBtn);
		eleUtil.clickWhenReady(WaitConstants.DEFAULT_SHORT_TIME_OUT, keepMeSignedInToolTipIcon);
		String actualText = eleUtil.doElementGetText(keepMeSignedInToolTipText);
		eleUtil.doClick(keepMeSignedInToolTipCloseBtn);
		eleUtil.doClick(backBtn);
		return actualText;
	}
	
	public List<String> getPasswordRequirementsText() {
		eleUtil.doClick(personalAccountBtn);
		eleUtil.clickWhenReady(WaitConstants.DEFAULT_SHORT_TIME_OUT, passwordField);
		List<String> actualList = eleUtil.getElementsTextList(passwordStrengthRequirements);
		eleUtil.doClick(backBtn);
		return actualList;
	}
	
	public String fillInPersonalForm(String emailAddress, String password, int zipCode, String phoneNumber) {
		eleUtil.doClick(personalAccountBtn);
		eleUtil.clickWhenReady(WaitConstants.DEFAULT_SHORT_TIME_OUT, emailField);
		eleUtil.doSendKeys(emailField, emailAddress);
		eleUtil.doSendKeys(passwordField, password);
		eleUtil.doSendKeys(zipCodeField, zipCode);
		eleUtil.doSendKeys(phoneNumberField, phoneNumber);
		eleUtil.doClick(keepMeSignedInCheckBox);
		eleUtil.doClick(verifyPhoneNumberCheckBox);
		eleUtil.doClick(personalAccountCreateBtn);
		String actualText =  eleUtil.doElementGetText(captchaMessage);
		eleUtil.doClick(backBtn);
		return actualText;
	}
	
	public String getPersonalAccountCreationButtonText() {
		eleUtil.doClick(personalAccountBtn);
		eleUtil.waitForElementPresence(personalAccountFormFields, WaitConstants.DEFAULT_SHORT_TIME_OUT);
		String actualText = eleUtil.doElementGetText(personalAccountCreateBtn);
		eleUtil.doClick(backBtn);
		return actualText;
	}
	
	public String getCurrentAccountHolderQuestionText() {
		eleUtil.doClick(personalAccountBtn);
		eleUtil.waitForElementPresence(personalAccountFormFields, WaitConstants.DEFAULT_SHORT_TIME_OUT);
		String actualText = eleUtil.doElementGetText(currentAccountHolderQuestion);
		eleUtil.doClick(backBtn);
		return actualText;
	}
	
	public boolean doesSignInLinkExist() {
		eleUtil.doClick(personalAccountBtn);
		eleUtil.waitForElementPresence(personalAccountFormFields, WaitConstants.DEFAULT_SHORT_TIME_OUT);
		boolean signInLinkFlag = eleUtil.doElementIsDisplayed(signInLink);
		eleUtil.doClick(backBtn);
		return signInLinkFlag;
	}
	
	public String clickSignInLink() {
		eleUtil.doClick(personalAccountBtn);
		eleUtil.clickWhenReady(WaitConstants.DEFAULT_SHORT_TIME_OUT, signInLink);
		String actualText = eleUtil.doElementGetText(signInFormMessage);
		eleUtil.doClick(backBtn);
		eleUtil.doClick(backBtn);
		return actualText;
	}
	
	public List<String> getLegalLinksSectionText() {
		eleUtil.doClick(personalAccountBtn);
		eleUtil.waitForElementsPresence(personalAccountCheckBoxLabels, WaitConstants.DEFAULT_SHORT_TIME_OUT);
		List<String> actualList = eleUtil.getElementsTextList(legalLinksText);
		eleUtil.doClick(backBtn);
		return actualList;
	}



}
