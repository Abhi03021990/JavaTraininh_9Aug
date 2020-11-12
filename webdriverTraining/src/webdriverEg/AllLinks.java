package webdriverEg;

import java.awt.AWTException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.FrameworkUtils;

public class AllLinks extends FrameworkUtils{
	@Before
	public void setUp() {
		
		launchBrowser();
		
	}
	@Test
	public void testAllLinks() throws AWTException, InterruptedException {
		launchApplication("https://www.bing.com/search?q=news&qs=HS&sc=3-0&cvid=35408390BFC6423B94757DB1B9EB36A0&FORM=QBLH&sp=1");
		//typeText("//*[@id='sb_form_q']", "news");
		//pressEnter();
		Thread.sleep(3000);
		//driver.manage().timeouts().pageLoadTimeout(3, TimeUnit.SECONDS);
		System.out.println(driver.getTitle());
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		for (WebElement ele : allLinks) {
			try {
				//ele.click();
				//driver.manage().timeouts().pageLoadTimeout(3, TimeUnit.SECONDS);
				//Thread.sleep(3000);
				System.out.println(ele.getText());
				System.out.println(ele.getAttribute("href"));
				
				//driver.navigate().back();
				//Thread.sleep(3000);
				//driver.navigate().refresh();
				//allLinks = driver.findElements(By.tagName("a"));
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(e.getStackTrace());
			}
			
			
		}
	}

}
