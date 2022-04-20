package MobileAutomation;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;
import pageObjects.HomePage;
import pageObjects.Preferences;

public class basics extends Hybridbase {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		AndroidDriver driver = capabilities("emulator");
		Thread.sleep(3000);
		HomePage h= new HomePage(driver);
		h.Preferences.click();

		// xpath id className, androidUIautomator
		/*
		 Xpath syntax= //tagName[@attribute('value')]
		 */

		driver.findElement(By.xpath("//android.widget.TextView[@text='Preference']")).click();
		
	    
		
		//Preferences p = new Preferences(driver);
		
		//p.dependencies.click();
		
		//driver.findElement(By.xpath("//android.widget.TextView[@text='3. Preference dependencies']")).click();
		driver.findElement(By.id("android:id/checkbox")).click();

		driver.findElement(By.xpath("(//android.widget.RelativeLayout)[2]")).click();
		driver.findElement(By.id("android:id/edit")).sendKeys("Hello");
		driver.findElements(By.className("android.widget.Button")).get(1).click();

	}

}
