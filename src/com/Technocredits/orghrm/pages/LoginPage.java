package com.Technocredits.orghrm.pages;

import org.openqa.selenium.By;

import com.Technocredits.orghrm.base.PredefinedActions;

public class LoginPage extends PredefinedActions {

	public void enterCredentials(String userName, String password) {
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("AXrKSz@24g");
	}

	public void clickOnLoginButton() {
		driver.findElement(By.name("Submit")).click();
	}

}
