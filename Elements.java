package week3.day1.ass1;

public class Elements extends Button{
	
	public void setElements() {
		
		System.out.println("elements - executing class");

	}
	public static void main(String[] args) {
		Elements elmts= new Elements();
		elmts.click();
		elmts.settext("aish");
		elmts.submit();

	}

}
