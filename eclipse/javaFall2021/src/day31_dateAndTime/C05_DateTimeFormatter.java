package day31_dateAndTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C05_DateTimeFormatter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	LocalDateTime tarihSaat=LocalDateTime.now();
	
	
	System.out.println(tarihSaat);
	
	DateTimeFormatter duzenle=DateTimeFormatter.ofPattern("dd/MMMM/YYYY EEE HH:mm a");
	
	System.out.println(duzenle.format(tarihSaat));
	
	
	
	
	
	
	}

}
