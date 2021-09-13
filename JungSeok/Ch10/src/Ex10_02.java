import java.util.*;

class Ex10_02 {

	public static void main(String[] args) {
		
		final String[] Day_OF_Week= {"", "일", "월", "화", "수", "목", "금", "토"};
		//요일은 1부터 시작하기에, 0은 빈문자열로
		//변수의 상수화를 위해 final
		
		Calendar date1 = Calendar.getInstance();
		Calendar date2 = Calendar.getInstance();
		
		
		//toString 오버라이딩			
		public static String toString(Calendar date) {
			return date.get(Calendar.YEAR)+"년 ";
		}	
		//왜 자꾸 에러가 나는지 모르겠다 ㅠㅠㅠ
		
		//2020년 4월 29일
		//3대신 Calendar.APRIL 해도 됨!
		date1.set(2020, 3, 29);
		System.out.println("date1은 "+ toString(date1)+ Day_OF_Week[date1.get(Calendar.DAY_OF_WEEK)]+"요일이다.");
		
		System.out.println("date2는 "+ toString(date2)+ Day_OF_Week[date2.get(Calendar.DAY_OF_WEEK)]+"요일이다.");
		
		//두 날짜 간의 차이
		long difference = Math.abs(date1.getTimeInMillis() - date2.getTimeInMillis()) / 1000;
		
		
		System.out.println("그날(date1)부터 지금(date)2까지 "+difference+"초가 지났습니다.");
		System.out.println("일(day)로 계산하면"+ difference/(60*60*24)+"일입니다.");
		
		
	}
}
