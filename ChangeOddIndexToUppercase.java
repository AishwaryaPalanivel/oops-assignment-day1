package week3.day1.ass1;

import java.util.Iterator;

public class ChangeOddIndexToUppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//- Convert the given String to a character array.
		String str=("changeme");
		char[] ch=str.toCharArray();
		//- Implement a loop to iterate through each character of the String (from end to start).
		for (int i = 0; i < ch.length; i++) {
			if (i%2!=0) 
			ch[i]=Character.toUpperCase(ch[i]);{
				System.out.println("output is:"+ch[i]);
				for(char c : ch) {
					System.out.print(c);
				}
				
			}
			
		}
		//- Find the odd index within the loop
		//- Inside the loop, change the character to uppercase only if the index is odd
		//- Print the characters with the expected output: cHaNgEmE
	}

}
