package xyzcompany.qa.teama1.tests;


import java.util.List;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import xyzcompany.qa.teama1.base.BaseTest;
import xyzcompany.qa.teama1.constants.AppConstants;

public class CreateAProfessionalAccountTest extends BaseTest{
	
	@BeforeClass
	public void createAnAccountPageSetup() {
		commonPageElements.topNavigation_openMyAccountPopUp();
		createAnAccountPage = commonPageElements.myAccountPopUp_clickCreateAnAccountButton();
	}
	
	@BeforeMethod
	public void clickProfessionalAccountButton() {
		createAnAccountPage.clickProfessionalAccountBtn();
	}
	
	@AfterMethod
	public void clickBackButton() {
		createAnAccountPage.clickBackButton();
	}
	
//*****Professional Account Type Tests*****		

	@Test
	public void professionalAccount_LogoDisplayedTest() {
		boolean logoFlag = createAnAccountPage.doesPageLogoExist();
		Assert.assertTrue(logoFlag);
	}
	
	@Test
	public void professionalAccount_PageHeaderTest() {
		String actualHeader = createAnAccountPage.getPageHeader();
		Assert.assertEquals(actualHeader, AppConstants.CREATE_AN_ACCOUNT_PAGE_PRO_XTRA_HEADER_VALUE);
	}
	
	@Test
	public void professionalAccount_BackButtonDisplayedTest() {
		boolean backBtnFlag = createAnAccountPage.doesBackBtnExist();
		Assert.assertTrue(backBtnFlag);
	}

	@Test
	public void professionalAccount_TotalFormFields_withoutAddressLine2_Test() {
		int totalFields = createAnAccountPage.getTotalFormFields();
		Assert.assertEquals(totalFields, AppConstants.CREATE_AN_ACCOUNT_PAGE_PRO_XTRA_FORM_FIELDS_WITHOUT_ADDRESS_LINE_2_COUNT);
	}
		
	@Test
	public void professionalAccount_TotalFormFields_withAddressLine2_Test() {
		createAnAccountPage.clickAddCompanyAddressLine2Link();
		int totalFields = createAnAccountPage.getTotalFormFields();
		Assert.assertEquals(totalFields, AppConstants.CREATE_AN_ACCOUNT_PAGE_PRO_XTRA_FORM_FIELDS_WITH_ADDRESS_LINE_2_COUNT);
	}
		
	@Test
	public void professionalAccount_FormFieldLabels_withoutAddressLine2_Test() {
		List<String> actualList = createAnAccountPage.getFormFieldLabels();
		Assert.assertEquals(actualList, AppConstants.CREATE_AN_ACCOUNT_PAGE_PRO_XTRA_FORM_FIELDS_WITHOUT_ADDRESS_LINE_2_LIST);
	}
		
	@Test
	public void professionalAccount_FormFieldLabels_withAddressLine2_Test() {
		createAnAccountPage.clickAddCompanyAddressLine2Link();
		List<String> actualList = createAnAccountPage.getFormFieldLabels();
		Assert.assertEquals(actualList, AppConstants.CREATE_AN_ACCOUNT_PAGE_PRO_XTRA_FORM_FIELDS_WITH_ADDRESS_LINE_2_LIST);
	}
	
	@Test
	public void professionalAccount_FormCheckBoxLabelsTest() {
		List<String> actualList = createAnAccountPage.getFormCheckBoxLabels();
		Assert.assertEquals(actualList, AppConstants.CREATE_AN_ACCOUNT_PAGE_PRO_XTRA_FORM_CHECKBOX_LIST);
	}
	
	@Test
	public void professionalAccount_KeepMeSignedInToolTipIconDisplayedTest() {
		boolean iconFlag = createAnAccountPage.doesKeepMeSignedInToolTipIconExist();
		Assert.assertTrue(iconFlag);
	}
		
	@Test
	public void professionalAccount_KeepMeSignedInToolTipTextTest() {
		String actualText = createAnAccountPage.getKeepMeSignedInToolTipText();
		Assert.assertEquals(actualText, AppConstants.CREATE_AN_ACCOUNT_PAGE_KEEP_ME_SIGNED_IN_TOOL_TIP_VALUE);
	}
	
	
	@Test
	public void professionalAccount_CompanyAddressToolTipIconDisplayedTest() {
		boolean iconFlag = createAnAccountPage.doesCompanyAddressToolTipIconExist();
		Assert.assertTrue(iconFlag);
	}
		
