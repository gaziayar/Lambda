package day10;

import java.util.Scanner;

public class C05_NestedTernary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
     char cinsiyet='E';
	int yas=71;
	
	String sonuc=cinsiyet=='K'?(yas>60?"emekli olabilirsin":"emekli olamazsin"):
	             (yas>=65?"emekli olabilirsin":"emekli olamazsin");
	
	System.out.println(sonuc);
	
	
	
	
	
	
	
	
	}

}
