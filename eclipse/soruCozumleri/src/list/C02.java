package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C02 {

	public static void main(String[] args) {

		// 10 elemanlı bir liste oluşturun. 8. öğeyi 3. öğeyle değiştirin.
		// GİRİŞ : Dizgi[]
		// isimler={"Ümit","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"};

		// Çıktı:

		// [Ümit,Emin,Furkan,Kerem,Taylan,Orhan,Sinan,Kemal,Ahmet,Ali]
		String arr[] = { "Umit", "Emin", "Kemal", "Kerem", "Taylan", "Orhan", "Sinan", "Furkan", "Ahmet", "Ali" };
		List<String> isimler = Arrays.asList(arr);

		System.out.println("ilk hali : " + isimler);
		String eleman3 = isimler.get(2);
		String eleman8 = isimler.get(7);

		isimler.set(2, eleman8);
		isimler.set(7, eleman3);

		System.out.println("3. ve 8. eleman yer degismis hali : " + isimler);

	}

}
