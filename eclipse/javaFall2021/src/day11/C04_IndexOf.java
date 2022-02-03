package day11;

public class C04_IndexOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String str= "Calisirsaniz, Java ogrenmek cok kolay";
	
	System.out.println(str.indexOf('s'));
	
	System.out.println(str.indexOf("J"));
	
	int index=str.indexOf("r");
	
	System.out.println(index);
	
	System.out.println(str.indexOf('q'));
	
    
   
    System.out.println(str.indexOf("va og"));
	
    System.out.println(str.indexOf('e',11));
	}

}
