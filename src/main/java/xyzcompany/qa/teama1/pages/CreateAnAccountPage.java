package xyzcompany.qa.teama1.pages;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import xyzcompany.qa.coe_web.utils.ElementUtil;
import xyzcompany.qa.coe_web.utils.JavaScriptUtil;
import xyzcompany.qa.coe_web.constants.WaitConstants;




public class CreateAnAccountPage {
	
	
	private WebDriver driver;
	private ElementUtil eleUtil;
	private JavaScriptUtil jsUtil;
		
	
	
	//By Locators
	private By pageLogo = By.xpath("//div[contains(@class,'flexbox--center-center col__12-12')]//img");
	private By pageHeader = By.xpath("//div[contains(@class,'flexbox--center-center col__12-12')]//p");
	private By pageMessage = By.xpath("//p[@class=' u__text-align--center u__medium u--paddingLarge-bottom']");
	private By backBtn = By.id("back-link");
	
	private By personalSectionLogo = By.xpath("//div[@data-automation-id='diy-type-button']//img[@alt='thd-logo']");
	private By personalSectionHeader = By.xpath("(//div[@data-automation-id='diy-type-button']//p)[1]");
	private By personalSectionMessage = By.xpath("(//div[@data-automation-id='diy-type-button']//p)[2]");
	private By personalIncentiveList = By.xpath("(//div[@data-automation-id='diy-type-button']//li)");
	private By personalAccountBtn = By.xpath("(//button[@class='bttn--primary'])[1]");
	
	private By professionalSectionLogo = By.xpath("//div[@data-automation-id='proxtra-type-button']//img[@alt='pro-xtra-logo']");
	private By professionalSectionHeader = By.xpath("(//div[@data-automation-id='proxtra-type-button']//p)[1]");
	private By professionalSectionMessage = By.xpath("(//div[@data-automation-id='proxtra-type-button']//p)[2]");
	private By professionalIncentiveList = By.xpath("(//div[@data-automation-id='proxtra-type-button']//li)");
	private By professionalAccountBtn = By.xpath("(//button[@class='bttn--primary'])[2]");
	
	//Common Locators
	private By formFields = By.xpath("(//form/div/label)");
	private By emailField = By.id("email");
	private By emailFieldErrorMessage = By.xpath("//span[contains(@data-automation-id,'EmailErrorField')]");
	private By passwordField = By.id("password-input-field");
	private By showPasswordLink = By.xpath("//label[contains(@data-automation-id, 'registrationPswShowBtn')]");
	private By hidePasswordLink = By.xpath("//label[contains(@data-automation-id, 'registrationPswHideBtn')]");
	private By passwordFieldErrorMessage = By.xpath("//span[contains(@data-automation-id,'PasswordErrorField')]");
	private By phoneNumberField = By.xpath("//input[contains(@id,'hone') and contains(@type,'text')]");
	private By phoneNumberFieldErrorMessage = By.xpath("//span[contains(@data-automation-id,'PhoneErrorField')]");
	private By checkBoxLabels = By.xpath("//div[contains(@class,'checkbox-btn')]/following-sibling::label");
	private By keepMeSignedInCheckBox = By.xpath("//label[@for='kmsi-checkbox']");
	private By keepMeSignedInToolTipIcon = By.className("kmsi-tooltip");
	private By keepMeSignedInToolTipText = By.xpath("//div[@class='tippy-content']//span");
	private By keepMeSignedInToolTipCloseBtn = By.xpath("//div[@class='tippy-content']//button");
	private By captchaMessage = By.xpath("//div[@class='form-input-error__message u--marginXsmall-top']");
	private By legalLinksText = By.className("modal-legal-links");
	private By legalLinks = By.xpath("//div[@class='modal-legal-links u--paddingSmall-top u__text-align--center u__small']/a");
	private By proXtraTermsAndConditionsLink = By.linkText("Pro Xtra Terms and Conditions");
	private By privacyAndSecurityStatementLink = By.linkText("Privacy and Security Statement");
	private By myAccountTermsAndConditionsLink = By.linkText("My Account Terms and Conditions");
	private By createAccountBtn = By.xpath("//button[@type='submit']");
	
	
	//Personal Account Locators
	
