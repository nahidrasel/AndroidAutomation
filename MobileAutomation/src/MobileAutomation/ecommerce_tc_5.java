package MobileAutomation;

import org.testng.AssertJUnit;
import java.net.MalformedURLException;
import org.openqa.selenium.By;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;

public class ecommerce_tc_5 extends base {
	public static void main(String[] args) throws MalformedURLException, InterruptedException {

		AndroidDriver driver = capabilities();

		driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Hello");

		driver.hideKeyboard();

		driver.findElement(By.xpath("//*[@text='Female']")).click();

		driver.findElement(By.id("android:id/text1")).click();

		driver.findElement(AppiumBy.androidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(text(\"Argentina\"))"));

		// driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new
		// UiSelector().scrollable(true).instance(0)).scrollIntoView(new
		// UiSelector().textMatches(\"" + containedText + "\").instance(0))"));

		driver.findElement(By.xpath("//*[@text='Argentina']")).click();

		driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();

		driver.findElements(By.xpath("//*[@text='ADD TO CART']")).get(0).click();
		driver.findElement(By.xpath("//*[@text='ADD TO CART']")).click();
		driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
		Thread.sleep(4000);

		int count = driver.findElements(By.id("com.androidsample.generalstore:id/productPrice")).size();

		double sum = 0;

		for (int i = 0; i < count; i++)

		{

			String amount1 = driver.findElements(By.id("com.androidsample.generalstore:id/productPrice")).get(i)
					.getText();

			double amount = getAmount(amount1);

			sum = sum + amount;// 280.97+116.97

		}

		System.out.println(sum + " sum of products");

		String total = driver.findElement(By.id("com.androidsample.generalstore:id/totalAmountLbl")).getText();

		total = total.substring(1);

		double totalValue = Double.parseDouble(total);

		System.out.println(totalValue + " Total value of products");

		AssertJUnit.assertEquals(sum, totalValue);

		// Mobile Gestures

		driver.findElement(By.className("android.widget.CheckBox")).click();

		WebElement tc = driver.findElement(By.xpath("//*[@text='Please read our terms of conditions']"));

		TouchActions t = new TouchActions(driver);
		t.clickAndHold(tc).perform();
		driver.findElement(By.id("android:id/button1")).click();

		driver.findElement(By.id("com.androidsample.generalstore:id/btnProceed")).click();
	}
	
	

	public static double getAmount(String value)

	{

		value = value.substring(1);

		double amount2value = Double.parseDouble(value);

		return amount2value;

	}

}