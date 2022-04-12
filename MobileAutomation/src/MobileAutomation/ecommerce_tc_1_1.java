package MobileAutomation;

import java.net.MalformedURLException;

import org.junit.Assert;
import org.openqa.selenium.By;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class ecommerce_tc_1_1 extends base {
	public static void main(String[] args) throws MalformedURLException, InterruptedException {

		AndroidDriver driver = capabilities();

		// driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Hello");

		// driver.hideKeyboard();

		driver.findElement(By.xpath("//*[@text='Female']")).click();

		driver.findElement(By.id("android:id/text1")).click();

		driver.findElement(AppiumBy.androidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(text(\"Argentina\"))"));

		driver.findElement(By.xpath("//*[@text='Argentina']")).click();

		driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();

		String toastMessage = driver.findElement(By.xpath("//android.widget.Toast[1]")).getAttribute("name");

		System.out.println(toastMessage);

		Assert.assertEquals("Please enter your name", toastMessage);// Actual validation
	}
}
