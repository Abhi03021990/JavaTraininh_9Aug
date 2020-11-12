package webdriverEg;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import ui.SavaariHomePage;

public class Savaari {
	WebDriver driver;
	@Before
	public void setUp() {
		System.out.println("running @before method");
		System.setProperty("webdriver.chrome.driver", "D:\\Java Training\\JavaTraininh_9Aug\\drivers\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
	}
	@Test
	public void testFromField() throws InterruptedException {
		driver.get("https://www.savaari.com/");
		//driver.findElement(By.id("fromCityList")).sendKeys("Bangalore");
		//1st way
		//typeText(getElement(driver, "//*[@id='fromCityList']"), "Bangalore");
		//2nd way
		//typeText(getElement("//*[@id='fromCityList']"), "Bangalore");
		//3rd way
		//typeText("//*[@id='fromCityList']", "Bangalore");
		//4th way
		typeText(SavaariHomePage.FROM_FIELD, "Bangalore");
		
		Thread.sleep(2000);
		driver.findElement(By.id("fromCityList")).sendKeys(Keys.TAB);
		driver.findElement(By.xpath("//label[text()='To']/parent::div/following-sibling::div/input")).sendKeys("Chennai");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[text()='To']/parent::div/following-sibling::div/input")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//button[text()='Select Car']")).click();
		click(SavaariHomePage.SELECT_CAR_BUTTON);
		Thread.sleep(4000);
		List<WebElement> fare = driver.findElements(By.xpath("//span[@class='text-right carPrice pricetag']"));
		for (WebElement ele : fare) {
			System.out.println(ele.getText());
		}
		
	}
	
	public WebElement getElement(WebDriver driver , String xpath) {
		return driver.findElement(By.xpath(xpath));
	}
	public WebElement getElement(String xpath) {
		return  getElement(driver, xpath);
	}
	
	
	public void typeText(WebElement element , String textToType) {
		element.sendKeys(textToType);
	}
	
	public void typeText(String xpath , String textToType) {
		//code to wait
		typeText(getElement(xpath), textToType);
	}
	
	public void click(String xpath) {
		getElement(xpath).click();
	}
	

}
