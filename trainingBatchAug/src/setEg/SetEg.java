package setEg;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List a= new ArrayList();
		a.add("Hello");
		a.add("Hello");
		a.add(5);
		a.add(55.25);
		a.add(null);
		a.add(null);
		System.out.println(a);
		ArrayList myArray = new ArrayList();
		
		Set abc = new HashSet();
		/*
		 * abc.add("car"); abc.add("car"); abc.add(12); abc.add(125.23); abc.add(null);
		 * abc.add(null);
		 */
		abc.addAll(a);
		
		
		System.out.println(abc);
		
		abc = new LinkedHashSet();
		
		  abc.add("car"); abc.add("apple"); abc.add(12); abc.add(125.23); abc.add(null);
		  abc.add(null);
		  System.out.println(abc);
		  
		  abc = new TreeSet();
		  abc.add("car"); abc.add("apple"); abc.add("banana"); abc.add("guava"); 
		  
		  System.out.println(abc);
		  Set abc1 = new TreeSet();
		  abc1.add(457);
		  abc1.add(52);
		  abc1.add(785);
		  abc1.add(58);
		  System.out.println(abc1);
		  
		 
		
		
		
		
		

	}

}
