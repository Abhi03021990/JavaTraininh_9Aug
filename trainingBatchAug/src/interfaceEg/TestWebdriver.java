package interfaceEg;

public class TestWebdriver {

	public static void main(String[] args) {
		/*
		 * WebDriver driver = new Chrome(); driver.get("https://www.bing.com");
		 * driver.close(); driver = new Firefox();
		 * driver.get("https://www.google.co.in"); driver.close();
		 */
		//WebDriver driver = new Chrome();
		DriverManager manager = new DriverManager();
		manager.launchBrowser(new Firefox(), "https://www.bing.com");
		

	}

}
