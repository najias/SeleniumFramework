package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import utils.ReadProperties;

public class Driver extends ReadProperties {

	public static WebDriver driver;

	public void setDriver(String browserType, String appUrl) {

		if (browserType.equalsIgnoreCase("firefox")) {
			initFirefox();
		} else {
			initFirefox();
		}

		setDriverProperty();
		driver.get(appUrl);
	}

	private void initFirefox() {
		driver = new FirefoxDriver();
	}

	private void setDriverProperty() {
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public static WebDriver getDriver() {
		return driver;
	}

}
