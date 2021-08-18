class Time {
	private int hour;	// 0~23만 가져야 한다.-> 접근 제한!!
//	private int minute;	// 직접 접근 제한하고
//	private int second;
	
	// public 메소드를 통한 간접 접근
	// 시 입력받음
	public void setHour(int hour) {
		if (isNotValidHour(hour)) {		// alt+shift+m
			return;
		}
		this.hour = hour;
	}
	// 매개변수로 받은 hour가 유효한지 확인
	// 여기서만 쓰이기 때문에 private이 좋다.
	private boolean isNotValidHour(int hour) {
		return hour < 0 || hour > 23;
	}
	// 입력받은 시 읽기, 반환
	public int getHour() {
		return hour;
	}
	
}


public class TimeTest {

	public static void main(String[] args) {
		// 접근제어자 활용
		Time t = new Time();
		//t.hour = 100; <- private이므로 에러난다.
		t.setHour(20);	//false -> this.hour = 20
		System.out.println(t.getHour());
		t.setHour(100);	//true -> return
		System.out.println(t.getHour());
	}

}
