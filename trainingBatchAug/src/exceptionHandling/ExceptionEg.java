package exceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionEg {
	
	public void a() throws FileNotFoundException {
		new FileInputStream("");
	}
	public void b() throws FileNotFoundException {
		a();
	}

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		new ExceptionEg().b();

	}

}
