package day29staticblock_passByValue;

import java.util.ArrayList;
import java.util.List;

public class C04_PasstByValueList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// bir list olst.

		// sonra list elemanlarini degistir methodu yazip list elemanlarindan bazilarini
		// degistirelim
		// method void olsun
		// main method a dondukten sonra yeniden list i yazdiralim
		List<String> harfler = new ArrayList<>();

		harfler.add("A");

		harfler.add("B");

		harfler.add("C");
		// java da list ve array gibi objeler icinde passby value gecerlidir
		// yani farkli bir method da array veya list e yeni deger atamasi yaparsaniz
		// orjinal array veya list degismez
		
		listElemanlarDegistir(harfler);
		System.out.println("method a donunce  list: " + harfler);
		listDegistir(harfler);// method a yeni deger atadigim halde harfler listesi degismedi

		System.out.println("list e yeni list atadiktan sonra main method a donunce list:" + harfler);

	}

	private static void listDegistir(List<String> harfler) {
		harfler = new ArrayList<>();
		System.out.println("list e yeni deger atayinca:" + harfler);

	}

	private static void listElemanlarDegistir(List<String> harfler) {

		harfler.set(0, "D");
		System.out.println("method da degistirdigimiz list: " + harfler);

	}

}
