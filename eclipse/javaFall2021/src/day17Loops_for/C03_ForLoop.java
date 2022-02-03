package day17Loops_for;

import java.util.Scanner;

public class C03_ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		Scanner scan =new Scanner (System .in);
		System.out.println(" lutfen tersine cevirmek icin bir yazi girin:  ");
		String str=scan.nextLine();
		System.out.println(tersineCevir(str));
	}

	public static String tersineCevir(String str) {
		String tersStr="";
		for (int i = str.length()-1; i >=0; i--) {
			tersStr+=str.substring(i,i+1);
		}	
		return tersStr;
		
		
		
		
		
		
		
		
	}

}
