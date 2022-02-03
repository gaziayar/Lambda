package day29staticblock_passByValue;

import java.util.Arrays;

public class C05_PassByValueArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int sayilar []= {3,4,5,6};
	
	elemanDegistir(sayilar);
	System.out.println("eleman degistir methodundan sonra: " +Arrays.toString(sayilar));
	
	arrayiDegistir(sayilar);
	
	System.out.println("arrayi degistir methodundan sonra: "+ Arrays.toString(sayilar));
	}

	private static void arrayiDegistir(int[] sayilar) {
		sayilar= new int [6];
		System.out.println("arrayi degistir methodunda: "+ Arrays.toString(sayilar));
	}

	private static void elemanDegistir(int[] sayilar) {
		sayilar [0]=10;
		System.out.println("eleman degistir methodunds: " +Arrays.toString(sayilar));
	}

}
