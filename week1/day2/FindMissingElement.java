package week1.day2;

import java.util.Arrays;

public class FindMissingElement {
	public static void main(String args[]) { 
		int Array1[] ={1, 4,3,2,8, 6, 7}; 
		Arrays. sort(Array1); 
		for (int i = 0; i < Array1. length; i++) { 
			if(i+1!=Array1[i])
		      { System. out. println(i+1); break; } 
			} 
		}
}
