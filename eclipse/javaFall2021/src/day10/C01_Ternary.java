package day10;

import java.util.Scanner;

public class C01_Ternary {

	public static void main(String[] args) {
	// kullanicdan iki sayi lain ve buyuk olmayani yazdirin
	
        Scanner scan= new Scanner (System .in );
		
		System.out.println(" lutfen bir sayi    giriniz");
	
	    double sayi1= scan.nextDouble();
	
	    System.out.println("lutfen bir sayi daha giriniz");
	
	    double sayi2= scan.nextDouble();
	
	System.out.println(sayi1>sayi2 ? sayi2:sayi1);
	
	}

}
