package com.demoaut.newtours.MavenDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class InvalidUserTest extends BaseTest {

	@Test
	public void invalidUserTest() {
		Login lp = new Login(driver);
		SignOn so = new SignOn(driver);

		lp.applicationLogin("abc@gmail.com", "password");
		boolean signOnStatus = so.getSignOn().isDisplayed();

		Assert.assertTrue(signOnStatus);
	}

}
