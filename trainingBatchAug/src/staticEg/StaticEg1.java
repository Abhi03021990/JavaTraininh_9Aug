package staticEg;

public class StaticEg1 {
	int counter1;
	static int counter2;
	
	public void dispCounter1() {
		counter1++;
		System.out.println("the value of countetr1 is "+counter1);
	}
	public static void dispCounter2() {
		counter2++;
		System.out.println("the value of countetr2 is "+counter2);
	}

}
