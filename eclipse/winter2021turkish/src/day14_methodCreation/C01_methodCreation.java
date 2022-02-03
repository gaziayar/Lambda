package day14_methodCreation;

public class C01_methodCreation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	// verilen iki sayinin top.ve carp.ni yapip yazdiran iki ayri method olust.
	//m.olustmak icin 3 adim 
	// 1. adim 
	//2. adim methoda a arguman yazacak miyiz
	int sayi1=4;
	int sayi2=5;
	carpma(sayi1,sayi2);
	
	topalama(sayi1,sayi2); //method call
	
	//3.adim 1.ve 2.adimi yaptiktsan sonra javadan yardim alip methodu olustururuz
	
	carpma(sayi1,sayi2);
	
	
	
	
	
	}

	public static void carpma(int sayi1, int sayi2) {
		System.out.println("sayilarin carpimi :"+(sayi1*sayi2));
		
	}

	public static void topalama(int sayi1, int sayi2) {
		// 4. adim erisim  duzenleyici ve return type a karar vermeliyiz
	// bizden sadece yazdirma istedigi icin void 
		
		System.out.println(" sayilarin toplami:"+(sayi1+sayi2) );
	}

}
