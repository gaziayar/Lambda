package day08_ifElseifnestedif;

import java.util.Scanner;

public class C2_Nestedif {

	public static void main(String[] args) {
		
	
	String cinsiyet= "kadin";
	int yas=59;
	if(yas<0) {System.out.println("yas negatif olamaz");}

	
	else if (cinsiyet.equalsIgnoreCase("erkek") && yas >=65)
			{ System.out.println("Emekli olabilirsin");}
	else if(cinsiyet.equalsIgnoreCase("erkek") && yas<65) 
	      {System.out.println( "emekli olamazsin");}
	else if (cinsiyet.equalsIgnoreCase("kadin") && yas >=60)
	      {System.out.println("Emekli olabilirsin");}
	else if(cinsiyet.equalsIgnoreCase("kadin") && yas<60)
	     {System.out.println("emekli olamazsin");}
	else System.out.println("Cinsiyet veya yas tanimsiz");
	
	
	System.out.println("Nested if ile sonuc");
	
	
	if(cinsiyet.equalsIgnoreCase("erkek")) {
		if (yas<0) 
		{System.out.println("yas negatif olamaz");}
		
		else if(yas<65) 
		{System.out.println("emekli olamazsin");}
		else 
		{System.out.println("emekli olabilirsin");}
		
	} else if (cinsiyet.equalsIgnoreCase("kadin"))
		if (yas<0) {
		System.out.println("yas negatif olamaz");}
	 else if(yas<60) {System.out.println("bu yastaki kadin emekli olamaz");}
	
	else {System.out.println("bu yastaki kadin emekli olabilir");} 
	
	else { System.out.println("yazdiginiz cinsiyet sisteme kayitli degil"); 

	}
	
	}
}
	
	
	
	
	








