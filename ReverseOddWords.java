package week3.day1.ass1;

public class ReverseOddWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "I am a Software Engineer";
		int a,b;
		
		System.out.println("The given string: " + s);

		//Split the string
		String[] s1 = s.split(" ");
		
		System.out.println("After splitting into separate strings:");
		
		//Print & check
		for (String each : s1) {
			System.out.print("   " + each);
		}
		
		//print only even number
		System.out.println("");
		System.out.println("Output: ");
		for (a = 0; a < s1.length; a++) {
			if(a%2!=0)
			{
				 
				 int len =s1[a].length();
			     char[] ch = s1[a].toCharArray();
			     System.out.print(" ");
			     for(b=len-1; b >= 0; b--)
			    	 System.out.print(ch[b]);
			     
			}
			else
			{
				System.out.print(" " + s1[a]); 
			}
	}

}
}
