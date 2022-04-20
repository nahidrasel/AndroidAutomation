
package AppiumFramework;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class base {
	public static AppiumDriverLocalService service;
	
	public void startServer()
	{
		service= AppiumDriverLocalService.buildDefaultService();
		service.start();
	}

	public static AndroidDriver capabilities(String appName) throws IOException {

		System.getProperty("user.dir");
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\AppiumFramework\\global.properties");
		Properties prop = new Properties();
		prop.load(fis);

		File appDir = new File("src");

		File app = new File(appDir, (String) prop.get(appName));
		DesiredCapabilities capabilities = new DesiredCapabilities();
		String device = (String) prop.get("device");

		// capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"Nahidemulator");

		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, device);

		capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");// new step

		capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 14);

		capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());

		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		return driver;
	}

}
