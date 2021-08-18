class Tv {
	boolean power;	// 전원on/off, 초기화 false(off)인 상태
	int channel;	// 채널
	
	void power() {
		power = !power;	// 이게 무슨 상태지???????? off 상태인가?
	}
	void channelUp() {
		++channel;		// 앞에다가 ++, --
	}
	void channelDown() {
		--channel;
	}
}

class SmartTv extends Tv{	// Tv클래스(부모)를 상속받는 SmartTv클래스(자식)
	boolean caption;		// 자막on/off, 초기화 false(off)인 상태
	void displayCaption(String text) {
		if(caption) {		// 자막이 on(true)일 때 매개변수로 받은 text를 출력
			System.out.println(text);
		}
		else {			// 자막 off(false)일 때 nothing 출력
			System.out.println("nothing");
		}
	}
}


public class Ex7_01 {

	public static void main(String[] args) {
		// 상속
		SmartTv stv = new SmartTv();
		stv.channel = 10;
		stv.channelUp();	// 인스턴스메소드 호출 방법 잊지 말기!
		System.out.println(stv.channel);
		
		System.out.println(stv.power);	// 전원 off라 false 출력됐네.
		
		stv.displayCaption("Hello");	// false(off)이기에 출력x
		stv.caption = true;				// 자막on
		stv.displayCaption("Hello");
		

	}

}
