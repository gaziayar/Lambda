package day07_ifelsestetament;

import java.util.Scanner;

public class C5_ifElse4 {
   public static void main(String[] args) {
	
	   
	   Scanner scan= new Scanner (System .in );
		
		System.out.println(" lutfen ucgenin kenar uzunlugunu  giriniz");  
	   
	   
	 double kenar1= scan.nextDouble();  
	
	 double kenar2= scan.nextDouble();
	 double kenar3= scan.nextDouble();
	 
	if (kenar1==kenar2&&kenar2==kenar3) {System.out.println(" eskenar");
		
	} else {System.out.println("eskenar degil");

	} 
     scan.close();
   
   }
   
 
}
