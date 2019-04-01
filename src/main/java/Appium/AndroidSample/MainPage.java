package Appium.AndroidSample;


import org.openqa.selenium.By;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class MainPage extends BasePage{

	public MainPage(AppiumDriver<MobileElement> driver) {
		super(driver);

	}

	public void InsertInLeftField(String LeftValue) throws InterruptedException
	{

		MobileElement LeftField =driver.findElement(By.id("com.vbanthia.androidsampleapp:id/inputFieldLeft"));
		LeftField.click();
		SetText(LeftField, LeftValue);
	}

	public void InsertInRightFiled(String RightValue)
	{
		MobileElement RightField=driver.findElement(By.id("com.vbanthia.androidsampleapp:id/inputFieldRight"));
		RightField.click();
		SetText(RightField, RightValue);

	}

	public void ClickOnPlusButton()
	{
		MobileElement plusButton=driver.findElement(By.id("com.vbanthia.androidsampleapp:id/additionButton"));
		ClickButton(plusButton);
	}
	public void ClickOnSubtractButton()
	{
		MobileElement SubtractButton=driver.findElement(By.id("com.vbanthia.androidsampleapp:id/subtractButton"));
		ClickButton(SubtractButton);
	}

	public void ClickOnResetButton()
	{
		MobileElement ResetButton=driver.findElement(By.id("com.vbanthia.androidsampleapp:id/resetButton"));
		ClickButton(ResetButton);
	}
	
	public MobileElement ResultMethod()
	{
		
		MobileElement Result =driver.findElement(By.id("com.vbanthia.androidsampleapp:id/resultTextView"));
		return Result;
		
	}

}
