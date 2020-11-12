package utils;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FrameworkUtils {
	public WebDriver driver;
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "D:\\Java Training\\JavaTraininh_9Aug\\drivers\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
	}
	/**
	 * Method to launch an application based on url provided
	 * @param url
	 */
	public void launchApplication(String url) {
		driver.get(url);
	}
	/**
	 * To find  element
	 * @param driver
	 * @param xpath
	 * @return WebElement
	 */
	public WebElement getElement(WebDriver driver , String xpath) {
		waitForElement(xpath);
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
	public boolean isSelected(String xpath) {
		return getElement(xpath).isSelected();
	}
	
	public Alert switchToAlert() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.alertIsPresent());
		return driver.switchTo().alert();
	}
	public void acceptAlert() {
		switchToAlert().accept();
	}
	public String getAlertmessage() {
		
		return switchToAlert().getText();
	}
	
	public void waitForElement(String xpathExpression) {
		WebDriverWait wait = new WebDriverWait(driver, 120);
		try {
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpathExpression)));
		} catch (Exception e) {
			// TODO: handle exception
			///waitForElement(xpathExpression);
		}
		
	}
	
	public void pressEnter() throws AWTException {
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}
	public void pressTab() throws AWTException {
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
	}
	

}
