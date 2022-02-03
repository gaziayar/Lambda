package day06;

import java.util.Scanner;

public class C4_ifstatement4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner scan= new Scanner( System.in);
	
	System.out.println( " lutfen bir gun ismi girin");
	
	
	String gunAdi=scan.next().toLowerCase();
	
	if (gunAdi.equals("cumartesi")||gunAdi.equals("pazar")) {
		
		
		System.out.println("Haftasonu");
	}
if (gunAdi.equals("pazartesi")||gunAdi.equals("sali")||gunAdi.equals("carsamba")||gunAdi.equals("persembe")||gunAdi.equals("cuma")) {
	
	System.out.println("Hafta ici");
	
	}
	
scan.close();
	}

}
