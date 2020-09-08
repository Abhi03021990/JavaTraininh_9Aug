package interfaceEg;

public class DriverManager {
	public void launchBrowser(WebDriver driver , String url){
		driver.get(url);
	}
	public void tearDown(WebDriver driver) {
		driver.close();
	}

}
