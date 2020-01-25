package realDevice;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Apidemos {
	public AndroidDriver<AndroidElement> driver;

	@BeforeMethod
	public AndroidDriver<AndroidElement> setUp() throws MalformedURLException {
		DesiredCapabilities cap = new DesiredCapabilities();

		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "8");
		cap.setCapability("deviceName", "Android");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");

		cap.setCapability("appPackage", "io.appium.android.apis");
		cap.setCapability("appActivity", "io.appium.android.apis.ApiDemos");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		driver = new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"), cap);

		// driver = new AppiumDriver(new URL("http://0.0.0.0:4723/wd/hub"),cap);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		return driver;
	}
	
	 @Test
	 public void primero() throws InterruptedException {
		 Thread.sleep(3000);
			driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
			driver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();
			driver.findElementById("android:id/checkbox").click();
			driver.findElementByXPath("(//android.widget.RelativeLayout)[2]").click();
			driver.findElementByClassName("android.widget.EditText").sendKeys("hello");
		
	  }
}
