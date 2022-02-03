package _07_ForLoop;

import java.util.Arrays;

public class Q08Array {

	public static void main(String[] args) {
		// Write a return method that accepts 2 integer Arrays as parameters And adds 2
		// array into a new Array and prints it.

//Input1={1,2,3,4}

//Input2={5,6}

//Output={1,2,3,4,5,6}

		int arr1[] = { 1, 2, 3, 4 };
		int arr2[] = { 5, 6 };

      int birlestir[]= birlesikArray(arr1,arr2);

		birlesikArray(arr1, arr2);
    System.out.println(Arrays.toString(birlestir));
	}

	private static int[] birlesikArray(int[] arr1, int[] arr2) {

	int birlestir[] =new int [arr1.length + arr2.length];
	
	for (int i = 0; i < arr1.length; i++) {
		birlestir[i]=arr1[i];
	}
	for (int i = 0; i < arr2.length; i++) {
		birlestir[i+arr1.length]=arr2[i];
	}
	return birlestir;
	
	
	}

}