	private By passwordStrengthRequirements = By.xpath("//div[@class='u__bold'] | //div[contains(@class,'password-req-entry')]");
	private By passwordRequirementMinCharIcon = By.xpath("(//div[contains(@class,'req-icon')])[1]/img");
	private By passwordRequirementUppercaseLetterIcon = By.xpath("(//div[contains(@class,'req-icon')])[2]/img");
	private By passwordRequirementNumberIcon = By.xpath("(//div[contains(@class,'req-icon')])[3]/img");
	private By passwordRequirementLowercaseLetterIcon = By.xpath("(//div[contains(@class,'req-icon')])[4]/img");
	private By passwordRequirementSpecialCharIcon = By.xpath("(//div[contains(@class,'req-icon')])[5]/img");
	private By passwordStrengthMeter = By.xpath("//div[contains(@class,'u--padding-bottom u__bold')]");
	private By zipCodeField = By.id("zipCode");
	private By zipCodeFieldErrorMessage = By.xpath("//span[@data-automation-id='registrationZipcodeErrorField']");
	private By verifyPhoneNumberCheckBox = By.xpath("//label[@for='verify-phone-checkbox']");
	private By currentAccountHolderQuestion = By.xpath("//div[@class='col__12-12 u__text-align--center u--paddingNormal-vertical']");
	private By signInLink = By.xpath("//span[@data-automation-id='registrationSignInButton']");
	
	
	//ProXtra Account By Locators
	 private By proXtraBenefitSectionHeader = By.xpath("//div[@data-automation-id='accountBenefits']/p[@class='u__bold u__text-align--left u__medium u--paddingSmall-bottom']");
	 private By proXtraBenefitDescription = By.xpath("//div[@data-automation-id='accountBenefits']/p[@class='u--paddingSmall-bottom']");
	 private By proXtraBenefitList = By.xpath("//div[@class='col__12-12 u--paddingNone-left']//p");
	 private By companyNameField = By.id("companyName");
	 private By companyNameFieldErrorMessage = By.xpath("//span[@data-automation-id='proRegistrationCompanyNameErrorField']");
	 private By firstNameField = By.id("firstName");	
	 private By firstNameFieldErrorMessage = By.xpath("//span[@data-automation-id='proRegistrationFirstNameErrorField']");
	 private By lastNameField = By.id("lastName");
	 private By lastNameFieldErrorMessage = By.xpath("//span[@data-automation-id='proRegistrationLastNameErrorField']");
	 private By companyAddressToolTipIcon = By.xpath("//button[@class='address-tooltip tooltip-icon u__margin--left-sm']");
	 private By companyAddressToolTipText = By.xpath("//span[@class='address-tooltip tooltip-content']");
	 private By companyAddressLine1Field = By.id("proAddress");
	 private By companyAddressFieldErrorMessage = By.xpath("//span[@data-automation-id='proRegistrationProAddressErrorField']");
	 private By addCompanyAddressLine2Link = By.id("renderAddressLine2Link");
	 private By companyAddressLine2Field = By.id("addr2_optional");
	 private By companyZipCode = By.id("proZipCode");
	 private By companyZipCodeErrorMessage = By.xpath("//span[@data-automation-id='proRegistrationProZipCodeErrorField']");
	 private By companyCityStateField = By.className("col__6-12");
	 private By proXtraBusinessDropdownLabel = By.className("drop-down__label");
	 private By proXtraBusinessDropdownField = By.className("drop-down__select");
	 private By proXtraBusinessDropdownDefaultValue = By.xpath("//select[@class='drop-down__select']/option[@value='DEFAULT']");
	 private By proXtraBusinessDropdownOptions = By.xpath("//select[@class='drop-down__select']/option");
	 private By proXtraBusinessFieldErrorMessage = By.xpath("//span[@data-automation-id='proRegistrationTradeTypeErrorField']");
	 private By noticeOfFinancialIncentiveLink = By.linkText("Notice of Financial Incentive");
	 private By proXtraPasswordRequirements = By.xpath("//span[@data-automation-id='registrationPasswordErrorField']/following-sibling::div");

