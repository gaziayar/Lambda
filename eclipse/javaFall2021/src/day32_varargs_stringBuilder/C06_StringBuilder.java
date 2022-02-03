package day32_varargs_stringBuilder;

public class C06_StringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Ali Can";

		String str2 = new String("Ali Cem");

		StringBuilder sb = new StringBuilder("yasasin java");
        
		sb.append("!!!");
	
	System.out.println(sb);
	
	String sbBuyukHarf=sb.toString().toUpperCase();
	System.out.println(sb);
	
	
	}

}
