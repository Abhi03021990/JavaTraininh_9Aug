package webdriverEg;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import utils.FrameworkUtils;

public class Alerts extends FrameworkUtils{
	@Before
	public void setUp() {
		
		launchBrowser();
		
	}
	@Test
	public void testAlert() throws InterruptedException, AWTException {
		launchApplication("file:///D:/Java%20Training/JavaTraininh_9Aug/WebDriver/dropdown.html");
		//Thread.sleep(3000);
		//driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		click("//button[text()='Try it']");
		//Thread.sleep(2000);
		//driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		//String actualAlertText = driver.switchTo().alert().getText();
		String actualAlertText = getAlertmessage();
		//driver.switchTo().alert().accept();
		//acceptAlert();
		//using robot class to press enter
		pressEnter();
		driver.findElement(By.xpath("//button[text()='Try it']")).sendKeys(Keys.ENTER);
		
		
		String expectedAlertText ="Hello\nHow are you?";
		Assert.assertEquals(expectedAlertText, actualAlertText);
		
	}
}