	 //Sign In Form By Locators
	 private By signInFormMessage = By.className("u--paddingNormal-bottom");
	
	 //Successful Registration By Locators
	 private By registrationSuccessHeader = By.xpath("//p[@data-automation-id='subscriptionHeader']");
	 private By chooseSubscriptionsHeader = By.className("spsi-h2");
	 private By chooseSubscriptionsMessage = By.xpath("//h2[@class='u--marginNormal-bottom spsi-h2']/following-sibling::p");
	 private By chooseSubscriptionsList = By.xpath("//label[@class='checkbox-content']");
	 private By chooseSubscriptionsButtons = By.xpath("//form//button");
	 private By chooseSubscriptionsSubscribeBtn = By.xpath("(//form//button)[1]");
	 private By chooseSubscriptionsSkipBtn = By.xpath("(//form//button)[2]");
	
	//constructor
	 public CreateAnAccountPage(WebDriver driver) {
		this.driver = driver;
		eleUtil = new ElementUtil(driver);
		jsUtil = new JavaScriptUtil(driver);
	}
	
//*****Select An Account Type Functions*****
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
	
	public void clickBackButton() {
		eleUtil.doClick(backBtn);
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
		return eleUtil.getElementsTextList(personalIncentiveList);
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
		return eleUtil.getElementsTextList(professionalIncentiveList);
	}
	
	public String getProfessionalSectionButtonText() {
		return eleUtil.doElementGetText(professionalAccountBtn);
	}
	
	
//Create Personal Account Functions
	
	public void clickPersonalAccountBtn() {
		eleUtil.doClick(personalAccountBtn);
		eleUtil.waitForElementsPresence(formFields, WaitConstants.DEFAULT_SHORT_TIME_OUT);
	}
	
	public int getTotalFormFields() {
		eleUtil.waitForElementsPresence(formFields, WaitConstants.DEFAULT_SHORT_TIME_OUT);
		return eleUtil.getTotalElementsCount(formFields);
	}
	
	public List<String> getFormFieldLabels() {
		eleUtil.waitForElementsPresence(formFields, WaitConstants.DEFAULT_SHORT_TIME_OUT);
		return eleUtil.getElementsTextList(formFields);
	}
	
	public List<String> getFormCheckBoxLabels() {
		eleUtil.waitForElementsPresence(formFields, WaitConstants.DEFAULT_SHORT_TIME_OUT);
		return eleUtil.getElementsTextList(checkBoxLabels);
	}
	
	public boolean doesKeepMeSignedInToolTipIconExist() {
		eleUtil.waitForElementPresence(formFields, WaitConstants.DEFAULT_SHORT_TIME_OUT);
		return  eleUtil.doElementIsDisplayed(keepMeSignedInToolTipIcon);
	}
	
	public String getKeepMeSignedInToolTipText() {
		eleUtil.clickWhenReady(WaitConstants.DEFAULT_SHORT_TIME_OUT, keepMeSignedInToolTipIcon);
		String actualText = eleUtil.doElementGetText(keepMeSignedInToolTipText);
		eleUtil.doClick(keepMeSignedInToolTipCloseBtn);
		return actualText;
	}
	public String getAccountCreationButtonText() {
		eleUtil.waitForElementPresence(formFields, WaitConstants.DEFAULT_SHORT_TIME_OUT);
		return eleUtil.doElementGetText(createAccountBtn);
	}
	
	public String getCurrentAccountHolderQuestionText() {
		eleUtil.waitForElementPresence(formFields, WaitConstants.DEFAULT_SHORT_TIME_OUT);
		return eleUtil.doElementGetText(currentAccountHolderQuestion);
	}
	
