package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotelPage {
	WebDriver driver;

	@FindBy(id = "first_name")
	private WebElement firstname;

	@FindBy(id = "last_name")
	private WebElement latsname;

	@FindBy(id = "address")
	private WebElement address;

	@FindBy(id = "cc_num")
	private WebElement creditCardNumber;

	@FindBy(id = "cc_type")
	private WebElement creditCardType;

	@FindBy(id = "cc_exp_month")
	private WebElement expiryDate;

	@FindBy(id = "cc_exp_year")
	private WebElement expiryYear;

	@FindBy(id = "cc_cvv")
	private WebElement cvvNumber;

	@FindBy(id = "book_now")
	private WebElement bookNowButton;

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLatsname() {
		return latsname;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCreditCardNumber() {
		return creditCardNumber;
	}

	public WebElement getCreditCardType() {
		return creditCardType;
	}

	public WebElement getExpiryDate() {
		return expiryDate;
	}

	public WebElement getExpiryYear() {
		return expiryYear;
	}

	public WebElement getCvvNumber() {
		return cvvNumber;
	}

	public WebElement getBookNowButton() {
		return bookNowButton;
	}

	public BookHotelPage(WebDriver d) {
		driver = d;
		PageFactory.initElements(driver, this);
	}
}
