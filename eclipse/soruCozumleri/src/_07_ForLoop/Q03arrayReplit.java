package _07_ForLoop;

import java.util.Scanner;

public class Q03arrayReplit {

	public static void main(String[] args) {
		/*
		 * Write a method which accepts a String as parameter and prints the sum of the
		 * digits, present in the given string.
		 * 
		 * input : ade1r4d3
		 * 
		 * output : 8
		 * 
		 * Hint : Use Character.isDigit() Integer.valueOf()
		 */

		String str = " ade1r4d3";

		String arr[] = str.split("");

		toplam(arr);
	}

	private static void toplam(String[] arr) {

		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
 
			if (Character.isDigit(arr[i].charAt(0))) {
				sum+=Integer.valueOf(arr [i]);
			
			}
			
			
		}

		System.out.println(sum);
		
	
	}
	
     
}
