package day08_ifElseifnestedif;

import java.util.Scanner;

public class C4_Nestedif4 {

	public static void main(String[] args) {
		

		Scanner scan= new Scanner (System .in );
	
	System.out.println("lutfen bir sifrenizi yazin");
	char ilkHarf= scan.next().charAt(0);
	
	if (ilkHarf>='A' &&  ilkHarf<='Z') {
		if (ilkHarf=='A') {System.out.println("sifre gecerli");
			
		} else {System.out.println("sifre gecersiz");

		}
		
		
		
		
	} else if(ilkHarf>='a' && ilkHarf<='z'){

		if (ilkHarf=='z') {System.out.println("sife gecerli");
			
		} else {System.out.println("sifre gecersiz");

		}
		
		
		
	} else { System.out.println("sifre gecersiz");
	
	
	
	}
	
	}

}
