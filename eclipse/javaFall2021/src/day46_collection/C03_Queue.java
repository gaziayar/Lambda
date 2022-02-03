package day46_collection;

import java.util.LinkedList;
import java.util.Queue;

public class C03_Queue {

	public static void main(String[] args) {

		Queue<String> kuyruk = new LinkedList<>();

		kuyruk.add("Lutfullah");
		kuyruk.add("Mustafa");
		kuyruk.add("Ridvan");
		
		System.out.println(kuyruk);

		kuyruk.remove();
		System.out.println(kuyruk);
		
		kuyruk.remove();
		System.out.println(kuyruk);

	}

}
