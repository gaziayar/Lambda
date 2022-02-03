package day09_ternary;

import java.util.Scanner;

public class Q_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		
		
		

		Scanner scan= new Scanner(System.in);
           
		
		System.out.print("Adinizi girin:");
		String  name= scan.nextLine();
		
	System.out.print("Soyadinizi girin:");
	
	String  surName= scan.nextLine();
	
	System.out.print("Yasinizi girin:");
	int yas= scan.nextInt();
	
	
	System.out.print("Boyunuzu girin");
	double boy= scan.nextDouble();
	System.out.print("kilonuzu girin");
	int kilo=scan.nextInt();
	
	System.out.println("benim adim:"+ name +"\n"
	        +"soyadim:"+surName+"\n"
			+"yasim:"+yas+"\n"
	        +"boyum:"+boy+"\n"
			+"kilom:"+ kilo+"\n");
	
	
	
	}

}
