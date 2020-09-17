package returnTypeObject;

public class Credentials {
	String userName;
	String password;
	public Credentials(String userName) {
		this.userName = userName;
	}
	public Credentials(String userName , String password) {
		this.userName = userName;
		this.password = password;
	}
	public void setPassword(String password) {
		this.password= password;
	}
	
	public Action enterPassword() {
		return new Action();
	}

}
