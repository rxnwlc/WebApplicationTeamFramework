package xyzcompany.qa.teama1.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import xyzcompany.qa.coe_web.constants.WaitConstants;
import xyzcompany.qa.coe_web.utils.ElementUtil;


public class CommonPageElements {
	
	private WebDriver driver;
	private ElementUtil eleUtil;
	
	//header section
	private By messageBar = By.id("messageBar");
	private By taskLinksList = By.xpath("//ul[@id='TasklinkList']/li");
	private By storeFinderLink = By.linkText("Store Finder");
	private By toolRentalLink = By.linkText("Truck & Tool Rental");
	private By proLink = By.linkText("For the Pro");
	private By giftCardsLink = By.linkText("Gift Cards");
	private By creditServicesLink = By.linkText("Credit Services");
	private By trackOrderLink = By.linkText("Track Order");
	private By helpLink = By.linkText("Help");
	private By topNavLogoImage = By.xpath("//*[local-name()='svg' and @class='HeaderLogo']");
	private By topNavMyStoreInfo = By.xpath("//div[@id='myStore']//div");
	private By topNavMyStoreDownCaret = By.xpath("//*[local-name()='svg' and @class='caret__myStore']");
	private By topNavMyStoreUpCaret = By.xpath("//*[local-name()='svg' and @class='caret__myStore caret__open']");
	private By myStoreTool = By.id("myStoreDropdown");
	private By myStoreTool_StoreName = By.xpath("//div[@id='myStoreDropdown']//h2");
	private By myStoreTool_StoreInfo = By.xpath("//ul[@class='StoreInfo']//li");
	private By myStoreTool_Map = By.id("myStoreMap");
	private By myStoreTool_FindOtherStoreBtn = By.xpath("//a[@class='bttn-outline bttn-outline--primary']");
	private By myStoreOverlay = By.id("myStore-overlay");
	private By topNavDeliverZip = By.xpath("//div[@id='zipContainer']");
	private By topNavDeliveryZipCode = By.xpath("//div[@id='zipContainer']//span[@class='zipCode']");
	private By topNavDeliveryZipCodeDownCaret = By.xpath("//*[local-name()='svg' and @class='caret__deliveryZip']");
	private By topNavDeliveryZipCodeUpCaret = By.xpath("//*[local-name()='svg' and @class='caret__deliveryZip caret__open']");
	private By deliveryZipTool = By.id("deliveryZipDropdown");
	private By deliveryZipTool_CloseBtn = By.id("deliveryZipDropDownClose");
	private By deliveryZipTool_Label = By.className("DeliveryZipDropDown__label");
	private By deliveryZipTool_ZipCodeField = By.id("deliveryZipInput");
	private By deliveryZipTool_UpdateBtn = By.id("deliveryZipUpdateButton");
	private By deliveryZipTool_Message = By.className("DeliveryZipDropDown__info--text");
	private By deliveryZipTool_InputErrorMsg = By.className("DeliveryZipDropDown__form--alert");
	private By topNavSearchField = By.id("headerSearch");
	private By topNavSearchBtn = By.id("headerSearchButton");
	private By topNavSearchSuggestionField = By.xpath("//ul[@class='terms']");
	private By topNavSearchSuggestList = By.xpath("//ul[@class='terms']/li/a[@data-category='suggested term']");
	
	private By topNavMyAccountLabels = By.className("MyAccount");
	private By topNavMyAccountLink = By.id("headerMyAccountTitle");
	private By myAccountTool = By.id("headerMyAccountDropdown");
	private By myAccountTool_Message = By.id("MyAccount__message");
	private By myAccountTool_SignInBtn = By.id("SPSOSignIn");
	private By myAccountTool_CreateAnAccountBtn = By.id("SPSORegister");
	private By myAccountTool_LinksList = By.id("guestMyAccountLinks");
	private By myAccountTool_OnlineOrdersLink = By.linkText("Online Orders");
	private By myAccountTool_InStoreOrdersLink = By.linkText("In-Store Orders");
	private By myAccountTool_TrackOrderLink = By.linkText("Track Order");
	private By myAccountTool_CardsAndAccountsLink = By.linkText("Cards & Accounts");
	private By myAccountTool_MilitaryDiscountLink = By.linkText("Military Discount");
	private By myAccountTool_ProfileLink = By.linkText("Profile");
	private By myAccountTool_ProductListLink = By.linkText("Product Lists");
	private By myAccountTool_SecurityAndPasswordLink = By.linkText("Security & Password");
	private By myAccountTool_SignOutBtn = By.id("signOut");
	private By topNavListsLink = By.linkText("Lists");
	private By topNavMyCartLabels = By.id("headerCart");
	private By topNavMyCartItemCount = By.className("MyCart__itemCount");
	private By topNavMyCartLink = By.partialLinkText("Cart");
	
