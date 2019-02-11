package com.sophos.retofb.webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class WebDriverRemote {
	
	public static WebDriver driver;
	
	public static WebDriverRemote hisBrowserWeb() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		options.addArguments("--ignore-certificate-errors");
		options.addArguments("--disable-infobars");
		options.addArguments("--disable-notifications");

		driver = new ChromeDriver(options);
		return new WebDriverRemote();
	}

	public static WebDriver on(String url) {
		driver.get(url);
		return driver;
	}
}
