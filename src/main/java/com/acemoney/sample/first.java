package com.acemoney.sample;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class first {


	WebDriver driver;

	@BeforeTest
	public void setup() {
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
		driver.get("www.qaclickacademy.com");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	@Test
	public void verifytitle() {
		String value="\"www.qaclickacademy.com";
		Assert.assertEquals(value, "\"www.qaclickacademy.com");
	}
	
	@Test
	public void verifyurl() {
		
		String s="qaclickacademy";
		Assert.assertEquals("qaclickacademy", s);
	}
	
	

	@AfterTest
	public void Teardown() {
		driver.close();

	}

}
