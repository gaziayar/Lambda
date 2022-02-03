package day07_ifelsestetament;

import java.util.Scanner;

public class C2_ifElse1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner scan =new Scanner (System .in);
	
	System.out.println(" lutfen dikdortgenin  kenar uzunlugu girin");
	
	double  kenar1= scan.nextDouble();
	
	double  kenar2= scan.nextDouble();
	
	if (kenar1==kenar2) {System.out.println("kare");
		
	} else {System.out.println("kare degil");

	}
	
	scan.close();
	}

}
