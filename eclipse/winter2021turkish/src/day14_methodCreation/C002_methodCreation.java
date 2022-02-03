package day14_methodCreation;

import java.util.Scanner;

public class C002_methodCreation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner scan=new Scanner(System.in);
		
		System.out.println("lutfen toplamak istediginiz sayi adedini 2,3 veya 4 den biri olarak giriniz:");
		
	int tercih=scan.nextInt();
	if (tercih>4)
	{tercih=5;
	}
	switch(tercih)	{
	case 2:
		ikiSayiTopla();
	break;
	
	case 3:
		ucSayiTopla();
	break;
		
	
	case 4:
		dortSayiTopla();
	break;
	case 5:
		System.out.println("cok sayi girdiniz , ben toplayamam ");
	break;
	default:
	
	System.out.println("gecersiz tercih");
	
	
	
	
	}
		
	}

	private static void ikiSayiTopla() {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
	
	
	
	
	
	}

}
