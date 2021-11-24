package pageObjectModel;

public class TestPage extends SeleniumBase1{
	
	public static void main(String[] args) {
		browserLaunch();
		driver.get("https://adactinhotelapp.com/index.php");
		PageManager page = new PageManager(driver);
		inputValues(page.getLoginPage().getUsername(), "PageManager");
		
	}

}
