package day0_Odev;

import java.util.Scanner;

public class C25_Odev111 {

	public static void main(String[] args) {

		 Scanner scan=new Scanner(System.in);
	    System.out.println("Lutfen isminizi giriniz");
	     
	     String isim=scan.next();
	     
	    System.out.println("lutfen soyisminizi giriniz");
	     String soyisim =scan.next();
	     
	     System.out.println("lutfen 16 karakterli KK numaranizi bosluk birakmadan yazin");
	     String kkNo=scan.next();
	     
	     String isimFormatli=isim.substring(0,1).toUpperCase() + 
	    		 isim.substring(1).replaceAll("\\w", "*");
	     String soyisimFormatli=soyisim.substring(0,1).toUpperCase()+soyisim.substring(1).replaceAll("\\w", "*");
	     String kkFormatli= "**** **** **** " + kkNo.substring(12);
	     
	     System.out.println("isim-soyisim : " + isimFormatli + " " + soyisimFormatli);
	     System.out.println("kart no : " + kkFormatli);
		
		
		

	}

}
