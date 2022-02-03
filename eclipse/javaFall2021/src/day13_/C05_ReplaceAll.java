package day13_;

public class C05_ReplaceAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String cumle= "java        cok          zevkli";
	
	cumle=cumle.replaceAll("\\s+"," ");
	System.out.println(cumle);
	
	System.out.println(cumle.replaceAll("[a-z]",""));//*********
	
	System.out.println(cumle.replaceAll("\\S","*"));
	
	System.out.println(cumle.replaceAll("\\s","*"));
	
	
	
	
	}

}
