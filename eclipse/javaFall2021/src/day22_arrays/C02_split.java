package day22_arrays;

import java.util.Arrays;

public class C02_split {

	public static void main(String[] args) {
		// java ogrenmek cok guzel cum kelimelerini ters sirada yazdirun

		
		String  cumle = "java ogrenmek cok guzel";
		
		String kelimeler[]=cumle.split(" ");
		
		System.out.println(Arrays.toString(kelimeler));
		
		
		for (int i = kelimeler.length-1; i >=0; i--) {
		
			System.out.print(kelimeler[i] + " ");
			
			
			
		}
	
}

}
