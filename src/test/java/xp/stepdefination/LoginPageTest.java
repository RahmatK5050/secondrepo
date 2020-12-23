package xp.stepdefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import xp.base.TestBase;
import xp.pages.LoginPage;

public class LoginPageTest extends TestBase {

	private LoginPage login = new LoginPage();
	
	
	@SuppressWarnings("deprecation")
	@Given("user is on loginpage")
	public void user_is_on_loginpage() {
	   String LoginTitle = login.GetPageTitle();
	   Assert.assertEquals("Sign in to GitHub · GitHub", LoginTitle);
	}

	@When("user enters {string} and {string}")
	public void user_enters_and(String string, String string2) {
		login.Login(string, string2);
	}

	@And("user clicks on login button")
	public void user_clicks_on_login_button() {
	   login.ClickOnLoginButton();
	}

	@SuppressWarnings("deprecation")
	@Then("Home page of the application should open")
	public void home_page_of_the_application_should_open() {
	    String HomeTitle = login.GetPageTitle();
	    Assert.assertEquals("GitHub", HomeTitle);
	}

	@SuppressWarnings("deprecation")
	@Then("it should shows the error msg")
	public void it_should_shows_the_error_msg() {
		String ErrorMsg = login.GetErrorMsg();
		Assert.assertEquals("Incorrect username or password.",ErrorMsg);
	}	
	
}