	private By topNavShoppingLinks = By.xpath("//ul[@class='ShoppingLinks']/li");
	private By topNavAllDepartmentsLink = By.linkText("All Departments");
	private By topNavHomeDecorFurnitureLink = By.linkText("Home Decor, Furniture & Kitchenware");
	private By topNavDIYProjectsAndIdeasLink = By.linkText("DIY Projects & Ideas");
	private By topNavProjectCalculators = By.linkText("Project Calculators");
	private By topNavInstallationAndServices = By.linkText("Installation & Services");
	private By topNavSpecialsAndOffers = By.linkText("Specials & Offers");
	private By topNavLocalAdAndCatalog = By.linkText("Local Ad & Catalog");
	
	private By allDepartments_Level1Links = By.xpath("//section[@class='MainFlyout__level1']//li");
	private By allDepartments_Level2Header = By.xpath("//section[@class='MainFlyout__level2']//header");
	private By allDepartments_Level2Links = By.xpath("//section[@class='MainFlyout__level2']//li");
	private By allDepartments_Level3Header = By.xpath("//section[@class='MainFlyout__level3']//header");
	private By allDepartments_Level3Links = By.xpath("//section[@class='MainFlyout__level3']//li");
	
	private By HomeDecorFurnitureSubMenuLinks = By.xpath("//section[@class='homeDecorFurnitureFlyout__subnav']//li");
	private By HomeDecorFurnitureSubMenu_HomeDecorLink = By.linkText("Home Decor");
	private By HomeDecorFurnitureSubMenu_FurnitureLink = By.linkText("Furniture");
	private By HomeDecorFurnitureSubMenu_WallDecorLink = By.linkText("Wall Decor");
	private By HomeDecorFurnitureSubMenu_SmallKitchenAppliancesLink = By.linkText("Small Kitchen Appliances");
	private By HomeDecorFurnitureSubMenu_KitchenAndTablewareLink = By.linkText("Kitchenware & Tableware");
	private By HomeDecorFurnitureSubMenu_BeddingAndBathLink = By.linkText("Bedding & Bath");
	private By HomeDecorFurnitureSubMenu_LightingLink = By.linkText("Lighting");
	private By HomeDecorFurnitureSubMenu_WindowTreatmentsLink = By.linkText("Window Treatments");
	private By HomeDecorFurnitureSubMenu_ShopByRoomLink = By.linkText("Shop By Room");
	private By HomeDecorFurnitureSubMenu_Headers = By.xpath("//div[@class='homeDecorFurnitureFlyout__bayName']");
	private By HomeDecorFurnitureSubMenu_SubHeaders = By.xpath("//div[@class='homeDecorFurnitureFlyout__shelf']");
	private By HomeDecorFurnitureSubMenu_Rooms = By.xpath("//div[@class='homeDecorFurnitureFlyout__room']");
	
	private By SpecialsAndOffersSubMenu_DailySpecialHeader = By.xpath("//div[@data-id='specialBuyLink']/a[contains(@class,'specialOffersFlyout__titlelink')]");
	private By SpecialsAndOffersSubMenu_DailySpecialDetails = By.xpath("//div[@data-id='specialBuyLink']/a[contains(@class,'specialOffersFlyout__level2link')]");
	private By SpecialsAndOffersSubMenu_WeeklySpecialHeader = By.xpath("//div[@data-id='proSpecialBuyOfTheWeekLink']/a[contains(@class,'specialOffersFlyout__titlelink')]");
	private By SpecialsAndOffersSubMenu_WeeklySpecialDetails = By.xpath("//div[@data-id='proSpecialBuyOfTheWeekLink']/a[contains(@class,'specialOffersFlyout__level2link')]");
	private By SpecialsAndOffersSubMenu_MoreWaysToSaveHeader = By.xpath("//div[@data-id='more_ways_to_save']//div[contains(@class,'specialOffersFlyout__title')]");
	private By SpecialsAndOffersSubMenu_MoreWaysToSaveList = By.xpath("//div[@data-id='more_ways_to_save']//li");
	private By SpecialsAndOffersSubMenu_NavHeader = By.xpath("//div[@data-id='savings_by_department']");
	private By SpecialsAndOffersSubMenu_NavDepartments = By.xpath("//div[@data-id='savings_by_department']//li");
	
	
	
	
	
	
	
	
	public CommonPageElements(WebDriver driver) {
		this.driver = driver;
		eleUtil = new ElementUtil(driver);
	}
	
