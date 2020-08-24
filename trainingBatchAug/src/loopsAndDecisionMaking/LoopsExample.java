package loopsAndDecisionMaking;

import java.util.Scanner;

public class LoopsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * lottery no is in 4 digits
		 * Program for lucky draw
		 * 1st winner exact match
		 * 2nd winner first 3digit of the no matches
		 * 3rd winner any 2 digits matches
		 * Scenario 
		 * user enters the 4 digit lottery number
		 * programs generates random 4 digit no and compares with the number provided by user 
		 * and based on the comparison result winner category is decided
		 * Output:
		 * Please enter your 4 digit lottery Number.
		 * 4525
		 * yay!!!   you won 2nd prize !! 
		 */
		int drawNumber =2525;//(int) (Math.random()*10000);
		System.out.println("Please enter your 4 digit lottery Number.");
		Scanner input = new Scanner(System.in);
		//input.processinte
		String userLotteryNo = input.next();
		System.out.println();
		String secondPrizeCondition= userLotteryNo.substring(0, 3);
		String thirdPrizeCondition=userLotteryNo.substring(0, 2);
		if(userLotteryNo.equals(drawNumber+"")) {
			System.out.println("you won 1st prize!!");
		}else if((drawNumber+"").contains(secondPrizeCondition)) {
			System.out.println("you won 2nd prize!!");
		}else if((drawNumber+"").contains(thirdPrizeCondition)) {
			System.out.println("you won 3rd prize!!");
		}

	}

}
