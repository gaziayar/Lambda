package day06;

import java.util.Scanner;

public class C5_IfStatement5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan= new Scanner( System.in);
	
	System.out.println(" bir dikdortgenin iki kenar uzunlugunu girin ");
	
	double kenar1=scan.nextDouble();
	double kenar2=scan.nextDouble();
	
	if (kenar1>0 && kenar2>0 && kenar1==kenar2)  
	{System.out.println("kare");}
	
	if(kenar1>0 && kenar2>0 && kenar1!=kenar2)
	{ System.out.println("Dikdortgen");}
	
	
	
	if(kenar1<=0 || kenar2<=0) {
		System.out.println("lutfen gecerli uzunluk giriniz ");
	}
	
	}
  
}
