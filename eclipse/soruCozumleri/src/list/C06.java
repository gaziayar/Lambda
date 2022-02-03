package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C06 {

	public static void main(String[] args) {
		// iki boyutlu bir multidimensional arrayi input kabul edip arraydaki tum
		// elemanlari bir listreye
		// kopyalayan ve harf sirasina gore yazdiran bir metod yazin

		// input {{ali,veli,ayse},{hasan,can},{suzan}}

		// outpur [ali,ayse,can,hasan,suzan,veli]
		String isim[][] = { { "ali", "veli", "ayse" }, { "hasan", "can" }, { "suzan" } };

		yeniList(isim);
	}

	public static void yeniList(String[][] isim) {

		List<String> List1 = new ArrayList<>();

		for (int kat = 0; kat < isim.length; kat++) {
			for (int daire = 0; daire < isim[kat].length; daire++) {
				List1.add(isim[kat][daire]);
			}

		}
		System.out.println("ilk liste: " + List1);
		Collections.sort(List1);
		System.out.println("siralamadan sonraki  liste: " + List1);
	}
}
