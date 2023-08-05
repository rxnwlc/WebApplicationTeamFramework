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

public class CreateAPersonalAccountTest extends BaseTest{
	
	@BeforeClass
	public void createAnAccountPageSetup() {
		commonPageElements.topNavigation_openMyAccountPopUp();
		createAnAccountPage = commonPageElements.myAccountPopUp_clickCreateAnAccountButton();
	}
	
	@BeforeMethod
	public void clickPersonalAccountButton() {
		createAnAccountPage.clickPersonalAccountBtn();
	}
	
	@AfterMethod
	public void clickBackButton() {
		createAnAccountPage.clickBackButton();
	}
	
	
	
	
	
//*****Personal Account Type Tests*****
	
	@Test
	public void personalAccount_LogoDisplayedTest() {
		boolean logoFlag = createAnAccountPage.doesPageLogoExist();
		Assert.assertTrue(logoFlag);
	}
	
	@Test
	public void personalAccount_PageHeaderTest() {
		String actualHeader = createAnAccountPage.getPageHeader();
		Assert.assertEquals(actualHeader, AppConstants.CREATE_AN_ACCOUNT_PAGE_HEADER_VALUE);
	}
	
	@Test
	public void personalAccount_BackButtonDisplayedTest() {
		boolean backBtnFlag = createAnAccountPage.doesBackBtnExist();
		Assert.assertTrue(backBtnFlag);
	}
	

	@Test
	public void personalAccount_TotalFormFieldsTest() {
		int totalFields = createAnAccountPage.getTotalFormFields();
		Assert.assertEquals(totalFields, AppConstants.CREATE_AN_ACCOUNT_PAGE_PERSONAL_FORM_FIELDS_COUNT);
	}
	
	@Test
	public void personalAccount_FormFieldLabelsTest() {
		List<String> actualList = createAnAccountPage.getFormFieldLabels();
		Assert.assertEquals(actualList, AppConstants.CREATE_AN_ACCOUNT_PAGE_PERSONAL_FORM_FIELDS_LIST);
	}
	
	@Test
	public void personalAccount_FormCheckBoxLabelsTest() {
		List<String> actualList = createAnAccountPage.getFormCheckBoxLabels();
		Assert.assertEquals(actualList, AppConstants.CREATE_AN_ACCOUNT_PAGE_PERSONAL_FORM_CHECKBOX_LIST);
	}
	
	@Test
	public void personalAccount_KeepMeSignedInToolTipIconDisplayedTest() {
		boolean iconFlag = createAnAccountPage.doesKeepMeSignedInToolTipIconExist();
		Assert.assertTrue(iconFlag);
	}
	
	@Test
	public void personalAccount_KeepMeSignedInToolTipTextTest() {
		String actualText = createAnAccountPage.getKeepMeSignedInToolTipText();
		Assert.assertEquals(actualText, AppConstants.CREATE_AN_ACCOUNT_PAGE_KEEP_ME_SIGNED_IN_TOOL_TIP_VALUE);
	}
	
	@Test
	public void personalAccount_CreationButtonTextTest() {
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
		int totalLinks = createAnAccountPage.getLegalLinksCount();
		Assert.assertEquals(totalLinks, AppConstants.CREATE_AN_ACCOUTN_PAGE_LEGAL_LINKS_COUNT);
	}
	
	@Test
	public void personalAccount_LegalLinksTextTest() {
		List<String> actualText = createAnAccountPage.getLegalLinksText();
		Assert.assertEquals(actualText, AppConstants.CREATE_AN_ACCOUTN_PAGE_LEGAL_LINKS_LIST);
	}
	
	@Test
	public void personalAccount_LegalLinksSectionTextTest() {
		List<String> actualList= createAnAccountPage.getLegalLinksSectionText();
		Assert.assertEquals(actualList, AppConstants.CREATE_AN_ACCOUTN_PAGE_LEGAL_LINKS_SECTION_LIST);
	}
	
	@Test
	public void personalAccount_ClickProXtraTermsAndConditionsLinkTest() {
		createAnAccountPage.clickProXtraTermsAndConditionsLink();
		String actualTitle = commonPageElements.getPageTitle(AppConstants.PRO_XTRA_TERMS_AND_CONDITIONS_PAGE_TITLE_VALUE, AppConstants.PRO_XTRA_TERMS_AND_CONDITIONS_PAGE_NAME_VALUE);
		proXtraTermsAndConditionsPage.closeTab();
		Assert.assertEquals(actualTitle, AppConstants.PRO_XTRA_TERMS_AND_CONDITIONS_PAGE_TITLE_VALUE);
	}
		
