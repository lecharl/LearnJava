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
	void play() { /*�������*/}
	void stop() { /*�������*/}
	void rew() { /*�������*/}
	void ff() { /*�������*/}
}

class TvDVD extends Tv2 {
	DVD d = new DVD();
	
	void play() {		// �̷� ������ �޼ҵ带 ���� ȣ���ؾ� �Ѵ�!!
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
		// ���ϻ�Ӱ� �������� ���߻�� ȿ�� ����

	}

}
