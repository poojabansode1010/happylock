package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.BaseClass;

public class LoginPage extends BaseClass{
	
	private WebDriver driver;
	public LoginPage() {
		this.driver=BaseClass.driver;
		PageFactory.initElements(this.driver, this);
    }
	
	@FindBy(xpath="//a[text()='Sign In']") 
	WebElement signinbtnclk;
	@FindBy(xpath= "//a[text()='Customer Login']") 
	WebElement cloginclk ;
	
	@FindBy(xpath= "//input[@id=\"login-input\"]") 
	WebElement logintext;
	@FindBy(xpath="//input[@placeholder='Enter Password']") 
	WebElement passtext;
	@FindBy(xpath="//button[contains(text(),'Login')]") 
	WebElement loginbtn;
	//driver.switchTo().frame("");
//	@FindBy(xpath="//a[@class='icon-close']") 
	WebElement popup;
   // @FindBy(xpath="//a[@class='btn btn-primary']")
    WebElement startnewrelocation;  
    
    
    
    
	
	
	public void clkButton() throws InterruptedException {
		// TODO Auto-generated method stub
		signinbtnclk.click();
		time();
		cloginclk.click();
		time();
		
		logintext.sendKeys("pooja.bansode235@gmail.com");
		time();
		passtext.sendKeys("Edystone.1");
		Thread.sleep(4000);
	    loginbtn.click();
	    Thread.sleep(4000);
	    
	    startnewrelocation.click();
		}

	
		
	}
	
 
