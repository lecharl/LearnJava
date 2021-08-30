abstract class Player{
	abstract void play(int pos);
	abstract void stop();
}

class AudioPlayer extends Player{
	void play(int pos) {
		System.out.println(pos+"위치부터 플레이시작합니다.");
	}
	void stop() {
		System.out.println("정지합니다.");
	}
}


public class PlayerTest {

	public static void main(String[] args) {
//		Player p = new Player();	//추상클래스로 객체못만듦, 에러
		AudioPlayer ap = new AudioPlayer();
		ap.play(100);
		ap.stop();
		
		Player p = new AudioPlayer();	//추상클 타입은 선언은 됨! 실제 생성된 객체는 AP니까 상관없음
		p.play(200);
		p.stop();

	}

}
