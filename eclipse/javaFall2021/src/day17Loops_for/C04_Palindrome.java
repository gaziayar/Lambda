package day17Loops_for;

import java.util.Scanner;

public class C04_Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	

		Scanner scan =new Scanner (System .in);
		System.out.println(" lutfen tersine cevirmek icin bir yazi girin:  ");
		String str=scan.nextLine();
		//System.out.println(tersineCevir(str));
		
		if (str.equals(tersineCevir(str))) {
			System.out.println("girdiginiz sitrin palindrome");
		} else {
			System.out.println("girdiginiz sitrin palindrome degil");
		}

	}

	public static String tersineCevir(String str) {
		String tersStr="";
		for (int i = str.length()-1; i >=0; i--) {
			tersStr+=str.substring(i,i+1);
		}	
		return tersStr;
		
		
		
		
		
		
	
	
	}

}
