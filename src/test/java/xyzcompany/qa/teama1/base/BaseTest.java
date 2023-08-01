package xyzcompany.qa.teama1.base;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.asserts.SoftAssert;

import xyzcompany.qa.coe_web.factory.DriverFactory;
import xyzcompany.qa.teama1.pages.CommonPageElements;
import xyzcompany.qa.teama1.pages.CreateAnAccountPage;
import xyzcompany.qa.teama1.pages.HomePage;
import xyzcompany.qa.teama1.pages.MyAccountTermsAndConditionsPage;
import xyzcompany.qa.teama1.pages.NoticeOfFinancialIncentivePage;
import xyzcompany.qa.teama1.pages.PrivacyAndSecurityStatementPage;
import xyzcompany.qa.teama1.pages.ProXtraTermsAndConditionsPage;


public class BaseTest {
	
	DriverFactory df;
	WebDriver driver;
	protected Properties prop;
	protected SoftAssert softAssert;
	protected CommonPageElements commonPageElements;
	protected CreateAnAccountPage createAnAccountPage;
	protected ProXtraTermsAndConditionsPage proXtraTermsAndConditionsPage;
	protected PrivacyAndSecurityStatementPage privacyAndSecurityStatementPage;
	protected MyAccountTermsAndConditionsPage myAccountTermsAndConditionsPage;
	protected NoticeOfFinancialIncentivePage noticeOfFinancialIncentivePage;
	
	@BeforeTest
	public void setUp() {
		df = new DriverFactory();
		prop = df.initProp();
		driver = df.initDriver(prop);
		commonPageElements = new CommonPageElements(driver);
		createAnAccountPage = new CreateAnAccountPage(driver);
		proXtraTermsAndConditionsPage = new ProXtraTermsAndConditionsPage(driver);
		privacyAndSecurityStatementPage = new PrivacyAndSecurityStatementPage(driver);
		myAccountTermsAndConditionsPage = new MyAccountTermsAndConditionsPage(driver);
		noticeOfFinancialIncentivePage = new NoticeOfFinancialIncentivePage(driver);
		
		softAssert = new SoftAssert();
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
