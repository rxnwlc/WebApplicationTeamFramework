package xyzcompany.qa.teama1.tests;


import java.util.List;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import xyzcompany.qa.teama1.base.BaseTest;
import xyzcompany.qa.teama1.constants.AppConstants;

public class CreateAnAccountPageTest extends BaseTest{
	
	@BeforeClass
	public void createAnAccountPageSetup() {
		commonPageElements.topNavigation_openMyAccountPopUp();
		createAnAccountPage = commonPageElements.myAccountPopUp_clickCreateAnAccountButton();
	}
	
	
	@Test
	public void createAnAccountPageURLTest() {
		String actualURL = commonPageElements.getPageURL(AppConstants.CREATE_AN_ACCOUNT_PAGE_URL_VALUE, AppConstants.CREATE_AN_ACCOUNT_PAGE_NAME_VALUE);
		Assert.assertEquals(actualURL, AppConstants.CREATE_AN_ACCOUNT_PAGE_URL_VALUE);
	}
	
	@Test
	public void createAnAccountPageTitleTest() {
		String actualTitle = commonPageElements.getPageTitle(AppConstants.CREATE_AN_ACCOUNT_PAGE_TITLE_VALUE, AppConstants.CREATE_AN_ACCOUNT_PAGE_NAME_VALUE);
		Assert.assertEquals(actualTitle, AppConstants.CREATE_AN_ACCOUNT_PAGE_TITLE_VALUE);
	}
	
//*****Select An Account Type Tests*****	

	@Test
	public void selectAccountType_LogoDisplayedTest() {
		boolean logoFlag = createAnAccountPage.doesPageLogoExist();
		Assert.assertTrue(logoFlag);
	}
	
	@Test
	public void selectAccountType_PageHeaderTest() {
		String actualHeader = createAnAccountPage.getPageHeader();
		Assert.assertEquals(actualHeader, AppConstants.CREATE_AN_ACCOUNT_PAGE_HEADER_VALUE);
	}
	
	@Test
	public void selectAccountType_PageMessageTest() {
		String actualMessage = createAnAccountPage.getPageMessage();
		Assert.assertEquals(actualMessage, AppConstants.CREATE_AN_ACCOUNT_PAGE_MESSAGE_VALUE);
	}
	
	@Test
	public void selectAccountType_BackButtonDisplayedTest() {
		boolean backBtnFlag = createAnAccountPage.doesBackBtnExist();
		Assert.assertTrue(backBtnFlag);
	}
	
	@Test
	public void selectAccountType_PersonalSectionLogoDisplayedTest() {
		boolean personalSectionLogoFlag = createAnAccountPage.doesPersonalSectionLogoExist();
		Assert.assertTrue(personalSectionLogoFlag);
	}
	
	@Test
	public void selectAccountType_PersonalSectionHeaderTest() {
		String actualHeader = createAnAccountPage.getPersonalSectionHeader();
		Assert.assertEquals(actualHeader, AppConstants.CREATE_AN_ACCOUNT_PAGE_PERSONAL_SECTION_HEADER_VALUE);
	}
	
	@Test
	public void selectAccountType_PersonalSectionMessageTest() {
		String actualMessage = createAnAccountPage.getPersonalSectionMessage();
		Assert.assertEquals(actualMessage, AppConstants.CREATE_AN_ACCOUNT_PAGE_PERSONAL_SECTION_MESSAGE_VALUE);
	}
	
	@Test
	public void selectAccountType_PersonalSectionIncentiveListTest() {
		List<String> actualList = createAnAccountPage.getPersonalIncentiveList();
		Assert.assertEquals(actualList, AppConstants.CREATE_AN_ACCOUNT_PAGE_PERSONAL_SECTION_INCENTIVE_LIST);
	}
	
	@Test
	public void selectAccountType_PersonalSectionButtonTextTest() {
		String actualBtnText = createAnAccountPage.getPersonalSectionButtonText();
		Assert.assertEquals(actualBtnText, AppConstants.CREATE_AN_ACCOUNT_PAGE_PROFESSIONAL_SECTION_BUTTON_LABEL_VALUE);
	}
	
	@Test
	public void selectAccountType_ProfessionalSectionLogoDisplayedTest() {
		boolean professionalSectionLogoFlag = createAnAccountPage.doesProfessionalSectionLogoExist();
		Assert.assertTrue(professionalSectionLogoFlag);
	}
	
	@Test
	public void selectAccountType_ProfessionalSectionHeaderTest() {
		String actualHeader = createAnAccountPage.getProfessionalSectionHeader();
		Assert.assertEquals(actualHeader, AppConstants.CREATE_AN_ACCOUNT_PAGE_PROFESSIONAL_SECTION_HEADER_VALUE);
	}
	
	@Test
	public void selectAccountType_ProfessionalSectionMessageTest() {
		String actualMessage = createAnAccountPage.getProfessionalSectionMessage();
		Assert.assertEquals(actualMessage, AppConstants.CREATE_AN_ACCOUNT_PAGE_PROFESSIONAL_SECTION_MESSAGE_VALUE);
	}
	
