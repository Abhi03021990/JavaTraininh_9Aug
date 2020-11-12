package webdriverEg;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ui.SampleHtmlPage;
import utils.FrameworkUtils;

public class CheckBox extends FrameworkUtils{
	
	@Before
	public void setUp() {
		
		launchBrowser();
		
	}
	@Test
	public void testCheckBoxes() {
		launchApplication("file:///D:/Java%20Training/JavaTraininh_9Aug/WebDriver/dropdown.html");
		click(SampleHtmlPage.CHECK_BOX1);
		driver.findElement(By.xpath("//input[@id='vehicle1']")).click();
		//boolean isCB1Selected = driver.findElement(By.xpath(SampleHtmlPage.CHECK_BOX1)).isSelected();
		//Assert.assertTrue(isCB1Selected);
		//boolean isCB2Selected = driver.findElement(By.xpath(SampleHtmlPage.CHECK_BOX2)).isSelected();
		//Assert.assertFalse(isCB2Selected);
		//System.out.println(isCB1Selected +" "+isCB2Selected);
		//click(SampleHtmlPage.CHECK_BOX2);
		//click(SampleHtmlPage.CHECK_BOX3);
		//after using the reusable code
		Assert.assertTrue(isSelected(SampleHtmlPage.CHECK_BOX1));
		Assert.assertFalse(isSelected(SampleHtmlPage.CHECK_BOX2));
		
	
	}

}
