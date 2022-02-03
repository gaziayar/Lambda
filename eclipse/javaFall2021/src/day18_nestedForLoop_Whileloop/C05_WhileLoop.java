package day18_nestedForLoop_Whileloop;

public class C05_WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	
	for (int i = 100; i < 1000; i++) {
		
		
		
		if (i%15==0 && i%20==0 && i%90==0) {
		System.out.println(i);	
		}
	}
	
	int sayi=100;
	while (sayi<1000) {
		if (sayi%15==0 && sayi%20==0 && sayi%90==0) {
			System.out.println(sayi);
			
		}
		sayi++;
	
	}
	}

}
