package day07_ifelsestetament;

import java.util.Scanner;

public class C4_ifElse3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner scan= new Scanner (System .in );
		
		System.out.println(" lutfen yasinizi  giriniz");
		
		int  yas=scan.nextInt();
		
		if (yas >=65 ) {System.out.println(" emekli olabilirsin ");
			
		} else {System.out.println(" emekli olamazsin");

		}
		scan.close();
	}

}
