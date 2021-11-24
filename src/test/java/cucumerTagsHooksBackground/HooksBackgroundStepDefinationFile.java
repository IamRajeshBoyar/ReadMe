package cucumerTagsHooksBackground;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HooksBackgroundStepDefinationFile {
	
	@Given("user is on the home page")
	public void user_is_on_the_home_page() {
	  System.out.println("user is on the home page");
	}
	@When("user enters the username and password")
	public void user_enters_the_username_and_password() {
		 System.out.println("user enters username and password");
	}
	@When("clicks on the login")
	public void clicks_on_the_login() {
	  System.out.println("user clicks on the login button");
	}
	@Then("user should be navigated to home page")
	public void user_should_be_navigated_to_home_page() {
		System.out.println("user is navigated to home page");
	}
	
	@When("user should launch browser")
	public void user_should_launch_browser() {
	  System.out.println("will be running before scenario but after hooks   - 1");
	}
	@When("user enter the url link")
	public void user_enter_the_url_link() {
		  System.out.println("will be running before scenario but after hooks  -2");
	}




}
