package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Product {
	WebDriver driver;

	public Product(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//h1[@class='product-summary__heading']")
	private WebElement newpdtheading;

	

	public WebElement getNewpdtheading() {
		return newpdtheading;
	}

}
