package webdriverEg;

import org.junit.Before;
import org.junit.Test;

import utils.FrameworkUtils;

public class Iframe extends FrameworkUtils{
	@Before
	public void setUp() {
		
		launchBrowser();
		
	}
	
	@Test
	public void testIframe() throws InterruptedException {
		launchApplication("https://timesofindia.indiatimes.com/");
		Thread.sleep(8000);
		driver.switchTo().frame(getElement("//iframe[@id='ifr_129105-1']"));
		String src = getElement("//*[@id=\"adsdivLyr\"]/div[1]/a/span/img").getAttribute("src");
		System.out.println(src);
		driver.switchTo().defaultContent();
		String title = getElement("//*[@id=\"lateststories\"]/div/div[2]/ul/li[12]/a").getAttribute("title");
		System.out.println(title);
	}

}
