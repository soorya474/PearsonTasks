package ObjectRepository;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

	public Login(WebDriver driver){                                                  
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="username")
	private WebElement usernameBtn;
	
	@FindBy(id="password")
	private WebElement passwordBtn;
	
	@FindBy(xpath="//button[contains(text(),'Sign in')]")
	private WebElement SignInbtn;
	
	
	public void loginToApp(String username , String password) { 
		usernameBtn.sendKeys(username);
		passwordBtn.sendKeys(password);
		SignInbtn.submit();
		//System.out.println("donelogin");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	
	


