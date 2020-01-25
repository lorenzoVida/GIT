package saucelabs;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Calculator {
	public static final String USERNAME = "lorenkaya";
	public static final String ACCESS_KEY = "a79b741f-8b49-4a86-a444-4e26e1682fbb";
	public static final String URL = "http://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:80/wd/hub";
	public static String id;
public AndroidDriver<AndroidElement> driver;
	
	@BeforeMethod
	public AndroidDriver<AndroidElement> setUp() throws MalformedURLException, InterruptedException {
		DesiredCapabilities caps = DesiredCapabilities.android();
		caps.setCapability("appiumVersion", "1.9.1");
		caps.setCapability("deviceName","Android GoogleAPI Emulator");
		caps.setCapability("deviceOrientation", "portrait");
		caps.setCapability("browserName", "");
		caps.setCapability("platformVersion","9.0");
		caps.setCapability("platformName","Android");
		caps.setCapability(MobileCapabilityType.APP, "http://appium.s3.amazonaws.com/ApiDemos-debug-2015-03-19.apk");
		AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL(URL),caps);
		id = ((RemoteWebDriver)driver).getSessionId().toString();
		return driver;
		
	}
	
	
	 @Test
	    public void ingresar() throws InterruptedException {
			Thread.sleep(3000);
			driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
			driver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();
			driver.findElementById("android:id/checkbox").click();
			driver.findElementByXPath("(//android.widget.RelativeLayout)[2]").click();
			driver.findElementByClassName("android.widget.EditText").sendKeys("hello");
		
	    	}
	
	
}
