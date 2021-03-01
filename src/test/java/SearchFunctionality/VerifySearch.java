package SearchFunctionality;

import java.util.concurrent.TimeUnit;

import org.apache.poi.ddf.EscherColorRef.SysIndexSource;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import CommonUtils.BaseClass;
import CommonUtils.ExcelUtility;
import CommonUtils.FileUtility;
import CommonUtils.WebDriverUtility;
import ObjectRepository.Home;
import ObjectRepository.Product;

public class VerifySearch extends BaseClass {
	@Test
	public void SearchanItem()  throws Throwable
	{
		
		
		/*Test  Data*/
		String SearchData  = EUtil.getExcelData("SearchField", "tc_01","SearchData");
		//String SearchData="law";
		System.out.println("Searched data is"+SearchData);
		/*Home Page*/
		Home hp=new Home(driver);
		/*Search box is displayed or not*/
		boolean v=hp.getSearchbox().isDisplayed();
		Assert.assertTrue(v);
		System.out.println("Search box is Displayed");
		/*Search a product*/
		hp.SearchProduct(SearchData,hp.getSearchbox());
		/*Results per page*/
		int size=hp.ResultsPerPage(hp.getResults());
		System.out.println("Verified Results per page is"+size);
		int actual=10;
		Assert.assertEquals(size, actual);
		System.out.println("Matches with the no of expected results");
		/*Click on close and continue button*/
		hp.getClosecookies().click();
		/*Click on Next Button*/
		hp.getNextBtn().click();
		int newsize=hp.ResultsPerPage(hp.getResults());
		System.out.println("Verified Results for next page is"+newsize);
		Assert.assertEquals(size, actual);
		System.out.println("Matches with the no of expected results");
		/*Click on the third element*//*verify its redirected to the correct article or not*/
		WebElement thirdele=hp.getClickedtobeElement();
		String href=thirdele.getAttribute("href");
		System.out.println("Attribute of clicked element is"+href);
		thirdele.click();
		/*wait for the expected url*/
		WbdUtil.waitForExpectedurl( driver , href);
		String currenturl=driver.getCurrentUrl();
		System.out.println("Redirected url"+currenturl);
		/*verify both are same*/
		Assert.assertEquals(href, currenturl);
		System.out.println("Searched products are same");
	
		
	}
	

}
