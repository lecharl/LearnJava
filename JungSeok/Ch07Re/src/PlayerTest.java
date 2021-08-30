abstract class Player{
	abstract void play(int pos);
	abstract void stop();
}

class AudioPlayer extends Player{
	void play(int pos) {
		System.out.println(pos+"��ġ���� �÷��̽����մϴ�.");
	}
	void stop() {
		System.out.println("�����մϴ�.");
	}
}


public class PlayerTest {

	public static void main(String[] args) {
//		Player p = new Player();	//�߻�Ŭ������ ��ü������, ����
		AudioPlayer ap = new AudioPlayer();
		ap.play(100);
		ap.stop();
		
		Player p = new AudioPlayer();	//�߻�Ŭ Ÿ���� ������ ��! ���� ������ ��ü�� AP�ϱ� �������
		p.play(200);
		p.stop();

	}

}
