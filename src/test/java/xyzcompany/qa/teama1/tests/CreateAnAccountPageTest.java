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
		createAnAccountPage = homePage.startCreateAnAccount();
	}
	
//	@Test
//	public void createAnAccountPageURLTest() {
//		String actualURL = commonPageElements.getPageURL(AppConstants.CREATE_AN_ACCOUNT_PAGE_URL_VALUE, AppConstants.CREATE_AN_ACCOUNT_PAGE_NAME_VALUE);
//		Assert.assertEquals(actualURL, AppConstants.CREATE_AN_ACCOUNT_PAGE_URL_VALUE);
//	}
//	
//	@Test
//	public void createAnAccountPageTitleTest() {
//		String actualTitle = commonPageElements.getPageTitle(AppConstants.CREATE_AN_ACCOUNT_PAGE_TITLE_VALUE, AppConstants.CREATE_AN_ACCOUNT_PAGE_NAME_VALUE);
//		Assert.assertEquals(actualTitle, AppConstants.CREATE_AN_ACCOUNT_PAGE_TITLE_VALUE);
//	}
//	
//	@Test
//	public void isPageLogoDisplayedTest() {
//		boolean logoFlag = createAnAccountPage.doesPageLogoExist();
//		Assert.assertTrue(logoFlag);
//	}
//	
//	@Test
//	public void createAnAccountPageHeaderTest() {
//		String actualHeader = createAnAccountPage.getPageHeader();
//		Assert.assertEquals(actualHeader, AppConstants.CREATE_AN_ACCOUNT_PAGE_HEADER_VALUE);
//	}
//	
//	@Test
//	public void createAnAccountPageMessageTest() {
//		String actualMessage = createAnAccountPage.getPageMessage();
//		Assert.assertEquals(actualMessage, AppConstants.CREATE_AN_ACCOUNT_PAGE_MESSAGE_VALUE);
//	}
//	
//	@Test
//	public void isBackButtonDisplayedTest() {
//		boolean backBtnFlag = createAnAccountPage.doesBackBtnExist();
//		Assert.assertTrue(backBtnFlag);
//	}
//	
//	@Test
//	public void isPersonalSectionLogoDisplayedTest() {
//		boolean personalSectionLogoFlag = createAnAccountPage.doesPersonalSectionLogoExist();
//		Assert.assertTrue(personalSectionLogoFlag);
//	}
//	
//	@Test
//	public void personalSectionHeaderTest() {
//		String actualHeader = createAnAccountPage.getPersonalSectionHeader();
//		Assert.assertEquals(actualHeader, AppConstants.CREATE_AN_ACCOUNT_PAGE_PERSONAL_SECTION_HEADER_VALUE);
//	}
//	
//	@Test
//	public void personalSectionMessageTest() {
//		String actualMessage = createAnAccountPage.getPersonalSectionMessage();
//		Assert.assertEquals(actualMessage, AppConstants.CREATE_AN_ACCOUNT_PAGE_PERSONAL_SECTION_MESSAGE_VALUE);
//	}
//	
//	@Test
//	public void personalSectionIncentiveListTest() {
//		List<String> actualList = createAnAccountPage.getPersonalIncentiveList();
//		Assert.assertEquals(actualList, AppConstants.CREATE_AN_ACCOUNT_PAGE_PERSONAL_SECTION_INCENTIVE_LIST);
//	}
//	
//	@Test
//	public void personalSectionButtonTextTest() {
//		String actualBtnText = createAnAccountPage.getPersonalSectionButtonText();
//		Assert.assertEquals(actualBtnText, AppConstants.CREATE_AN_ACCOUNT_PAGE_PROFESSIONAL_SECTION_BUTTON_LABEL_VALUE);
//	}
//	
//	@Test
//	public void isProfessionalSectionLogoDisplayedTest() {
//		boolean professionalSectionLogoFlag = createAnAccountPage.doesProfessionalSectionLogoExist();
//		Assert.assertTrue(professionalSectionLogoFlag);
//	}
//	
//	@Test
//	public void professionalSectionHeaderTest() {
//		String actualHeader = createAnAccountPage.getProfessionalSectionHeader();
//		Assert.assertEquals(actualHeader, AppConstants.CREATE_AN_ACCOUNT_PAGE_PROFESSIONAL_SECTION_HEADER_VALUE);
//	}
//	
//	@Test
//	public void professionalSectionMessageTest() {
//		String actualMessage = createAnAccountPage.getProfessionalSectionMessage();
//		Assert.assertEquals(actualMessage, AppConstants.CREATE_AN_ACCOUNT_PAGE_PROFESSIONAL_SECTION_MESSAGE_VALUE);
//	}
//	
//	@Test
//	public void professionalSectionIncentiveListTest() {
//		List<String> actualList = createAnAccountPage.getProfessionalIncentiveList();
//		Assert.assertEquals(actualList, AppConstants.CREATE_AN_ACCOUNT_PAGE_PROFESSIONAL_SECTION_INCENTIVE_LIST);
//	}
//	
//	@Test
//	public void professionalSectionButtonTextTest() {
//		String actualBtnText = createAnAccountPage.getProfessionalSectionButtonText();
//		Assert.assertEquals(actualBtnText, AppConstants.CREATE_AN_ACCOUNT_PAGE_PROFESSIONAL_SECTION_BUTTON_LABEL_VALUE);
//	}
//	
//	@Test
//	public void totalPersonalFormFieldsTest() {
//		int totalFields = createAnAccountPage.getTotalPersonalFormFields();
//		Assert.assertEquals(totalFields, AppConstants.CREATE_AN_ACCOUNT_PAGE_PERSONAL_FORM_FIELDS_COUNT);
//	}
//	
//	@Test
//	public void personalFormFieldLabelsTest() {
//		List<String> actualList = createAnAccountPage.getPersonalFormFieldLabels();
//		Assert.assertEquals(actualList, AppConstants.CREATE_AN_ACCOUNT_PAGE_PERSONAL_FORM_FIELDS_LIST);
//	}
//	
//	@Test
//	public void personalFormCheckBoxLabelsTest() {
//		List<String> actualList = createAnAccountPage.getPersonalFormCheckBoxLabels();
//		Assert.assertEquals(actualList, AppConstants.CREATE_AN_ACCOUNT_PAGE_PERSONAL_FORM_CHECKBOX_LIST);
//	}
//	
//	@Test
//	public void isKeepMeSignedInToolTipIconDisplayedTest() {
//		boolean iconFlag = createAnAccountPage.doesKeepMeSignedInToolTipIconExist();
//		Assert.assertTrue(iconFlag);
//	}
//	
//	@Test
//	public void keepMeSignedInToolTipTextTest() {
//		String actualText = createAnAccountPage.getKeepMeSignedInToolTipText();
//		Assert.assertEquals(actualText, AppConstants.CREATE_AN_ACCOUTN_PAGE_KEEP_ME_SIGNED_IN_VALUE);
//	}
//	
//	@Test
//	public void passwordRequirementsTest() {
//		List<String> actualList = createAnAccountPage.getPasswordRequirementsText();
//		Assert.assertEquals(actualList, AppConstants.CREATE_AN_ACCOUTN_PAGE_PASSWORD_REQUIREMENTS_LIST);
//	}
	
//	@DataProvider
//	public Object[][] getPersonalFormTestData() {
//		return new Object[][] {
//			{"test@uat.com", "Pass-1234", 50309, "5551234567"},
//		};
//	}
//	
//	@Test(dataProvider = "getPersonalFormTestData")
//	public void enterDataInPersonFormFieldsTest(String emailAddress, String password, int zipCode, String phoneNumber) {
//		createAnAccountPage.fillInPersonalForm(emailAddress, password, zipCode, phoneNumber);
//	}
	
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
	public void legalLinksTextTest() {
		List<String> actualList= createAnAccountPage.getLegalLinksSectionText();
		Assert.assertEquals(actualList, AppConstants.CREATE_AN_ACCOUTN_PAGE_LEGAL_LINKS_SECTION_LIST);
	}
	
	

	
	


}
