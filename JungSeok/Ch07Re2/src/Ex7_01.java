class Tv{
	boolean power;	//�⺻:false(���� ����)
	int channel;
	
	void power() { power = !power;}	//***1, 3, ...�� ȣ��: true(���� ����)
	void channelUp() { channel++;}
	void channelDown() { channel--;}
}

class SmartTv extends Tv{
	boolean caption;	//�⺻:false(���� ����)
	void captionDisplay(String text) {
		if(caption)		//true(���� ����)�� ���� �Ű������� ���� ���ڿ� �����ֱ�
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
		System.out.println("ä�� ��ȣ: "+sTv.channel);
		sTv.captionDisplay("�ڸ�: hello?");
		//**caption==false �̹Ƿ� ������ �ʴ´�.
		//-> �ڸ� ���ֱ�
		sTv.caption = true;
		sTv.captionDisplay("�ڸ�: hello?");
		

	}

}
