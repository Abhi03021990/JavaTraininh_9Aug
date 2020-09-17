package interfaceEg;

public interface Test {
	
	public boolean compareEqual(String expected , String actual);
	static boolean compareNotEqual(String expected , String actual) {
		
		return false;
	}
	default int m1() {
		return 0;
		
	}
	

}