	public String getPageTitle (String pageTitle, String pageName) {		
		String titleVal = eleUtil.waitForTitleIsAndFetch(WaitConstants.DEFAULT_SHORT_TIME_OUT, pageTitle);
		System.out.println(pageName + " page title is: " + titleVal);
		return titleVal;
	}
	
	public String getPageURL(String pageURL, String pageName) {
		String url = eleUtil.waitForURLIsAndFetch(WaitConstants.DEFAULT_SHORT_TIME_OUT, pageURL);
		System.out.println(pageName + " page url is: " + url);
		return url;
	}
	
	public String getMessageBarText() {
		return eleUtil.doElementGetText(messageBar);
	}
	
	public List<String> getTaskLinksText() {
		return eleUtil.getElementsTextList(taskLinksList);
	}
	
	public StoreFinderPage clickStoreFinderLink() {
		eleUtil.clickWhenReady(WaitConstants.DEFAULT_SHORT_TIME_OUT, storeFinderLink);
		return new StoreFinderPage(driver);
	}
	
	public ToolRentalPage clickTruckAndToolRentalLink() {
		eleUtil.clickWhenReady(WaitConstants.DEFAULT_SHORT_TIME_OUT, toolRentalLink);
		return new ToolRentalPage(driver);
	}
	
	public ProHomepagePage clickForTheProLink() {
		eleUtil.clickWhenReady(WaitConstants.DEFAULT_SHORT_TIME_OUT, proLink);
		return new ProHomepagePage(driver);
	}
	
	public GiftCardsPage clickGiftCardsLink() {
		eleUtil.clickWhenReady(WaitConstants.DEFAULT_SHORT_TIME_OUT, giftCardsLink);
		return new GiftCardsPage(driver);
	}
	
	public CreditCenterPage clickCreditServicesLink() {
		eleUtil.clickWhenReady(WaitConstants.DEFAULT_SHORT_TIME_OUT, creditServicesLink);
		return new CreditCenterPage(driver);
	}
	
	public TrackYourOrderPage clickTrackOrderLink() {
		eleUtil.clickWhenReady(WaitConstants.DEFAULT_SHORT_TIME_OUT, trackOrderLink);
		return new TrackYourOrderPage(driver);
	}
	
	public HelpAndCustomerServiceCenterPage clickHelpLink() {
		eleUtil.clickWhenReady(WaitConstants.DEFAULT_SHORT_TIME_OUT, helpLink);
		return new HelpAndCustomerServiceCenterPage(driver);
	}
	
	public boolean topNavigation_isLogoDisplayed() {
		return eleUtil.doElementIsDisplayed(topNavLogoImage);
	}
	
	public List<String> topNavigation_getMyStoreInfo() {
		return eleUtil.getElementsTextList(topNavMyStoreInfo);
	}
	
	public boolean topNavigation_openMyStoreInformationPopUp() {
		eleUtil.doClick(topNavMyStoreDownCaret);
		return eleUtil.doElementIsDisplayed(myStoreTool);
	}
	
	public String myStoreInformationPopUp_storeName() {
		return eleUtil.doElementGetText(myStoreTool_StoreName);
	}
	
	public List<String> myStoreInformationPopUp_storeInfo() {
		return eleUtil.getElementsTextList(myStoreTool_StoreInfo);
	}
	
	public boolean myStoreInformationPopUp_storeMap() {
		return eleUtil.doElementIsDisplayed(myStoreTool_Map);
	}
	
	public boolean myStoreInformationPopUp_clickFindOtherStoresBtn() {
		eleUtil.doClick(myStoreTool_FindOtherStoreBtn);
		return eleUtil.doElementIsDisplayed(myStoreOverlay);
	}
	
