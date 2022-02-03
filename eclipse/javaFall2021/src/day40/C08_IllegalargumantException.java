package day40;

import java.util.Scanner;

public class C08_IllegalargumantException {

	public static void main(String[] args) throws IllegalAccessException  {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		System.out.println("lutfen yasinizi giriniz");
	int yas =scan.nextInt();
	
	
	try {
		if (yas<0) {
			throw new IllegalAccessException();
		}
	} catch (IllegalArgumentException e) {
		
		System.out.println("yas sifirdan kucuk olamaz");
	
	}
	
	
	}

}
