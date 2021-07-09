package com.openbrowsertest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\driver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("razakamrul2021@gamil.com");
		driver.findElement(By.id("pass")).sendKeys("raza12345");
		
		
//        driver.findElement(By.id("u_0_d_Zw")).click(); 
//        Thread.sleep(7000);

	}

}
