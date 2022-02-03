package _07_ForLoop;

import java.util.Arrays;

public class Q02array4 {

	public static void main(String[] args) {
		/*
		 * Create a custom return type method accepts a name as parameter and prints the
		 * name as a char array.
		 * 
		 * (do not use toCharArray() method)
		 * 
		 * Input : John
		 * 
		 * Output :[J, o, h, n]
		 */

		String isim = "John";
		String[] kelimeler = isim.split("");

		krk(kelimeler);
		System.out.println(Arrays.toString(kelimeler));
	}

	private static String[] krk(String[] kelimeler) {

		for (int i = 0; i < kelimeler.length; i++) {

			kelimeler[i] = kelimeler[i].replace("\\W", "");

		}

		return kelimeler;

	}

}
