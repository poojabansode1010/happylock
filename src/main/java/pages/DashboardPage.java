package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.BaseClass;
public class DashboardPage extends BaseClass {
	
	private WebDriver driver;
	public DashboardPage() throws InterruptedException {
		this.driver=BaseClass.driver;
		PageFactory.initElements(this.driver, this);
		
		if(BaseClass.isElementDisplay(closePopup))
		{
			Thread.sleep(3000);
			closePopup.click();
		}
    }
	
	@FindBy(xpath="//a[@class='btn btn-primary']") 
	WebElement closePopup;
	
	public void closePopup()
	{
		closePopup.click();
	}

}
