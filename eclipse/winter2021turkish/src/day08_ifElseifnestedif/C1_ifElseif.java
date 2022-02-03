package day08_ifElseifnestedif;

import java.util.Scanner;

public class C1_ifElseif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner scan= new Scanner (System .in );
		
		System.out.println(" lutfen gun ismini   giriniz");
	
   String gunIsmi= scan.nextLine().toLowerCase();
	
   if (gunIsmi.equalsIgnoreCase("pazar") || gunIsmi.equalsIgnoreCase("pazartesi")) {
	System.out.println("Paz");
   } else if (gunIsmi.equalsIgnoreCase("Sali")) 
   { System.out.println("Sal");}
   else if (gunIsmi.equalsIgnoreCase("carsamba"))
   { System.out.println("Car");}
   else if (gunIsmi.equalsIgnoreCase("persembe")) 
   {  System.out.println("per");}
   else if(gunIsmi.equalsIgnoreCase("cuma")|| gunIsmi.equalsIgnoreCase("cumartesi")) {
		    System.out.println( "Cum");}
	
   else { System.out.println("lutfen gecerli bir gun ismi giriniz");}
  scan.close();
	}
}
	


