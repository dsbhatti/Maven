package com.demoaut.newtours.MavenDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class FlightFinder {
	
	@FindBy(css="body > div:nth-child(1) > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(4) > td > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(5) > td > form > table > tbody > tr:nth-child(9) > td:nth-child(2) > font > font > input[type=\"radio\"]:nth-child(2)")
	private WebElement businessClass;
	
	@FindBy(name="airline")
	private WebElement airline;
	
	@FindBy(name="findFlights")
	private WebElement submit;
	
	@FindBy(linkText="SIGN-OFF")
	private WebElement signOff;
	
	public FlightFinder(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void findFlight() {
		businessClass.click();
		Select select = new Select(airline);
		select.selectByIndex(2);
		submit.click();
	}
	
	public WebElement getSignOff() {
		return signOff;
	}

}
