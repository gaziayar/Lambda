package day13_;

import java.util.Scanner;

public class C06_SifreSorusu {

	public static void main(String[] args) {
		//  Kullanicidan ismini, soyismini ve kredi karti bilgisini isteyin ve asagidaki gibi yazdirin
       // isim-soyisim : M***** B*******
       // kart no : **** **** **** 1234
	
		Scanner scan=new Scanner(System.in);
        System.out.println("lutfen isminizi girin");
	
	String isim=scan.next();
	System.out.println("lutfen soyisminizi girin");
	String soyisim=scan.next();
	System.out.println("lutfen 16 karakterli kk numaranizi bosluk birakmadan yazin");
	
	String kkno=scan.next();
	
	String isimFormatli=isim.substring(0,1).toUpperCase()+ 
			isim.substring(1).replaceAll("\\w", "*");
	
    String soyisimFormatli=soyisim.substring(0,1).toUpperCase()+ 
            soyisim.substring(1).replaceAll("\\w", "*");

	String kkFormatli="**** **** **** "+ kkno.substring(12);
	
	System.out.println("isim-soyisim: " + isimFormatli + " "+ soyisimFormatli);
	
	System.out.println("kart no: " + kkFormatli);
	
	
	
	
	
	
	
	}

}
