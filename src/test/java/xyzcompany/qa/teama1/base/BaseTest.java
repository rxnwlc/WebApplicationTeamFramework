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


public class BaseTest {
	
	DriverFactory df;
	WebDriver driver;
	protected Properties prop;
	protected SoftAssert softAssert;
	protected CommonPageElements commonPageElements;
	protected HomePage homePage;
	protected CreateAnAccountPage createAnAccountPage;
	
	@BeforeTest
	public void setUp() {
		df = new DriverFactory();
		prop = df.initProp();
		driver = df.initDriver(prop);
		commonPageElements = new CommonPageElements(driver);
		homePage = new HomePage(driver);
		createAnAccountPage = new CreateAnAccountPage(driver);
		
		softAssert = new SoftAssert();
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
