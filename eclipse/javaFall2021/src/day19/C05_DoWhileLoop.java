package day19;

public class C05_DoWhileLoop {

	public static void main(String[] args) {
		// m harfinden baslayarak c harfine kadar yazdirin

	
	for (char i = 'm'; i >'c' ; i--) {
		System.out.print(i +" ");
	}
	System.out.println(" ");
	char krk='m';
	
	while (krk>'c') {
		System.out.print(krk +" ");
		
		krk--;
	}
	System.out.println(" ");
	
	char harf='m';
	do {System.out.print(harf +" ");
	
	harf--;	
	}
	while (harf>'c');
	
	
	
	}

}
