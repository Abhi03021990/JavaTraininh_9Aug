package methodOverriding;

public class TestOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Ford();
		//car.changeGear();
		Ford car2 = new Ford();
		car2.changeGear();
		
		
		/*
		 * Car car1 = new Car(); car1.changeGear(); Ford car2 = new Ford();
		 * car2.changeGear(); //Ford car3= new Car();
		 */

	}

}
