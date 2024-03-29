package week3.day1.ass1;

public class LoginPage extends Basepage{
public void performCommonTask() {
		
		System.out.println("Perform common task - Sub class");
	}
	
	public static void main(String[] args) {
		
		LoginPage lp = new LoginPage();
		lp.clickElement();
		lp.enterText();
		lp.findElement();
		lp.performCommonTask();
		
		Basepage bp = new Basepage();
		bp.performCommonTask();
	}
}
