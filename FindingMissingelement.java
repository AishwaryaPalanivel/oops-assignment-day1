package week3.day1.ass1;

import java.util.Arrays;

import org.openqa.selenium.bidi.Input;

public class FindingMissingelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1, 4,3,2,8, 6, 7};
		System.out.println("unsorted array: ");
		for (int i = 0; i < a.length; i++) {
			System.out.print("   " + a[i]);
		}
		
		Arrays.sort(a);
		System.out.println(" ");
		System.out.println("sorted array: ");
		for(int i=0;i<a.length;i++)
			System.out.print("   " + a[i]);
		
		System.out.println(" ");
		System.out.println("missing element: ");
		for (int j = 0; j < a.length; j++) {
			if(a[j] != j+1)
			{
				System.out.println(j+1);break; 	   
			}
				
			}
		}
		
		
	}


