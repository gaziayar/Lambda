package day13_;

import java.util.Scanner;

public class C01_StartsWith_EndWiths {

	public static void main(String[] args) {
		
     // kullanicidan bir cum ve bir kel alalim

	// verlen kel ile baslayip baslamadigini ve bitip bitmedigini yazdiralim
	
		Scanner scan=new Scanner(System.in);
        System.out.println("cumle gir");
        String cumle=scan.nextLine();
        System.out.println("kelmi gir");
        String kelime=scan.next();
        

if (cumle.startsWith(kelime)) {
	System.out.println("girilen cumle " + kelime + " ile basliyor ");
 } else {
	System.out.println("girilen cumle " + kelime + " ile baslamiyor");
  }
	if (cumle.endsWith(kelime)) {
		System.out.println("girilen cumle " + kelime + " ile bitiyor");
	} else {
		System.out.println("girilen cumle " + kelime + " ile bitmiyor");
	}	 
	
	scan.close();
	
	}

}
