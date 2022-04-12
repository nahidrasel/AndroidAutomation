package MobileAutomation;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class baseChrome {
	public static AndroidDriver capabilities() throws MalformedURLException {
		AndroidDriver driver;

		/*
		 * File appDir = new File("src"); File app = new File(appDir,
		 * "ApiDemos-debug.apk");
		 */
		DesiredCapabilities capabilities = new DesiredCapabilities();

		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Nahid2");

		capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");

		// capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

		return driver;
	}

}
