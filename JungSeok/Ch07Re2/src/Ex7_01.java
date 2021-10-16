class Tv{
	boolean power;	//기본:false(꺼진 상태)
	int channel;
	
	void power() { power = !power;}	//***1, 3, ...번 호출: true(켜진 상태)
	void channelUp() { channel++;}
	void channelDown() { channel--;}
}

class SmartTv extends Tv{
	boolean caption;	//기본:false(꺼진 상태)
	void captionDisplay(String text) {
		if(caption)		//true(켜진 상태)일 때만 매개변수로 받은 문자열 보여주기
			System.out.println(text);
		else
			System.out.println("error..");
	}
	
}


public class Ex7_01 {

	public static void main(String[] args) {
		SmartTv sTv = new SmartTv();
		sTv.channel = 10;
		sTv.channelUp();
		System.out.println("채널 번호: "+sTv.channel);
		sTv.captionDisplay("자막: hello?");
		//**caption==false 이므로 나오지 않는다.
		//-> 자막 켜주기
		sTv.caption = true;
		sTv.captionDisplay("자막: hello?");
		

	}

}
