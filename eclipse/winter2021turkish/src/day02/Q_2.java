package day02;

import java.util.Scanner;

public class Q_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
         * Kullanicidan alacaginiz iki sayiyi yine kullaniciya sectireceginiz
         *  dort islemden biri ile isleme koyup sonucun yazdiriniz
         */
	

	      Scanner scan= new Scanner (System .in );
			
	    System.out.print("LUTFEN IKI SAYI GIRINIZ  :");
	
	double sayi1=scan.nextDouble();
	
	double sayi2=scan.nextDouble();

	System.out.println("toplama icin 1 \n cikarma icin 2\n carpma icin3\n bolme icin 4");
	
	int islem= scan.nextInt();
	
	if(islem==1) {
	System.out.println("girdiginiz sayilarin toplami" + (sayi1 +sayi2));
	
	}

	else if (islem==2) {
		System.out.println("girdiginiz sayilarin farki" + (sayi1 -sayi2));
	}
	else if (islem==3) {
		System.out.println("girdiginiz sayilarin caarpimi" + (sayi1 *sayi2));
	}
	
	else if (islem==4) {
		System.out.println("girdiginiz sayilarin orani" + (sayi1 /sayi2));
	}
	else {
		System.out.println("hatali giris");
	}
	}
}
