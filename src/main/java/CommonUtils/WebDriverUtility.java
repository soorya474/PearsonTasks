package CommonUtils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtility {
	/**
	 * 
	 * element is displayed or not
	 * @throws InterruptedException 
	 */
	public void ElementIsDisplayedOrNot(WebDriver driver,String element) throws InterruptedException
	{
		int count =0 ; 
		 while(count<40) {
			 try {
				 driver.findElement(By.xpath(element)).isDisplayed();
				 break;
			 }catch (Exception e) {
				Thread.sleep(500);
				count ++;
			}
		 }
	}
	/**
	 * to get the text of webelement
	 */
	
	public String GetTextOfWebElement(WebElement element)
	{
		String text=element.getText();
		return text;
	}
	
	public void waitForPageTitle(WebDriver driver , String pageTitle){
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.urlContains(pageTitle));
		
	}
	
	public void waitForExpectedurl(WebDriver driver , String url){
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.urlToBe(url));
	
	}
}


