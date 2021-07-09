package com.openbrowsertest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Doordash {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.doordash.com/dasher/signup/?utm_source=google-sem-brand&utm_medium=semb&utm_campaign=dx_us_se_sb_go_acq_8xxxxx_10101799391_%2B_brand_all_brooklyn_8&utm_term=%2Bdoordash%20%2Bdriver&utm_content=436677896305_._EAIaIQobChMIvuLg-dPA8QIV3QiICR17LQLWEAAYASAAEgIKgvD_BwE&kclickid=_k_EAIaIQobChMIvuLg-dPA8QIV3QiICR17LQLWEAAYASAAEgIKgvD_BwE_k_&gclid=EAIaIQobChMIvuLg-dPA8QIV3QiICR17LQLWEAAYASAAEgIKgvD_BwE");

	}

}
