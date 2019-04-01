package Appium.AndroidSample;


import org.testng.Assert;
import org.testng.annotations.Test;



public class PlusTC extends BaseTC {

	MainPage MainPageObject;
	String LeftNumber= "1";
	String RightNumber = "2";
	String Result = "3";
	
	@Test
	public void PlusMethod() throws InterruptedException 
	{
		StartSession();
		MainPageObject = new MainPage(driver);
		MainPageObject.InsertInLeftField(Leftnumber);
		MainPageObject.InsertInRightFiled(RightNumber);
		MainPageObject.ClickOnPlusButton();
		Assert.assertTrue(MainPageObject.ResultMethod().getText().contains(Result));

	} 

}
