package test3;

import java.util.Date;
import java.text.SimpleDateFormat;

public class DateFormatTest {

	public static void main(String[] args) {
		
		Date today = new Date();
		
		SimpleDateFormat format1 = new SimpleDateFormat("yyyy�� MM�� dd�� HH�� mm�� ss��");
		System.out.println(format1.format(today));
				
				//"2021�� 02�� 15�� 11�� 30�� 50��"

	}

}
