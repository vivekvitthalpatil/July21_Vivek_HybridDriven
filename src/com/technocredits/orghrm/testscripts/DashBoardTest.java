package com.technocredits.orghrm.testscripts;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.technocredits.orghrm.base.TestBase;
import com.technocredits.orghrm.pages.DashboardPage;

public class DashBoardTest extends TestBase{

	@BeforeMethod
	public void setup() {
		super.setup();		
	}
	
	@Test
	void verifyDashboardTitle() {
		System.out.println("STEP - Verify Dashboard Title");
		DashboardPage dashboardpage = new DashboardPage();
		String expectedTitle = "Dashboard";
		String actualTitle = dashboardpage.getDashBoardTitle();
		Assert.assertTrue(actualTitle.equals(expectedTitle));
	}
	
	@AfterMethod
	public void teardown() {
		super.teardown();
	}
}
