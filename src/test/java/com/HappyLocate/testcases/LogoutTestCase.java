package com.HappyLocate.testcases;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import core.BaseClass;

public class LogoutTestCase {

	public class LogoutPage extends BaseClass{
		
		
		@FindBy(xpath="//a[@class='dropdown-toggle']") WebElement profile;
		@FindBy(xpath="//a[normalize-space()='Logout']") WebElement logoutbtn;
		
		public void clkButton() throws InterruptedException {
			
			profile.click();
		    time();
		    logoutbtn.click();
		    time();
		    
		    
		}
		   
			}
}
