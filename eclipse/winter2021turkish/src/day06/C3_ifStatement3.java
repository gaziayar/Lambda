package day06;

import java.util.Scanner;

public class C3_ifStatement3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	Scanner scan =new Scanner (System.in);
	
	System.out.println("lutfen gun isminin ilk harfini yaziniz");
	
	
	
	char ilkHarf=scan.next().charAt(0);
	
	if (ilkHarf=='p'||ilkHarf=='p') {
		
		
		System.out.println(" pazar pazartesi veya persembe");
	}
	if (ilkHarf=='s'||ilkHarf=='s') {
		
		
	System.out.println("sali");
	
	}
	if (ilkHarf=='c'||ilkHarf=='c') {
	System.out.println(" carsamba cuma veya cumartesi");	
		
}	
	
	if (ilkHarf!='p'&&ilkHarf!='P'&& ilkHarf!='s' && ilkHarf!='S' && ilkHarf!='c'&& ilkHarf!='C') {
		
		System.out.println("lutfen gecerli bir harf yaziniz");}
	
	
	
	
	
	
	
	}
	}