	public boolean doesSignInLinkExist() {
		eleUtil.waitForElementPresence(formFields, WaitConstants.DEFAULT_SHORT_TIME_OUT);
		return eleUtil.doElementIsDisplayed(signInLink);
	}
	
	public String clickSignInLink() {
		eleUtil.clickWhenReady(WaitConstants.DEFAULT_SHORT_TIME_OUT, signInLink);
		String actualText = eleUtil.doElementGetText(signInFormMessage);
		eleUtil.doClick(backBtn);
		return actualText;
	}
	
	public int getLegalLinksCount() {
		eleUtil.waitForElementPresence(formFields, WaitConstants.DEFAULT_SHORT_TIME_OUT);
		return eleUtil.getElements(legalLinks).size();
	}
	
	public List<String> getLegalLinksText() {
		eleUtil.waitForElementPresence(formFields, WaitConstants.DEFAULT_SHORT_TIME_OUT);
		return eleUtil.getElementsTextList(legalLinks);
	}
		
	public List<String> getLegalLinksSectionText() {
		eleUtil.waitForElementsPresence(checkBoxLabels, WaitConstants.DEFAULT_SHORT_TIME_OUT);
		return eleUtil.getElementsTextList(legalLinksText);
	}

	public ProXtraTermsAndConditionsPage clickProXtraTermsAndConditionsLink() {
		eleUtil.clickWhenReady(WaitConstants.DEFAULT_SHORT_TIME_OUT, proXtraTermsAndConditionsLink);
		eleUtil.switchToChildWindowID();
		return new ProXtraTermsAndConditionsPage(driver);
	}
	
	public PrivacyAndSecurityStatementPage clickPrivacyAndSecurityStatementLink() {
		eleUtil.clickWhenReady(WaitConstants.DEFAULT_SHORT_TIME_OUT, privacyAndSecurityStatementLink);
		eleUtil.switchToChildWindowID();
		return new PrivacyAndSecurityStatementPage(driver);
	}
	
	public MyAccountTermsAndConditionsPage clickMyAccountTermsAndConditionsLink() {
		eleUtil.clickWhenReady(WaitConstants.DEFAULT_SHORT_TIME_OUT, myAccountTermsAndConditionsLink);
		eleUtil.switchToChildWindowID();
		return new MyAccountTermsAndConditionsPage(driver);
	}
	
	
//Create Professional Account Functions
	
	public void clickProfessionalAccountBtn() {
		eleUtil.doClick(professionalAccountBtn);
		eleUtil.waitForElementsPresence(formFields, WaitConstants.DEFAULT_SHORT_TIME_OUT);
	}
	
	public boolean clickAddCompanyAddressLine2Link() {
		eleUtil.doClick(addCompanyAddressLine2Link);
		return eleUtil.doElementIsDisplayed(companyAddressLine2Field);
	}
	
	public boolean doesCompanyAddressToolTipIconExist() {
		return  eleUtil.doElementIsDisplayed(companyAddressToolTipIcon);
	}
	
	public String getCompanyAddressToolTipText() {
		eleUtil.clickWhenReady(WaitConstants.DEFAULT_SHORT_TIME_OUT, companyAddressToolTipIcon);
		return eleUtil.doElementGetText(companyAddressToolTipText);
	}
	
	public String getBusinessTypeFieldLabel() {
		return eleUtil.doElementGetText(proXtraBusinessDropdownLabel);
	}
	
	public String getBusinessTypeFieldDefault() {
		return eleUtil.doElementGetText(proXtraBusinessDropdownDefaultValue);
	}
	
	public boolean doesZipCodeFieldExist(String companyAddress) {
		eleUtil.doClearData(companyAddressLine1Field);
		eleUtil.doSendKeys(companyAddressLine1Field, companyAddress);
		return eleUtil.doElementIsDisplayed(companyZipCode);
	}
		
