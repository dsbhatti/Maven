package com.demoaut.newtours.MavenDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class ValidateUserTest extends BaseTest{

	@Test
	public void userValidation() {
		Login lp = new Login(driver);
		FlightFinder ff = new FlightFinder(driver);

		lp.applicationLogin("mercury", "mercury");
		boolean signOffVisibility = ff.getSignOff().isDisplayed();

		Assert.assertTrue(signOffVisibility);
	}

}
