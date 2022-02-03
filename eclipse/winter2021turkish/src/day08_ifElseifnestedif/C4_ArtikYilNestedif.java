package day08_ifElseifnestedif;

import java.util.Scanner;

public class C4_ArtikYilNestedif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan= new Scanner (System .in );
	System.out.println("lutfen yil yaziniz");
		int yil=scan.nextInt();
		if (yil%100==0) {
	     if (yil%400==0) {System.out.println("artik yil");
	     } else {System.out.println("artik yil degil");
	     }

		 
	
	if (yil%4==0) {System.out.println("artik yil");} else 
	{System.out.println("artik yil degil");}
	}
	
	}
	}	

	