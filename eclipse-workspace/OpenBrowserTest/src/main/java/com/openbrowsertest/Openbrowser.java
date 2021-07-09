package com.openbrowsertest;

import org.openqa.selenium.WebDriver;

public class Openbrowser {

	public static void main(String[] args) {
	WebDriver driver;
	System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe")
	driver = new chromedriver();
	driver.get("https://www.google.com/");
		

	}

}
