package day40;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C03_exception {
//InputMismatchException ArrayIndexOutOfBoundsException

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 2, 3, 5, 6, 2, 7, 9, 1 };
		try {

			Scanner scan = new Scanner(System.in);

			System.out.println("lutfen elementi yazdirmak icin index giriniz");
			int index = scan.nextInt();
			System.out.println("girdiginiz indexdeki element:" + arr[index]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("girdiginiz index arrayde yok");

		} catch (InputMismatchException e) {
			System.out.println("girdiginiz index pozitf tam sayi olmali ");
		}
	}

}
