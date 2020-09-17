package returnTypeObject;

public class Login {
	public Credentials userName(String userName) {
		return new Credentials(userName);
	}
	public void loginUserWithValidCredentials(String username , String password) {
		
	}

}
