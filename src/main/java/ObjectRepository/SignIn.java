package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignIn {

	public SignIn(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[text()='Sign in']")
	private WebElement SignInBt;
	
	@FindBy(xpath="//button[contains(text(),' Close this message and continue')]")
	private WebElement Closecookie;
	

	public WebElement getSignInBt() {
		return SignInBt;
	}
	
	public WebElement getClosecookie() {
		return Closecookie;
	}
	
   
}
