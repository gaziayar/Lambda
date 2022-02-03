package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import _07_ForLoop.syso2;

public class C05 {

	public static void main(String[] args) {
		//Write a program that accepts an integer as input and prints first 10 prime numbers greater than input Check numbers if they are even or not in a return method.

			//	Input : 5

		List<Integer> asalSayilar = new ArrayList<>();
       
		
		
		int sayi = 2;
        int sayac = 0;
        while (sayi<100) {

            for (int i =5; i <=sayi; i++) {

                if (sayi % i == 0) {
                    sayac++;
                }
            }

            if (sayac == 1) {
                asalSayilar.add(sayi);
            }

            sayi++;
            sayac = 0;
        }
        System.out.println(asalSayilar);
        System.out.println("100'e kadar olan asal sayilar ");
		
		}
		}
	

