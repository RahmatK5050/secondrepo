package xp.stepdefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import xp.pages.HomePage;
import xp.pages.LoginPage;

public class HomePageTest {

	private LoginPage login = new LoginPage();
	private HomePage home = new HomePage();
	
	@SuppressWarnings("deprecation")
	@Given("user is on home page")
	public void user_is_on_home_page() {
	    String Title = login.GetPageTitle();
	    Assert.assertEquals("GitHub",Title);
	}

	@When("user clicks on Plus button in the top right side of the page")
	public void user_clicks_on_plus_button_in_the_top_right_side_of_the_page() {
	    home.clickonPlusbutton();
	}

	@And("user opens the New Repository page")
	public void user_opens_the_new_repository_page() {
	   home.clickonNewRepository();
	}

	@SuppressWarnings("deprecation")
	@Then("New Repository page should open")
	public void new_repository_page_should_open() {
	    String repotitle = login.GetPageTitle();
	    Assert.assertEquals("Create a New Repository", repotitle);
	}
	
	
}
