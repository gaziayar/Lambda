package day33_stringbuilder;

public class C06_SubSquence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuilder sb=new StringBuilder("java ne kadar kolay");
		
		sb.substring(14);
		
		System.out.println(sb.substring(14));
		
		System.out.println(sb.subSequence(14, 19));
		
		
		
	}

}
