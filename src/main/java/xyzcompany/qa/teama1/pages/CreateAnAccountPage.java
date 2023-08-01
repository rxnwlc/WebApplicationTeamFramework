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
	 private By companyAddrLine2Field = By.id("addr2_optional");
	 private By proXtraBusinessDropdownLabel = By.className("drop-down__label");
	 private By proXtraBusinessDropdownField = By.className("drop-down__select");
	 private By proXtraBusinessDropdownDefaultValue = By.xpath("//select[@class='drop-down__select']/option[@value='DEFAULT']");
	 private By proXtraBusinessDropdownOptions = By.xpath("//select[@class='drop-down__select']/option");
	 private By proXtraBusinessFieldErrorMessage = By.xpath("//span[@data-automation-id='proRegistrationTradeTypeErrorField']");
	 private By noticeOfFinancialIncentiveLink = By.linkText("Notice of Financial Incentive");
	 private By proXtraPasswordRequirements = By.xpath("//span[@data-automation-id='registrationPasswordErrorField']/following-sibling::div");

	 private By signInFormMessage = By.className("u--paddingNormal-bottom");
	
	
	
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
		List<String> actualList = eleUtil.getElementsTextList(personalIncentiveList);
		//System.out.println(actualList);
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
		//System.out.println(actualList);
		return actualList;
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
		int totalFields = eleUtil.getTotalElementsCount(formFields);
		eleUtil.doClick(backBtn);
		return totalFields;
	}
	
	public List<String> getFormFieldLabels() {
		eleUtil.waitForElementsPresence(formFields, WaitConstants.DEFAULT_SHORT_TIME_OUT);
		List<String> actualList = eleUtil.getElementsTextList(formFields);
		//System.out.println(actualList);
		eleUtil.doClick(backBtn);
		return actualList;
	}
	
	public List<String> getFormCheckBoxLabels() {
		eleUtil.waitForElementsPresence(formFields, WaitConstants.DEFAULT_SHORT_TIME_OUT);
		List<String> actualList = eleUtil.getElementsTextList(checkBoxLabels);
		//System.out.println(actualList);
		eleUtil.doClick(backBtn);
		return actualList;
	}
	
	public boolean doesKeepMeSignedInToolTipIconExist() {
		eleUtil.waitForElementPresence(formFields, WaitConstants.DEFAULT_SHORT_TIME_OUT);
		boolean iconFlag =  eleUtil.doElementIsDisplayed(keepMeSignedInToolTipIcon);
		eleUtil.doClick(backBtn);
		return iconFlag;
	}
	
	public String getKeepMeSignedInToolTipText() {
		eleUtil.clickWhenReady(WaitConstants.DEFAULT_SHORT_TIME_OUT, keepMeSignedInToolTipIcon);
		String actualText = eleUtil.doElementGetText(keepMeSignedInToolTipText);
		eleUtil.doClick(keepMeSignedInToolTipCloseBtn);
		eleUtil.doClick(backBtn);
		return actualText;
	}
	public String getAccountCreationButtonText() {
		eleUtil.waitForElementPresence(formFields, WaitConstants.DEFAULT_SHORT_TIME_OUT);
		String actualText = eleUtil.doElementGetText(createAccountBtn);
		eleUtil.doClick(backBtn);
		return actualText;
	}
	
	public String getCurrentAccountHolderQuestionText() {
		eleUtil.doClick(personalAccountBtn);
		eleUtil.waitForElementPresence(formFields, WaitConstants.DEFAULT_SHORT_TIME_OUT);
		String actualText = eleUtil.doElementGetText(currentAccountHolderQuestion);
		eleUtil.doClick(backBtn);
		return actualText;
	}
	
	public boolean doesSignInLinkExist() {
		eleUtil.doClick(personalAccountBtn);
		eleUtil.waitForElementPresence(formFields, WaitConstants.DEFAULT_SHORT_TIME_OUT);
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
	
	public int getLegalLinksCount() {
		eleUtil.waitForElementPresence(formFields, WaitConstants.DEFAULT_SHORT_TIME_OUT);
		int linksCount = eleUtil.getElements(legalLinks).size();
		eleUtil.doClick(backBtn);
		return linksCount;
	}
	
	public List<String> getLegalLinksText() {
		eleUtil.waitForElementPresence(formFields, WaitConstants.DEFAULT_SHORT_TIME_OUT);
		List<String> actualList = eleUtil.getElementsTextList(legalLinks);
		//System.out.println(actualList);
		eleUtil.doClick(backBtn);
		return actualList;
	}
		
	public List<String> getLegalLinksSectionText() {
		eleUtil.waitForElementsPresence(checkBoxLabels, WaitConstants.DEFAULT_SHORT_TIME_OUT);
		List<String> actualList = eleUtil.getElementsTextList(legalLinksText);
		eleUtil.doClick(backBtn);
		return actualList;
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
		eleUtil.doClick(professionalAccountBtn);
		eleUtil.waitForElementsPresence(formFields, WaitConstants.DEFAULT_SHORT_TIME_OUT);
		eleUtil.doClick(addCompanyAddressLine2Link);
		return eleUtil.doElementIsDisplayed(companyAddrLine2Field);
	}
	
	public boolean doesCompanyAddressToolTipIconExist() {
		eleUtil.doClick(professionalAccountBtn);
		eleUtil.waitForElementPresence(formFields, WaitConstants.DEFAULT_SHORT_TIME_OUT);
		boolean iconFlag =  eleUtil.doElementIsDisplayed(companyAddressToolTipIcon);
		eleUtil.doClick(backBtn);
		return iconFlag;
	}
	
	public String getCompanyAddressToolTipText() {
		eleUtil.doClick(professionalAccountBtn);
		eleUtil.clickWhenReady(WaitConstants.DEFAULT_SHORT_TIME_OUT, companyAddressToolTipIcon);
		String actualText = eleUtil.doElementGetText(companyAddressToolTipText);
		eleUtil.doClick(backBtn);
		return actualText;
	}
	
	public String getBusinessTypeFieldLabel() {
		eleUtil.doClick(professionalAccountBtn);
		eleUtil.waitForElementPresence(formFields, WaitConstants.DEFAULT_SHORT_TIME_OUT);
		String actualText = eleUtil.doElementGetText(proXtraBusinessDropdownLabel);
		eleUtil.doClick(backBtn);
		return actualText;
	}
	
	public String getBusinessTypeFieldDefault() {
		eleUtil.doClick(professionalAccountBtn);
		eleUtil.waitForElementPresence(formFields, WaitConstants.DEFAULT_SHORT_TIME_OUT);
		String actualText = eleUtil.doElementGetText(proXtraBusinessDropdownDefaultValue);
		eleUtil.doClick(backBtn);
		return actualText;
	}
	
	public List<String> getBusinessTypeFieldDropdownOptions() {
		eleUtil.doClick(professionalAccountBtn);
		eleUtil.waitForElementsPresence(formFields, WaitConstants.DEFAULT_SHORT_TIME_OUT);
		List<String> actualList = eleUtil.getElementsTextList(proXtraBusinessDropdownOptions);
		//System.out.println(actualList);
		eleUtil.doClick(backBtn);
		return actualList;
	}
	
	public NoticeOfFinancialIncentivePage clickNoticeOfFinancialIncentiveLink() {
		eleUtil.clickWhenReady(WaitConstants.DEFAULT_SHORT_TIME_OUT, noticeOfFinancialIncentiveLink);
		eleUtil.switchToChildWindowID();
		return new NoticeOfFinancialIncentivePage(driver);
	}
	
	public String getProfessionalAccountBenefitsSectionHeader() {
		eleUtil.doClick(professionalAccountBtn);
		eleUtil.waitForElementsPresence(formFields, WaitConstants.DEFAULT_SHORT_TIME_OUT);
		String actualHeader = eleUtil.doElementGetText(proXtraBenefitSectionHeader);
		//System.out.println(actualHeader);
		eleUtil.doClick(backBtn);
		return actualHeader;
	}
	
	public String getProfessionalAccountBenefitsDescription() {
		eleUtil.doClick(professionalAccountBtn);
		eleUtil.waitForElementsPresence(formFields, WaitConstants.DEFAULT_SHORT_TIME_OUT);
		String actualText = eleUtil.doElementGetText(proXtraBenefitDescription);
		//System.out.println(actualText);
		eleUtil.doClick(backBtn);
		return actualText;
	}
	
	public List<String> getProfessionalAccountBenefitsList() {
		eleUtil.doClick(professionalAccountBtn);
		eleUtil.waitForElementsPresence(formFields, WaitConstants.DEFAULT_SHORT_TIME_OUT);
		List<String> actualList = eleUtil.getElementsTextList(proXtraBenefitList);
		//System.out.println(actualList);
		eleUtil.doClick(backBtn);
		return actualList;
	}
	
//form field functions
	
	public String getEmailAddressErrorMessage1() {
		eleUtil.clickWhenReady(WaitConstants.DEFAULT_SHORT_TIME_OUT, emailField);
		eleUtil.doSendKeys(emailField, "");
		eleUtil.doTabBySendKeys(emailField);
		String actualText =  eleUtil.doElementGetText(emailFieldErrorMessage);
		eleUtil.doClick(backBtn);
		return actualText;
	}
	
	public String getEmailAddressErrorMessage2(String emailAddress) {
		eleUtil.clickWhenReady(WaitConstants.DEFAULT_SHORT_TIME_OUT, emailField);
		eleUtil.doClearData(emailField);
		eleUtil.doSendKeys(emailField, emailAddress);
		eleUtil.doTabBySendKeys(emailField);
		String actualText =  eleUtil.doElementGetText(emailFieldErrorMessage);
		eleUtil.doClick(backBtn);
		return actualText;
	}
	
	public List<String> getPersonalPasswordRequirementsText() {
		eleUtil.doClick(personalAccountBtn);
		eleUtil.clickWhenReady(WaitConstants.DEFAULT_SHORT_TIME_OUT, passwordField);
		List<String> actualList = eleUtil.getElementsTextList(passwordStrengthRequirements);
		eleUtil.doClick(backBtn);
		return actualList;
	}
	
	public String getProfessionalPasswordRequirementsText() {
		eleUtil.doClick(professionalAccountBtn);
		eleUtil.clickWhenReady(WaitConstants.DEFAULT_SHORT_TIME_OUT, passwordField);
		String actualText = eleUtil.doElementGetText(proXtraPasswordRequirements);
		eleUtil.doClick(backBtn);
		return actualText;
	}
	
	public String getPasswordErrorMessage(String password) {
		eleUtil.clickWhenReady(WaitConstants.DEFAULT_SHORT_TIME_OUT, passwordField);
		eleUtil.doClearData(passwordField);
		eleUtil.doSendKeys(passwordField, password);
		eleUtil.doTabBySendKeys(passwordField);
		String actualText =  eleUtil.doElementGetText(passwordFieldErrorMessage);
		eleUtil.doClick(backBtn);
		return actualText;
	}
	
	public String getZipCodeErrorMessage(int zipCode) {
		eleUtil.doClick(personalAccountBtn);
		eleUtil.clickWhenReady(WaitConstants.DEFAULT_SHORT_TIME_OUT, zipCodeField);
		eleUtil.doClearData(zipCodeField);
		eleUtil.doSendKeys(zipCodeField, zipCode);
		eleUtil.doTabBySendKeys(zipCodeField);
		String actualText =  eleUtil.doElementGetText(zipCodeFieldErrorMessage);
		eleUtil.doClick(backBtn);
		return actualText;
	}
	
	public String getPhoneNumberErrorMessage(String phoneNumber) {
		eleUtil.clickWhenReady(WaitConstants.DEFAULT_SHORT_TIME_OUT, phoneNumberField);
		eleUtil.doClearData(phoneNumberField);
		eleUtil.doSendKeys(phoneNumberField, phoneNumber);
		eleUtil.doTabBySendKeys(phoneNumberField);
		String actualText =  eleUtil.doElementGetText(phoneNumberFieldErrorMessage);
		eleUtil.doClick(backBtn);
		return actualText;
	}
	
	public String getFirstNameErrorMessage(String lastName) {
		eleUtil.doClick(professionalAccountBtn);
		eleUtil.clickWhenReady(WaitConstants.DEFAULT_SHORT_TIME_OUT, firstNameField);
		eleUtil.doClearData(firstNameField);
		eleUtil.doSendKeys(firstNameField, lastName);
		eleUtil.doTabBySendKeys(firstNameField);
		String actualText =  eleUtil.doElementGetText(firstNameFieldErrorMessage);
		eleUtil.doClick(backBtn);
		return actualText;
	}
	
	public String getLastNameErrorMessage(String lastName) {
		eleUtil.doClick(professionalAccountBtn);
		eleUtil.clickWhenReady(WaitConstants.DEFAULT_SHORT_TIME_OUT, lastNameField);
		eleUtil.doClearData(lastNameField);
		eleUtil.doSendKeys(lastNameField, lastName);
		eleUtil.doTabBySendKeys(companyNameField);
		String actualText =  eleUtil.doElementGetText(lastNameFieldErrorMessage);
		eleUtil.doClick(backBtn);
		return actualText;
	}
	
	public String getCompanyNameErrorMessage(String companyName) {
		eleUtil.doClick(professionalAccountBtn);
		eleUtil.clickWhenReady(WaitConstants.DEFAULT_SHORT_TIME_OUT, companyNameField);
		eleUtil.doClearData(companyNameField);
		eleUtil.doSendKeys(companyNameField, companyName);
		eleUtil.doTabBySendKeys(companyNameField);
		String actualText =  eleUtil.doElementGetText(companyNameFieldErrorMessage);
		eleUtil.doClick(backBtn);
		return actualText;
	}
	
	public String getCompanyAddressErrorMessage(String companyAddress) {
		eleUtil.doClick(professionalAccountBtn);
		eleUtil.clickWhenReady(WaitConstants.DEFAULT_SHORT_TIME_OUT, companyAddressLine1Field);
		eleUtil.doClearData(companyAddressLine1Field);
		eleUtil.doSendKeys(companyAddressLine1Field, companyAddress);
		eleUtil.doTabBySendKeys(companyAddressLine1Field);
		String actualText =  eleUtil.doElementGetText(companyAddressFieldErrorMessage);
		eleUtil.doClick(backBtn);
		return actualText;
	}
	
	public String getBusinessTypeErrorMessage() {
		eleUtil.doClick(professionalAccountBtn);
		eleUtil.clickWhenReady(WaitConstants.DEFAULT_SHORT_TIME_OUT, proXtraBusinessDropdownField);
		eleUtil.doSelectDropDownByValue(proXtraBusinessDropdownField, "DEFAULT");
		eleUtil.doTabBySendKeys(proXtraBusinessDropdownField);
		eleUtil.doClick(createAccountBtn);
		String actualText =  eleUtil.doElementGetText(proXtraBusinessFieldErrorMessage);
		eleUtil.doClick(backBtn);
		return actualText;
	}
	
	
	
	public String clickShowPasswordLink(String password) {
		WebElement showPassword = driver.findElement(showPasswordLink);
		eleUtil.clickWhenReady(WaitConstants.DEFAULT_SHORT_TIME_OUT, passwordField);
		eleUtil.doClearData(passwordField);
		eleUtil.doSendKeys(passwordField, password);
		jsUtil.clickElementByJS(showPassword);
		eleUtil.doElementIsDisplayed(hidePasswordLink);
		String actualText =  eleUtil.doElementGetText(hidePasswordLink);
		eleUtil.doClick(backBtn);
		return actualText;
	}
	
	public String clickHidePasswordLink(String password) {
		WebElement showPassword = driver.findElement(showPasswordLink);
		
		eleUtil.clickWhenReady(WaitConstants.DEFAULT_SHORT_TIME_OUT, passwordField);
		eleUtil.doClearData(passwordField);
		eleUtil.doSendKeys(passwordField, password);
		jsUtil.clickElementByJS(showPassword);
		WebElement hidePassword = driver.findElement(hidePasswordLink);
		jsUtil.clickElementByJS(hidePassword);
		String actualText =  eleUtil.doElementGetText(showPasswordLink);
		eleUtil.doClick(backBtn);
		return actualText;
	}
	
	public String getPasswordContainsMiniumCharatersIcon(String password) {
		eleUtil.doClick(personalAccountBtn);
		eleUtil.clickWhenReady(WaitConstants.DEFAULT_SHORT_TIME_OUT, passwordField);
		eleUtil.doClearData(passwordField);
		eleUtil.doSendKeys(passwordField, password);
		String srcLink = eleUtil.getElementAttribute(passwordRequirementMinCharIcon, "src");
		eleUtil.doClick(backBtn);
		return srcLink;
	}
	
	public String getPasswordContainsUppercaseLetterIcon(String password) {
		eleUtil.doClick(personalAccountBtn);
		eleUtil.clickWhenReady(WaitConstants.DEFAULT_SHORT_TIME_OUT, passwordField);
		eleUtil.doClearData(passwordField);
		eleUtil.doSendKeys(passwordField, password);
		String srcLink = eleUtil.getElementAttribute(passwordRequirementUppercaseLetterIcon, "src");
		eleUtil.doClick(backBtn);
		return srcLink;
	}
	
	public String getPasswordContainsNumberIcon(String password) {
		eleUtil.doClick(personalAccountBtn);
		eleUtil.clickWhenReady(WaitConstants.DEFAULT_SHORT_TIME_OUT, passwordField);
		eleUtil.doClearData(passwordField);
		eleUtil.doSendKeys(passwordField, password);
		String srcLink = eleUtil.getElementAttribute(passwordRequirementNumberIcon, "src");
		eleUtil.doClick(backBtn);
		return srcLink;
	}
	
	public String getPasswordContainsLowercaseLetterIcon(String password) {
		eleUtil.doClick(personalAccountBtn);
		eleUtil.clickWhenReady(WaitConstants.DEFAULT_SHORT_TIME_OUT, passwordField);
		eleUtil.doClearData(passwordField);
		eleUtil.doSendKeys(passwordField, password);
		String srcLink = eleUtil.getElementAttribute(passwordRequirementLowercaseLetterIcon, "src");
		eleUtil.doClick(backBtn);
		return srcLink;
	}
	
	public String getPasswordContainsSpecialCharaterIcon(String password) {
		eleUtil.doClick(personalAccountBtn);
		eleUtil.clickWhenReady(WaitConstants.DEFAULT_SHORT_TIME_OUT, passwordField);
		eleUtil.doClearData(passwordField);
		eleUtil.doSendKeys(passwordField, password);
		String srcLink = eleUtil.getElementAttribute(passwordRequirementSpecialCharIcon, "src");
		eleUtil.doClick(backBtn);
		return srcLink;
	}
	
	public String getPasswordStrenthMeterText(String password) {
		eleUtil.doClick(personalAccountBtn);
		eleUtil.clickWhenReady(WaitConstants.DEFAULT_SHORT_TIME_OUT, passwordField);
		eleUtil.doClearData(passwordField);
		eleUtil.doSendKeys(passwordField, password);
		String actualText = eleUtil.doElementGetText(passwordStrengthMeter);
		eleUtil.doClick(backBtn);
		return actualText;
	}

//*****completely fill in the form fields	
	
	public String fillInPersonalForm(String emailAddress, String password, int zipCode, String phoneNumber) {
		eleUtil.doClick(personalAccountBtn);
		eleUtil.clickWhenReady(WaitConstants.DEFAULT_SHORT_TIME_OUT, emailField);
		eleUtil.doSendKeys(emailField, emailAddress);
		eleUtil.doSendKeys(passwordField, password);
		eleUtil.doSendKeys(zipCodeField, zipCode);
		eleUtil.doSendKeys(phoneNumberField, phoneNumber);
		eleUtil.doClick(keepMeSignedInCheckBox);
		eleUtil.doClick(verifyPhoneNumberCheckBox);
		eleUtil.doClick(createAccountBtn);
		String actualText =  eleUtil.doElementGetText(captchaMessage);
		eleUtil.doClick(backBtn);
		return actualText;
	}
	
	public String fillInProfessionalForm(String emailAddress, String password, String companyName, String firstName, String lastName, String phoneNumber, String companyAddress, String businessType ) {
		eleUtil.doClick(professionalAccountBtn);
		eleUtil.clickWhenReady(WaitConstants.DEFAULT_SHORT_TIME_OUT, emailField);
		eleUtil.doSendKeys(emailField, emailAddress);
		eleUtil.doSendKeys(passwordField, password);
		eleUtil.doSendKeys(companyNameField, companyName);
		eleUtil.doSendKeys(firstNameField, firstName);
		eleUtil.doSendKeys(lastNameField, lastName);
		eleUtil.doSendKeys(phoneNumberField, phoneNumber);
		eleUtil.doSendKeys(companyAddressLine1Field, companyAddress);
		eleUtil.doSelectDropDownByVisibleText(proXtraBusinessDropdownField, businessType);
		eleUtil.doClick(keepMeSignedInCheckBox);
		eleUtil.doClick(createAccountBtn);
		String actualText =  eleUtil.doElementGetText(captchaMessage);
		eleUtil.doClick(backBtn);
		return actualText;
	}
	
	public String fillInProfessionalFormWithAddressLine2(String emailAddress, String password, String companyName, String firstName, String lastName, String phoneNumber, String companyAddress, String companyAddress2, String businessType ) {
		eleUtil.doClick(professionalAccountBtn);
		eleUtil.clickWhenReady(WaitConstants.DEFAULT_SHORT_TIME_OUT, emailField);
		eleUtil.doSendKeys(emailField, emailAddress);
		eleUtil.doSendKeys(passwordField, password);
		eleUtil.doSendKeys(companyNameField, companyName);
		eleUtil.doSendKeys(firstNameField, firstName);
		eleUtil.doSendKeys(lastNameField, lastName);
		eleUtil.doSendKeys(phoneNumberField, phoneNumber);
		eleUtil.doSendKeys(companyAddressLine1Field, companyAddress);
		eleUtil.doClick(addCompanyAddressLine2Link);
		eleUtil.doSendKeys(companyAddrLine2Field, companyAddress2);
		eleUtil.doSelectDropDownByVisibleText(proXtraBusinessDropdownField, businessType);
		eleUtil.doClick(keepMeSignedInCheckBox);
		eleUtil.doClick(createAccountBtn);
		String actualText =  eleUtil.doElementGetText(captchaMessage);
		eleUtil.doClick(backBtn);
		return actualText;
	}
	
	
	
	
	
	


	
	
	


}
