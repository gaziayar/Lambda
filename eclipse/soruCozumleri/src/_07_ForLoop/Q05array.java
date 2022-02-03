package _07_ForLoop;

public class Q05array {

	public static void main(String[] args) {
		//Write a java program that calculates the average value of array elements

		//input[]= {1,2,3,4,5,6,7}

		//Output : 4
		
	int rakam[]= {1,2,3,4,5,6,7};
	int toplam=0;
	int ortalama=0;
	
	for (int i = 0; i <=rakam.length; i++) {
		
	toplam+=i;
		
		ortalama=toplam/7;
	}
	
	System.out.println(ortalama);
	
	}

}
