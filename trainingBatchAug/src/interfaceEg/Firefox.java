package interfaceEg;

public class Firefox implements WebDriver{

	@Override
	public void get(String url) {
		System.out.println("launching url :---->"+url+" in firefox");
		
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		System.out.println("Closing the firefox browser");
		
	}

}
