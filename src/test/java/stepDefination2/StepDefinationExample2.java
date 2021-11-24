package stepDefination2;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjectModel2.PageManager;

public class StepDefinationExample2 extends BaseClass2{
	PageManager page; 
	@Given("user is on the adactin login page")
	public void user_is_on_the_adactin_login_page() throws IOException {
		browserLaunch();
		driver.get("https://adactinhotelapp.com/");
		
	}
	@When("when user enters the username and password")
	public void when_user_enters_the_username_and_password() {
		page = new PageManager(driver);
	   inputValues(page.getLpage().getUsername(), "QARajesh");
	   inputValues(page.getLpage().getPassword(),"Speeds@123");
	}
	@When("clicks on login button")
	public void clicks_on_login_button() {
		click(page.getLpage().getLogin());
	}
	@Then("user should be navigated to home page")
	public void user_should_be_navigated_to_home_page() {
	   
	}




}
