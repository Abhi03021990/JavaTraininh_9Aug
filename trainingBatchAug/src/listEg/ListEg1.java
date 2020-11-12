package listEg;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;

import exceptionHandling.User;

public class ListEg1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sub [] = {"Maths","Science","History"};
		ArrayList students = new ArrayList();//heterogenous
		ArrayList ar = new ArrayList(5000);
		students.add("Mahesh");
		students.add(20);
		students.add(2545.20);
		students.add(sub);
		students.add(new User().toString());
		System.out.println(students);
		
		System.out.println(students);
		LinkedList evenNo = new LinkedList();
		for (int i = 0; i < 20; i++) {
			evenNo.add(i*2);
			System.out.println(evenNo.get(i));
		}
		
		evenNo.add(2, "hello");
		System.out.println(evenNo);
		evenNo.addAll(students);
		System.out.println(evenNo);
		System.out.println(evenNo.contains(38));
		
		ArrayList<Integer> integerArraylist = new ArrayList<Integer>();
		String no = "654";
		String n = "458.20";
		System.out.println(Integer.parseInt(no)+2);
		System.out.println(Double.parseDouble(n)+2);
		integerArraylist.add(25);
		integerArraylist.add(25);
		integerArraylist.add(25);
		integerArraylist.add(50);
		System.out.println(integerArraylist);
		HashSet<Integer> id = new HashSet<Integer>();
		id.add(10);
		id.add(10);
		id.add(20);
		System.out.println(id);
		
		String num1 ="65423a";
		String num2 = "765";
		System.out.println(Integer.parseInt(num1)+Integer.parseInt(num2));
		
		
		

	}

}
