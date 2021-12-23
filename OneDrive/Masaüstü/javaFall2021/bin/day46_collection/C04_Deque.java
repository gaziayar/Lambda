package day46_collection;

import java.util.Deque;
import java.util.LinkedList;

public class C04_Deque {

	public static void main(String[] args) {

		Deque<String> ciftBasli = new LinkedList<>();

		ciftBasli.add("Yildiz");
		ciftBasli.add("Ali");

		System.out.println(ciftBasli);
		
		ciftBasli.addLast("Emine");
		System.out.println(ciftBasli);
		
		
		ciftBasli.addFirst("Gazi");
		System.out.println(ciftBasli.pop());
		System.out.println(ciftBasli);
		ciftBasli.push("Seyfi");
	
	System.out.println(ciftBasli);
	ciftBasli.add(null);
	System.out.println(ciftBasli);
	ciftBasli.addFirst(null);
	System.out.println(ciftBasli);
	
	}

}
