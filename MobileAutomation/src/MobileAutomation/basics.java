package MobileAutomation;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class basics extends Hybridbase {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		AndroidDriver driver = capabilities("real");

		Thread.sleep(3000);

		// xpath id className, androidUIautomator

		/*
		 * Xpath syntax= //tagName[@attribute('value')]
		 * 
		 * 
		 * 
		 * 
		 * 
		 */

		driver.findElement(By.xpath("//android.widget.TextView[@text='Preference']")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='3. Preference dependencies']")).click();
		driver.findElement(By.id("android:id/checkbox")).click();

		driver.findElement(By.xpath("(//android.widget.RelativeLayout)[2]")).click();
		driver.findElement(By.id("android:id/edit")).sendKeys("Hello");
		driver.findElements(By.className("android.widget.Button")).get(1).click();

	}

}
