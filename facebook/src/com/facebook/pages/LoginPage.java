package com.facebook.pages;

import com.facebook.genericPage.MasterPage;

public class LoginPage extends MasterPage {

	public LoginPage() throws Exception {
		super();
	}

	// click Email or phone
	public void clickEmailOrPhone() {
		click("EmailOrPhone");
	}

	// Enter Email
	public void enterEmail() {
		enterData("EmailOrPhone", "testData1");
	}
	
	// click Password
	public void clickPassword() {
		click("Password");
	}
	
	// Enter Password
	public void enterPassword() {
		enterData("Password", "testData2");
	}
	
	// click Login Button
	public void clickLoginButton() {
		click("LoginButton");
	}

}