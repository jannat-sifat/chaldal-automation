package chaldal;



import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.junit.After;
//import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class ChaldalAutomate {
	
	AndroidDriver<MobileElement> driver;
	
	@Before
	public void openChaldal() throws MalformedURLException {
		// setup
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "OnePlus 6");
		cap.setCapability("udid", "35815da");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "10");
		
		cap.setCapability("appPackage", "com.chaldal.poached");
		cap.setCapability("appActivity", "com.chaldal.poached.MainActivity");
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AndroidDriver<MobileElement>(url, cap);
		
		// end setup
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		System.out.println("Started");
		
	}
	
	@After
	public void doAfter() {
		
	}
	
public void test()
{
	
}


	@Test
	public void searchToothBrush() throws InterruptedException {
//		
		
		driver.findElements(By.className("android.widget.TextView")).get(2).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//android.widget.EditText[@text='e.g. milk, eggs, etc. browse over 5000 products...']")).sendKeys("toothbrush");


		// unfinished

		
	}


}
