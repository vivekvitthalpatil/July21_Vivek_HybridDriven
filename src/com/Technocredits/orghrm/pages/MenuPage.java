package com.Technocredits.orghrm.pages;

import org.openqa.selenium.By;

import com.Technocredits.orghrm.base.PredefinedActions;

public class MenuPage extends PredefinedActions {

	public void navigateTo(String menu) {
		String[] arr = menu.split("->");
		for (String element : arr) {
			driver.findElement(By.xpath("//span[text()='" + element + "']")).click();
		}
	}
}
