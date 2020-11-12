package webdriverEg;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class MyFirstTest {
	WebDriver driver;
	@Before
	public void setUp() {
		System.out.println("running @before method");
		System.setProperty("webdriver.chrome.driver", "D:\\Java Training\\JavaTraininh_9Aug\\drivers\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
	}
	@Test
	public void findElementTest() {
		System.out.println("running findElementTest ");
		driver.get("https://www.makemytrip.com/flights/");
		
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		WebElement roundTripElement = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[1]/ul/li[2]"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", roundTripElement);
	}
	@Test
	public void dropDownTest() throws InterruptedException {
		System.out.println("running dropDownTest ");
		driver.get("file:///D:/Java%20Training/JavaTraininh_9Aug/WebDriver/dropdown.html");
		WebElement dropDownEle = driver.findElement(By.id("dropDown1"));
		Select dropdown = new Select(dropDownEle);
		Thread.sleep(4000);
		dropdown.selectByVisibleText("option3");
		for(WebElement ele : dropdown.getOptions()) {
			System.out.println(ele.getText());
		}
		
	}
	@Test
	public void titleTest() {
		driver.get("https://www.educba.com/dropdown-list-in-html/");
		String expectedTitle ="Abc";
		String actualtitle = driver.getTitle();
		if(expectedTitle.equals(actualtitle)) {
			System.out.println("pass");
		}else {
			System.out.println("fail");
		}
		Assert.assertEquals(expectedTitle, actualtitle);		
	}
	@After
	public void tearDown() {
		System.out.println("running tearDown ");
		driver.close();
		
	}
}