	public boolean doesCityStateFieldExist(String companyAddress, int zipCode) {
		eleUtil.doClearData(companyAddressLine1Field);
		eleUtil.doSendKeys(companyAddressLine1Field, companyAddress);
		eleUtil.doSendKeys(companyZipCode, zipCode);
		eleUtil.waitForElementPresence(companyCityStateField, WaitConstants.DEFAULT_SHORT_TIME_OUT);
		return eleUtil.doElementIsDisplayed(companyCityStateField);
	}
	
	public List<String> getBusinessTypeFieldDropdownOptions() {
		return eleUtil.getElementsTextList(proXtraBusinessDropdownOptions);
	}
	
	public NoticeOfFinancialIncentivePage clickNoticeOfFinancialIncentiveLink() {
		eleUtil.clickWhenReady(WaitConstants.DEFAULT_SHORT_TIME_OUT, noticeOfFinancialIncentiveLink);
		eleUtil.switchToChildWindowID();
		return new NoticeOfFinancialIncentivePage(driver);
	}
	
	public String getProfessionalAccountBenefitsSectionHeader() {
		return eleUtil.doElementGetText(proXtraBenefitSectionHeader);
	}
	
	public String getProfessionalAccountBenefitsDescription() {
		return eleUtil.doElementGetText(proXtraBenefitDescription);
	}
	
	public List<String> getProfessionalAccountBenefitsList() {
		return eleUtil.getElementsTextList(proXtraBenefitList);
	}
	
//form field functions
	
	public String getEmailAddressErrorMessage1() {
		eleUtil.doSendKeys(emailField, "");
		eleUtil.doTabBySendKeys(emailField);
		return eleUtil.doElementGetText(emailFieldErrorMessage);
	}
	
	public String getEmailAddressErrorMessage2(String emailAddress) {
		eleUtil.doClearData(emailField);
		eleUtil.doSendKeys(emailField, emailAddress);
		eleUtil.doTabBySendKeys(emailField);
		return  eleUtil.doElementGetText(emailFieldErrorMessage);
	}
	
	public List<String> getPersonalPasswordRequirementsText() {
		return eleUtil.getElementsTextList(passwordStrengthRequirements);
	}
	
	public String getProfessionalPasswordRequirementsText() {
		return eleUtil.doElementGetText(proXtraPasswordRequirements);
	}
	
	public String getPasswordErrorMessage(String password) {
		eleUtil.doClearData(passwordField);
		eleUtil.doSendKeys(passwordField, password);
		eleUtil.doTabBySendKeys(passwordField);
		return eleUtil.doElementGetText(passwordFieldErrorMessage);
	}
	
	public String getPasswordErrorMessage() {
		eleUtil.doClearData(passwordField);
		eleUtil.doTabBySendKeys(passwordField);
		return eleUtil.doElementGetText(passwordFieldErrorMessage);
	}
	
	public String getZipCodeErrorMessage(int zipCode) {
		eleUtil.doClearData(zipCodeField);
		eleUtil.doSendKeys(zipCodeField, zipCode);
		eleUtil.doTabBySendKeys(zipCodeField);
		return eleUtil.doElementGetText(zipCodeFieldErrorMessage);
	}
	
	public String getPhoneNumberErrorMessage(String phoneNumber) {
		eleUtil.doClearData(phoneNumberField);
		eleUtil.doSendKeys(phoneNumberField, phoneNumber);
		eleUtil.doTabBySendKeys(phoneNumberField);
		return eleUtil.doElementGetText(phoneNumberFieldErrorMessage);
	}
	
	public String getFirstNameErrorMessage(String lastName) {
		eleUtil.doClearData(firstNameField);
		eleUtil.doSendKeys(firstNameField, lastName);
		eleUtil.doTabBySendKeys(firstNameField);
		return eleUtil.doElementGetText(firstNameFieldErrorMessage);
	}
	
	public String getFirstNameErrorMessage() {
		eleUtil.doClearData(firstNameField);
		eleUtil.doTabBySendKeys(firstNameField);
		return eleUtil.doElementGetText(firstNameFieldErrorMessage);
	}
	
