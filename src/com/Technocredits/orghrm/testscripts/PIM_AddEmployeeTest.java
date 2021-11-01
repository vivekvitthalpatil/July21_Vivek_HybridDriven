package com.Technocredits.orghrm.testscripts;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Technocredits.orghrm.base.TestBase;
import com.Technocredits.orghrm.pages.AddEmployeePage;
import com.Technocredits.orghrm.pages.MenuPage;

public class PIM_AddEmployeeTest extends TestBase {

	@BeforeMethod
	public void setup() {
		super.setup();
	}

	@Test
	public void addEmployee() {
		System.out.println("STEP - Navigate to Add Employee subtab under PIM tab");
		MenuPage menupage = new MenuPage();
		menupage.navigateTo("PIM->Add Employee");
		System.out.println("STEP - Add Emp name and location and click on next");

		AddEmployeePage addemployee = new AddEmployeePage();
		addemployee.getFirstName("Vivek").getMiddleName("V").getLastName("Patil").getLocation("Australian Regional HQ")
				.clickOnNextButton();
		System.out.println("STEP - Add Emp hobbies and click on next");
		addemployee.getEmployeeHobbies("Reading").clickOnNextButton();
		System.out.println("STEP - Add Emp shift,region and department details and click on save");
		addemployee.getWorkShift("General").getEffectiveFromDate("26", "October", "2020").getEmployeeRegion("Region-2")
				.getEmployeeFTE("1").getEmployeeDepartment("Sub unit-2").clickOnSave();
		Assert.assertTrue(addemployee.successfullySaved());
	}

	@AfterMethod
	public void teardown() {
		super.teardown();
	}

}
