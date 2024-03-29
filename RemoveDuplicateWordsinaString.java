package week3.day1.ass1;

import java.util.Iterator;

public class RemoveDuplicateWordsinaString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Initialize a variable ‘count’ to keep track of the number of duplicate words found
		int count=0;
		String text = "We learn Java basics as part of java sessions in java week1";
		System.out.println("The given string: " + text);
		System.out.println("Strings after splitting into words: ");
		String[] text1 = text.split(" ");
		for (String each : text1) {
			System.out.print("    " + each);
		}
		for (int i = 0; i < text1.length; i++) {
			for (int j = i+1; j < text1.length; j++) {
				if (text1[i].equalsIgnoreCase(text1[j])) {
					text1[j]="    ";
					count=count+1;
				}
					
			}
		}
		if (count>1) {
			System.out.println("");
			System.out.println("Output is: ");
			for (String each : text1) {
				System.out.print("    " + each);
			}	
		}
			
		}
			
		}
	


