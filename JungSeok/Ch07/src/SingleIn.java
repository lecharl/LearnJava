class Tv2 {
	boolean power;
	int channel;
	
	void power() { power = !power;}
	void channelUP() { ++channel;}
	void channelDown() { --channel;}
}

class DVD {
	boolean power;
	
	void power() { power = !power;}
	void play() { /*내용생략*/}
	void stop() { /*내용생략*/}
	void rew() { /*내용생략*/}
	void ff() { /*내용생략*/}
}

class TvDVD extends Tv2 {
	DVD d = new DVD();
	
	void play() {		// 이런 식으로 메소드를 만들어서 호출해야 한다!!
		d.play();
	}
	void stop() {
		d.stop();
	}
	void rew() {
		d.rew();
	}
	void ff() {
		d.ff();
	}
}

public class SingleIn {

	public static void main(String[] args) {
		// 단일상속과 포함으로 다중상속 효과 내기

	}

}