	@Test
	public void professionalAccount_CompanyAddressToolTipTextTest() {
		String actualText = createAnAccountPage.getCompanyAddressToolTipText();
		Assert.assertEquals(actualText, AppConstants.CREATE_AN_ACCOUNT_PAGE_PRO_XTRA_FORM_COMPANY_ADDRESS_FIELD_TOOL_TIP_VALUE);
	}
		
	@Test
	public void professionalAccount_BusinessTypeFieldLabelTextTest() {
		String actualText = createAnAccountPage.getBusinessTypeFieldLabel();
		Assert.assertEquals(actualText, AppConstants.CREATE_AN_ACCOUNT_PAGE_PRO_XTRA_SELECT_BUSINESS_OR_TRADE_DROPDOWN_LABEL_VALUE);
	}
		
	@Test
	public void professionalAccount_BusinessTypeFieldDefaultOptionTest() {
		String actualText = createAnAccountPage.getBusinessTypeFieldDefault();
		Assert.assertEquals(actualText, AppConstants.CREATE_AN_ACCOUNT_PAGE_PRO_XTRA_SELECT_BUSINESS_OR_TRADE_DROPDOWN_DEFAULT_VALUE);
	}
		
	@Test
	public void professionallAccount_BusinessTypeFieldOptionsListTest() {
		List<String> actualList = createAnAccountPage.getBusinessTypeFieldDropdownOptions();
		Assert.assertEquals(actualList, AppConstants.CREATE_AN_ACCOUNT_PAGE_PRO_XTRA_SELECT_BUSINESS_OR_TRADE_DROPDOWN_OPTIONS_LIST);
	}
	
	@Test
	public void professionalAccount_CreationButtonTextTest() {
		String actualText = createAnAccountPage.getAccountCreationButtonText();
		Assert.assertEquals(actualText, AppConstants.CREATE_AN_ACCOUNT_PAGE_PRO_XTRA_ACCOUNT_CREATION_BUTTON_LABEL_VALUE);
	}
		
	@Test
	public void professionalAccount_TotalLegalLinksTest() {
		int totalLinks = createAnAccountPage.getLegalLinksCount();
		Assert.assertEquals(totalLinks, AppConstants.CREATE_AN_ACCOUTN_PAGE_PRO_XTRA_LEGAL_LINKS_COUNT);
	}
		
	@Test
	public void professionalAccount_LegalLinksTextTest() {
		List<String> actualText = createAnAccountPage.getLegalLinksText();
		Assert.assertEquals(actualText, AppConstants.CREATE_AN_ACCOUTN_PAGE_PRO_XTRA_LEGAL_LINKS_LIST);
	}
		
	@Test
	public void professionalAccount_LegalLinksSectionTextTest() {
		List<String> actualList= createAnAccountPage.getLegalLinksSectionText();
		Assert.assertEquals(actualList, AppConstants.CREATE_AN_ACCOUTN_PAGE_PRO_XTRA_LEGAL_LINKS_SECTION_LIST);
	}
	
	@Test
	public void professionalAccount_ClickProXtraTermsAndConditionsLinkTest() {
		createAnAccountPage.clickProXtraTermsAndConditionsLink();
		String actualTitle = commonPageElements.getPageTitle(AppConstants.PRO_XTRA_TERMS_AND_CONDITIONS_PAGE_TITLE_VALUE, AppConstants.PRO_XTRA_TERMS_AND_CONDITIONS_PAGE_NAME_VALUE);
		proXtraTermsAndConditionsPage.closeTab();
		Assert.assertEquals(actualTitle, AppConstants.PRO_XTRA_TERMS_AND_CONDITIONS_PAGE_TITLE_VALUE);
	}
		
	@Test
	public void professionalAccount_ClickPrivacyAndSecurityStatementLinkTest() {
		createAnAccountPage.clickPrivacyAndSecurityStatementLink();
		String actualTitle = commonPageElements.getPageTitle(AppConstants.PRIVACY_AND_SECURITY_STATEMENT_PAGE_TITLE_VALUE, AppConstants.PRIVACY_AND_SECURITY_STATEMENT_PAGE_NAME_VALUE);
		privacyAndSecurityStatementPage.closeTab();
		Assert.assertEquals(actualTitle, AppConstants.PRIVACY_AND_SECURITY_STATEMENT_PAGE_TITLE_VALUE);
	}
	
