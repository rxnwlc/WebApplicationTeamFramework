package xyzcompany.qa.teama1.tests;


import java.util.List;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import xyzcompany.qa.teama1.base.BaseTest;
import xyzcompany.qa.teama1.constants.AppConstants;

public class CreateAnAccountTypeTest extends BaseTest{
	
	@BeforeClass
	public void createAnAccountPageSetup() {
		commonPageElements.topNavigation_openMyAccountPopUp();
		createAnAccountPage = commonPageElements.myAccountPopUp_clickCreateAnAccountButton();
	}
	
	
	@Test
	public void createAnAccountPage_URLTest() {
		String actualURL = commonPageElements.getPageURL(AppConstants.CREATE_AN_ACCOUNT_PAGE_URL_VALUE, AppConstants.CREATE_AN_ACCOUNT_PAGE_NAME_VALUE);
		Assert.assertEquals(actualURL, AppConstants.CREATE_AN_ACCOUNT_PAGE_URL_VALUE);
	}
	
	@Test
	public void createAnAccountPage_TitleTest() {
		String actualTitle = commonPageElements.getPageTitle(AppConstants.CREATE_AN_ACCOUNT_PAGE_TITLE_VALUE, AppConstants.CREATE_AN_ACCOUNT_PAGE_NAME_VALUE);
		Assert.assertEquals(actualTitle, AppConstants.CREATE_AN_ACCOUNT_PAGE_TITLE_VALUE);
	}
	
	@Test
	public void createAnAccountPage_LogoDisplayedTest() {
		boolean logoFlag = createAnAccountPage.doesPageLogoExist();
		Assert.assertTrue(logoFlag);
	}
	
	@Test
	public void createAnAccountPage_PageHeaderTest() {
		String actualHeader = createAnAccountPage.getPageHeader();
		Assert.assertEquals(actualHeader, AppConstants.CREATE_AN_ACCOUNT_PAGE_HEADER_VALUE);
	}
	
	@Test
	public void createAnAccountPage_PageMessageTest() {
		String actualMessage = createAnAccountPage.getPageMessage();
		Assert.assertEquals(actualMessage, AppConstants.CREATE_AN_ACCOUNT_PAGE_MESSAGE_VALUE);
	}
	
	@Test
	public void createAnAccountPage_BackButtonDisplayedTest() {
		boolean backBtnFlag = createAnAccountPage.doesBackBtnExist();
		Assert.assertTrue(backBtnFlag);
	}
	
	//*****Personal Account Section Tests*****
	
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
	
	//*****Professional Account Section Tests*****
	
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
	

	
	
	

		

}
