class Tv {
	boolean power;	// ����on/off, �ʱ�ȭ false(off)�� ����
	int channel;	// ä��
	
	void power() {
		power = !power;	// �̰� ���� ������???????? off �����ΰ�?
	}
	void channelUp() {
		++channel;		// �տ��ٰ� ++, --
	}
	void channelDown() {
		--channel;
	}
}

class SmartTv extends Tv{	// TvŬ����(�θ�)�� ��ӹ޴� SmartTvŬ����(�ڽ�)
	boolean caption;		// �ڸ�on/off, �ʱ�ȭ false(off)�� ����
	void displayCaption(String text) {
		if(caption) {		// �ڸ��� on(true)�� �� �Ű������� ���� text�� ���
			System.out.println(text);
		}
		else {			// �ڸ� off(false)�� �� nothing ���
			System.out.println("nothing");
		}
	}
}


public class Ex7_01 {

	public static void main(String[] args) {
		// ���
		SmartTv stv = new SmartTv();
		stv.channel = 10;
		stv.channelUp();	// �ν��Ͻ��޼ҵ� ȣ�� ��� ���� ����!
		System.out.println(stv.channel);
		
		System.out.println(stv.power);	// ���� off�� false ��µƳ�.
		
		stv.displayCaption("Hello");	// false(off)�̱⿡ ���x
		stv.caption = true;				// �ڸ�on
		stv.displayCaption("Hello");
		

	}

}
