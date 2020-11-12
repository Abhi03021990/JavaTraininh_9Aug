package collectionEg;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class School {
	 int rollNumber=1;
	String schoolName;
	Map <Integer ,String> students = new HashMap<Integer, String>();
	
	public School(String schoolName) {
		this.schoolName =schoolName;
	}
	public void addStudent(int rollNumber , String studentName) {
		students.put(rollNumber, studentName);
		
	}
	public void addStudent(String studentName) {
		addStudent(rollNumber, studentName);
		rollNumber++;
	}
	public void studentsInfo() {
		for (int i=1 ; i<rollNumber ;i++) {
			System.out.println("Roll Number :\t"+i +" \tStudent Name :\t"+students.get(i));
		}
	}

}
