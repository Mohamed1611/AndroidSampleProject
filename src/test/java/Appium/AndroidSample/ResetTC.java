package Appium.AndroidSample;


import org.testng.Assert;
import org.testng.annotations.Test;



public class ResetTC extends BaseTC {

	MainPage MainPageObject;
	String LeftNumber= "1";
	String RightNumber = "2";
	
	@Test
	public void ResetMethod() throws InterruptedException 
	{
		StartSession();
		MainPageObject = new MainPage(driver);
		MainPageObject.InsertInLeftField(LeftNumber);
		MainPageObject.InsertInRightFiled(RightNumber);
		MainPageObject.ClickOnPlusButton();
		Assert.assertTrue(MainPageObject.ResultMethod().getText().contains("3"));
		MainPageObject.ClickOnResetButton();
		MainPageObject.ClickOnPlusButton();
		Assert.assertTrue(MainPageObject.ResultMethod().getText().contains("Please"));

	}

}
