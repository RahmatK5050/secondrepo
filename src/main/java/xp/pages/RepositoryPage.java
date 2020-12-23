package xp.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import xp.base.TestBase;

public class RepositoryPage extends TestBase{
	
	@FindBy(xpath = "//input[contains(@class,'form-control js-repo-name')]")
	WebElement repositorynametext;

	@FindBy(xpath = "//button[contains(@class,'btn btn-primary first-in-line')]")
	WebElement createrepository;
    
   public RepositoryPage()
   {
	   PageFactory.initElements(driver,this);
   }
   
   public void clickonrepository()
   {
	   repositorynametext.click();
   }
   
   public void EnterRepositoryName(String name)
   {
	   repositorynametext.sendKeys(name);
   }
   
   public void clickonCreateRepository()
   {
	   //createrepository.click();
	   System.out.println("WE are not creating repo now");
   }

}
