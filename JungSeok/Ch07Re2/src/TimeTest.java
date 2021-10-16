class Time{
	private int hour;
	private int minute;
	private int second;
	
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		if(isNotValidHour(hour)) return;
		this.hour = hour;
	}
	private boolean isNotValidHour(int hour) {
		return hour<0 || hour>23;
	}
	public int getMinute() {
		return minute;
	}
	public void setMinute(int minute) {
		if(	isNotValidMinute(minute)) return;
		this.minute = minute;
	}
	private boolean isNotValidMinute(int minute) {
		return minute<0 || minute>59;
	}
	public int getSecond() {
		return second;
	}
	public void setSecond(int second) {
		if(isNotValidSecond(second)) return;
		this.second = second;
	}
	private boolean isNotValidSecond(int second) {
		return second<0 || second>59;
	}
}



public class TimeTest {

	public static void main(String[] args) {
		Time t = new Time();
		t.setHour(22);
		t.setMinute(59);
		t.setSecond(600);
		System.out.println(t.getHour()+"시 "+t.getMinute()+"분 "+t.getSecond()+"초");
		t.setHour(2);
		System.out.println(t.getHour()+"시 "+t.getMinute()+"분 "+t.getSecond()+"초");

	}

}
