package test3;

import java.util.Date;
import java.text.SimpleDateFormat;

public class DateFormatTest {

	public static void main(String[] args) {
		
		Date today = new Date();
		
		SimpleDateFormat format1 = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");
		System.out.println(format1.format(today));
				
				//"2021년 02월 15일 11시 30분 50초"

	}

}
