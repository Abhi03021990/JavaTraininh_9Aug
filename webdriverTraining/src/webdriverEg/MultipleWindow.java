package webdriverEg;

import java.util.Set;

import org.junit.Before;
import org.junit.Test;

import utils.FrameworkUtils;

public class MultipleWindow extends FrameworkUtils{
	@Before
	public void setUp() {
		
		launchBrowser();
		
	}
	@Test
	public void testMultipleWindow() {
		launchApplication("file:///D:/Java%20Training/JavaTraininh_9Aug/WebDriver/dropdown.html");
		//click on button which launches new window
		click("//*[@id='mw']");
		//get current window name
		String currentWindow = driver.getWindowHandle();
		System.out.println(driver.getTitle());
		Set<String> allWindows = driver.getWindowHandles();
		for (String window : allWindows) {
			if(!window.equals(currentWindow)) {
				driver.switchTo().window(window);
			}
		}
		String googleWindow = driver.getWindowHandle();
		System.out.println(driver.getTitle());
		System.out.println("Switching to previous window");
		System.out.println(driver.getTitle());
		driver.switchTo().window(currentWindow);
		System.out.println(driver.getTitle());
		System.out.println("Switching to google window");
		driver.switchTo().window(googleWindow);
		System.out.println(driver.getTitle());
		driver.quit();	
		
	}

}
