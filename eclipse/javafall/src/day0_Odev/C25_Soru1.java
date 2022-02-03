package day0_Odev;

import java.util.Scanner;

public class C25_Soru1 {

	public static void main(String[] args) {
		//Kullanicidan ismini, soyismini ve bosluk birakmadan
		//16 hane olarak kredi karti numarasini alin. 
		//Isim ve soyismi ilk harfleri buyuk diger harfler kucuk olacak sekilde,
		//KK numarasini ise 4 rakamlik 4 blok ve aralarinda bosluk olacak sekilde duzelten 2 method yazin,
		//ve programda kullanabilmek icin duzenlenmis hallerini geri dondurun.

		Scanner scan=new Scanner(System.in);
	    System.out.println("Lutfen isminizi giriniz");
	
	String isim=scan.next();
	System.out.println("Lutfen soyisminizi giriniz");
	String soyisim=scan.next();
	System.out.println("Lutfen kk numaranizi  giriniz");
	
	String kkno=scan.next();
odeBil(isim,soyisim,kkno);
	
	
	
	}

	public static void odeBil(String isim, String soyisim, String kkno) {
	String isimFormatli=isim.substring(0,1).toUpperCase()+ isim.substring(1).toLowerCase();
	String soyisimFormatli=soyisim.substring(0,1).toUpperCase()+ soyisim.substring(1).toLowerCase();
	String kkFormatli=kkno.substring(0, 12).replaceAll("\\w",  "*")+ kkno.substring(12);
	
System.out.println("isim : " + isimFormatli + "\nsoyisim: "+ soyisimFormatli + "\nkredi karti num"+kkFormatli);
	
	
	}

}
