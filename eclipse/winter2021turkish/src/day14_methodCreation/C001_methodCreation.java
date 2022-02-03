package day14_methodCreation;

import java.util.Scanner;

public class C001_methodCreation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		System.out.println("lutfen isminizi ve soyisminizi giriniz:");
		
		String isim=scan.next();
		String soyisim=scan.next();
		System.out.println("isminizin aciksekilde yazilmasini istiyorsaniz 1"
			     + "\n ilk harf haric gizli yazilmasini istiyorsaniz 2 e basin");
		int tercih=scan.nextInt();
		String birlesmisIsim=null;
		 if (tercih==1) {
			birlesmisIsim=acikIsim(isim,soyisim);
		} else if(tercih==2){
			birlesmisIsim=isimGizle(isim,soyisim);
		} else {
			
			
			System.out.println("lutfen 1 veya 2 yi secin");
		}
		
		System.out.println("kullanicinin tercihi:"+ birlesmisIsim);
		
	}

	public static String isimGizle(String isim, String soyisim) {
		isim=isim.substring(0, 1).toUpperCase()+isim.substring(1).replaceAll("\\w", "*"); 
		soyisim=soyisim.substring(0, 1).toUpperCase()+isim.substring(1).replaceAll("\\w", "*");
		
		return isim+" "+soyisim;
		  
		  
		// TODO Auto-generated method stub
		
	}

	public static String acikIsim(String isim, String soyisim) {
		
		isim=isim.substring(0, 1).toUpperCase()+isim.substring(1).toLowerCase();
		soyisim=soyisim.substring(0, 1).toUpperCase()+isim.substring(1).toLowerCase();
		return isim+" "+ soyisim ;
		
		
	}

}
