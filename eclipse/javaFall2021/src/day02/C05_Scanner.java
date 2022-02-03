package day02;

import java.util.Scanner;

public class C05_Scanner {

	public static void main(String[] args) {
		
    Scanner scan = new Scanner (System.in);
	System.out.println("lutfen isiminizi girin");
	String isim= scan.next();
	
	System.out.println("lutfen soy isminizi yaziniz");
	
	String soyisim= scan.next();
	
	System.out.println("girilen isim:" + isim + " "+ soyisim);
	
	
	
	}

}
