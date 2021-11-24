package pageObjectModel2;

import org.openqa.selenium.WebDriver;

public class PageManager {
	
	WebDriver driver;
	private LoginPage lpage;
	
	public PageManager(WebDriver driver){
		this.driver = driver;
	}
	
	public LoginPage getLpage() {
		lpage = new LoginPage(driver);
		
		return lpage;
	}

}
