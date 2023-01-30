package com.HappyLocate.testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import core.BaseClass;
import pages.DashboardPage;
import pages.LoginPage;

public class LoginTestCase extends BaseClass   {
	
	  @BeforeSuite 
	  public void initialisation() throws IOException {
	
	  setup();
	 
	 }

	@Test
	
	public void LoginTest() throws InterruptedException 
	{
		LoginPage l= PageFactory.initElements(driver, LoginPage.class);
				l.clkButton();
	}
	
	@Test
	public void webloginTest() throws InterruptedException 
	{
		LoginPage loginPage = new LoginPage();
		DashboardPage dashboardPage = new DashboardPage();
		loginPage.clkButton();
		dashboardPage.closePopup();
		
		
		
	}
	
	@AfterSuite
	
	public void CloseDriver() {
		//tearDown();
	
	}
}
