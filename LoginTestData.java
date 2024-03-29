package week3.day1.ass1;

public class LoginTestData extends Uipage {
public void enterUsername() {
		
		System.out.println("Please Enter Username - Subclass - Username method");
	}
	
	public void enterPassword() {
		
		System.out.println("Please Enter Password -  Subclass - Password method");
	}
	
	public static void main(String[] args) {

		LoginTestData login = new LoginTestData();

		login.enterUsername(); //sub class method
		login.enterPassword(); //sub class method
	}
}
