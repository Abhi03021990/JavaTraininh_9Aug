package webdriverEg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownEg {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Java Training\\JavaTraininh_9Aug\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/Java%20Training/JavaTraininh_9Aug/WebDriver/dropdown.html");
		WebElement dropDownEle = driver.findElement(By.id("dropDown1"));
		Select dropdown = new Select(dropDownEle);
		//Thread.sleep(4000);
		dropdown.selectByVisibleText("option3");
		for(WebElement ele : dropdown.getOptions()) {
			System.out.println(ele.getText());
		}
		
		

	}

}
