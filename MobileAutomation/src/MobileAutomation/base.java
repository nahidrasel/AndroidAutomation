
package MobileAutomation;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class base {

	public static AndroidDriver capabilities() throws MalformedURLException {

		DesiredCapabilities capabilities = new DesiredCapabilities();

		File appDir = new File("src");

		File app = new File(appDir, "General-Store.apk");

		// capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,
		// "Nahidemulator");
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Nahid2");

		capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");// new step

		capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 14);

		capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());

		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		return driver;
	}

}
