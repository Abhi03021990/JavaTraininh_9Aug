package interfaceEg;

public class Chrome implements WebDriver{

	@Override
	public void get(String url) {
		System.out.println("launching url :---->"+url+" in chrome");

		
	}

	@Override
	public void close() {
		System.out.println("Closing the chrome browser");
	}

}