	@Test
	public void selectAccountType_ProfessionalSectionIncentiveListTest() {
		List<String> actualList = createAnAccountPage.getProfessionalIncentiveList();
		Assert.assertEquals(actualList, AppConstants.CREATE_AN_ACCOUNT_PAGE_PROFESSIONAL_SECTION_INCENTIVE_LIST);
	}
	
	@Test
	public void selectAccountType_ProfessionalSectionButtonTextTest() {
		String actualBtnText = createAnAccountPage.getProfessionalSectionButtonText();
		Assert.assertEquals(actualBtnText, AppConstants.CREATE_AN_ACCOUNT_PAGE_PROFESSIONAL_SECTION_BUTTON_LABEL_VALUE);
	}
	
//*****Personal Account Type Tests*****
	
	@Test
	public void personalAccount_LogoDisplayedTest() {
		createAnAccountPage.clickPersonalAccountBtn();
		boolean logoFlag = createAnAccountPage.doesPageLogoExist();
		createAnAccountPage.clickBackButton();
		Assert.assertTrue(logoFlag);
	}
	
	@Test
	public void personalAccount_PageHeaderTest() {
		createAnAccountPage.clickPersonalAccountBtn();
		String actualHeader = createAnAccountPage.getPageHeader();
		createAnAccountPage.clickBackButton();
		Assert.assertEquals(actualHeader, AppConstants.CREATE_AN_ACCOUNT_PAGE_HEADER_VALUE);
	}
	
	@Test
	public void personalAccount_BackButtonDisplayedTest() {
		createAnAccountPage.clickPersonalAccountBtn();
		boolean backBtnFlag = createAnAccountPage.doesBackBtnExist();
		createAnAccountPage.clickBackButton();
		Assert.assertTrue(backBtnFlag);
	}
	

	@Test
	public void personalAccount_TotalFormFieldsTest() {
		createAnAccountPage.clickPersonalAccountBtn();
		int totalFields = createAnAccountPage.getTotalFormFields();
		Assert.assertEquals(totalFields, AppConstants.CREATE_AN_ACCOUNT_PAGE_PERSONAL_FORM_FIELDS_COUNT);
	}
	
	@Test
	public void personalAccount_FormFieldLabelsTest() {
		createAnAccountPage.clickPersonalAccountBtn();
		List<String> actualList = createAnAccountPage.getFormFieldLabels();
		Assert.assertEquals(actualList, AppConstants.CREATE_AN_ACCOUNT_PAGE_PERSONAL_FORM_FIELDS_LIST);
	}
	
	@Test
	public void personalAccount_FormCheckBoxLabelsTest() {
		createAnAccountPage.clickPersonalAccountBtn();
		List<String> actualList = createAnAccountPage.getFormCheckBoxLabels();
		Assert.assertEquals(actualList, AppConstants.CREATE_AN_ACCOUNT_PAGE_PERSONAL_FORM_CHECKBOX_LIST);
	}
	
	@Test
	public void personalAccount_KeepMeSignedInToolTipIconDisplayedTest() {
		createAnAccountPage.clickPersonalAccountBtn();
		boolean iconFlag = createAnAccountPage.doesKeepMeSignedInToolTipIconExist();
		Assert.assertTrue(iconFlag);
	}
	
	@Test
	public void personalAccount_KeepMeSignedInToolTipTextTest() {
		createAnAccountPage.clickPersonalAccountBtn();
		String actualText = createAnAccountPage.getKeepMeSignedInToolTipText();
		Assert.assertEquals(actualText, AppConstants.CREATE_AN_ACCOUNT_PAGE_KEEP_ME_SIGNED_IN_TOOL_TIP_VALUE);
	}
	
	@Test
	public void personalAccount_CreationButtonTextTest() {
		createAnAccountPage.clickPersonalAccountBtn();
		String actualText = createAnAccountPage.getAccountCreationButtonText();
		Assert.assertEquals(actualText, AppConstants.CREATE_AN_ACCOUNT_PAGE_PERSONAL_ACCOUNT_CREATION_BUTTON_LABEL_VALUE);
	}
	
	@Test
	public void personalAccount_CurrentAccountHolderQuestionTextTest() {
		String actualText = createAnAccountPage.getCurrentAccountHolderQuestionText();
		Assert.assertEquals(actualText, AppConstants.CREATE_AN_ACCOUNT_PAGE_CURRENT_ACCOUNT_HOLDER_QUESTION_VALUE);
	}
	
	@Test
	public void personalAccount_IsSignInLinkDisplayedTest() {
		boolean signInLinkFlag = createAnAccountPage.doesSignInLinkExist();
		Assert.assertTrue(signInLinkFlag);
	}
	
	@Test
	public void personalAccount_TotalLegalLinksTest() {
		createAnAccountPage.clickPersonalAccountBtn();
		int totalLinks = createAnAccountPage.getLegalLinksCount();
		Assert.assertEquals(totalLinks, AppConstants.CREATE_AN_ACCOUTN_PAGE_LEGAL_LINKS_COUNT);
	}
	
	@Test
	public void personalAccount_LegalLinksTextTest() {
		createAnAccountPage.clickPersonalAccountBtn();
		List<String> actualText = createAnAccountPage.getLegalLinksText();
		Assert.assertEquals(actualText, AppConstants.CREATE_AN_ACCOUTN_PAGE_LEGAL_LINKS_LIST);
	}
	
