package _05_StringManipulation._05_StringManipulation;

public class Q11 {
    public static void main(String[] args) {
	/*
		Asagidaki String degiskenini kullanarak  konsolda A L i yazdiriniz.
		String  pickName = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		 */

       String pickName= "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
   char A=pickName.charAt(pickName.indexOf("A"));
   char L=pickName.charAt(pickName.indexOf("L"));
   char I=pickName.charAt(pickName.indexOf("I"));   
		   
		   
		   System.out.println("ALI: "+ A+" "+L+" "+" "+I);
    
	   
		   
		   
    }

}
