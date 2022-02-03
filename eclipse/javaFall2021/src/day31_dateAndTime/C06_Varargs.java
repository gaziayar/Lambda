package day31_dateAndTime;

public class C06_Varargs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int a=10;
     int b=20;
     int c=30;
     int d=40;
     int e=50;
     int f=60;
	
    topla(a,b);
	topla(a,b,c);
	topla(a,b,c,d);
	topla(a,b,c,d,e);
	topla(a,b,c,d,e,f);
	}

	private static void topla(int... a) {
		// TODO Auto-generated method stub
		System.out.println("varargs calisir");
	
	
	
	}

	private static void topla(int a, int b, int c) {
		// TODO Auto-generated method stub
		System.out.println("uc sayinin toplami:"+(a+b+c));
	
	}

	private static void topla(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("iki sayinin toplami:"+(a+b));
	}

}
