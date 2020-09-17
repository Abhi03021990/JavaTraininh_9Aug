package exceptionHandling;

public class UncheckedException {
	
	public static void printMessage() {
		String msg = null;
		System.out.println("NO of characters in the message is "+ msg.length());
		
		
	}

	public static void main(String[] args) {
		UncheckedException.printMessage();

	}

}
