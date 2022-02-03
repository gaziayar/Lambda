package day13_;

public class C04_ReplaceAll {

	public static void main(String[] args) {
		// replaceall medodu kul java ogrenmek kolay yazdir

	
	String str="*java 98ogrenmek c..ok k876olay";
	
	str=str.replaceAll("\\d" , "");//*java ogrenmek c..ok kolay
	
	System.out.println(str);
	
	str=str.replaceAll("\\s", "x");//javaxogrenmekxcokxkolay
	str=str.replaceAll("\\W", "");
	System.out.println(str);
	str=str.replace("x", " ");
	
	System.out.println(str);
	
	
	
	}

}
