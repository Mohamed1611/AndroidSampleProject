package Appium.AndroidSample;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class BasePage {
	AppiumDriver<MobileElement> driver=null;

	// Creating the constructor
	public BasePage(AppiumDriver<MobileElement> driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public static void ClickButton(MobileElement Button) 
	{
		Button.click();
	}
	public static void SetText(MobileElement mobileElementText,String Value)
	{
		mobileElementText.sendKeys(Value);	
	}

	

}