	public String getLastNameErrorMessage(String lastName) {
		eleUtil.doClearData(lastNameField);
		eleUtil.doSendKeys(lastNameField, lastName);
		eleUtil.doTabBySendKeys(companyNameField);
		return eleUtil.doElementGetText(lastNameFieldErrorMessage);
	}
	
	public String getLastNameErrorMessage() {
		eleUtil.doClearData(lastNameField);
		eleUtil.doTabBySendKeys(companyNameField);
		return eleUtil.doElementGetText(lastNameFieldErrorMessage);
	}
	
	public String getCompanyNameErrorMessage(String companyName) {
		eleUtil.doClearData(companyNameField);
		eleUtil.doSendKeys(companyNameField, companyName);
		eleUtil.doClearData(companyNameField);
		eleUtil.doTabBySendKeys(companyNameField);
		return eleUtil.doElementGetText(companyNameFieldErrorMessage);
	}
	
	public String getCompanyNameErrorMessage() {
		eleUtil.doClearData(companyNameField);
		eleUtil.doTabBySendKeys(companyNameField);
		return eleUtil.doElementGetText(companyNameFieldErrorMessage);
	}
	
	public String getCompanyAddressErrorMessage(String companyAddress) {
		eleUtil.doClearData(companyAddressLine1Field);
		eleUtil.doSendKeys(companyAddressLine1Field, companyAddress);
		eleUtil.doTabBySendKeys(companyAddressLine1Field);
		eleUtil.doClearData(companyAddressLine1Field);
		return eleUtil.doElementGetText(companyAddressFieldErrorMessage);
	}
	
	public String getCompanyAddressErrorMessage() {
		eleUtil.doClearData(companyAddressLine1Field);
		eleUtil.doTabBySendKeys(companyAddressLine1Field);
		return eleUtil.doElementGetText(companyAddressFieldErrorMessage);
	}
	
	public String getCompanyZipCodeErrorMessage(String companyAddress, int zipCode) {
		eleUtil.doClearData(companyAddressLine1Field);
		eleUtil.doSendKeys(companyAddressLine1Field, companyAddress);
		eleUtil.doTabBySendKeys(companyAddressLine1Field);
		eleUtil.doClearData(companyZipCode);
		eleUtil.doSendKeys(companyZipCode, zipCode);
		return eleUtil.doElementGetText(companyZipCodeErrorMessage);
	}
	
	public String getBusinessTypeErrorMessage() {
		eleUtil.doSelectDropDownByValue(proXtraBusinessDropdownField, "HANDYPERSON");
		eleUtil.doSelectDropDownByValue(proXtraBusinessDropdownField, "DEFAULT");
		return eleUtil.doElementGetText(proXtraBusinessFieldErrorMessage);
	}
	
	public String clickShowPasswordLink(String password) {
		WebElement showPassword = driver.findElement(showPasswordLink);
		eleUtil.doClearData(passwordField);
		eleUtil.doSendKeys(passwordField, password);
		jsUtil.clickElementByJS(showPassword);
		eleUtil.doElementIsDisplayed(hidePasswordLink);
		return eleUtil.doElementGetText(hidePasswordLink);
	}
	
	public String clickHidePasswordLink(String password) {
		WebElement showPassword = driver.findElement(showPasswordLink);
		eleUtil.doClearData(passwordField);
		eleUtil.doSendKeys(passwordField, password);
		jsUtil.clickElementByJS(showPassword);
		WebElement hidePassword = driver.findElement(hidePasswordLink);
		jsUtil.clickElementByJS(hidePassword);
		return eleUtil.doElementGetText(showPasswordLink);
	}
	
	public String getPasswordContainsMiniumCharatersIcon(String password) {
		eleUtil.doClearData(passwordField);
		eleUtil.doSendKeys(passwordField, password);
		return eleUtil.getElementAttribute(passwordRequirementMinCharIcon, "src");
	}
	
	public String getPasswordContainsUppercaseLetterIcon(String password) {
		eleUtil.doClearData(passwordField);
		eleUtil.doSendKeys(passwordField, password);
		return eleUtil.getElementAttribute(passwordRequirementUppercaseLetterIcon, "src");
	}
	
