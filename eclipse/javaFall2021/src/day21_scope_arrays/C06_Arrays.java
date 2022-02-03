package day21_scope_arrays;

import java.util.Arrays;

public class C06_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int arr[]= {3,5,8,5,2,4,};
	
	int toplam=0;
	for (int i = 0; i < arr.length; i++) {
		
toplam+=arr[i];


	
	}
	System.out.println("elementlerin  toplami:" + toplam);
	// kucukten buyuge dogru yazdir
	Arrays.sort(arr);
	System.out.println(Arrays.toString(arr));
	
	
	//buyukten kucuge dogru
	
	for (int i = arr.length-1; i > 0; i--) {
		System.out.print(arr[i]+" ");
	}
	// ters array yapmak icin
	
	int tersArray[]=new int [arr.length];
	
	for (int i = 0; i < tersArray.length; i++) {
		tersArray[i]=arr[arr.length-1 -i];
	}
	
	
	
	System.out.print(Arrays.toString(tersArray));
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
