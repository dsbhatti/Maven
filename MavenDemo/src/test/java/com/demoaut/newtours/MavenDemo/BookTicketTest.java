package com.demoaut.newtours.MavenDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class BookTicketTest extends BaseTest{	

	@Test
	public void ticketBookingTest() {
		Login lp = new Login(driver);
		FlightFinder ff = new FlightFinder(driver);
		SelectFlight sf = new SelectFlight(driver);
		BookAFlight bf = new BookAFlight(driver);
		FlightConfirmation fc = new FlightConfirmation(driver);

		lp.applicationLogin("mercury","mercury");
		ff.findFlight();
		sf.flightSelection();
		bf.flightBooking("Deepinder", "Bhatti", "222111333");

		String expectedMessage = "Your itinerary has been booked!";
		String actualMessage = fc.getSuccessMessage().getText();

		Assert.assertEquals(actualMessage, expectedMessage);
	}

	

}
