package aug25;

import java.util.Scanner;

public class MathsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * Maths test for nursury kids . 5 one digit addition questions after student
		 * ansers the answer is evaluated and and the message correct or incorrect
		 * answer is displayed Output:
		 *  Welcome to Maths Test on one digit number. 
		 *  The
		 * test will have 5 questions and the evalution will be done after every answer
		 * 2 + 5 = ? 
		 * 6 
		 * incorrect answer
		 *  3 + 6 = ? 
		 *  9
		 *   correct answer
		 */
		System.out.println("\t\tWelcome to Maths Test on one digit number. ");
		System.out.println("Every question is of 1 mark ");
		System.out.println("There are 5 questions in the test");
		int total_marks = 5;
		int correctAnswer=0;
		int incorrectAnswer=0;
		for (int i = 0; i < 5; i++) {
			int randomNumber1 = (int) (Math.random() * 10);
			int randomNumber2 = (int) (Math.random() * 10);
			int result=randomNumber1+randomNumber2;
			Scanner input = new Scanner(System.in);
			//System.out.println( randomNumber1 + "+ "+randomNumber2 +"= ?" );
			System.out.println(randomNumber1 +" + " + randomNumber2+" = ?" );
			int answer = input.nextInt();
			if(result==answer) {
				System.out.println("Correct Answer");
				correctAnswer++;
			}else {
				System.out.println("Incorrect Answer, \ncorrect answer is "+result);
				incorrectAnswer++;
			}
		}
		
		System.out.println("Out of "+total_marks+" marks you got "+correctAnswer+" marks");
		double percentage = ((double)correctAnswer/(double)total_marks)*100;
		if(percentage>=40) {
			System.out.println("you got "+percentage+" % and passed the exam");
		}else {
			System.out.println("you got "+percentage+" % and failed the exam");
		}
		
		

	}

}
