package patterns;

import java.util.Scanner;

public class RightAngledTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the size of the pattern u wnt to prnt");
		int size = input.nextInt();
		
		for (int i = 0; i < size; i++) {
			for (int j = 0; j <=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
