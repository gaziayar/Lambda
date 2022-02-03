package day40;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C05_PentChildException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		try {
			FileInputStream fis=new FileInputStream("day40\\yazi.txt");
			int k=0;
			while ((k=fis.read())!=-1){
				System.out.print((char)k);
			}
		} catch (FileNotFoundException e) { 
			// TODO: handle exception
		e.printStackTrace();
		}
		catch (IOException e) {
		System.out.println("gorev tamam");
		
	}

}
}