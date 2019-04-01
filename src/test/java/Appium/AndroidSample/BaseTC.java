package Appium.AndroidSample;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;


public class BaseTC {

	static AppiumDriver<MobileElement> driver;
	@BeforeTest
	public void StartSession(){

		// AppiumDriver<MobileElement> driver = null;
		//Set the Desired Capabilities
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("deviceName", "My Phone");
		caps.setCapability("udid", "GVV7N18725004723"); //Give Device ID of your mobile phone
		caps.setCapability("platformName", "Android");
		caps.setCapability("platformVersion", "8.2");
		caps.setCapability("appPackage","com.vbanthia.androidsampleapp");		
		caps.setCapability("appActivity","com.vbanthia.androidsampleapp.MainActivity");
		caps.setCapability("noReset", "true");
		//caps.setCapability("unicodeKeyboard", "true");
		caps.setCapability("resetKeyboard", "true");

		//Instantiate Appium Driver
		try {
			driver = new AppiumDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), caps);

		} catch (MalformedURLException e) {
			System.out.println(e.getMessage());
		}

	}
}


