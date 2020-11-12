package webdriverEg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import utils.FrameworkUtils;

public class Tables extends FrameworkUtils{
	@Before
	public void setUp() {
		
		launchBrowser();
		
	}
	@Test
	public void testWebTable() {
		launchApplication("file:///D:/Java%20Training/JavaTraininh_9Aug/WebDriver/dropdown.html");
		int row=0;
		int col=0;
		int rowCount = driver.findElements(By.xpath("//table[@id='names']/tbody/tr")).size();
		int colCount = driver.findElements(By.xpath("//table[@id='names']/tbody/tr/th")).size();
		//String webTableXpath = "//table[@id='names']/tbody/tr["+row+"]/td["+col+"]";
		
		for (row = 1; row <=rowCount; row++) {
			for (col = 1;col <= colCount;col++) {
				if(row==1) {
					System.out.print(driver.findElement(By.xpath("//table[@id='names']/tbody/tr["+row+"]/th["+col+"]")).getText()+" ");
				}	
				else {
					System.out.print(driver.findElement(By.xpath("//table[@id='names']/tbody/tr["+row+"]/td["+col+"]")).getText()+" ");
				}
				
			}
			System.out.println();
		}
			
		}
		

}
