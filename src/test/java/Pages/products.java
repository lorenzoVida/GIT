package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class products {
	WebDriver driver;


	public products(AndroidDriver<AndroidElement> driver) {
		this.driver = driver;
	}
	
	By lblJordan = By.id("com.androidsample.generalstore:id/productName");
	
	public WebElement lblJordan() {
		return driver.findElement(lblJordan);
	}
}
