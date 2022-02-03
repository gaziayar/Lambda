package _13_stringBuilder;

import java.util.Scanner;

public class Q01 {
	public static void main(String[] args) {
		/*
		 * Bir cumleyi parameter olarak kabul eden, StringBuilder kullanarak cumleyi
		 * ters çeviren ve cümlenin palindrom olup olmadigini kontrol eden
		 * (buyuk/kucukk harf duyarlılığı olmadan) bir Java programı yazın.
		 * (without case sensitivity) Eg : input : I love Java Output: "Reversed
		 * sentence : avaJ evol I It is not a palindrome"
		 * 
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("bir metin giriniz:");

		String metin = scan.nextLine();

		StringBuilder sb = new StringBuilder(metin);

		String tersMetin = sb.reverse().toString();

		if (tersMetin.equalsIgnoreCase(tersMetin)) {
			System.out.println("girilen metin polindrom ifadedir: " + tersMetin);
		} else
			System.out.println("girilen metin polindrom  degildir: " + tersMetin);

	}

}
