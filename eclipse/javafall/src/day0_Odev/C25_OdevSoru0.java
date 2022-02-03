package day0_Odev;

import java.util.Scanner;

public class C25_OdevSoru0 {

	public static void main(String[] args) {
		//  Kullanicidan 3 Numara isteyiniz ve bu numaralarin en buyuk ve 
	    //en kucuk olanlarini konsola yazdiriniz
	  //  int num1 
	 //   int num2 
	 //   int num3
	
	Scanner scan = new Scanner(System.in);
	System.out.println("lutfen 3  numara  giriniz");
	int num1= scan.nextInt();
	int num2= scan.nextInt();
	int num3=scan.nextInt();
	
	System.out.println("buyuk sayi : " + 
	                       (num1>num2 && num1>num3 ? num1:(num2>num1 && num2>num3?num2:num3))
	
	 + "\nkucuk sayi : " + (num1<num2 && num1<num3 ? num1:(num2<num1 && num2<num3?num2:num3)));
	
	
	
	}
	
	}


