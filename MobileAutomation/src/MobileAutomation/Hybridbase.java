
package MobileAutomation;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Hybridbase {

	public static AndroidDriver capabilities(String device) throws MalformedURLException
	{
		

		File appDir = new File("src");

		File app = new File(appDir, "ApiDemos-debug.apk");
		DesiredCapabilities capabilities= new DesiredCapabilities();

		if(device.equals("emulator"))
		{
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Nahidemulator");
		}
		else if(device.equals("real"))
		{
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
		}

		capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");//new step


		capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());

		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		return driver;
	}


}
