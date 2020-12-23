package xp.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import xp.base.TestBase;

public class HomePage extends TestBase {
	
	@FindBy(xpath = "//div[contains(@class,'Header-item position-relative d-none d-md-flex')]")
	WebElement plusbutton;

	@FindBy(xpath = "//a[contains(text(),'New repository')]")
	WebElement newrepository;
    
   public HomePage()
   {
	   PageFactory.initElements(driver,this);
   }
   
    public void clickonPlusbutton()
    {
    	plusbutton.click();
    }
   
    public void clickonNewRepository()
    {
    	newrepository.click();
    }
   
}
