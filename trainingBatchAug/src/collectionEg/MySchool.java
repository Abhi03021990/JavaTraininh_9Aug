package collectionEg;

public class MySchool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		School donbosco = new School("Donbosco");
		donbosco.addStudent("Vishal");
		donbosco.addStudent("Omkar");
		donbosco.addStudent("Soumya");
		donbosco.studentsInfo();
		School xavier = new School("Xavier");
		xavier.addStudent("Raj");
		xavier.addStudent("Anbu");
		xavier.addStudent("Arun");
		xavier.studentsInfo();
		System.out.println(getTravelOption("oneWayTrip"));
		

	}
	public static String getTravelOption(String travelMode) {
		String xpath = "//li[@data-cy='"+travelMode+"']/span";
		return xpath;
	}

}
