package day09_ternary;

import java.util.Scanner;

public class C4_Ternary4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		Scanner scan = new Scanner (System. in);
		System.out.println("lutfen bir tam sayi girin");
	
	int sayi= scan.nextInt();
	
	System.out.println(sayi%2==0? "cift sayi":"tek sayi");
	
	System.out.println("sayinin mutlak degeri:" + (sayi>0 ?  sayi : -sayi));
	
	}

}
