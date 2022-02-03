package _07_ForLoop;

public class swap {

	public static void main(String[] args) {
		/*
		 * Verilen iki degerin degerlerini degistiriniz. Mulakat Sorusu(Swap)
		 * 
		 * int a= 3;
		 * 
		 * int b= 5;
		 * 
		 * Ornek Cikti:
		 * 
		 * a=5
		 * 
		 * b=3
		 */

		int a = 3;

		int b = 5;

		System.out.println("baslangicta a=" + a + " ve b=" + b);

		int bos;
		bos = b;
		b = a;
		a = bos;

		System.out.println("sonucta a=" + a + " ve b=" + b);

	}

}
