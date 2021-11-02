package com.technocredits.orghrm.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PredefinedActions {

	protected static WebDriver driver;
	
	public static WebDriver start() {
		System.setProperty("webdriver.chrome.driver", "./resources/chromedriver.exe");
		System.out.println("STEP - Open chrome browser");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		System.out.println("STEP - Enter URL");
		driver.get("https://vivekpatil-trials72.orangehrmlive.com/");
		return driver;
	}

	public static WebDriver start(String url) {
		System.setProperty("webdriver.chrome.driver", "./resources/chromedriver.exe");
		System.out.println("STEP - Open chrome browser");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		System.out.println("STEP - Enter URL");
		driver.get(url);
		return driver;
	}
	
	public static void closeBrowser() {
		driver.close();
	}

}
