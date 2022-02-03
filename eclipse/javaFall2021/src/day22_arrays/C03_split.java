package day22_arrays;

import java.util.Arrays;

public class C03_split {

	public static void main(String[] args) {
		//"Java ogrendim,  #cok para ?kazandim.,"
		// cumlesinin kelimelerini, ozel karakterler ve noktalama isaretleri olmadan
		// harf sirasina gore yazdiralim
	
	
	String cumle="Java ogrendim,  #cok para ?kazandim., ";
	
	String kelimeler[]=cumle.split(" ");
	
	System.out.println(Arrays.toString(kelimeler));
	
	for (int i = 0; i < kelimeler.length; i++) {
		kelimeler[i]=kelimeler[i].replaceAll("\\W", "");
		
		System.out.println(kelimeler[i]);
	}
	
	System.out.println(Arrays.toString(kelimeler));
	
	Arrays.sort(kelimeler);
	
	System.out.println(Arrays.toString(kelimeler));
	
	for (int i = 0; i < kelimeler.length; i++) {
		if (kelimeler[i]!= ""){
			System.out.print(kelimeler[i] +" ");
		}
		
	}
	
	
	
	
	
	
	
	}

}
