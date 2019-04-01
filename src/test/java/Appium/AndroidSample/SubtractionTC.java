package Appium.AndroidSample;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SubtractionTC extends BaseTC {

	MainPage MainPageObject;
	String LeftNumber= "5";
	String RightNumber = "1";
	String Result = "6";

	@Test
	public void SubtractMethod() throws InterruptedException
	{
		StartSession();
		MainPageObject = new MainPage(driver);
		MainPageObject.InsertInLeftField(LeftNumber);
		MainPageObject.InsertInRightFiled(RightNumber);
		MainPageObject.ClickOnSubtractButton();
		Assert.assertTrue(MainPageObject.ResultMethod().getText().contains(Result));
	}

}