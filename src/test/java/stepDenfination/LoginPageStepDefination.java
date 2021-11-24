package stepDenfination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjectModel.PageManager;
import pageObjectModel.SeleniumBase1;

public class LoginPageStepDefination extends SeleniumBase1{
	PageManager page;
	@Given("user is on the adactin login page {string}")
	public void user_is_on_the_adactin_login_page(String string) {
		browserLaunch();
		 page = new PageManager(driver);
	    driver.get(string);
	}
	@When("user enters username and password")
	public void user_enters_username_and_password() {
		inputValues(page.getLoginPage().getUsername(), "QARajesh");
		inputValues(page.getLoginPage().getPassword(), "Speeds@123");
	   
	}
	@When("clicks on the login button")
	public void clicks_on_the_login_button() {
	  click(page.getLoginPage().getLoginButton());
	}
	@Then("user should be navigated to book hotel page")
	public void user_should_be_navigated_to_book_hotel_page() {
	   System.out.println("user is on the hotel page");
	}




}
