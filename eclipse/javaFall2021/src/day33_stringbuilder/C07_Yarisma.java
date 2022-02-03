package day33_stringbuilder;

public class C07_Yarisma {

	public static void main(String[] args) {

		// For loop ile 1000 defa bir islem yapalim.
		// Oncesinde ve sonrasinda zamani kontrol edip
		// StringBuilder ve String class’larinin performanslarini karsilastiralim.
		// Ipucu: long TimeSb = System.nanoTime(); kullanalim

		String str = "merhaba";
		StringBuilder sb = new StringBuilder("merhaba");

		sb.trimToSize();

		long time1 = System.nanoTime();

		for (int i = 0; i < 1000; i++) {
			str += " ";

		}

		long time2 = System.nanoTime();
		long StringSure = time2 - time1;

		
		long time3 = System.nanoTime();

		for (int i = 0; i < 1000; i++) {
			sb.append(" ");

		}

		long time4 = System.nanoTime();
		long sbSure = time4 - time3;
		
		if (sbSure>StringSure) {
			System.out.println("string daha hizli");
		} else {
			System.out.println("stringbuilder daha hizli");
		}
		System.out.println("sb: " +sbSure);
		System.out.println("str:" +StringSure);

	
	}
	

}