	@Test
	public void personalAccount_LegalLinksSectionTextTest() {
		createAnAccountPage.clickPersonalAccountBtn();
		List<String> actualList= createAnAccountPage.getLegalLinksSectionText();
		Assert.assertEquals(actualList, AppConstants.CREATE_AN_ACCOUTN_PAGE_LEGAL_LINKS_SECTION_LIST);
	}
	
	@Test
	public void personalAccount_ClickProXtraTermsAndConditionsLinkTest() {
		createAnAccountPage.clickPersonalAccountBtn();
		createAnAccountPage.clickProXtraTermsAndConditionsLink();
		String actualTitle = commonPageElements.getPageTitle(AppConstants.PRO_XTRA_TERMS_AND_CONDITIONS_PAGE_TITLE_VALUE, AppConstants.PRO_XTRA_TERMS_AND_CONDITIONS_PAGE_NAME_VALUE);
		proXtraTermsAndConditionsPage.closeTab();
		createAnAccountPage.clickBackButton();
		Assert.assertEquals(actualTitle, AppConstants.PRO_XTRA_TERMS_AND_CONDITIONS_PAGE_TITLE_VALUE);
	}
		
	@Test
	public void personalAccount_ClickPrivacyAndSecurityStatementLinkTest() {
		createAnAccountPage.clickPersonalAccountBtn();
		createAnAccountPage.clickPrivacyAndSecurityStatementLink();
		String actualTitle = commonPageElements.getPageTitle(AppConstants.PRIVACY_AND_SECURITY_STATEMENT_PAGE_TITLE_VALUE, AppConstants.PRIVACY_AND_SECURITY_STATEMENT_PAGE_NAME_VALUE);
		privacyAndSecurityStatementPage.closeTab();
		createAnAccountPage.clickBackButton();
		Assert.assertEquals(actualTitle, AppConstants.PRIVACY_AND_SECURITY_STATEMENT_PAGE_TITLE_VALUE);
	}
	
	@Test
	public void personalAccount_ClickMyAccountTermsAndConditionsLinkTest() {
		createAnAccountPage.clickPersonalAccountBtn();
		createAnAccountPage.clickMyAccountTermsAndConditionsLink();
		String actualTitle = commonPageElements.getPageTitle(AppConstants.MY_ACCOUNT_TERMS_AND_CONDITIONS_PAGE_TITLE_VALUE, AppConstants.MY_ACCOUNT_TERMS_AND_CONDITIONS_PAGE_NAME_VALUE);
		myAccountTermsAndConditionsPage.closeTab();
		createAnAccountPage.clickBackButton();
		Assert.assertEquals(actualTitle, AppConstants.MY_ACCOUNT_TERMS_AND_CONDITIONS_PAGE_TITLE_VALUE);
	}
	
//*****Professional Account Type Tests*****		

	
	@Test
	public void professionalAccount_LogoDisplayedTest() {
		createAnAccountPage.clickProfessionalAccountBtn();
		boolean logoFlag = createAnAccountPage.doesPageLogoExist();
		createAnAccountPage.clickBackButton();
		Assert.assertTrue(logoFlag);
	}
	
	@Test
	public void professionalAccount_PageHeaderTest() {
		createAnAccountPage.clickProfessionalAccountBtn();
		String actualHeader = createAnAccountPage.getPageHeader();
		createAnAccountPage.clickBackButton();
		Assert.assertEquals(actualHeader, AppConstants.CREATE_AN_ACCOUNT_PAGE_PRO_XTRA_HEADER_VALUE);
	}
	
	@Test
	public void professionalAccount_BackButtonDisplayedTest() {
		createAnAccountPage.clickProfessionalAccountBtn();
		boolean backBtnFlag = createAnAccountPage.doesBackBtnExist();
		createAnAccountPage.clickBackButton();
		Assert.assertTrue(backBtnFlag);
	}

	@Test
	public void professionalAccount_TotalFormFields_withoutAddressLine2_Test() {
		createAnAccountPage.clickProfessionalAccountBtn();
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
		createAnAccountPage.clickProfessionalAccountBtn();
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
		createAnAccountPage.clickProfessionalAccountBtn();
		List<String> actualList = createAnAccountPage.getFormCheckBoxLabels();
		Assert.assertEquals(actualList, AppConstants.CREATE_AN_ACCOUNT_PAGE_PRO_XTRA_FORM_CHECKBOX_LIST);
	}
	
	@Test
	public void professionalAccount_KeepMeSignedInToolTipIconDisplayedTest() {
		createAnAccountPage.clickProfessionalAccountBtn();
		boolean iconFlag = createAnAccountPage.doesKeepMeSignedInToolTipIconExist();
		Assert.assertTrue(iconFlag);
	}
		
	@Test
	public void professionalAccount_KeepMeSignedInToolTipTextTest() {
		createAnAccountPage.clickProfessionalAccountBtn();
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
		createAnAccountPage.clickProfessionalAccountBtn();
		String actualText = createAnAccountPage.getAccountCreationButtonText();
		Assert.assertEquals(actualText, AppConstants.CREATE_AN_ACCOUNT_PAGE_PRO_XTRA_ACCOUNT_CREATION_BUTTON_LABEL_VALUE);
	}
		
