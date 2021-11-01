package com.Technocredits.orghrm.testscripts;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Technocredits.orghrm.base.TestBase;
import com.Technocredits.orghrm.pages.EmployeeListPage;
import com.Technocredits.orghrm.pages.MenuPage;

public class PIM_EmployeeListTest extends TestBase {

	@BeforeMethod
	public void setup() {
		super.setup();
	}

	@Test
	public void enterEmployeeToBeSearched() {
		System.out.println("STEP - Navigate to Employee List subtab under PIM tab");
		MenuPage menu = new MenuPage();
		menu.navigateTo("PIM->Employee List");
		System.out.println("STEP - Enter Employee name to be searched and click on search");
		EmployeeListPage employeelist = new EmployeeListPage();
		employeelist.enterEmployeeDetailsToBeSearched("Vivek V Patil").clickOnSearch();
		Assert.assertTrue(employeelist.isEmployeeAdded("Vivek V Patil "));

	}

	@AfterMethod()
	public void teardown() {
		super.teardown();
	}

}
