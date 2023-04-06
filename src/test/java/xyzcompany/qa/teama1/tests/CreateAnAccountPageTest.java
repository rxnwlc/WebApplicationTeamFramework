package xyzcompany.qa.teama1.tests;


import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import xyzcompany.qa.teama1.base.BaseTest;
import xyzcompany.qa.teama1.constants.AppConstants;

public class CreateAnAccountPageTest extends BaseTest{
	
	@BeforeClass
	public void createAnAccountPageSetup() {
		createAnAccountPage = homePage.startCreateAnAccount();
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
	
	@Test
	public void isPageLogoDisplayedTest() {
		boolean logoFlag = createAnAccountPage.doesPageLogoExist();
		Assert.assertTrue(logoFlag);
	}
	
	@Test
	public void createAnAccountPageHeaderTest() {
		String actualHeader = createAnAccountPage.getPageHeader();
		Assert.assertEquals(actualHeader, AppConstants.CREATE_AN_ACCOUNT_PAGE_HEADER_VALUE);
	}
	
	@Test
	public void createAnAccountPageMessageTest() {
		String actualMessage = createAnAccountPage.getPageMessage();
		Assert.assertEquals(actualMessage, AppConstants.CREATE_AN_ACCOUNT_PAGE_MESSAGE_VALUE);
	}
	
	@Test
	public void isBackButtonDisplayedTest() {
		boolean backBtnFlag = createAnAccountPage.doesBackBtnExist();
		Assert.assertTrue(backBtnFlag);
	}
	
	@Test
	public void isPersonalSectionLogoDisplayedTest() {
		boolean personalSectionLogoFlag = createAnAccountPage.doesPersonalSectionLogoExist();
		Assert.assertTrue(personalSectionLogoFlag);
	}
	
	@Test
	public void personalSectionHeaderTest() {
		String actualHeader = createAnAccountPage.getPersonalSectionHeader();
		Assert.assertEquals(actualHeader, AppConstants.CREATE_AN_ACCOUNT_PAGE_PERSONAL_SECTION_HEADER_VALUE);
	}
	
	@Test
	public void personalSectionMessageTest() {
		String actualMessage = createAnAccountPage.getPersonalSectionMessage();
		Assert.assertEquals(actualMessage, AppConstants.CREATE_AN_ACCOUNT_PAGE_PERSONAL_SECTION_MESSAGE_VALUE);
	}
	
	@Test
	public void personalSectionIncentiveListTest() {
		List<String> actualList = createAnAccountPage.getPersonalIncentiveList();
		Assert.assertEquals(actualList, AppConstants.CREATE_AN_ACCOUNT_PAGE_PERSONAL_SECTION_INCENTIVE_LIST);
	}
	
	@Test
	public void personalSectionButtonTextTest() {
		String actualBtnText = createAnAccountPage.getPersonalSectionButtonText();
		Assert.assertEquals(actualBtnText, AppConstants.CREATE_AN_ACCOUNT_PAGE_PROFESSIONAL_SECTION_BUTTON_LABEL_VALUE);
	}
	
	@Test
	public void isProfessionalSectionLogoDisplayedTest() {
		boolean professionalSectionLogoFlag = createAnAccountPage.doesProfessionalSectionLogoExist();
		Assert.assertTrue(professionalSectionLogoFlag);
	}
	
	@Test
	public void professionalSectionHeaderTest() {
		String actualHeader = createAnAccountPage.getProfessionalSectionHeader();
		Assert.assertEquals(actualHeader, AppConstants.CREATE_AN_ACCOUNT_PAGE_PROFESSIONAL_SECTION_HEADER_VALUE);
	}
	
	@Test
	public void professionalSectionMessageTest() {
		String actualMessage = createAnAccountPage.getProfessionalSectionMessage();
		Assert.assertEquals(actualMessage, AppConstants.CREATE_AN_ACCOUNT_PAGE_PROFESSIONAL_SECTION_MESSAGE_VALUE);
	}
	
	@Test
	public void professionalSectionIncentiveListTest() {
		List<String> actualList = createAnAccountPage.getProfessionalIncentiveList();
		Assert.assertEquals(actualList, AppConstants.CREATE_AN_ACCOUNT_PAGE_PROFESSIONAL_SECTION_INCENTIVE_LIST);
	}
	
	@Test
	public void professionalSectionButtonTextTest() {
		String actualBtnText = createAnAccountPage.getProfessionalSectionButtonText();
		Assert.assertEquals(actualBtnText, AppConstants.CREATE_AN_ACCOUNT_PAGE_PROFESSIONAL_SECTION_BUTTON_LABEL_VALUE);
	}
	
	@Test
	public void totalPersonalFormFieldsTest() {
		int totalFields = createAnAccountPage.getTotalPersonalFormFields();
		Assert.assertEquals(totalFields, AppConstants.CREATE_AN_ACCOUNT_PAGE_PERSONAL_FORM_FIELDS_COUNT);
	}
	
	@Test
	public void personalFormFieldLabelsTest() {
		List<String> actualList = createAnAccountPage.getPersonalFormFieldLabels();
		Assert.assertEquals(actualList, AppConstants.CREATE_AN_ACCOUNT_PAGE_PERSONAL_FORM_FIELDS_LIST);
	}
	
	@Test
	public void personalFormCheckBoxLabelsTest() {
		List<String> actualList = createAnAccountPage.getPersonalFormCheckBoxLabels();
		Assert.assertEquals(actualList, AppConstants.CREATE_AN_ACCOUNT_PAGE_PERSONAL_FORM_CHECKBOX_LIST);
	}
	
	@Test
	public void isKeepMeSignedInToolTipIconDisplayedTest() {
		boolean iconFlag = createAnAccountPage.doesKeepMeSignedInToolTipIconExist();
		Assert.assertTrue(iconFlag);
	}
	
	@Test
	public void keepMeSignedInToolTipTextTest() {
		String actualText = createAnAccountPage.getKeepMeSignedInToolTipText();
		Assert.assertEquals(actualText, AppConstants.CREATE_AN_ACCOUNT_PAGE_KEEP_ME_SIGNED_IN_VALUE);
	}
	
	@Test
	public void passwordRequirementsTest() {
		List<String> actualList = createAnAccountPage.getPasswordRequirementsText();
		Assert.assertEquals(actualList, AppConstants.CREATE_AN_ACCOUNT_PAGE_PASSWORD_REQUIREMENTS_LIST);
	}
	
	@DataProvider
	public Object[][] getPersonalFormTestData() {
		return new Object[][] {
			{"test@uat.com", "Pass-1234", 50309, "5551234567"},
		};
	}
	
	@Test(dataProvider = "getPersonalFormTestData")
	public void enterDataInPersonFormFields_noCaptcha_Test(String emailAddress, String password, int zipCode, String phoneNumber) {
		String actualText = createAnAccountPage.fillInPersonalForm(emailAddress, password, zipCode, phoneNumber);
		Assert.assertEquals(actualText, AppConstants.CREATE_AN_ACCOUNT_PAGE_PERSONAL_ACCOUNT_CAPTCHA_MESSAGE_VALUE);
	}
	
	@Test
	public void personalAccountCreationButtonTextTest() {
		String actualText = createAnAccountPage.getPersonalAccountCreationButtonText();
		Assert.assertEquals(actualText, AppConstants.CREATE_AN_ACCOUNT_PAGE_PERSONAL_ACCOUNT_CREATION_BUTTON_LABEL_VALUE);
	}
	
	@Test
	public void currentAccountHolderQuestionTextTest() {
		String actualText = createAnAccountPage.getCurrentAccountHolderQuestionText();
		Assert.assertEquals(actualText, AppConstants.CREATE_AN_ACCOUNT_PAGE_CURRENT_ACCOUNT_HOLDER_QUESTION_VALUE);
	}
	
	@Test
	public void isSignInLinkDisplayedTest() {
		boolean signInLinkFlag = createAnAccountPage.doesSignInLinkExist();
		Assert.assertTrue(signInLinkFlag);
	}
	@Test
	public void totalLegalLinksTest() {
		int totalLinks = createAnAccountPage.getLegalLinksCount();
		Assert.assertEquals(totalLinks, AppConstants.CREATE_AN_ACCOUTN_PAGE_LEGAL_LINKS_COUNT);
	}
	
	@Test
	public void legalLinksTextTest() {
		List<String> actualText = createAnAccountPage.getLegalLinksText();
		Assert.assertEquals(actualText, AppConstants.CREATE_AN_ACCOUTN_PAGE_LEGAL_LINKS_LIST);
	}
	
	@Test
	public void legalLinksTextTest() {
		List<String> actualList= createAnAccountPage.getLegalLinksSectionText();
		Assert.assertEquals(actualList, AppConstants.CREATE_AN_ACCOUTN_PAGE_LEGAL_LINKS_SECTION_LIST);
	}
	@Test
	public void clickProXtraTermsAndConditionsLinkTest() {
		String actualTitle = createAnAccountPage.clickProXtraTermsAndConditionsLink();
		Assert.assertEquals(actualTitle, AppConstants.PRO_XTRA_TERMS_AND_CONDITIONS_PAGE_TITLE_VALUE);
	}
	
	@Test
	public void clickPrivacyAndSecurityStatementLinkTest() {
		String actualTitle = createAnAccountPage.clickPrivacyAndSecurityStatementLink();
		Assert.assertEquals(actualTitle, AppConstants.PRIVACY_AND_SECURITY_STATEMENT_PAGE_TITLE_VALUE);
	}
	
	@Test
	public void clickMyAccountTermsAndConditionsLinkTest() {
		String actualTitle = createAnAccountPage.clickMyAccountTermsAndConditionsLink();
		Assert.assertEquals(actualTitle, AppConstants.MY_ACCOUNT_TERMS_AND_CONDITIONS_PAGE_TITLE_VALUE);
	}
	
	@Test
	public void blankEmailAddressTest() {
		String actualText = createAnAccountPage.getPersonalAccountEmailAddressErrorMessage1();
		Assert.assertEquals(actualText, AppConstants.CREATE_AN_ACCOUNT_PAGE_PERSONAL_FORM_EMAIL_FIELD_ERROR_MESSAGE_1);
	}
	
	@DataProvider
	public Object[][] getPersonalFormErroneousEmailAddress() {
		return new Object[][] {
			{"automation"},
			{"automation@"},
			{"automation@uat"},
			{"automation@uat."},
		};
	}
	
	@Test(dataProvider = "getPersonalFormErroneousEmailAddress")
	public void enterErroneousEmailAddressTest(String emailAddress) {
		String actualText = createAnAccountPage.getPersonalAccountEmailAddressErrorMessage2(emailAddress);
		Assert.assertEquals(actualText, AppConstants.CREATE_AN_ACCOUNT_PAGE_PERSONAL_FORM_EMAIL_FIELD_ERROR_MESSAGE_2);
	}
	
	@Test
	public void blankPasswordTest() {
		String actualText = createAnAccountPage.getPersonalAccountPasswordErrorMessage1();
		Assert.assertEquals(actualText, AppConstants.CREATE_AN_ACCOUNT_PAGE_PERSONAL_FORM_PASSWORD_FIELD_ERROR_MESSAGE_1);
	}
	
	@DataProvider
	public Object[][] getPersonalFormShortPassword() {
		return new Object[][] {
			{"test"},
			{"Test"},
			{"TEST"},
			{"@Test"},
			{"Test12"},
			{"Test12@#"},
		};
	}
	
	@Test(dataProvider = "getPersonalFormShortPassword")
	public void enterShortPasswordTest(String password) {
		String actualText = createAnAccountPage.getPersonalAccountPasswordErrorMessage2(password);
		Assert.assertEquals(actualText, AppConstants.CREATE_AN_ACCOUNT_PAGE_PERSONAL_FORM_PASSWORD_FIELD_ERROR_MESSAGE_2);
	}
	
	@DataProvider
	public Object[][] getPersonalFormErroneousPassword() {
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
	
	@Test(dataProvider = "getPersonalFormErroneousPassword")
	public void enterErroneousPasswordTest(String password) {
		String actualText = createAnAccountPage.getPersonalAccountPasswordErrorMessage3(password);
		Assert.assertEquals(actualText, AppConstants.CREATE_AN_ACCOUNT_PAGE_PERSONAL_FORM_PASSWORD_FIELD_ERROR_MESSAGE_3);
	}
	
	@DataProvider
	public Object[][] getPassword(){
		return new Object[][] {
			{"pass-1234"}
		};
	}
	
	@Test(dataProvider = "getPassword")
	public void clickShowPasswordLinkTest(String password) {
		String linkText = createAnAccountPage.clickShowPasswordLink(password);
		Assert.assertEquals(linkText, AppConstants.CREATE_AN_ACCOUNT_PAGE_PERSONAL_FORM_PASSWORD_CHECK_VALUE_1);
	}
	
	@Test(dataProvider = "getPassword")
	public void clickHidePasswordLinkTest(String password) {
		String linkText = createAnAccountPage.clickHidePasswordLink(password);
		Assert.assertEquals(linkText, AppConstants.CREATE_AN_ACCOUNT_PAGE_PERSONAL_FORM_PASSWORD_CHECK_VALUE_2);
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
	public void enterErroneousZipCodeTest(int zipCode) {
		String linkText = createAnAccountPage.getPersonalAccountZipCodeErrorMessage(zipCode);
		Assert.assertEquals(linkText, AppConstants.CREATE_AN_ACCOUNT_PAGE_PERSONAL_FORM_ZIP_CODE_FIELD_ERROR_MESSAGE);
	}
	
	@DataProvider
	public Object[][] getErroneousPhoneNumber(){
		return new Object[][] {
			{" "},
			{"555"},
			{"555123"},
			{"5551230"},
			{"555123456"},
		};
	}
	
	@Test(dataProvider = "getErroneousPhoneNumber")
	public void enterErroneousPhoneNumberTest(String phoneNumber) {
		String linkText = createAnAccountPage.getPersonalAccountPhoneNumberErrorMessage(phoneNumber);
		Assert.assertEquals(linkText, AppConstants.CREATE_AN_ACCOUNT_PAGE_PERSONAL_FORM_PHONE_FIELD_ERROR_MESSAGE);
	}
	
	@Test(dataProvider = "getPersonalFormShortPassword")
	public void passwordContainsMiniumCharatersIcon_Negative_Test(String password) {
		String srcLink = createAnAccountPage.getPasswordContainsMiniumCharatersIcon(password);
		Assert.assertEquals(srcLink, AppConstants.CREATE_AN_ACCOUNT_PAGE_PASSWORD_REQUIREMENTS_NOT_MET_ICON);
	}
	
	@Test(dataProvider = "getPassword")
	public void passwordContainsMiniumCharatersIconTest(String password) {
		String srcLink = createAnAccountPage.getPasswordContainsMiniumCharatersIcon(password);
		Assert.assertEquals(srcLink, AppConstants.CREATE_AN_ACCOUNT_PAGE_PASSWORD_REQUIREMENTS_MET_ICON);
	}
	
	@Test(dataProvider = "getPersonalFormShortPassword")
	public void passwordContainsSpecialCharaterIcon_Negative_Test(String password) {
		String srcLink = createAnAccountPage.getPasswordContainsSpecialCharaterIcon(password);
		Assert.assertEquals(srcLink, AppConstants.CREATE_AN_ACCOUNT_PAGE_PASSWORD_REQUIREMENTS_NOT_MET_ICON);
	}
	
	@Test(dataProvider = "getPassword")
	public void passwordContainsSpecialCharaterIconTest(String password) {
		String srcLink = createAnAccountPage.getPasswordContainsSpecialCharaterIcon(password);
		Assert.assertEquals(srcLink, AppConstants.CREATE_AN_ACCOUNT_PAGE_PASSWORD_REQUIREMENTS_MET_ICON);
	}
	
	@Test(dataProvider = "getPersonalFormShortPassword")
	public void passwordContainsUppercaseLetterIcon_Negative_Test(String password) {
		String srcLink = createAnAccountPage.getPasswordContainsUppercaseLetterIcon(password);
		Assert.assertEquals(srcLink, AppConstants.CREATE_AN_ACCOUNT_PAGE_PASSWORD_REQUIREMENTS_NOT_MET_ICON);
	}
	
	@Test(dataProvider = "getPassword")
	public void passwordContainsUppercaseLetterIconTest(String password) {
		String srcLink = createAnAccountPage.getPasswordContainsUppercaseLetterIcon(password);
		Assert.assertEquals(srcLink, AppConstants.CREATE_AN_ACCOUNT_PAGE_PASSWORD_REQUIREMENTS_MET_ICON);
	}
	
	@Test(dataProvider = "getPersonalFormShortPassword")
	public void passwordContainsLowercaseLetterIcon_Negative_Test(String password) {
		String srcLink = createAnAccountPage.getPasswordContainsLowercaseLetterIcon(password);
		Assert.assertEquals(srcLink, AppConstants.CREATE_AN_ACCOUNT_PAGE_PASSWORD_REQUIREMENTS_NOT_MET_ICON);
	}
	
	@Test(dataProvider = "getPassword")
	public void passwordContainsLowercaseLetterIconTest(String password) {
		String srcLink = createAnAccountPage.getPasswordContainsLowercaseLetterIcon(password);
		Assert.assertEquals(srcLink, AppConstants.CREATE_AN_ACCOUNT_PAGE_PASSWORD_REQUIREMENTS_MET_ICON);
	}
	
	@Test(dataProvider = "getPassword")
	public void passwordPoorStrengthMeterTest(String password) {
		String actualText = createAnAccountPage.getPasswordStrenthMeterText(password);
		Assert.assertEquals(actualText, AppConstants.CREATE_AN_ACCOUNT_PAGE_PASSWORD_STRENGTH_METER_VALUE_1);
	}
	
	@Test(dataProvider = "getPassword")
	public void passwordFairStrengthMeterTest(String password) {
		String actualText = createAnAccountPage.getPasswordStrenthMeterText(password);
		Assert.assertEquals(actualText, AppConstants.CREATE_AN_ACCOUNT_PAGE_PASSWORD_STRENGTH_METER_VALUE_2);
	}
	
	@Test(dataProvider = "getPassword")
	public void passwordGoodStrengthMeterTest(String password) {
		String actualText = createAnAccountPage.getPasswordStrenthMeterText(password);
		Assert.assertEquals(actualText, AppConstants.CREATE_AN_ACCOUNT_PAGE_PASSWORD_STRENGTH_METER_VALUE_3);
	}
	
	@Test(dataProvider = "getPassword")
	public void passwordExcellentStrengthMeterTest(String password) {
		String actualText = createAnAccountPage.getPasswordStrenthMeterText(password);
		Assert.assertEquals(actualText, AppConstants.CREATE_AN_ACCOUNT_PAGE_PASSWORD_STRENGTH_METER_VALUE_4);
	}
	


}
