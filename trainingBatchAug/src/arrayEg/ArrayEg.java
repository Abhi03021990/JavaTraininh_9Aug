package arrayEg;

public class ArrayEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int arrayEvenNo [] = {2 ,4, 6};
		/*
		 * int arrayEvenNo [] = new int[10]; String names [] = {"Abc" ,"def"}; ArrayEg
		 * myClass = new ArrayEg(); Person abhishek = new Person(); Person raj = new
		 * Person();
		 */
		int arrayEvenNo [][] = new int[10][10];
		/*
		 * for(int i= 0 ; i<10 ; i++) { arrayEvenNo[i]=i+2;
		 * System.out.println(arrayEvenNo[i]); }
		 */
		
		/*
		 * for(int i= 0 ; i<10 ; i++) { System.out.println(arrayEvenNo[i]); }
		 */
		//System.out.println(arrayEvenNo);
	for (int i = 0; i < 10; i++) {
		for (int j = 0; j < 10; j++) {
			arrayEvenNo[i][j]=j;
			System.out.print(arrayEvenNo[i][j]);
			
		}
		System.out.println();
		
	}

	}
	
	/*
	 * class Person{ int myheight; int myWeight; String myName; }
	 */

}
