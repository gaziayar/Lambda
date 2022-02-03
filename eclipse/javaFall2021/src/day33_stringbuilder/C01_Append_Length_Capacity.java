package day33_stringbuilder;

public class C01_Append_Length_Capacity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuilder sb = new StringBuilder();
		StringBuilder sb2 = new StringBuilder("java candir");
		System.out.println(sb2.length()); // kullanilan kisim
		System.out.println(sb2.capacity()); // kapasitesi

		System.out.println(sb.length()); // kullanilan kisim
		System.out.println(sb.capacity());

		StringBuilder sb3 = new StringBuilder(7);
		System.out.println("mahlika");

		System.out.println(sb3.length()); // kullanilan kisim
		System.out.println(sb3.capacity()); // kapasitesi

		StringBuilder sb4 = new StringBuilder(7);
		System.out.println(sb4.length()); // kullanilan kisim
		System.out.println(sb4.capacity());
		sb4.append("nilgun");
		System.out.println(sb4.length()); // kullanilan kisim
		System.out.println(sb4.capacity());

		sb4.append("candir");
		System.out.println(sb4.length()); // kullanilan kisim
		System.out.println(sb4.capacity());

		sb.append("  java");
		System.out.println(sb);

		sb.append("   candir");
		System.out.println(sb);

	}

}
