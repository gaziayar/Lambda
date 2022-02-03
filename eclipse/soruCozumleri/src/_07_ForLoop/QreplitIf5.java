package _07_ForLoop;

import java.util.Scanner;

public class QreplitIf5 {

	public static void main(String[] args) {
		/*
		 * Bir aydaki gün sayısını hesaplayan bir Java programı yazınız.
		 * 
		 * INPUT:
		 * 
		 * Ay Numarasi:
		 * 
		 * 2
		 * 
		 * Yil :
		 * 
		 * 2016
		 * 
		 * OUTPUT :
		 * 
		 * Subat 2016 29 Gundur.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen  ay numarasini girin: ");

		int ay = scan.nextInt();

		System.out.println("lutfen bir yil girin: ");

		int yil = scan.nextInt();

		switch (ay) {
		case 1:
System.out.println("ocak " + yil +" 31 gundur");
			break;
		case 2:
if (yil%4==0) {
	System.out.println("subat " + yil +" 29 gundur");
}else{
	System.out.println("subat " + yil +" 28 gundur");
}
			break;

		case 3:
			System.out.println("mart " + yil +" 31 gundur");
			break;

		case 4:
			System.out.println("nisan " + yil +" 30 gundur");
			break;

		case 5:
			System.out.println("mayis " + yil +" 31 gundur");
			break;

		case 6:
			System.out.println("haziran " + yil +" 30 gundur");
			break;
		case 7:
			System.out.println("temmuz " + yil +" 31 gundur");
			break;

		case 8:
			System.out.println(" agustos " + yil +" 31 gundur");
			break;

		case 9:
			System.out.println(" eylul " + yil +" 30 gundur ");
			break;

		case 10:
			System.out.println("ekim " + yil +" 31 gundur ");
			break;

		case 11:
			System.out.println("kasim " + yil +" 30 gundur ");
			break;
		case 12:
			System.out.println("aralik " + yil +" 31 gundur");
			break;

		default:
			break;
		}
scan.close();
	}

}
