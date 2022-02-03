package _for_while;

public class C04 {

	public static void main(String[] args) {
		/*
		Girdi olarak bir tamsayı kabul eden ve faktöriyel hesaplayan programi yazıniz.

		Input : 6

		Output: 6!=65432*1=720
	*/
	int sayi=6;
	
	int toplam=1;
	
	for (int i = 1; i <= 6; i++) {
		
		toplam*=i;
		
		
	}
	
	System.out.println("6!=6*5*4*3*2*1="+ toplam);
	
	}

}
