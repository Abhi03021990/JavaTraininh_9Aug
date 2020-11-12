package exceptionHandling;

public class User {
	
	private String userName ;
	private String password;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	 public Dashboard clickLogin() throws Exception {
		 if(getUserName().equals("") || getPassword().equals("") ) {
			 throw new Exception("Either username or the password field is empty ..please enter the values in username and password fields");
		 }
		 
		return new Dashboard();
		 
	 }

}
