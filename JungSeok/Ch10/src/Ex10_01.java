import java.util.Calendar;

public class Ex10_01 {

	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();
		//이런 방식으로 Calendar 객체를 생성한다!!!
		System.out.println("*날짜*");
		System.out.println("이 해의 년도 : "+today.get(Calendar.YEAR));
		System.out.println("이 해의 월(0~11, 0=1월) : "+today.get(Calendar.MONTH));
		System.out.println("이 해의 일 : "+today.get(Calendar.DATE));
		
		System.out.println("이 해의 몇 째 주 : "+today.get(Calendar.WEEK_OF_YEAR));
		System.out.println("이 달의 몇 째 주 : "+today.get(Calendar.WEEK_OF_MONTH));
		
		System.out.println("이 해의 몇 일(DATE와 같다) : "+today.get(Calendar.DAY_OF_YEAR));
		System.out.println("이 달의 몇 일 : "+today.get(Calendar.DAY_OF_MONTH));
		
		System.out.println("요일(1~7, 1=일요일) : "+today.get(Calendar.DAY_OF_WEEK));
		System.out.println("이 달의 몇 째 요일 : "+today.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		
		System.out.println("*시간*");
		System.out.println("오전/오후(0:오전, 1:오후) : "+today.get(Calendar.AM_PM));
		System.out.println("시간(0~11) : "+today.get(Calendar.HOUR));
		System.out.println("시간(0~24) : "+today.get(Calendar.HOUR_OF_DAY));
		System.out.println("분(0~59) : "+today.get(Calendar.MINUTE));
		System.out.println("초(0~59) : "+today.get(Calendar.SECOND));
		System.out.println("1000 분의 1초(0~999) : "+today.get(Calendar.MILLISECOND));
		
		System.out.println("TimeZone(-12~+12) : "+today.get(Calendar.ZONE_OFFSET)/3600000);
		//**천분의 일초 기준이므로 60*60*1000을 나눈다
		System.out.println("이 달의 마지막 날 : "+today.getActualMaximum(Calendar.DATE));
		//**이 달의 마지막 날을 찾는다
		
		

	}

}
