package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;


public class loginStore {

	WebDriver driver;


	public loginStore(AndroidDriver<AndroidElement> driver) {
		this.driver = driver;
	}

	By cboseleccionComboPais = By.id("com.androidsample.generalstore:id/spinnerCountry");
	By cboseleccionarPaisEncombo = By.xpath("//android.widget.TextView[@text='Argentina']");
	By txtYourName = By.xpath("//android.widget.EditText[@text='Enter name here']");
	By rbtnGenderMale = By.id("com.androidsample.generalstore:id/radioMale");
	By rbtnGenderFemale = By.id("com.androidsample.generalstore:id/radioFemale");
	By btnShop = By.id("com.androidsample.generalstore:id/btnLetsShop");
	//By paisElegido = By.id("new UiScrollable(new UiSelector()).scrollIntoView(text(\\\"Argentina\\\"));");
	//By paisElegido = By.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Argentina\"));");
	
	public WebElement rbtnGenderMale() {
		return driver.findElement(rbtnGenderMale);
	}
	
	
	public WebElement rbtnGenderFemale() {
		return driver.findElement(rbtnGenderFemale);
	}
	
	
	public WebElement btnShop() {
		return driver.findElement(btnShop);
	}
	
	public WebElement cboseleccionarPaisEncombo() {
		return driver.findElement(cboseleccionarPaisEncombo);
	}
	
	public WebElement txtYourName() {
		return driver.findElement(txtYourName);
	}
	
	public WebElement cboseleccionComboPais() {
		return driver.findElement(cboseleccionComboPais);
	}
}
