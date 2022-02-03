package day33_stringbuilder;

public class C04_Insert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	StringBuilder sb=new StringBuilder("java ogrendik");
	
	
	sb.insert(4, "yi cok iyi");
	
	System.out.println(sb);
	
	// sonuna yasasin ekleyelim
	String str2="cok iyiyim";
	sb.insert(7, str2, 0,4);
	
	
	System.out.println(sb);
	
	
	
	
	
	
	
	
	}

}
