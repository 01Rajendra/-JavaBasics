package in.co.porogram;

import java.time.LocalDate;
import java.util.Date;

public class date {
	public static void main(String [] args) {
			
	
	int birth = 2004;
	//Date currentDate = new Date
	LocalDate CurrentDate = LocalDate.now();
	int CurrentYear = CurrentDate.getYear();
	int age = CurrentYear-birth;
	System.out.println(" current age: " + age);
	
	}

}