	public String getPasswordContainsNumberIcon(String password) {
		eleUtil.doClearData(passwordField);
		eleUtil.doSendKeys(passwordField, password);
		return eleUtil.getElementAttribute(passwordRequirementNumberIcon, "src");
	}
	
	public String getPasswordContainsLowercaseLetterIcon(String password) {
		eleUtil.doClearData(passwordField);
		eleUtil.doSendKeys(passwordField, password);
		return eleUtil.getElementAttribute(passwordRequirementLowercaseLetterIcon, "src");
	}
	
	public String getPasswordContainsSpecialCharaterIcon(String password) {
		eleUtil.doClearData(passwordField);
		eleUtil.doSendKeys(passwordField, password);
		return eleUtil.getElementAttribute(passwordRequirementSpecialCharIcon, "src");
	}
	
	public String getPasswordStrenthMeterText(String password) {
		eleUtil.doClearData(passwordField);
		eleUtil.doSendKeys(passwordField, password);
		return eleUtil.doElementGetText(passwordStrengthMeter);
	}

//*****completely fill in the form fields	
	
	public void fillInPersonalForm(String emailAddress, String password, int zipCode, String phoneNumber) {
		eleUtil.doSendKeys(emailField, emailAddress);
		eleUtil.doSendKeys(passwordField, password);
		eleUtil.doSendKeys(zipCodeField, zipCode);
		eleUtil.doSendKeys(phoneNumberField, phoneNumber);
		eleUtil.doClick(keepMeSignedInCheckBox);
		eleUtil.doClick(verifyPhoneNumberCheckBox);
		eleUtil.doClick(createAccountBtn);
	}
	
	public String fillInProfessionalForm(String emailAddress, String password, String companyName, String firstName, String lastName, String phoneNumber, String companyAddress, String unitNumber, int zipCode, String businessType ) {
		eleUtil.doSendKeys(emailField, emailAddress);
		eleUtil.doSendKeys(passwordField, password);
		eleUtil.doSendKeys(companyNameField, companyName);
		eleUtil.doSendKeys(firstNameField, firstName);
		eleUtil.doSendKeys(lastNameField, lastName);
		eleUtil.doSendKeys(phoneNumberField, phoneNumber);
		eleUtil.doSendKeys(companyAddressLine1Field, companyAddress);
		clickAddCompanyAddressLine2Link();
		eleUtil.doSendKeys(companyAddressLine2Field, unitNumber);
		eleUtil.doSendKeys(companyZipCode, zipCode);
		eleUtil.doSelectDropDownByVisibleText(proXtraBusinessDropdownField, businessType);
		eleUtil.doClick(keepMeSignedInCheckBox);
		eleUtil.doClick(createAccountBtn);
		return eleUtil.waitForElementPresence(registrationSuccessHeader, WaitConstants.DEFAULT_SHORT_TIME_OUT).getText();
	}

//successful registration
	public String getChooseSubscriptionsHeaderText() {
		return eleUtil.waitForElementPresence(chooseSubscriptionsHeader, WaitConstants.DEFAULT_SHORT_TIME_OUT).getText();
	}
	
	public String getChooseSubscriptionsMessageText() {
		return eleUtil.waitForElementPresence(chooseSubscriptionsMessage, WaitConstants.DEFAULT_SHORT_TIME_OUT).getText();
	}
	
	public List<String> getChooseSubscriptionsListText() {
		return eleUtil.getElementsTextList(chooseSubscriptionsList);
	}
	
	public List<String> getChooseSubscriptionsButtonsText() {
		return eleUtil.getElementsTextList(chooseSubscriptionsButtons);
	}
	
	public void chooseSubcriptions_clickSubscribeButton() {
		eleUtil.doClick(chooseSubscriptionsSubscribeBtn);
	}
	
	public void chooseSubscriptions_clickSkipButton() {
		eleUtil.doClick(chooseSubscriptionsSkipBtn);
	}
	
	

	
	
	
	
	
	
	
	


	
	
	


}
