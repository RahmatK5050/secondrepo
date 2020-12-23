package xp.stepdefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import xp.pages.LoginPage;
import xp.pages.RepositoryPage;

public class RepositoryPageTest {
	
	private LoginPage login = new LoginPage();
	private RepositoryPage repository = new RepositoryPage();

	@SuppressWarnings("deprecation")
	@Given("user is on Repository page")
	public void user_is_on_repository_page() {
		String repotitle = login.GetPageTitle();
	    Assert.assertEquals("Create a New Repository", repotitle);
	}

	@When("user enters {string}")
	public void user_enters(String string) {
	   repository.EnterRepositoryName(string);
	}

	@And("user clicks on createRepository")
	public void user_clicks_on_create_repository() {
	  repository.clickonCreateRepository();
	}

	@Then("New Repository should be created")
	public void new_repository_should_be_created() {
	    System.out.println("New Repo Got Created");
	}


}
