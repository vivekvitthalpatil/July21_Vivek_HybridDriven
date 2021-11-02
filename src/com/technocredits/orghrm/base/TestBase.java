package com.technocredits.orghrm.base;

import com.technocredits.orghrm.pages.LoginPage;

public class TestBase {

	public void setup() {
		System.out.println("Launch the OrgHRM application");
		PredefinedActions.start();
		LoginPage loginpage = new LoginPage();
		loginpage.enterCredentials("Admin", "AXrKSz@24g");
		loginpage.clickOnLoginButton();
	}
	
	public void teardown() {
		PredefinedActions.closeBrowser();
	}
}