	public boolean topNavigation_closeMyStoreInformationPopUp() {
		eleUtil.doClick(topNavMyStoreUpCaret);
		return eleUtil.doElementIsDisplayed(myStoreTool);
	}
	
	public List<String> topNavigation_getDeliveryZipCodeInfo() {
		return eleUtil.getElementsTextList(topNavDeliverZip);
	}
	
	public boolean topNavigation_openDeliveryZipCodePopUp() {
		eleUtil.doClick(topNavDeliveryZipCodeDownCaret);
		return eleUtil.doElementIsDisplayed(deliveryZipTool);
	}
	
	public String deliveryZipCodePopUp_inputBoxLabel() {
		return eleUtil.doElementGetText(deliveryZipTool_Label);
	}
	
	public void deliveryZipCodePopUp_enterZipCode(int zipCode) {
		eleUtil.doSendKeys(deliveryZipTool_ZipCodeField, zipCode);
	}
	
	public String deliveryZipCodePopUp_getZipCodeFieldPlaceholderText() {
		return eleUtil.getElementAttribute(deliveryZipTool_ZipCodeField, "placeholder");
	}
	
	public String deliveryZipCodePopUp_clickUpdateBtn() {
		eleUtil.doClick(deliveryZipTool_UpdateBtn);
		if(eleUtil.doElementIsDisplayed(deliveryZipTool_InputErrorMsg)) {
			return eleUtil.doElementGetText(deliveryZipTool_InputErrorMsg);
		}else {
			return eleUtil.doElementGetText(topNavDeliveryZipCode);
		}
	}
	
	public String deliveryZipCodePopUp_bottomMessage() {
		return eleUtil.doElementGetText(deliveryZipTool_Message);
	}
	
	public boolean topNavigation_closeDeliveryZipCodePopUp_Caret() {
		eleUtil.doClick(topNavDeliveryZipCodeUpCaret);
		return eleUtil.doElementIsDisplayed(deliveryZipTool);
	}
	
	public boolean topNavigation_closeDeliveryZipCodePopUp_CloseBtn() {
		eleUtil.doClick(deliveryZipTool_CloseBtn);
		return eleUtil.doElementIsDisplayed(deliveryZipTool);
	}
	
	public List<String> topNavigation_enterProduct(String searchItem) {
		eleUtil.doSendKeys(topNavSearchField, searchItem);
		return eleUtil.getElementsTextList(topNavSearchField);
	}
	
	public SearchResultsPage topNavigation_selectProduct(String selectItem) {
		eleUtil.doSelectDropDownByVisibleText(topNavSearchSuggestionField, selectItem);
		return new SearchResultsPage(driver);
	}
	
	public SearchResultsPage topNaviagtion_clickSearchBtn() {
		eleUtil.doClick(topNavSearchBtn);
		return new SearchResultsPage(driver);
	}
	
	//****************************************************************************************************
	
	public List<String> topNavigation_getMyAccountLabels() {
		return eleUtil.getElementsTextList(topNavMyAccountLabels);
	}
	
	public boolean topNavigation_openMyAccountPopUp() {
		eleUtil.doClick(topNavMyAccountLink);
		return eleUtil.doElementIsDisplayed(myAccountTool);
	}
	
	public SignInPage myAccountPopUp_clickSignInButton() {
		eleUtil.doClick(myAccountTool_SignInBtn);
		return new SignInPage(driver);
	}
	
	public CreateAnAccountPage myAccountPopUp_clickCreateAnAccountButton() {
		eleUtil.doClick(myAccountTool_CreateAnAccountBtn);
		return new CreateAnAccountPage(driver);
	}
	
	public List<String> myAccountPopUp_getMyAccountLinksListLabels() {
		return eleUtil.getElementsTextList(myAccountTool_LinksList);
	}
	
	public TrackYourOrderPage myAccountPopUp_clickTrackOrderLink() {
		eleUtil.clickWhenReady(WaitConstants.DEFAULT_SHORT_TIME_OUT, myAccountTool_TrackOrderLink);
		return new TrackYourOrderPage(driver);
	}
	
	public CardsAndAccountsPage myAccountPopUp_clickCardsAndAccountLink_signedIn() {
		eleUtil.clickWhenReady(WaitConstants.DEFAULT_SHORT_TIME_OUT, myAccountTool_CardsAndAccountsLink);
		return new CardsAndAccountsPage(driver);
	}
	
