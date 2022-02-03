package day10;

import java.util.Scanner;

public class C03_Ternary {

	public static void main(String[] args) {
		// kul bir sayi alin ve say mutlak degerini yazdirin

	
Scanner scan= new Scanner (System .in );
		
		System.out.println(" lutfen  sayi    giriniz");
	
	double sayi =scan.nextDouble();
	
	double mutlakDeger= sayi>=0  ? sayi: (-1)* sayi;
	
	System.out.println(mutlakDeger);
	
	
	
	
	}

}
