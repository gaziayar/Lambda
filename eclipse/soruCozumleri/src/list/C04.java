package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C04 {

	public static void main(String[] args) {
		/*
		 * Write a program that deletes the letters 'a' from the names in the list given
		 * as input.
		 * 
		 * INPUT : list1={"Ali","Veli","Ayse","Fatma","Omer"}
		 * 
		 * OUTPUT :
		 * 
		 * [Veli,Omer]
		 */
		List<String> list = new ArrayList<>(Arrays.asList("Ali", "Veli", "Fatma", "Omer", "Ayse"));

		List<String> list1 = new ArrayList<>();

		for (String b : list) {
			if (!b.toLowerCase().contains("a")) {
				list1.add(b);
			}
		}

		System.out.println("a harfi icermeyen isimler: " + list1);

	}

}