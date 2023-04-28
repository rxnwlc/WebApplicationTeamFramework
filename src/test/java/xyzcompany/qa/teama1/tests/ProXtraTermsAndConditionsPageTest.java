package xyzcompany.qa.teama1.tests;


import java.util.List;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import xyzcompany.qa.teama1.base.BaseTest;
import xyzcompany.qa.teama1.constants.AppConstants;

public class ProXtraTermsAndConditionsPageTest extends BaseTest{
	
	@BeforeClass
	public void createAnAccountPageSetup() {
		createAnAccountPage = homePage.startCreateAnAccount();
		createAnAccountPage.clickProfessionalAccountBtn();
		proXtraTermsAndConditionsPage = createAnAccountPage.clickProXtraTermsAndConditionsLink();
	}
		
	@Test
	public void breadcrumbsListTest() {
		List<String> actualList = proXtraTermsAndConditionsPage.getBreadcrumbs();
		Assert.assertEquals(actualList, AppConstants.PRO_XTRA_TERMS_AND_CONDITIONS_PAGE_BREADCRUMBS_LIST);
		
	}
	
	@Test
	public void pageHeaderTest() {
		String actualText = proXtraTermsAndConditionsPage.getPageHeader();
		Assert.assertEquals(actualText, AppConstants.PRO_XTRA_TERMS_AND_CONDITIONS_PAGE_HEADER_VALUE);
		//System.out.println(actualText);
	}
	
	@Test
	public void pageHeaderSectionTextTest() {
		String actualText = proXtraTermsAndConditionsPage.getPageHeaderText();
		Assert.assertEquals(actualText, AppConstants.PRO_XTRA_TERMS_AND_CONDITIONS_PAGE_HEADER_SECTION_VALUE);
		//System.out.println(actualText);
	}
	
	@Test
	public void sectionIHeaderTest() {
		String actualText = proXtraTermsAndConditionsPage.getSectionIHeader();
		Assert.assertEquals(actualText, AppConstants.PRO_XTRA_TERMS_AND_CONDITIONS_PAGE_SECTION_I_HEADER_VALUE);
		//System.out.println(actualText);
	}
	
	@Test
	public void sectionITextTest() {
		String actualText = proXtraTermsAndConditionsPage.getSectionIText();
		Assert.assertEquals(actualText, AppConstants.PRO_XTRA_TERMS_AND_CONDITIONS_PAGE_SECTION_I_VALUE);
		//System.out.println(actualText);
	}
	
	@Test
	public void sectionIIHeaderTest() {
		String actualText = proXtraTermsAndConditionsPage.getSectionIIHeader();
		Assert.assertEquals(actualText, AppConstants.PRO_XTRA_TERMS_AND_CONDITIONS_PAGE_SECTION_II_HEADER_VALUE);
		//System.out.println(actualText);
	}
	
	@Test
	public void sectionIITextTest() {
		String actualText = proXtraTermsAndConditionsPage.getSectionIIText();
		Assert.assertEquals(actualText, AppConstants.PRO_XTRA_TERMS_AND_CONDITIONS_PAGE_SECTION_II_VALUE);
		//System.out.println(actualText);
	}
	
	@Test
	public void sectionIIIHeaderTest() {
		String actualText = proXtraTermsAndConditionsPage.getSectionIIIHeader();
		Assert.assertEquals(actualText, AppConstants.PRO_XTRA_TERMS_AND_CONDITIONS_PAGE_SECTION_III_HEADER_VALUE);
		//System.out.println(actualText);
	}
	
	@Test
	public void sectionIIITextTest() {
		List<String> actualText = proXtraTermsAndConditionsPage.getSectionIIIText();
		Assert.assertEquals(actualText, AppConstants.PRO_XTRA_TERMS_AND_CONDITIONS_PAGE_SECTION_III_VALUE);
		//System.out.println(actualText);
	}
	
	@Test
	public void sectionIVHeaderTest() {
		String actualText = proXtraTermsAndConditionsPage.getSectionIVHeader();
		Assert.assertEquals(actualText, AppConstants.PRO_XTRA_TERMS_AND_CONDITIONS_PAGE_SECTION_IV_HEADER_VALUE);
		//System.out.println(actualText);
	}
	
	@Test
	public void sectionIVTextTest() {
		String actualText = proXtraTermsAndConditionsPage.getSectionIVText();
		//System.out.println(actualText);
		Assert.assertEquals(actualText, AppConstants.PRO_XTRA_TERMS_AND_CONDITIONS_PAGE_SECTION_IV_VALUE);
	}
	
	@Test
	public void sectionVHeaderTest() {
		String actualText = proXtraTermsAndConditionsPage.getSectionVHeader();
		Assert.assertEquals(actualText, AppConstants.PRO_XTRA_TERMS_AND_CONDITIONS_PAGE_SECTION_V_HEADER_VALUE);
		//System.out.println(actualText);
	}
	
	@Test
	public void sectionVTextTest() {
		String actualText = proXtraTermsAndConditionsPage.getSectionVText();
		//System.out.println(actualText);
		Assert.assertEquals(actualText, AppConstants.PRO_XTRA_TERMS_AND_CONDITIONS_PAGE_SECTION_V_VALUE);
	}
	
	@Test
	public void areTableImagesDisplayedTest() {
		softAssert.assertTrue(proXtraTermsAndConditionsPage.isTierTableImageDisplayed());
		softAssert.assertTrue(proXtraTermsAndConditionsPage.isMemberBenifitsTableImageDisplayed());
		softAssert.assertTrue(proXtraTermsAndConditionsPage.isMembershipLevelTableImageDisplayed());
		softAssert.assertAll();
	}
	
	@AfterClass
	public void closeTab() {
		proXtraTermsAndConditionsPage.closeTab();
	}
	
	

}
