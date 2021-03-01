package SearchFunctionality;

import org.testng.Assert;

import org.testng.annotations.Test;

import CommonUtils.BaseClass;
import ObjectRepository.Home;

public class VerifyErrorMessage extends BaseClass {
	@Test
	public void ErrorMessage() 
	{
		String SearchData="/*/*";
		//String SearchDatas= EUtil.getExcelData("SearchField", "tc_02", "SearchData");
		/*home page*/
		Home hp=new Home(driver);
		/*Search a product*/
		hp.SearchProduct(SearchData,hp.getSearchbox());
		/*check for error message*/
		String DispalyedMessage=hp.getErrormsgdisplay().getText();
		/*verify error message*/
		String errormsg="We're sorry, we didn't find anything that matched your search.";
		Assert.assertEquals(DispalyedMessage, errormsg);
		System.out.println("Data not found try new data");
		
	}
	
	

}



