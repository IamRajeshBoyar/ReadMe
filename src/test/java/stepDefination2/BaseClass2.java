package stepDefination2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass2 {

	public static WebDriver driver;
	
	public static Properties properties;
	
	public static Properties loadProperties() throws IOException {
		FileInputStream file = new FileInputStream("src\\test\\java\\propertiesFile2\\config.properties");
		properties = new Properties();
		
		properties.load(file);
		
		return properties;
		
	}
	public static void browserLaunch() throws IOException {
		String browsername = loadProperties().getProperty("browser");
	
		if(browsername.equalsIgnoreCase(browsername)) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\MavenProjectMain\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		}else {
			
			System.out.println("other browser is not there");
			
		}
		
	}
	public static void inputValues(WebElement element, String text) {
		element.clear();
		element.sendKeys(text);
		
	}
	
	public static void dropDown(WebElement element, int index) {
		Select option = new Select(element);
		option.selectByIndex(index);
	}
	
	public static void click(WebElement element) {
		element.click();
		
	}
	

}
