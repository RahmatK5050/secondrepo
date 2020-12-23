package xp.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import xp.base.TestBase;
import xp.utils.TestUtil;

public class LoginPage extends TestBase {

	@FindBy(xpath = "//input[@id='login_field']")
	WebElement username;

	@FindBy(xpath = "//input[@id='password']")
	WebElement password;

	@FindBy(xpath = "//input[@type='submit']")
	WebElement loginbutton;

	@FindBy(xpath = "//div[contains(@class,'container-lg px-2')]")
	WebElement EmailErrorMsg;

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	public void Login(String un, String pwd) {
		username.sendKeys(un);
		password.sendKeys(pwd);
		
	}

	public void ClickOnLoginButton() {
		loginbutton.click();
	}

	public String GetPageTitle() {
		return TestBase.driver.getTitle();
	}

	public String GetErrorMsg() {
		return EmailErrorMsg.getText();
	}
}
