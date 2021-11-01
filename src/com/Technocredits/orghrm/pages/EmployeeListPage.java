package com.Technocredits.orghrm.pages;

import org.openqa.selenium.By;

import com.Technocredits.orghrm.base.PredefinedActions;

public class EmployeeListPage extends PredefinedActions {

	public EmployeeListPage enterEmployeeDetailsToBeSearched(String empName) {
		driver.findElement(By.xpath("//input[@id='employee_name_quick_filter_employee_list_value']")).sendKeys(empName);
		return this;
	}

	public EmployeeListPage clickOnSearch() {
		driver.findElement(By.id("quick_search_icon")).click();
		return this;
	}

	public boolean isEmployeeAdded(String empName) {
		return driver.findElement(By.xpath("//table[@id='employeeListTable']//td[text()='" + empName + "']"))
				.isDisplayed();
	}

}
