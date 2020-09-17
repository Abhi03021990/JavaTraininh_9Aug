package exceptionHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

public class CheckedException {
	
	public static String getData() throws Exception    {
		//File file = new File("c:/user/download/abc.txt");
		int a = 0;
		int b = a+2;
		
		//FileInputStream fis = new FileInputStream(file);
		FileInputStream fis ;
		
		
				try {
					fis =new FileInputStream("c:/user/download/abc.txt");
					fis.read();
				} catch (FileNotFoundException e) {
					System.out.println("Check the file path or name either one is incorrect");
					//System.exit(0);
					//System.out.println("Main file is not there using the backup copy");
					//fis =new FileInputStream("C:\\Users\\Lenovo\\Desktop\\javaTraining\\abc.java");
					//fis.read()
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				try {
					String abc = null;
					System.out.println("hjgfjhgk"+abc.length());
					
				}
				catch (ArithmeticException e) {
					System.out.println("Arithmetic exception occured ");
					//throw new Exception("my exception");
				}catch (Exception e) {
					// TODO: handle exception
					System.out.println("some exception occured "+ e.getMessage());
				}
				finally {
					System.out.println("Executing finally");
					
				}
				try {
					int result = 50/0;
				} catch (Exception e) {
					System.out.println("Exception occured"+e.getMessage());
				}
				
				
		
		
		return "";
	}

	public static void main(String[] args) throws Exception  {
		// TODO Auto-generated method stub
		CheckedException.getData();
		System.out.println("after exception");

	}

}
