package day09_ternary;

public class Q_01 {

	public static void main(String[] args) {
		// Verilen 12345 sayisinin rakamlarini 
	
	// yukaridan asagi dogtru yazin
	
	int sayi=12345;
	int birler= sayi%10;
	int onlar=(sayi/10)%10;
	int yuzler=(sayi/100)%10;
	int binler=(sayi/1000)%10;
	int onBinler=(sayi/10000)%10;
	
	System.out.println(onBinler);
	System.out.println(binler);
	System.out.println(yuzler);
	System.out.println(onlar);
	System.out.println(birler);

	
	}
}
