package day48_maps_TheEND;

import java.security.KeyStore.Entry;
import java.util.Map;
import java.util.Set;

public class C03_MapMethodlari {

	public static void main(String[] args) {
		Map<Integer,String> ornek= MapOlustur.myMap();

		System.out.println(ornek.containsKey(110));
        System.out.println(ornek.containsValue("JAVA"));
        System.out.println(ornek.containsValue("Ali, Kan, java"));
	
	// Set<Entry<Integer,String>> entrySet = ornek.entrySet();
	ornek.putIfAbsent(103, "Ali, Yan, C#");
	ornek.putIfAbsent(110, "Fikri, Yan, C#");
	
	System.out.println();
	
	}

}
