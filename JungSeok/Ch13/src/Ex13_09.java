import javax.swing.JOptionPane;

class Ex13_09 {

	public static void main(String[] args) throws Exception {
		Thread09_1 th1 = new Thread09_1();
		th1.start();
		System.out.println("isInterrupted(): " + th1.isInterrupted());

		String input = JOptionPane.showInputDialog("����Ͻ÷��� �ƹ� Ű�� �����ּ���.");
		System.out.println(input + ": ����մϴ�.");
		th1.interrupt(); // th1�� interrupted���� -> true ��
		System.out.println("��isInterrupted(): "+th1.isInterrupted());
		
		//***interrupted()�� static!! �ڱ��ڽ�Thread��!!
		//main�����尡 interrupt�Ǿ����� Ȯ��
		System.out.println("����:interrupted(): "+Thread.interrupted());
		//main�� interrupt()���� �ʾ����� �翬 false
		System.out.println("��isInterrupted(): "+th1.isInterrupted());
		System.out.println("���� ����");

	}

}

//***���ӿ��� "��� �Ͻðڽ��ϱ�?" ī��Ʈ�ٿ��ϴ� �˰���
class Thread09_1 extends Thread {
	public void run() {
		int i = 10;
		// ���� �ð� �����ְ� && interrupted���°�==false�̸�(==interrupt();ȣ�� ��������)
		while (i != 0 && !isInterrupted()) {
			try {
				sleep(1000);
				System.out.println(i--);
			} catch (InterruptedException e) {
				interrupt();
			}
//			for (long x = 0; x < 2500000000000L; x++); // �ð�����
		}

		//������ th1.interrupt()�߾ false��. ��?? 
		//????�����尡 �����ִ� ���� th1.interruptȣ��Ǹ� ���ܰ� �߻��ϸ鼭 interrupted���°� false�� �ʱ�ȭ�Ǳ� ����!!
		//***���� catch�� interrupt()ȣ��� �ٽ� true�� ������ �Ѵ�.
		System.out.println("isInterrupted(): " + this.isInterrupted());
		//**th1�����尡 interrupt�Ǿ����� Ȯ���Ϸ��� ����ٰ�, true, �׸��� false�� �ʱ�ȭ
		System.out.println("interrupted(): " + Thread.interrupted());
		System.out.println("isInterrupted(): " + this.isInterrupted());
		System.out.println("interrupted(): " + Thread.interrupted());
		//�´� this.�� Thread. ���ص� �ȴ�.

		System.out.println("ī��Ʈ�ٿ��� ����Ǿ����ϴ�.");
	}
}
