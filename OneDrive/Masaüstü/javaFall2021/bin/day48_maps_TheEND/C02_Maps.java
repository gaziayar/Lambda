package day48_maps_TheEND;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class C02_Maps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer, String> soruMap = MapOlustur.myMap();

		String istenendil = "java";

		System.out.println(dilBilenListesiOlustur(soruMap, istenendil));

	}

	private static List<String> dilBilenListesiOlustur(Map<Integer, String> soruMap, String istenendil) {

		List<String> dilBilenListesi = new ArrayList<>();

		List<String> valueList = new ArrayList<>(soruMap.values());

		

		String parcaliArr[] = new String[3];

		for (String each : valueList) {
			parcaliArr = each.split(", ");
			if (parcaliArr[2].equalsIgnoreCase(istenendil)) {
				dilBilenListesi.add(parcaliArr[0]);
			}

		}

		return dilBilenListesi;

	}

}
