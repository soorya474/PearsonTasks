package CommonUtils;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import ObjectRepository.Home;
import ObjectRepository.Login;
import ObjectRepository.SignIn;
public class BaseClass {
	
	public WebDriverUtility WbdUtil = new WebDriverUtility();
	public FileUtility FUtil = new FileUtility();
	public ExcelUtility EUtil=new ExcelUtility();
	public static WebDriver driver;
	
	@BeforeClass
	public void configBeforeClass() throws Throwable {
		System.out.println("=========launch the browser==============");
		/*Common  Data*/
		String URL  = FUtil.getKeyValue("url");

		String BROWSER  = FUtil.getKeyValue("browser");
    
		 if(BROWSER.equals("chrome")) {
		    driver = new ChromeDriver();
		 }else if(BROWSER.equals("firefox")) {
			 driver = new FirefoxDriver();
		 }else if(BROWSER.equals("ie")) {
			 driver = new InternetExplorerDriver();
		 }else {
			 driver = new ChromeDriver(); 
		 }
	
		
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get(URL);
		//SignIn Sgn=new SignIn(driver);//add for firefox
		//Sgn.getSignInBt().click();
		//Sgn.getClosecookie().click();
	}	
		
		/*@BeforeMethod
		public void configBeforeMthd()throws Throwable {
			System.out.println("=======login======");
			String USERNAME  = FUtil.getKeyValue("username");
			String PASSWORD  = FUtil.getKeyValue("password");
			
			/*step 1 : login to app*/
		/*	Login lp = new Login(driver);
			lp.loginToApp(USERNAME, PASSWORD);
		}
		
		
		@AfterMethod
		public void configAfterMethod()throws Throwable {
			System.out.println("=======logout======");
			Home hp = new Home(driver);
			hp.getSignOutbtn();
		
		}*/
	
		@AfterClass
		public void configAfterClass() throws Throwable{
		System.out.println("=========close the browser==============");
		driver.quit();
			}
			
		}

		
		
	

