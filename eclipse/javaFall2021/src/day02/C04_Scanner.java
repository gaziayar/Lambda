package day02;

import java.util.Scanner;

public class C04_Scanner {

	public static void main(String[] args) {
		// kullanicidan degr almak icin 3 adim takip edilir
		//1. adim= scanner objesi olusturma
  Scanner scan= new Scanner(System.in);
	
	// ikinci adim kullaniciya ne istediginizi soyleyin
	
	System.out.println("lutfen isminizi yaziniz");
	
	String isim = scan.next();
	System.out.println("isminiz :" + isim);
	
	
	
	}

}
