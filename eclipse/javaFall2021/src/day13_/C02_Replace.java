package day13_;

import java.util.Scanner;

public class C02_Replace {

	public static void main(String[] args) {
		// str olarak verilen 10.000 sayisinin 1.000 den buyuk olup olm yazdirin
		
	
	String sonuc= "10.000";
	sonuc=sonuc.replace(".", "");
	
	if (Integer.valueOf(sonuc)>1000) {
		System.out.println("Bulunan sonuc sayisi 1000' den cok");
	} else {
		System.out.println("Bulunan sonuc sayisi 1000'den az");
	}
	
	
	
	
	}

}