	@Test
	public void professionalAccount_TotalLegalLinksTest() {
		createAnAccountPage.clickProfessionalAccountBtn();
		int totalLinks = createAnAccountPage.getLegalLinksCount();
		Assert.assertEquals(totalLinks, AppConstants.CREATE_AN_ACCOUTN_PAGE_PRO_XTRA_LEGAL_LINKS_COUNT);
	}
		
	@Test
	public void professionalAccount_LegalLinksTextTest() {
		createAnAccountPage.clickProfessionalAccountBtn();
		List<String> actualText = createAnAccountPage.getLegalLinksText();
		Assert.assertEquals(actualText, AppConstants.CREATE_AN_ACCOUTN_PAGE_PRO_XTRA_LEGAL_LINKS_LIST);
	}
		
	@Test
	public void professionalAccount_LegalLinksSectionTextTest() {
		createAnAccountPage.clickProfessionalAccountBtn();
		List<String> actualList= createAnAccountPage.getLegalLinksSectionText();
		Assert.assertEquals(actualList, AppConstants.CREATE_AN_ACCOUTN_PAGE_PRO_XTRA_LEGAL_LINKS_SECTION_LIST);
	}
	
	@Test
	public void professionalAccount_ClickProXtraTermsAndConditionsLinkTest() {
		createAnAccountPage.clickProfessionalAccountBtn();
		createAnAccountPage.clickProXtraTermsAndConditionsLink();
		String actualTitle = commonPageElements.getPageTitle(AppConstants.PRO_XTRA_TERMS_AND_CONDITIONS_PAGE_TITLE_VALUE, AppConstants.PRO_XTRA_TERMS_AND_CONDITIONS_PAGE_NAME_VALUE);
		proXtraTermsAndConditionsPage.closeTab();
		createAnAccountPage.clickBackButton();
		Assert.assertEquals(actualTitle, AppConstants.PRO_XTRA_TERMS_AND_CONDITIONS_PAGE_TITLE_VALUE);
	}
		
	@Test
	public void professionalAccount_ClickPrivacyAndSecurityStatementLinkTest() {
		createAnAccountPage.clickProfessionalAccountBtn();
		createAnAccountPage.clickPrivacyAndSecurityStatementLink();
		String actualTitle = commonPageElements.getPageTitle(AppConstants.PRIVACY_AND_SECURITY_STATEMENT_PAGE_TITLE_VALUE, AppConstants.PRIVACY_AND_SECURITY_STATEMENT_PAGE_NAME_VALUE);
		privacyAndSecurityStatementPage.closeTab();
		createAnAccountPage.clickBackButton();
		Assert.assertEquals(actualTitle, AppConstants.PRIVACY_AND_SECURITY_STATEMENT_PAGE_TITLE_VALUE);
	}
	
	@Test
	public void professionalAccount_ClickNoticeOfFinancialIncentiveLinkTest() {
		createAnAccountPage.clickProfessionalAccountBtn();
		createAnAccountPage.clickNoticeOfFinancialIncentiveLink();
		String actualTitle = commonPageElements.getPageTitle(AppConstants.NOTICE_OF_FINANCIAL_INCENTIVE_PAGE_TITLE_VALUE, AppConstants.NOTICE_OF_FINANCIAL_INCENTIVE_PAGE_NAME_VALUE);
		noticeOfFinancialIncentivePage.closeTab();
		createAnAccountPage.clickBackButton();
		Assert.assertEquals(actualTitle, AppConstants.NOTICE_OF_FINANCIAL_INCENTIVE_PAGE_TITLE_VALUE);
	}
		
