package day40;

public class C07_NumberFormatException{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "123a";
        int sayi=Integer.parseUnsignedInt(str)+4;
	
	System.out.println(sayi);
	}

}