	@Test
	public void personalAccount_ClickPrivacyAndSecurityStatementLinkTest() {
		createAnAccountPage.clickPrivacyAndSecurityStatementLink();
		String actualTitle = commonPageElements.getPageTitle(AppConstants.PRIVACY_AND_SECURITY_STATEMENT_PAGE_TITLE_VALUE, AppConstants.PRIVACY_AND_SECURITY_STATEMENT_PAGE_NAME_VALUE);
		privacyAndSecurityStatementPage.closeTab();
		Assert.assertEquals(actualTitle, AppConstants.PRIVACY_AND_SECURITY_STATEMENT_PAGE_TITLE_VALUE);
	}
	
	@Test
	public void personalAccount_ClickMyAccountTermsAndConditionsLinkTest() {
		createAnAccountPage.clickMyAccountTermsAndConditionsLink();
		String actualTitle = commonPageElements.getPageTitle(AppConstants.MY_ACCOUNT_TERMS_AND_CONDITIONS_PAGE_TITLE_VALUE, AppConstants.MY_ACCOUNT_TERMS_AND_CONDITIONS_PAGE_NAME_VALUE);
		myAccountTermsAndConditionsPage.closeTab();
		Assert.assertEquals(actualTitle, AppConstants.MY_ACCOUNT_TERMS_AND_CONDITIONS_PAGE_TITLE_VALUE);
	}
	
	
//*****Individual Form Field Tests*****
	
	//email address field error messages tests
		
	@Test
	public void personalAccount_BlankEmailAddressTest() {
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
		String actualText = createAnAccountPage.getEmailAddressErrorMessage2(emailAddress);
		Assert.assertEquals(actualText, AppConstants.CREATE_AN_ACCOUNT_PAGE_FORM_EMAIL_FIELD_ERROR_MESSAGE_2);
	}
	
	//password field requirements and error messages tests
		
	@Test
	public void personalAccount_PasswordRequirementsTest() {
		List<String> actualList = createAnAccountPage.getPersonalPasswordRequirementsText();
		Assert.assertEquals(actualList, AppConstants.CREATE_AN_ACCOUNT_PAGE_PASSWORD_REQUIREMENTS_LIST);
	}
	
	@DataProvider
	public Object[][] getPassword(){
		return new Object[][] {
			{"pass-1234"}
		};
	}
	
	@Test(dataProvider = "getPassword")
	public void personalAccount_ClickShowPasswordLinkTest(String password) {
		String linkText = createAnAccountPage.clickShowPasswordLink(password);
		Assert.assertEquals(linkText, AppConstants.CREATE_AN_ACCOUNT_PAGE_FORM_PASSWORD_CHECK_VALUE_1);
	}
	
	@Test(dataProvider = "getPassword")
	public void personalAccount_ClickHidePasswordLinkTest(String password) {
		String linkText = createAnAccountPage.clickHidePasswordLink(password);
		Assert.assertEquals(linkText, AppConstants.CREATE_AN_ACCOUNT_PAGE_FORM_PASSWORD_CHECK_VALUE_2);
	}
	
	@Test
	public void personalAccount_BlankPasswordTest() {
		String actualText = createAnAccountPage.getPasswordErrorMessage();
		Assert.assertEquals(actualText, AppConstants.CREATE_AN_ACCOUNT_PAGE_PERSONAL_FORM_PASSWORD_FIELD_ERROR_MESSAGE_1);
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
		String actualText = createAnAccountPage.getPasswordErrorMessage(password);
		Assert.assertEquals(actualText, AppConstants.CREATE_AN_ACCOUNT_PAGE_PERSONAL_FORM_PASSWORD_FIELD_ERROR_MESSAGE_2);
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
		String actualText = createAnAccountPage.getPasswordErrorMessage(password);
		Assert.assertEquals(actualText, AppConstants.CREATE_AN_ACCOUNT_PAGE_PERSONAL_FORM_PASSWORD_FIELD_ERROR_MESSAGE_3);
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
		Assert.assertEquals(actualText, AppConstants.CREATE_AN_ACCOUNT_PAGE_ZIP_CODE_FIELD_ERROR_MESSAGE);
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
		String actualText = createAnAccountPage.getPhoneNumberErrorMessage(phoneNumber);
		Assert.assertEquals(actualText, AppConstants.CREATE_AN_ACCOUNT_PAGE_FORM_PHONE_FIELD_ERROR_MESSAGE);
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
		
		
//	@DataProvider
//	public Object[][] getPersonalFormTestData() {
//		return new Object[][] {
//			{"test@uat.com", "Pass-1234", 50309, "5551234567"},
//		};
//	}
//		
//	@Test(dataProvider = "getPersonalFormTestData")
//	public void personalAccount_EnterDataInFormFields_noCaptcha_Test(String emailAddress, String password, int zipCode, String phoneNumber) {
//		String actualText = createAnAccountPage.fillInPersonalForm(emailAddress, password, zipCode, phoneNumber);
//		Assert.assertEquals(actualText, AppConstants.CREATE_AN_ACCOUNT_PAGE_CAPTCHA_MESSAGE_VALUE);
//	}
		
	
		
	
		

}