	@Test
	public void professionalAccount_ClickMyAccountTermsAndConditionsLinkTest() {
		createAnAccountPage.clickProfessionalAccountBtn();
		createAnAccountPage.clickMyAccountTermsAndConditionsLink();
		String actualTitle = commonPageElements.getPageTitle(AppConstants.MY_ACCOUNT_TERMS_AND_CONDITIONS_PAGE_TITLE_VALUE, AppConstants.MY_ACCOUNT_TERMS_AND_CONDITIONS_PAGE_NAME_VALUE);
		myAccountTermsAndConditionsPage.closeTab();
		createAnAccountPage.clickBackButton();
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
	
	//email address field error messages tests
		
	@Test
	public void personalAccount_BlankEmailAddressTest() {
		createAnAccountPage.clickPersonalAccountBtn();
		String actualText = createAnAccountPage.getEmailAddressErrorMessage1();
		Assert.assertEquals(actualText, AppConstants.CREATE_AN_ACCOUNT_PAGE_FORM_EMAIL_FIELD_ERROR_MESSAGE_1);
	}
	
	@Test
	public void professionalAccount_BlankEmailAddressTest() {
		createAnAccountPage.clickProfessionalAccountBtn();
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
	public void personalAccount_EnterErroneousEmailAddressTest(String emailAddress) {
		createAnAccountPage.clickPersonalAccountBtn();
		String actualText = createAnAccountPage.getEmailAddressErrorMessage2(emailAddress);
		Assert.assertEquals(actualText, AppConstants.CREATE_AN_ACCOUNT_PAGE_FORM_EMAIL_FIELD_ERROR_MESSAGE_2);
	}
	
	@Test(dataProvider = "getErroneousEmailAddress")
	public void professionalAccount_EnterErroneousEmailAddressTest(String emailAddress) {
		createAnAccountPage.clickProfessionalAccountBtn();
		String actualText = createAnAccountPage.getEmailAddressErrorMessage2(emailAddress);
		Assert.assertEquals(actualText, AppConstants.CREATE_AN_ACCOUNT_PAGE_FORM_EMAIL_FIELD_ERROR_MESSAGE_2);
	}
	
	//password field requirements and error messages tests
		
	@Test
	public void personalAccount_PasswordRequirementsTest() {
		List<String> actualList = createAnAccountPage.getPersonalPasswordRequirementsText();
		Assert.assertEquals(actualList, AppConstants.CREATE_AN_ACCOUNT_PAGE_PASSWORD_REQUIREMENTS_LIST);
	}
	
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
	public void personalAccount_ClickShowPasswordLinkTest(String password) {
		createAnAccountPage.clickPersonalAccountBtn();
		String linkText = createAnAccountPage.clickShowPasswordLink(password);
		Assert.assertEquals(linkText, AppConstants.CREATE_AN_ACCOUNT_PAGE_FORM_PASSWORD_CHECK_VALUE_1);
	}
	
	@Test(dataProvider = "getPassword")
	public void personalAccount_ClickHidePasswordLinkTest(String password) {
		createAnAccountPage.clickPersonalAccountBtn();
		String linkText = createAnAccountPage.clickHidePasswordLink(password);
		Assert.assertEquals(linkText, AppConstants.CREATE_AN_ACCOUNT_PAGE_FORM_PASSWORD_CHECK_VALUE_2);
	}
	
	@Test(dataProvider = "getPassword")
	public void professionalAccount_ClickShowPasswordLinkTest(String password) {
		createAnAccountPage.clickProfessionalAccountBtn();
		String linkText = createAnAccountPage.clickShowPasswordLink(password);
		Assert.assertEquals(linkText, AppConstants.CREATE_AN_ACCOUNT_PAGE_FORM_PASSWORD_CHECK_VALUE_1);
	}
	
	@Test(dataProvider = "getPassword")
	public void professionalAccount_ClickHidePasswordLinkTest(String password) {
		createAnAccountPage.clickProfessionalAccountBtn();
		String linkText = createAnAccountPage.clickHidePasswordLink(password);
		Assert.assertEquals(linkText, AppConstants.CREATE_AN_ACCOUNT_PAGE_FORM_PASSWORD_CHECK_VALUE_2);
	}
		
	@DataProvider
	public Object[][] getBlank(){
		return new Object[][] {
			{""}
		};
	}
	
	@Test(dataProvider = "getBlank")
	public void personalAccount_BlankPasswordTest(String password) {
		createAnAccountPage.clickPersonalAccountBtn();
		String actualText = createAnAccountPage.getPasswordErrorMessage(password);
		Assert.assertEquals(actualText, AppConstants.CREATE_AN_ACCOUNT_PAGE_PERSONAL_FORM_PASSWORD_FIELD_ERROR_MESSAGE_1);
	}
	
	@Test(dataProvider = "getBlank")
	public void professionalAccount_BlankPasswordTest(String password) {
		createAnAccountPage.clickProfessionalAccountBtn();
		String actualText = createAnAccountPage.getPasswordErrorMessage(password);
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
	public void personalAccount_EnterShortPasswordTest(String password) {
		createAnAccountPage.clickPersonalAccountBtn();
		String actualText = createAnAccountPage.getPasswordErrorMessage(password);
		Assert.assertEquals(actualText, AppConstants.CREATE_AN_ACCOUNT_PAGE_PERSONAL_FORM_PASSWORD_FIELD_ERROR_MESSAGE_2);
	}
	
	@Test(dataProvider = "getPasswordWithoutMiniumCharacters")
	public void professionalAccount_EnterShortPasswordTest(String password) {
		createAnAccountPage.clickProfessionalAccountBtn();
		String actualText = createAnAccountPage.getPasswordErrorMessage(password);
		Assert.assertEquals(actualText, AppConstants.CREATE_AN_ACCOUNT_PAGE_PRO_XTRA_FORM_PASSWORD_FIELD_ERROR_MESSAGE_2);
	}
		
	@DataProvider
	public Object[][] getErroneousPassword() {
		return new Object[][] {
			{"automation"},
			{"autoTESTING"},
			{"AUTOMATION"},
			{"auto_+)(*&"},
			{"TEST_+)(*&"},
			{"auto1234567"},
			{"123456789"},
			{"!@#$%^&*("},
			{"1245!@#$%"},
		};
	}
		
	@Test(dataProvider = "getErroneousPassword")
	public void personalAccount_EnterErroneousPasswordTest(String password) {
		createAnAccountPage.clickPersonalAccountBtn();
		String actualText = createAnAccountPage.getPasswordErrorMessage(password);
		Assert.assertEquals(actualText, AppConstants.CREATE_AN_ACCOUNT_PAGE_PERSONAL_FORM_PASSWORD_FIELD_ERROR_MESSAGE_3);
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
		createAnAccountPage.clickProfessionalAccountBtn();
		String actualText = createAnAccountPage.getPasswordErrorMessage(password);
		Assert.assertEquals(actualText, AppConstants.CREATE_AN_ACCOUNT_PAGE_PRO_XTRA_FORM_PASSWORD_FIELD_ERROR_MESSAGE_3);
	}
		
	@DataProvider
	public Object[][] getErroneousZipCode(){
		return new Object[][] {
			{0},
			{1234},
			{50},
			{021},
			{6},
		};
	}
		
	@Test(dataProvider = "getErroneousZipCode")
	public void personalAccount_EnterErroneousZipCodeTest(int zipCode) {
		String actualText = createAnAccountPage.getZipCodeErrorMessage(zipCode);
		Assert.assertEquals(actualText, AppConstants.CREATE_AN_ACCOUNT_PAGE_PERSONAL_FORM_ZIP_CODE_FIELD_ERROR_MESSAGE);
	}
		
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
	public void personalAccount_EnterErroneousPhoneNumberTest(String phoneNumber) {
		createAnAccountPage.clickPersonalAccountBtn();
		String actualText = createAnAccountPage.getPhoneNumberErrorMessage(phoneNumber);
		Assert.assertEquals(actualText, AppConstants.CREATE_AN_ACCOUNT_PAGE_FORM_PHONE_FIELD_ERROR_MESSAGE);
	}
	
	@Test(dataProvider = "getErroneousPhoneNumber")
	public void professionalAccount_EnterErroneousPhoneNumberTest(String phoneNumber) {
		createAnAccountPage.clickProfessionalAccountBtn();
		String actualText = createAnAccountPage.getPhoneNumberErrorMessage(phoneNumber);
		Assert.assertEquals(actualText, AppConstants.CREATE_AN_ACCOUNT_PAGE_FORM_PHONE_FIELD_ERROR_MESSAGE);
	}
	
	@Test(dataProvider = "getBlank")
	public void professionalAccount_BlankCompanyNameTest(String companyName) {
		String actualText = createAnAccountPage.getCompanyNameErrorMessage(companyName);
		Assert.assertEquals(actualText, AppConstants.CREATE_AN_ACCOUNT_PAGE_PRO_XTRA_FORM_COMPANY_NAME_FIELD_ERROR_MESSAGE);
	}
	
	@Test(dataProvider = "getBlank")
	public void professionalAccount_BlankFirstNameTest(String firstName) {
		String actualText = createAnAccountPage.getFirstNameErrorMessage(firstName);
		Assert.assertEquals(actualText, AppConstants.CREATE_AN_ACCOUNT_PAGE_PRO_XTRA_FORM_NAME_FIELD_ERROR_MESSAGE);
	}
	
	@Test(dataProvider = "getBlank")
	public void professionalAccount_BlankLastNameTest(String lastName) {
		String actualText = createAnAccountPage.getLastNameErrorMessage(lastName);
		Assert.assertEquals(actualText, AppConstants.CREATE_AN_ACCOUNT_PAGE_PRO_XTRA_FORM_NAME_FIELD_ERROR_MESSAGE);
	}
	
	@Test(dataProvider = "getBlank")
	public void professionalAccount_BlankCompanyAddressTest(String companyAddress) {
		String actualText = createAnAccountPage.getCompanyAddressErrorMessage(companyAddress);
		Assert.assertEquals(actualText, AppConstants.CREATE_AN_ACCOUNT_PAGE_PRO_XTRA_FORM_COMPANY_ADDRESS_FIELD_ERROR_MESSAGE);
	}
	
	@Test
	public void professionalAccount_NoSelection_BusinessTypeTest() {
		String actualText = createAnAccountPage.getBusinessTypeErrorMessage();
		Assert.assertEquals(actualText, AppConstants.CREATE_AN_ACCOUNT_PAGE_PRO_XTRA_SELECT_BUSINESS_OR_TRADE_DROPDOWN_ERROR_MESSAGE);
	}
		
	@Test(dataProvider = "getPasswordWithoutMiniumCharacters")
	public void personalAccount_PasswordContainsMiniumCharatersIcon_Negative_Test(String password) {
		String srcLink = createAnAccountPage.getPasswordContainsMiniumCharatersIcon(password);
		Assert.assertEquals(srcLink, AppConstants.CREATE_AN_ACCOUNT_PAGE_PASSWORD_REQUIREMENTS_NOT_MET_ICON);
	}
		
	@DataProvider
	public Object[][] getPasswordWithMiniumCharacters(){
		return new Object[][] {
			{"pass-1234"},
			{"automation"},
			{"autoTESTING"},
			{"AUTOMATION"},
			{"auto_+)(*&"},
			{"TEST_+)(*&"},
			{"auto1234567"},
			{"123456789"},
			{"!@#$%^&*("},
			{"1245!@#$%"}
		};
	}
		
	@Test(dataProvider = "getPasswordWithMiniumCharacters")
	public void personalAccount_PasswordContainsMiniumCharatersIconTest(String password) {
		String srcLink = createAnAccountPage.getPasswordContainsMiniumCharatersIcon(password);
		Assert.assertEquals(srcLink, AppConstants.CREATE_AN_ACCOUNT_PAGE_PASSWORD_REQUIREMENTS_MET_ICON);
	}
	
	@DataProvider
	public Object[][] getPasswordWithoutSpecialCharacters(){
		return new Object[][] {
			{"automation"},
			{"autoTESTING"},
			{"AUTOMATION"},
			{"auto"},
			{"auto1234567"},
			{"123456789"},
			{"1245"}
		};
	}
		
	@Test(dataProvider = "getPasswordWithoutSpecialCharacters")
	public void personalAccount_PasswordContainsSpecialCharaterIcon_Negative_Test(String password) {
		String srcLink = createAnAccountPage.getPasswordContainsSpecialCharaterIcon(password);
		Assert.assertEquals(srcLink, AppConstants.CREATE_AN_ACCOUNT_PAGE_PASSWORD_REQUIREMENTS_NOT_MET_ICON);
	}
	
	@DataProvider
	public Object[][] getPasswordWithSpecialCharacters(){
		return new Object[][] {
			{"pass-1234"},
			{"autoTESTING$%"},
			{"AUTOMATION!"},
			{"auto_+)(*&"},
			{"TEST_+)(*&"},
			{"!@#$%^&*("},
			{"1245!@#$%"}
		};
	}
	
	@Test(dataProvider = "getPasswordWithSpecialCharacters")
	public void personalAccount_PasswordContainsSpecialCharaterIconTest(String password) {
		String srcLink = createAnAccountPage.getPasswordContainsSpecialCharaterIcon(password);
		Assert.assertEquals(srcLink, AppConstants.CREATE_AN_ACCOUNT_PAGE_PASSWORD_REQUIREMENTS_MET_ICON);
	}
		
	@DataProvider
	public Object[][] getPasswordWithoutUppercaseLetter(){
		return new Object[][] {
			{"pass-1234"},
			{"automation"},
			{"auto"},
			{"auto_+)(*&"},
			{"auto1234567"},
			{"123456789"},
			{"!@#$%^&*("},
			{"1245!@#$%"}
		};
	}
		
	@Test(dataProvider = "getPasswordWithoutUppercaseLetter")
	public void personalAccount_PasswordContainsUppercaseLetterIcon_Negative_Test(String password) {
		String srcLink = createAnAccountPage.getPasswordContainsUppercaseLetterIcon(password);
		Assert.assertEquals(srcLink, AppConstants.CREATE_AN_ACCOUNT_PAGE_PASSWORD_REQUIREMENTS_NOT_MET_ICON);
	}
		
	@DataProvider
	public Object[][] getPasswordWithUppercaseLetter(){
		return new Object[][] {
			{"Pass-1234"},
			{"autoTESTING"},
			{"AUTOMATION"},
			{"A_+)(*8"},
			{"TEST_+)"},
			{"autO1"}
		};
	}
		
	@Test(dataProvider = "getPasswordWithUppercaseLetter")
	public void personalAccount_PasswordContainsUppercaseLetterIconTest(String password) {
		String srcLink = createAnAccountPage.getPasswordContainsUppercaseLetterIcon(password);
		Assert.assertEquals(srcLink, AppConstants.CREATE_AN_ACCOUNT_PAGE_PASSWORD_REQUIREMENTS_MET_ICON);
	}
		
	@DataProvider
	public Object[][] getPasswordWithoutLowercaseLetter(){
		return new Object[][] {
			{"P-1234"},
			{"TESTING"},
			{"AUTOMATION"},
			{"_+)(*7P"},
			{"TEST_+)(*&"},
			{"AUTO1234567"},
			{"123456789"},
			{"!@#$%^&*("},
			{"1245!@#$%"}
		};
	}
		
	@Test(dataProvider = "getPasswordWithoutLowercaseLetter")
	public void personalAccount_PasswordContainsLowercaseLetterIcon_Negative_Test(String password) {
		String srcLink = createAnAccountPage.getPasswordContainsLowercaseLetterIcon(password);
		Assert.assertEquals(srcLink, AppConstants.CREATE_AN_ACCOUNT_PAGE_PASSWORD_REQUIREMENTS_NOT_MET_ICON);
	}
	
	@DataProvider
	public Object[][] getPasswordWithLowercaseLetter(){
		return new Object[][] {
			{"p-1234"},
			{"automation"},
			{"autoTEST"},
			{"auto_+)(*&"},
			{"TEST_+)u4&"},
			{"auto1234567"},
			{"123test"},
			{"!@tr&*("},
			{"1245!@#i"}
		};
	}
		
	@Test(dataProvider = "getPasswordWithLowercaseLetter")
	public void personalAccount_PasswordContainsLowercaseLetterIconTest(String password) {
		String srcLink = createAnAccountPage.getPasswordContainsLowercaseLetterIcon(password);
		Assert.assertEquals(srcLink, AppConstants.CREATE_AN_ACCOUNT_PAGE_PASSWORD_REQUIREMENTS_MET_ICON);
	}
	
	@DataProvider
	public Object[][] getPasswordStrenthPoor(){
		return new Object[][] {
			{"caption"},
			{"TEST"},
			{"_+)(*&"},
			{"234567"},
			{"!@Tr&*("},
			{"123test"},
			{"123ROCK"},
			{"!@tr&*("},
			{"1245!@#"},
			{"TEST_+)"},
			{"TESTing"}
		};
	}
		
	@Test(dataProvider = "getPasswordStrenthPoor")
	public void personalAccount_PasswordPoorStrengthMeterTest(String password) {
		String actualText = createAnAccountPage.getPasswordStrenthMeterText(password);
		Assert.assertEquals(actualText, AppConstants.CREATE_AN_ACCOUNT_PAGE_PASSWORD_STRENGTH_METER_VALUE_1);
	}
		
	@DataProvider
	public Object[][] getPasswordStrengthFair(){
		return new Object[][] {
			{"automation"},
			{"TESTINGROCKS"},
			{"_+)(*&@#$%^&"},
			{"123456789"}
		};
	}
		
	@Test(dataProvider = "getPasswordStrengthFair")
	public void personalAccount_PasswordFairStrengthMeterTest(String password) {
		String actualText = createAnAccountPage.getPasswordStrenthMeterText(password);
		Assert.assertEquals(actualText, AppConstants.CREATE_AN_ACCOUNT_PAGE_PASSWORD_STRENGTH_METER_VALUE_2);
	}
		
	@DataProvider
	public Object[][] getPasswordStrengthGood(){
		return new Object[][] {
			{"AUTOmation"},
			{"TEST+)(*&@#$%^&"},
			{"12345ROCK"},
			{"8854_+)(*&@#$%^&"},
			{"123test55"},
			{"!@tr&*(q+"}
		};
	}
		
	@Test(dataProvider = "getPasswordStrengthGood")
	public void personalAccount_PasswordGoodStrengthMeterTest(String password) {
		String actualText = createAnAccountPage.getPasswordStrenthMeterText(password);
		Assert.assertEquals(actualText, AppConstants.CREATE_AN_ACCOUNT_PAGE_PASSWORD_STRENGTH_METER_VALUE_3);
	}
		
	@DataProvider
	public Object[][] getPasswordStrengthExcellent(){
		return new Object[][] {
			{"AUTOmation#$"},
			{"AUTOmation12"},
			{"TEST84&@#$%^&"},
			{"12345-rock"}
		};
	}
		
	@Test(dataProvider = "getPasswordStrengthExcellent")
	public void personalAccount_PasswordExcellentStrengthMeterTest(String password) {
		String actualText = createAnAccountPage.getPasswordStrenthMeterText(password);
		Assert.assertEquals(actualText, AppConstants.CREATE_AN_ACCOUNT_PAGE_PASSWORD_STRENGTH_METER_VALUE_4);
	}
		
//*****Fill Out Complete Form with Data********
		
		
	@DataProvider
	public Object[][] getPersonalFormTestData() {
		return new Object[][] {
			{"test@uat.com", "Pass-1234", 50309, "5551234567"},
		};
	}
		
	@Test(dataProvider = "getPersonalFormTestData")
	public void personalAccount_EnterDataInFormFields_noCaptcha_Test(String emailAddress, String password, int zipCode, String phoneNumber) {
		String actualText = createAnAccountPage.fillInPersonalForm(emailAddress, password, zipCode, phoneNumber);
		Assert.assertEquals(actualText, AppConstants.CREATE_AN_ACCOUNT_PAGE_CAPTCHA_MESSAGE_VALUE);
	}
		
	@DataProvider
	public Object[][] getProfessionalFormTestData1() {
		return new Object[][] {
			{"test@uat.com", "Pass-1234", "We can fix it", "Paisley", "Oliver", "5551234567", "123 Worker Way, Des Moines, IA 50313", "Handyperson"},
		};
	}
		
	@Test(dataProvider = "getProfessionalFormTestData1")
	public void professionalAccount_EnterDataInFormFields_noCaptcha_Test(String emailAddress, String password, String companyName, String firstName, String lastName, String phoneNumber, String companyAddress, String businessType) {
		String actualText = createAnAccountPage.fillInProfessionalForm(emailAddress, password, companyName, firstName, lastName, phoneNumber, companyAddress, businessType);
		Assert.assertEquals(actualText, AppConstants.CREATE_AN_ACCOUNT_PAGE_CAPTCHA_MESSAGE_VALUE);
	}
		
	@DataProvider
	public Object[][] getProfessionalFormTestData2() {
		return new Object[][] {
			{"test@uat.com", "Pass-1234", "We can fix it", "Paisley", "Oliver", "5551234567", "123 Worker Way, Des Moines, IA 50313", "Unit 234k", "Handyperson"},
		};
	}
		
	@Test(dataProvider = "getProfessionalFormTestData2")
	public void professionalAccount_EnterDataInFormFields_noCaptcha_Test(String emailAddress, String password, String companyName, String firstName, String lastName, String phoneNumber, String companyAddress, String companyAddrssLn2, String businessType) {
		String actualText = createAnAccountPage.fillInProfessionalFormWithAddressLine2(emailAddress, password, companyName, firstName, lastName, phoneNumber, companyAddress, companyAddrssLn2, businessType);
		Assert.assertEquals(actualText, AppConstants.CREATE_AN_ACCOUNT_PAGE_CAPTCHA_MESSAGE_VALUE);
	}
		

}
