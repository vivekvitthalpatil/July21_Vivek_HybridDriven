package com.Technocredits.orghrm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Technocredits.orghrm.base.PredefinedActions;

public class AddEmployeePage extends PredefinedActions {

	public AddEmployeePage getFirstName(String fname) {
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys(fname);
		return this;
	}

	public AddEmployeePage getMiddleName(String mname) {
		driver.findElement(By.xpath("//input[@placeholder='Middle Name']")).sendKeys(mname);
		return this;
	}

	public AddEmployeePage getLastName(String lname) {
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys(lname);
		return this;
	}

	public AddEmployeePage getLocation(String location) {
		driver.findElement(By.xpath("//i[text()='arrow_drop_down']")).click();
		driver.findElement(By.xpath("//span[text()='" + location + "']//parent::a")).click();
		return this;
	}

	public AddEmployeePage clickOnNextButton() {
		driver.findElement(By.xpath("//button[text()='Next']")).click();
		return this;
	}

	public AddEmployeePage getEmployeeHobbies(String hobby) {
		driver.findElement(By.id("5")).sendKeys(hobby);
		return this;
	}

	public AddEmployeePage getWorkShift(String workshift) {
		try {
			driver.findElement(By.xpath("//label[text()='Work Shift']/preceding-sibling::div//input")).click();
		} catch (StaleElementReferenceException se) {
			driver.findElement(By.xpath("//label[text()='Work Shift']/preceding-sibling::div//input")).click();
		}
		WebDriverWait wait = new WebDriverWait(driver, 30);
		WebElement e = wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//label[text()='Work Shift']/preceding-sibling::div//span[text()='" + workshift + "']")));
		e.click();
		return this;
	}

	public AddEmployeePage getEffectiveFromDate(String day, String month, String year) {
		driver.findElement(By.xpath("//label[text()='Effective From']/following-sibling::span//i")).click();

		driver.findElement(By.xpath("//div[@class='select-wrapper picker__select--month']//input")).click();

		// div[@class='select-wrapper picker__select--month']//input
		// div[@class='select-wrapper picker__select--month']//span[@class='caret']

		driver.findElement(
				By.xpath("//div[@class='select-wrapper picker__select--month']//span[text()='" + month + "']")).click();
		driver.findElement(By.xpath("//div[@class='select-wrapper picker__select--year']//input")).click();
		driver.findElement(By.xpath("//div[@class='select-wrapper picker__select--year']//span[text()='" + year + "']"))
				.click();
		driver.findElement(
				By.xpath("//input[@id='add_employee_effective_date']//following-sibling::span[1]//div[text()='" + day
						+ "'][contains(@class,'--infocus')]"))
				.click();
		return this;
	}

	public AddEmployeePage getEmployeeRegion(String region) {
		driver.findElement(By.xpath("//label[text()='Region']/preceding-sibling::div//input")).click();
		driver.findElement(By.xpath("//span[text()='" + region + "']")).click();
		return this;
	}

	public AddEmployeePage getEmployeeFTE(String FTE) {
		driver.findElement(By.xpath("//label[text()='FTE']/preceding-sibling::div//input")).click();
		driver.findElement(By.xpath("//span[text()='" + FTE + "']")).click();
		return this;
	}

	public AddEmployeePage getEmployeeDepartment(String department) {
		driver.findElement(By.xpath("//label[text()='Temporary Department']/preceding-sibling::div//input")).click();
		driver.findElement(By.xpath("//span[text()='" + department + "']")).click();
		return this;
	}

	public AddEmployeePage clickOnSave() {
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		return this;
	}

	public boolean successfullySaved() {
		return driver.findElement(By.xpath("//div[text()='Successfully Saved']")).isDisplayed();
	}

}
