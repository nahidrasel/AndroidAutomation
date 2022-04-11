package MobileAutomation;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;


public class base {

	public static AndroidDriver main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		DesiredCapabilities cap= new DesiredCapabilities();

		File appDir = new File("src");

		File app = new File(appDir, "ApiDemos-debug.apk");




		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Nahidemulator");


		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");//new step


		cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());

		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		return driver;
	}


}
