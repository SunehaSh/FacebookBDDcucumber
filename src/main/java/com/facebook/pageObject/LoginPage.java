package com.facebook.pageObject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

	WebDriver driver;

	public void enterURL() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\NeoSOFT\\Documents\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");

	}

	public void enterUsername() {

		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("abc@gmail.com");

	}

	public void enterPassword() {

		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("12345678");
	}

	public void clickLoginButton() {

		driver.findElement(By.xpath("//*[@name='login']")).click();
	}

	public void verifylogin() {

		System.out.println("successful verification");
	}

}