	@Test
	public void professionalAccount_ClickNoticeOfFinancialIncentiveLinkTest() {
		createAnAccountPage.clickNoticeOfFinancialIncentiveLink();
		String actualTitle = commonPageElements.getPageTitle(AppConstants.NOTICE_OF_FINANCIAL_INCENTIVE_PAGE_TITLE_VALUE, AppConstants.NOTICE_OF_FINANCIAL_INCENTIVE_PAGE_NAME_VALUE);
		noticeOfFinancialIncentivePage.closeTab();
		Assert.assertEquals(actualTitle, AppConstants.NOTICE_OF_FINANCIAL_INCENTIVE_PAGE_TITLE_VALUE);
	}
		
	@Test
	public void professionalAccount_ClickMyAccountTermsAndConditionsLinkTest() {
		createAnAccountPage.clickMyAccountTermsAndConditionsLink();
		String actualTitle = commonPageElements.getPageTitle(AppConstants.MY_ACCOUNT_TERMS_AND_CONDITIONS_PAGE_TITLE_VALUE, AppConstants.MY_ACCOUNT_TERMS_AND_CONDITIONS_PAGE_NAME_VALUE);
		myAccountTermsAndConditionsPage.closeTab();
		Assert.assertEquals(actualTitle, AppConstants.MY_ACCOUNT_TERMS_AND_CONDITIONS_PAGE_TITLE_VALUE);
	}
		
	@Test
	public void professionalAccount_BenefitsSectionHeader_Test() {
		String actualHeader = createAnAccountPage.getProfessionalAccountBenefitsSectionHeader();
		Assert.assertEquals(actualHeader, AppConstants.CREATE_AN_ACCOUNT_PAGE_PRO_XTRA_ACCOUNT_BENEFIT_HEADER_VALUE);
	}
		
	@Test
	public void professionalAccount_BenefitsSectionDescription_Test() {
		String actualText = createAnAccountPage.getProfessionalAccountBenefitsDescription();
		Assert.assertEquals(actualText, AppConstants.CREATE_AN_ACCOUNT_PAGE_PRO_XTRA_ACCOUNT_BENEFIT_DESCRIPTION_VALUE);
	}
			
	@Test
	public void professionalAccount_BenefitsList_Test() {
		List<String> actualList = createAnAccountPage.getProfessionalAccountBenefitsList();
		Assert.assertEquals(actualList, AppConstants.CREATE_AN_ACCOUNT_PAGE_PRO_XTRA_ACCOUNT_BENEFIT_LIST);
	}
		
//*****Individual Form Field Tests*****
	
	//email address field tests
		
	@Test
	public void professionalAccount_BlankEmailAddressTest() {
		String actualText = createAnAccountPage.getEmailAddressErrorMessage1();
		Assert.assertEquals(actualText, AppConstants.CREATE_AN_ACCOUNT_PAGE_FORM_EMAIL_FIELD_ERROR_MESSAGE_1);
	}
		
	@DataProvider
	public Object[][] getErroneousEmailAddress() {
		return new Object[][] {
			{"automation"},
			{"automation@"},
			{"automation@uat"},
			{"automation@uat."},
		};
	}
		
	@Test(dataProvider = "getErroneousEmailAddress")
	public void professionalAccount_EnterErroneousEmailAddressTest(String emailAddress) {
		String actualText = createAnAccountPage.getEmailAddressErrorMessage2(emailAddress);
		Assert.assertEquals(actualText, AppConstants.CREATE_AN_ACCOUNT_PAGE_FORM_EMAIL_FIELD_ERROR_MESSAGE_2);
	}
	
	//password field tests
		
	@Test
	public void professionalAccount_PasswordRequirementsTest() {
		String actualText = createAnAccountPage.getProfessionalPasswordRequirementsText();
		Assert.assertEquals(actualText, AppConstants.CREATE_AN_ACCOUNT_PAGE_PRO_XTRA_FORM_PASSWORD_REQUIREMENTS_MESSAGE);
	}
	
	@DataProvider
	public Object[][] getPassword(){
		return new Object[][] {
			{"pass-1234"}
		};
	}
	