	public SignInPage myAccountPopUp_clickCardsAndAccountLink_notSignedIn() {
		eleUtil.clickWhenReady(WaitConstants.DEFAULT_SHORT_TIME_OUT, myAccountTool_CardsAndAccountsLink);
		return new SignInPage(driver);
	}
	
	public MilitaryDiscountBenefitPage myAccountPopUp_clickMilitaryDiscountLink_signedIn() {
		eleUtil.clickWhenReady(WaitConstants.DEFAULT_SHORT_TIME_OUT, myAccountTool_MilitaryDiscountLink);
		return new MilitaryDiscountBenefitPage(driver);
	}
	
	public SignInPage myAccountPopUp_clickMilitaryDiscountLink_notSignedIn() {
		eleUtil.clickWhenReady(WaitConstants.DEFAULT_SHORT_TIME_OUT, myAccountTool_MilitaryDiscountLink);
		return new SignInPage(driver);
	}
	
	public ProfilePage myAccountPopUp_clickProfileLink_signedIn() {
		eleUtil.clickWhenReady(WaitConstants.DEFAULT_SHORT_TIME_OUT, myAccountTool_ProfileLink);
		return new ProfilePage(driver);
	}
	
	public SignInPage myAccountPopUp_clickProfileLink_notSignedIn() {
		eleUtil.clickWhenReady(WaitConstants.DEFAULT_SHORT_TIME_OUT, myAccountTool_ProfileLink);
		return new SignInPage(driver);
	}
	
	public MyListsPage myAccountPopUp_clickProductListLink() {
		eleUtil.clickWhenReady(WaitConstants.DEFAULT_SHORT_TIME_OUT, myAccountTool_ProductListLink);
		return new MyListsPage(driver);
	}
	
	public SecurityAndPasswordPage myAccountPopUp_clickSecurityAndPasswordLink_signedIn() {
		eleUtil.clickWhenReady(WaitConstants.DEFAULT_SHORT_TIME_OUT, myAccountTool_SecurityAndPasswordLink);
		return new SecurityAndPasswordPage(driver);
	}
	
	public SignInPage myAccountPopUp_clickSecurityAndPasswordLink_notSignedIn() {
		eleUtil.clickWhenReady(WaitConstants.DEFAULT_SHORT_TIME_OUT, myAccountTool_SecurityAndPasswordLink);
		return new SignInPage(driver);
	}
	
	public InStoreOrdersPage myAccountPopUp_clickInStoreOrderLink_signedIn() {
		eleUtil.clickWhenReady(WaitConstants.DEFAULT_SHORT_TIME_OUT, myAccountTool_InStoreOrdersLink);
		return new InStoreOrdersPage(driver);
	}
	
	public OnlineOrdersPage myAccountPopUp_clickOnlineOrderLink_signedIn() {
		eleUtil.clickWhenReady(WaitConstants.DEFAULT_SHORT_TIME_OUT, myAccountTool_OnlineOrdersLink);
		return new OnlineOrdersPage(driver);
	}
	
	public boolean myAccountPopUp_isMessageDisplayed() {
		return eleUtil.doElementIsDisplayed(myAccountTool_Message);
	}
	
	public String myAccountPopUp_getMessageText() {
		return eleUtil.doElementGetText(myAccountTool_Message);
	}
	
	public void myAccountPopUp_clickSignOutButton() {
		eleUtil.doClick(myAccountTool_SignOutBtn);
	}
	
	public MyListsPage topNavigation_clickListsLink() {
		eleUtil.clickWhenReady(WaitConstants.DEFAULT_SHORT_TIME_OUT, topNavListsLink);
		return new MyListsPage(driver);
	}
	
	public String topNavigation_getMyCartLabelText() {
		return eleUtil.doElementGetText(topNavMyCartLabels);
	}
	
	public String topNavigation_getCartItemNumber() {
		return eleUtil.doElementGetText(topNavMyCartItemCount);
	}
	
	public YourCartPage topNavigation_clickCartLink() {
		eleUtil.clickWhenReady(WaitConstants.DEFAULT_SHORT_TIME_OUT, topNavMyCartLink);
		return new YourCartPage(driver);
	}

}
