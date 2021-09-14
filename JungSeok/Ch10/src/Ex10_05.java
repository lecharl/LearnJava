import java.util.Calendar;

public class Ex10_05 {

	public static void main(String[] args) {
		//콘솔에 입력한 값이 2개가 아니면 아래를 출력하고 끝
		if(args.length != 2) {
			System.out.println("Usage : java Ex10_5 2020 10");
			return;
		}
		int year = Integer.parseInt(args[0]);
		int month = Integer.parseInt(args[1]);
		int start_day_of_week = 0;	//1일의 요일
		int end_day = 0;	//달의 마지막 날
		
		Calendar sDay = Calendar.getInstance();	//시작일
		Calendar eDay = Calendar.getInstance();	//끝일
		
		//sDay = 2020년 10월(10으로 입력한다면->9) 1일
		sDay.set(year, month-1, 1);
		//eDay = 2020년 11월(10으로 입력한다면->11월) 1일
		eDay.set(year, month, 1);
		
		//마지막 날 구하기
		eDay.add(Calendar.DATE, -1);
		end_day = eDay.get(Calendar.DATE);
		//2020년 10월 31일
		
		//1일의 요일 구하기
		start_day_of_week = sDay.get(Calendar.DAY_OF_WEEK);
		
		System.out.println("      "+args[0]+"년 "+args[1]+"월");
		System.out.println(" SU MO TU WE TH FR SA");
		
		//***해당 월의 1일이 어느 요일인지에 따라 공백을 출력한다.
		for(int i=1; i<start_day_of_week; i++) {
			System.out.print("   ");
		}
		//***i는 마지막30 또는 31까지, n은 요일주기(7)
		for(int i=1, n=start_day_of_week; i<=end_day; i++, n++) {
			System.out.print((i<10)? "  "+i : " "+i);
			//***10부터는 빈칸의 길이도 적으니까!
			if(n%7==0) System.out.println();
		}

	}

}
