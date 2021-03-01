package ObjectRepository;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {
	
	WebDriver driver;

	public Home(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="search-box-input")
	private WebElement Searchbox;
	
	@FindBy(xpath="//a[contains(text(),'Close this message and continue')]")
	private WebElement Closecookies;
	
	@FindBy(xpath="//a[@class='pagination__btn hasArrow arrowRight']")
	private WebElement NextBtn;
	
	@FindBy(xpath="//a[text()='Terms and Conditions for Purchase of Goods and Services']")
	private WebElement ClickedtobeElement;
	
	@FindBy(xpath="//button[@class='userNav__button jsUserSignedInIdentifier']")
	private WebElement SignOutbtn;
	
	
	@FindAll({@FindBy(xpath = "//article[@class='productItem test']")})
	public List<WebElement> results;
	
	
	@FindBy(xpath="//p[contains(text(),\"We're sorry, we didn't find anything that matched \")]")
	private WebElement errormsgdisplay;
	
	////////checking for other result///
	@FindAll({@FindBy(xpath="//li[@class='product-card']")})
	public  List<WebElement> newresults;
	
	@FindBy(xpath="//a[contains(text(),'Next')]")
	private WebElement nextnewbtn;
	
	@FindBy(xpath="//a[contains(text(),'Administrative')]")
	private WebElement newpdt;
	
	@FindBy(xpath="//h1[contains(text(),'We couldn’t find anything')]")
	private WebElement errormsg;



	public WebElement getErrormsg() {
		return errormsg;
	}

	public WebElement getNewpdt() {
		return newpdt;
	}

	public WebElement getNextnewbtn() {
		return nextnewbtn;
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getSearchbox() {
		return Searchbox;
	}

	public List<WebElement> getResults() {
		return results;
	}

	public WebElement getClosecookies() {
		return Closecookies;
	}

	public WebElement getNextBtn() {
		return NextBtn;
	}

	public WebElement getClickedtobeElement() {
		return ClickedtobeElement;
	}
	public WebElement getSignOutbtn() {
		return SignOutbtn;
	}
	public List<WebElement> getNewresults() {
		return newresults;
	}
	public WebElement getErrormsgdisplay() {
		return errormsgdisplay;
	}
	
	/**
	 * 
	 * to find results displayed per page
	 */
	
	public int ResultsPerPage(List<WebElement> results)
	{
		int size=results.size();
		return size;
	}
	/**
	 * to search a product
	 */
	public void SearchProduct(String data,WebElement element)
	{
		element.sendKeys(data);
		element.sendKeys(Keys.ENTER);
		
	}
	/*
	 * to get new results per page
	 */
	
	public int NewResultsPerPage(List<WebElement> newresults)
	{
		int newsize=newresults.size();
		return newsize;
	}
	
	}
	
	


