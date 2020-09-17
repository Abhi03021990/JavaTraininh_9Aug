package patterns;

import methodOverriding.Car;

public class Ford {
	public void drive() {
		
	}
	 void turnOnWindowLock() {
		
	}
	 public void changeGear() {
		System.out.println("method from ford class");
	}
	public void disp2() {
		 changeGear();
	 }
	
	public static void main(String[] args) {
		//Car c = new Ford();
		Ford f = new Ford();
		
		
		
	}

}
