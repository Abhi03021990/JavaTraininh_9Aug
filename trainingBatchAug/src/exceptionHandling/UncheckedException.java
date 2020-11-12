package exceptionHandling;

public class UncheckedException {
	
	public static void printMessage() {
		String msg = null;
		System.out.println("NO of characters in the message is "+ msg.length());
		
		
	}

	public static void main(String[] args) throws Exception {
		//UncheckedException.printMessage();
		
		User user = new User();
		user.setUserName("65465");
		user.setPassword("654+6");
		user.clickLogin();

	}

}
