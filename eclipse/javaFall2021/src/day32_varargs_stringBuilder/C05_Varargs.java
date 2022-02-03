package day32_varargs_stringBuilder;

public class C05_Varargs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		topla(5,10,13,0);
	
	
	}

	private static void topla(int...sayilar) {
		// TODO Auto-generated method stub
	int toplam=0;
		
		for (int each : sayilar) {
			toplam+=each;
		}
	System.out.println("girilen sayilarin toplami:"+toplam);
	
	
	}

}
