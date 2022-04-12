package MobileAutomation;

import java.net.MalformedURLException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import io.appium.java_client.android.AndroidDriver;

public class browse1 extends baseChrome {

	public static void main(String[] args) throws MalformedURLException {

		AndroidDriver driver = capabilities();
		/*
		 * driver.get("http://facebook.com");
		 * driver.findElementByXPath("//*[@id='u_0_1']/div[1]/div/input").sendKeys(
		 * "qwerty"); driver.findElementByName("pass").sendKeys("12345");
		 * driver.findElementByXPath("//button[@value='Log In']").click();
		 */
		// rahulonlinetutor@gmail.com

		driver.get("http://cricbuzz.com");
		driver.findElement(By.xpath("//a[@href='#menu']")).click();
		driver.findElement(By.cssSelector("a[title='Cricbuzz Home']")).click();
		System.out.println(driver.getCurrentUrl());
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,480)", "");
		Assert.assertTrue(
				driver.findElement(By.xpath("//h4[text()='Top Stories']")).getAttribute("class").contains("header"));
		System.out.println("Passed");

//adb devices- Unauthorized
//adb kill-server
//adb start-server
//adb devices

	}

}
