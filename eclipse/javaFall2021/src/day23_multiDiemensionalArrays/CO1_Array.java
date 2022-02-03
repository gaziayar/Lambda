package day23_multiDiemensionalArrays;

import java.util.Arrays;

public class CO1_Array {

	public static void main(String[] args) {
		// Verilen bir array'den istenen degere sahip elementleri silip
		// kalani yeni bir array olarak kaydedin
		// ve sonra yeni array'i yazdirin

		int arr[] = { 3, 4, 5, 6, 3, 5 };

		int silinecekEleman = 3;

		int sayac = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == silinecekEleman) {
				sayac++;
			}
		}
		System.out.println(sayac);
		int yeniArrayUzunluk = arr.length-sayac;

		int yeniArr[] = new int[yeniArrayUzunluk];
		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != silinecekEleman) {
				yeniArr[j] = arr[i];
				j++;
			}
		}
		System.out.println(Arrays.toString(yeniArr));
	}

}
