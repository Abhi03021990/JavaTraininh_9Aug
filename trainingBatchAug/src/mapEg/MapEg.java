package mapEg;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> student = new HashMap<Integer, String>();
		student.put(258, "Rayan");
		student.put(252, "Jack");
		student.put(253, "Cyndy");
		student.put(254, "Bob");
		student.put(255, "Cyndy");
		student.put(255, "Cyndy");
		student.put(256, "Cyndy");
		student.put(null ,"abc");
		student.compute(258, null);
		//student.put(null ,"abc");
		
		System.out.println(student);
		System.out.println(student.get(258));
		student = new LinkedHashMap<Integer, String>();
		student.put(258, "Rayan");
		student.put(252, "Jack");
		student.put(253, "Cyndy");
		student.put(254, "Bob");
		student.put(255, "Cyndy");
		student.put(255, "Cyndy");
		student.put(256, "Cyndy");
		//System.out.println(student);
		System.out.println(student);
		//
		student = new TreeMap<Integer, String>();
		student.put(258, "Rayan");
		student.put(252, "Jack");
		student.put(253, "Cyndy");
		student.put(254, "Bob");
		student.put(255, "Cyndy");
		student.put(255, "Cyndy");
		student.put(256, "Cyndy");
		//System.out.println(student);
		System.out.println(student);
		

	}

}