	@Test(dataProvider = "getPassword")
	public void professionalAccount_ClickShowPasswordLinkTest(String password) {
		String linkText = createAnAccountPage.clickShowPasswordLink(password);
		Assert.assertEquals(linkText, AppConstants.CREATE_AN_ACCOUNT_PAGE_FORM_PASSWORD_CHECK_VALUE_1);
	}
	
	@Test(dataProvider = "getPassword")
	public void professionalAccount_ClickHidePasswordLinkTest(String password) {
		String linkText = createAnAccountPage.clickHidePasswordLink(password);
		Assert.assertEquals(linkText, AppConstants.CREATE_AN_ACCOUNT_PAGE_FORM_PASSWORD_CHECK_VALUE_2);
	}
		
	@Test
	public void professionalAccount_BlankPasswordTest() {
		String actualText = createAnAccountPage.getPasswordErrorMessage();
		Assert.assertEquals(actualText, AppConstants.CREATE_AN_ACCOUNT_PAGE_PRO_XTRA_FORM_PASSWORD_FIELD_ERROR_MESSAGE_1);
	}
		
	@DataProvider
	public Object[][] getPasswordWithoutMiniumCharacters() {
		return new Object[][] {
			{"test"},
			{"Test"},
			{"TEST"},
			{"@Test"},
			{"Test12"},
			{"Test12@"},
		};
	}
		
	@Test(dataProvider = "getPasswordWithoutMiniumCharacters")
	public void professionalAccount_EnterShortPasswordTest(String password) {
		String actualText = createAnAccountPage.getPasswordErrorMessage(password);
		Assert.assertEquals(actualText, AppConstants.CREATE_AN_ACCOUNT_PAGE_PRO_XTRA_FORM_PASSWORD_FIELD_ERROR_MESSAGE_2);
	}
		
	@DataProvider
	public Object[][] getErroneousBusinessPassword() {
		return new Object[][] {
			{"password"},
			{"password1"},
			{"password12"},
			{"password123"}
		};
	}
		
	@Test(dataProvider = "getErroneousBusinessPassword")
	public void professionalAccount_EnterErroneousPasswordTest(String password) {
		String actualText = createAnAccountPage.getPasswordErrorMessage(password);
		Assert.assertEquals(actualText, AppConstants.CREATE_AN_ACCOUNT_PAGE_PRO_XTRA_FORM_PASSWORD_FIELD_ERROR_MESSAGE_3);
	}
	
	//phone number field tests
		
	@DataProvider
	public Object[][] getErroneousPhoneNumber(){
		return new Object[][] {
			{" "},
			{"555"},
			{"555123"},
			{"5551230"},
			{"555123456"}
		};
	}
		
	@Test(dataProvider = "getErroneousPhoneNumber")
	public void professionalAccount_EnterErroneousPhoneNumberTest(String phoneNumber) {
		String actualText = createAnAccountPage.getPhoneNumberErrorMessage(phoneNumber);
		Assert.assertEquals(actualText, AppConstants.CREATE_AN_ACCOUNT_PAGE_FORM_PHONE_FIELD_ERROR_MESSAGE);
	}
	
	//company name field tests
	
	@Test
	public void professionalAccount_BlankCompanyNameTest() {
		String actualText = createAnAccountPage.getCompanyNameErrorMessage();
		Assert.assertEquals(actualText, AppConstants.CREATE_AN_ACCOUNT_PAGE_PRO_XTRA_FORM_COMPANY_NAME_FIELD_ERROR_MESSAGE);
	}
	
	@DataProvider
	public Object[][] getCompanyName(){
		return new Object[][] {
			{"ABC Company"}
		};
	}
	
	@Test(dataProvider = "getCompanyName")
	public void professionalAccount_ClearCompanyNameTest(String company) {
		String actualText = createAnAccountPage.getCompanyNameErrorMessage(company);
		Assert.assertEquals(actualText, AppConstants.CREATE_AN_ACCOUNT_PAGE_PRO_XTRA_FORM_COMPANY_NAME_FIELD_ERROR_MESSAGE);
	}
	
	//first name field test
	
