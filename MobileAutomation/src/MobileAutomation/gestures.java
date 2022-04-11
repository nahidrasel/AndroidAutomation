package MobileAutomation;

import java.net.MalformedURLException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;

import io.appium.java_client.android.AndroidDriver;

public class gestures extends base {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

		AndroidDriver driver = capabilities();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//android.widget.TextView[@text='Views']")).click();
		// tap
		/*
		 * TouchActions t= new TouchActions(driver); WebElement expandList =
		 */
		driver.findElement(By.xpath("//android.widget.TextView[@text='Expandable Lists']")).click();
		// t.singleTap(expandList).perform();

		driver.findElement(By.xpath("//android.widget.TextView[@text='1. Custom Adapter']")).click();
		WebElement pn = driver.findElement(By.xpath("//android.widget.TextView[@text='People Names']"));
		TouchActions t = new TouchActions(driver);
		t.clickAndHold(pn).perform();
		System.out.println(driver.findElement(By.id("android:id/title")).isDisplayed());

	}

}
