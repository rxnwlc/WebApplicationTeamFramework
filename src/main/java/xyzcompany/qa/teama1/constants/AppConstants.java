package xyzcompany.qa.teama1.constants;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class AppConstants {
	
	public static final String CREATE_AN_ACCOUNT_PAGE_NAME_VALUE = "Create An Account";
	public static final String CREATE_AN_ACCOUNT_PAGE_TITLE_VALUE = "The Home Depot: sign in, create or secure your account";
	public static final String CREATE_AN_ACCOUNT_PAGE_URL_VALUE = "https://www.homedepot.com/auth/view/createaccount?redirect=/&ref=null";
	public static final String CREATE_AN_ACCOUNT_PAGE_HEADER_VALUE = "Create an Account";
	public static final String CREATE_AN_ACCOUNT_PAGE_MESSAGE_VALUE = "Select the account type that best suits your needs.";
	
	public static final String CREATE_AN_ACCOUNT_PAGE_PERSONAL_SECTION_HEADER_VALUE = "Personal Account";
	public static final String CREATE_AN_ACCOUNT_PAGE_PERSONAL_SECTION_MESSAGE_VALUE = "I'm shopping for myself";
	public static final List<String> CREATE_AN_ACCOUNT_PAGE_PERSONAL_SECTION_INCENTIVE_LIST = Arrays.asList("Enjoy faster checkout", "Save more with exclusive offers", "Favorite product and save lists");
	public static final String CREATE_AN_ACCOUNT_PAGE_PERSONAL_SECTION_BUTTON_LABEL_VALUE ="Select & Continue";
	
	public static final String CREATE_AN_ACCOUNT_PAGE_PROFESSIONAL_SECTION_HEADER_VALUE = "Pro Xtra Account";
	public static final String CREATE_AN_ACCOUNT_PAGE_PROFESSIONAL_SECTION_MESSAGE_VALUE = "I'm making purchases for my business";
	public static final List<String> CREATE_AN_ACCOUNT_PAGE_PROFESSIONAL_SECTION_INCENTIVE_LIST = Arrays.asList("Home Depot’s loyalty program built for Pros", "Member exclusive business tools and benefits", "It's free to join");
	public static final String CREATE_AN_ACCOUNT_PAGE_PROFESSIONAL_SECTION_BUTTON_LABEL_VALUE ="Select & Continue";
	
	public static final int CREATE_AN_ACCOUNT_PAGE_PERSONAL_FORM_FIELDS_COUNT = 4;
	public static final List<String> CREATE_AN_ACCOUNT_PAGE_PERSONAL_FORM_FIELDS_LIST = Arrays.asList("Email Address", "Password", "Zip Code", "Phone");
	public static final String CREATE_AN_ACCOUNT_PAGE_FORM_EMAIL_FIELD_ERROR_MESSAGE_1 = "Please provide your email address.";
	public static final String CREATE_AN_ACCOUNT_PAGE_FORM_EMAIL_FIELD_ERROR_MESSAGE_2 = "Please provide your email address, formatted as you@domain.com.";
	public static final String CREATE_AN_ACCOUNT_PAGE_FORM_PASSWORD_CHECK_VALUE_1 = "Hide";
	public static final String CREATE_AN_ACCOUNT_PAGE_FORM_PASSWORD_CHECK_VALUE_2 = "Show";
	public static final String CREATE_AN_ACCOUNT_PAGE_PERSONAL_FORM_PASSWORD_FIELD_ERROR_MESSAGE_1 = "Please add a password.";
	public static final String CREATE_AN_ACCOUNT_PAGE_PERSONAL_FORM_PASSWORD_FIELD_ERROR_MESSAGE_2 = "Please use at least 9 characters.";
	public static final String CREATE_AN_ACCOUNT_PAGE_PERSONAL_FORM_PASSWORD_FIELD_ERROR_MESSAGE_3 = "Password must meet at least 3 of the requirements.";
	public static final String CREATE_AN_ACCOUNT_PAGE_PERSONAL_FORM_ZIP_CODE_FIELD_ERROR_MESSAGE = "Please enter a valid 5-digit ZIP Code.";
	public static final String CREATE_AN_ACCOUNT_PAGE_FORM_PHONE_FIELD_ERROR_MESSAGE = "Phone numbers must be 10 digits.";
	
	
	public static final List<String> CREATE_AN_ACCOUNT_PAGE_PERSONAL_FORM_CHECKBOX_LIST = Arrays.asList("Keep me signed in Only check if on a private device", "Verify my mobile number via text message or phone call Message and data rates may apply.");
	public static final String CREATE_AN_ACCOUNT_PAGE_KEEP_ME_SIGNED_IN_TOOL_TIP_VALUE = "We'll keep you signed in on this device. You may need to sign in again when editing sensitive account information.";
	public static final List<String> CREATE_AN_ACCOUNT_PAGE_PASSWORD_REQUIREMENTS_LIST = Arrays.asList("Passwords must contain:",  "9 characters minimum", "And 3 of the following:",  "Uppercase letter",  "Number",  "Lowercase letter",  "Special characters");
	public static final String CREATE_AN_ACCOUNT_PAGE_PASSWORD_REQUIREMENTS_NOT_MET_ICON = "https://assets.homedepot-static.com/single-signin-ui/v0.706.0/build/6a2ec2f1d4cbdf7706466d8e9cecb71d.svg";
	public static final String CREATE_AN_ACCOUNT_PAGE_PASSWORD_REQUIREMENTS_MET_ICON = "https://assets.homedepot-static.com/single-signin-ui/v0.706.0/build/76972c85ea72c7b0fbda9184d5969470.svg";
	public static final String CREATE_AN_ACCOUNT_PAGE_PASSWORD_STRENGTH_METER_VALUE_1 = "Strength: Poor";
	public static final String CREATE_AN_ACCOUNT_PAGE_PASSWORD_STRENGTH_METER_VALUE_2 = "Strength: Fair";
	public static final String CREATE_AN_ACCOUNT_PAGE_PASSWORD_STRENGTH_METER_VALUE_3 = "Strength: Good";
	public static final String CREATE_AN_ACCOUNT_PAGE_PASSWORD_STRENGTH_METER_VALUE_4 = "Strength: Excellent";
	public static final String CREATE_AN_ACCOUNT_PAGE_PERSONAL_ACCOUNT_CREATION_BUTTON_LABEL_VALUE = "Create an Account";
	public static final String CREATE_AN_ACCOUNT_PAGE_CAPTCHA_MESSAGE_VALUE = "Please verify that you are not a robot.";
	public static final String CREATE_AN_ACCOUNT_PAGE_CURRENT_ACCOUNT_HOLDER_QUESTION_VALUE = "Already Have an Account?Sign In";
	public static final int CREATE_AN_ACCOUTN_PAGE_LEGAL_LINKS_COUNT = 3;
	public static final List<String> CREATE_AN_ACCOUTN_PAGE_LEGAL_LINKS_SECTION_LIST = Arrays.asList("By selecting 'Create an Account' you are agreeing to the Pro Xtra Terms and Conditions, Privacy and Security Statement, & My Account Terms and Conditions.");
	public static final List<String> CREATE_AN_ACCOUTN_PAGE_LEGAL_LINKS_LIST = Arrays.asList("Pro Xtra Terms and Conditions", "Privacy and Security Statement", "My Account Terms and Conditions");

	public static final List<String> CREATE_AN_ACCOUNT_PAGE_PRO_XTRA_FORM_CHECKBOX_LIST = Arrays.asList("Keep me signed in Only check if on a private device");
	public static final String CREATE_AN_ACCOUNT_PAGE_PRO_XTRA_HEADER_VALUE = "Create a Pro Xtra Account";
	public static final String CREATE_AN_ACCOUNT_PAGE_PRO_XTRA_ACCOUNT_BENEFIT_HEADER_VALUE = "Pro Xtra Account Benefits";
	public static final String CREATE_AN_ACCOUNT_PAGE_PRO_XTRA_ACCOUNT_BENEFIT_DESCRIPTION_VALUE = "Pro Xtra is The Home Depot’s free loyalty program built just for Pros —providing members with exclusive benefits that help them save time, save money and get rewarded. Pro Xtra benefits include:";
	public static final List<String> CREATE_AN_ACCOUNT_PAGE_PRO_XTRA_ACCOUNT_BENEFIT_LIST = Arrays.asList("Perks", "Purchase Tracking", "Exclusive Offers", "Volume Pricing Program", "Pro Xtra Paint Rewards", "Text2Confirm Purchase Authorization");
	public static final int CREATE_AN_ACCOUNT_PAGE_PRO_XTRA_FORM_FIELDS_WITHOUT_ADDRESS_LINE_2_COUNT = 7;
	public static final int CREATE_AN_ACCOUNT_PAGE_PRO_XTRA_FORM_FIELDS_WITH_ADDRESS_LINE_2_COUNT = 8;
	public static final String CREATE_AN_ACCOUNT_PAGE_PRO_XTRA_ADD_ADRESS_LINE_2_VALUE = "Add an apartment, suite, building etc.";
	public static final List<String> CREATE_AN_ACCOUNT_PAGE_PRO_XTRA_FORM_FIELDS_WITHOUT_ADDRESS_LINE_2_LIST = Arrays.asList("Email Address", "Password", "Company Name", "First Name", "Last Name", "Phone", "Company Address");
	public static final List<String> CREATE_AN_ACCOUNT_PAGE_PRO_XTRA_FORM_FIELDS_WITH_ADDRESS_LINE_2_LIST = Arrays.asList("Email Address", "Password", "Company Name", "First Name", "Last Name", "Phone", "Company Address", "Unit Number (Optional)");
	public static final String CREATE_AN_ACCOUNT_PAGE_PRO_XTRA_FORM_PASSWORD_REQUIREMENTS_MESSAGE = "Passwords are case sensitive and must be at least 8 characters.";
	public static final String CREATE_AN_ACCOUNT_PAGE_PRO_XTRA_FORM_PASSWORD_FIELD_ERROR_MESSAGE_1 = "Please provide your password.";
	public static final String CREATE_AN_ACCOUNT_PAGE_PRO_XTRA_FORM_PASSWORD_FIELD_ERROR_MESSAGE_2 = "Please use at least 8 characters.";
	public static final String CREATE_AN_ACCOUNT_PAGE_PRO_XTRA_FORM_PASSWORD_FIELD_ERROR_MESSAGE_3 = "You cannot use simple passwords such as your email, \"password\", \"password123\", etc.";
	public static final String CREATE_AN_ACCOUNT_PAGE_PRO_XTRA_FORM_COMPANY_NAME_FIELD_ERROR_MESSAGE = "Please provide your company name.";
	public static final String CREATE_AN_ACCOUNT_PAGE_PRO_XTRA_FORM_NAME_FIELD_ERROR_MESSAGE = "Please enter a valid name.";
	public static final String CREATE_AN_ACCOUNT_PAGE_PRO_XTRA_FORM_COMPANY_ADDRESS_FIELD_ERROR_MESSAGE = "Please provide your business address.";
	public static final String CREATE_AN_ACCOUNT_PAGE_PRO_XTRA_FORM_COMPANY_ADDRESS_FIELD_TOOL_TIP_VALUE = "This is the address where all rebates will be sent to.";
	public static final String CREATE_AN_ACCOUNT_PAGE_PRO_XTRA_SELECT_BUSINESS_OR_TRADE_DROPDOWN_ERROR_MESSAGE = "Please provide your business/trade type.";
	public static final String CREATE_AN_ACCOUNT_PAGE_PRO_XTRA_SELECT_BUSINESS_OR_TRADE_DROPDOWN_LABEL_VALUE = "Business or Trade";
	public static final String CREATE_AN_ACCOUNT_PAGE_PRO_XTRA_SELECT_BUSINESS_OR_TRADE_DROPDOWN_DEFAULT_VALUE = "Select a Business or Trade";
	public static final List<String> CREATE_AN_ACCOUNT_PAGE_PRO_XTRA_SELECT_BUSINESS_OR_TRADE_DROPDOWN_OPTIONS_LIST = Arrays.asList("Select a Business or Trade", "Carpentry", "Education", "Electrical", "Fire/Water Restoration", "Government", "Handyperson", "Healthcare", "Hotels and Lodging", "Housing Authorities", "Import/Export", "Janitorial Building Services", "Landscaping", "Manufacturing", "MultiFamily Residential Construction", "Non-Profit Organization", "Non-Residential Construction", "Non-Residential Remodeling", "Painter", "Plumbing and HVAC", "Property Investment", "Property Management, Non-Residential", "Property Management, Single and Multifamily", "Property Owner", "Residential Remodeling", "Restaurants and Event Spaces", "Roofing", "Single-Family Residential Construction", "Other");
	public static final String CREATE_AN_ACCOUNT_PAGE_PRO_XTRA_ACCOUNT_CREATION_BUTTON_LABEL_VALUE = "Register for Pro Xtra";
	public static final int CREATE_AN_ACCOUTN_PAGE_PRO_XTRA_LEGAL_LINKS_COUNT = 4;
	public static final List<String> CREATE_AN_ACCOUTN_PAGE_PRO_XTRA_LEGAL_LINKS_SECTION_LIST = Arrays.asList("By selecting 'Register for Pro Xtra' you are agreeing to the Pro Xtra Terms and Conditions, Privacy and Security Statement, Notice of Financial Incentive & My Account Terms and Conditions.");
	public static final List<String> CREATE_AN_ACCOUTN_PAGE_PRO_XTRA_LEGAL_LINKS_LIST = Arrays.asList("Pro Xtra Terms and Conditions", "Privacy and Security Statement", "Notice of Financial Incentive", "My Account Terms and Conditions");
	
	
	
	public static final String CREATE_AN_ACCOUNT_PAGE_SIGN_IN_FORM_MESSAGE_VALUE = "First, enter your email address";
	
	
	
	public static final String PRO_XTRA_TERMS_AND_CONDITIONS_PAGE_NAME_VALUE = "Pro Xtra Terms & Conditions";
	public static final String PRO_XTRA_TERMS_AND_CONDITIONS_PAGE_TITLE_VALUE = "Pro Xtra Terms & Conditions - The Home Depot";
	public static final String PRO_XTRA_TERMS_AND_CONDITIONS_PAGE_URL_VALUE = "https://www.homedepot.com/c/ProXtra_TermsandConditions";
	
	public static final String NOTICE_OF_FINANCIAL_INCENTIVE_PAGE_NAME_VALUE = "Pro Xtra Terms & Conditions";
	public static final String NOTICE_OF_FINANCIAL_INCENTIVE_PAGE_TITLE_VALUE = "Pro Xtra Terms & Conditions - The Home Depot";
	public static final String NOTICE_OF_FINANCIAL_INCENTIVE_PAGE_URL_VALUE = "https://www.homedepot.com/c/ProXtra_TermsandConditions#membership";
	
	public static final String MY_ACCOUNT_TERMS_AND_CONDITIONS_PAGE_NAME_VALUE = "My Account Terms and Conditions";
	public static final String MY_ACCOUNT_TERMS_AND_CONDITIONS_PAGE_TITLE_VALUE = "My Account Terms and Conditions at The Home Depot";
	public static final String MY_ACCOUNT_TERMS_AND_CONDITIONS_PAGE_URL_VALUE = "https://www.homedepot.com/c/PH_MyAccount";
	
	public static final String PRIVACY_AND_SECURITY_STATEMENT_PAGE_NAME_VALUE = "Privacy and Security Statement";
	public static final String PRIVACY_AND_SECURITY_STATEMENT_PAGE_TITLE_VALUE = "Privacy and Security Statement – The Home Depot";
	public static final String PRIVACY_AND_SECURITY_STATEMENT_PAGE_URL_VALUE = "https://www.homedepot.com/privacy/privacy-and-security-statement";
	
	
	
	

}
