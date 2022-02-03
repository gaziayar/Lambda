package day33_stringbuilder;

public class C02_Delete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuilder sb = new StringBuilder("java candir can");

		sb.deleteCharAt(11); // sadece 11 deki karakteri siler

		System.out.println(sb); // java candircan

		sb.delete(11, 13);

		System.out.println(sb);

		sb.delete(11, sb.length());
		System.out.println(sb);
		System.out.println(sb.capacity());
		sb.delete(5, 20);
		System.out.println(sb);
		System.out.println(sb.capacity());
	}

}