	@Test
	public void professionalAccount_BlankFirstNameTest() {
		String actualText = createAnAccountPage.getFirstNameErrorMessage();
		Assert.assertEquals(actualText, AppConstants.CREATE_AN_ACCOUNT_PAGE_PRO_XTRA_FORM_NAME_FIELD_ERROR_MESSAGE);
	}
	
	//last name field test
	
	@Test
	public void professionalAccount_BlankLastNameTest() {
		String actualText = createAnAccountPage.getLastNameErrorMessage();
		Assert.assertEquals(actualText, AppConstants.CREATE_AN_ACCOUNT_PAGE_PRO_XTRA_FORM_NAME_FIELD_ERROR_MESSAGE);
	}
	
	//company address fields tests
	
	@DataProvider
	public Object[][] getCompanyAddress(){
		return new Object[][] {
			{"145 Work Way"}
		};
	}
	
	@Test
	public void professionalAccount_BlankCompanyAddressTest() {
		String actualText = createAnAccountPage.getCompanyAddressErrorMessage();
		Assert.assertEquals(actualText, AppConstants.CREATE_AN_ACCOUNT_PAGE_PRO_XTRA_FORM_COMPANY_ADDRESS_FIELD_ERROR_MESSAGE);
	}
		
	@Test(dataProvider = "getCompanyAddress")
	public void professionalAccount_isZipCodeFieldDisplayedTest(String companyAddress) {
		boolean flag = createAnAccountPage.doesZipCodeFieldExist(companyAddress);
		Assert.assertTrue(flag);
	}
	
	@DataProvider
	public Object[][] getErroneousZipCode(){
		return new Object[][] {
			{"558 Work",0},
			{"1411 Job Ave",1234},
			{"5",50},
			{"Shipping Ln",021},
			{"65 N 15th St",6},
		};
	}
		
	@Test(dataProvider = "getErroneousZipCode")
	public void professionalAccount_EnterErroneousZipCodeTest(String companyAddress, int zipCode) {
		String actualText = createAnAccountPage.getCompanyZipCodeErrorMessage(companyAddress, zipCode);
		Assert.assertEquals(actualText, AppConstants.CREATE_AN_ACCOUNT_PAGE_ZIP_CODE_FIELD_ERROR_MESSAGE);
	}
	
	@DataProvider
	public Object[][] getCompanyAddressAndZipCode(){
		return new Object[][] {
			{"558 Work Way",10282},
		};
	}
	
	@Test(dataProvider = "getCompanyAddressAndZipCode")
	public void professionalAccount_isCityStateFieldDisplayedTest(String companyAddress, int zipCode) {
		boolean flag = createAnAccountPage.doesCityStateFieldExist(companyAddress, zipCode);
		Assert.assertTrue(flag);
	}
	
//business type field tests
	
	@Test
	public void professionalAccount_NoSelection_BusinessTypeTest() {
		String actualText = createAnAccountPage.getBusinessTypeErrorMessage();
		Assert.assertEquals(actualText, AppConstants.CREATE_AN_ACCOUNT_PAGE_PRO_XTRA_SELECT_BUSINESS_OR_TRADE_DROPDOWN_ERROR_MESSAGE);
	}
		
	//*****Fill Out Complete Form with Data********
		
	@DataProvider
	public Object[][] getProfessionalFormTestData() {
		return new Object[][] {
			{"testauto.test@uat.com", "Pass-1234", "We Can Fix It", "Paisley", "Oliver", "5551234567", "123 Worker Way", "", 50313, "Handyperson"},
		};
	}
		
	@Test(dataProvider = "getProfessionalFormTestData")
	public void professionalAccount_EnterDataInFormFieldsTest(String emailAddress, String password, String companyName, String firstName, String lastName, String phoneNumber, String companyAddress, String unitNumber, int zipCode, String businessType ) {
		String actualText = createAnAccountPage.fillInProfessionalForm(emailAddress, password, companyName, firstName, lastName, phoneNumber, companyAddress, unitNumber, zipCode, businessType);
		Assert.assertEquals(actualText, AppConstants.SUCCESSFUL_REGISTRATION_HEADER_VALUE);
	}
	
	@Test
	public void successfulRegistration_HeaderTextTest() {
		String actualText = createAnAccountPage.getChooseSubscriptionsHeaderText();
		Assert.assertEquals(actualText, AppConstants.SUCCESSFUL_REGISTRATION_HEADER_VALUE);
	}
	
		

}
