package day02;

import java.util.Scanner;

public class Q_3 {

	public static void main(String[] args) {
		 /*
        *  Kullanicidan boyunu  CM  ve kilosunu kg alarak  BMI (VKE) hesaplayiniz
        *
       BMI = kilo(kg) /(boy*boy)(cm)
       BMI <=20 oldukca zayifsiniz
       20<BMI<=25 Normal sinirlardasiniz 
       25<BMI<=30 Sisman kategorisindesiniz
       30<BMI ==> Obez grubundasiniz.
       
        */

		 Scanner scan= new Scanner (System .in );
			
		    System.out.print("LUTFEN BOYUNUZU  GIRINIZ  :");
		double boy=scan.nextDouble();
		System.out.print("LUTFEN KILONUZU  GIRINIZ  :");
		double kilo=scan.nextDouble();
	
	double bmi=kilo/(boy/100*boy/100);
	
	if(bmi<=20) {
		System.out.print("OLDUKCA ZAYIFSINIZ");
	}
	
	else if(20<bmi&&bmi<=25) {
		System.out.print("NORMAL SINIRDASINIZ");
	}
	else if(25<bmi&&bmi<=30){
		System.out.print("SISMAN KATAGORIDESINIZ");
	}
	else if(30<bmi) {
		System.out.print("OBEZ KATAGORIDESINIZ");
	}
	
	}

}


