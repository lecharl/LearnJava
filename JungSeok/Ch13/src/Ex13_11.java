
public class Ex13_11 {
	static long startTime = 0;

	public static void main(String[] args) {
		Thread11_1 th1 = new Thread11_1();
		Thread11_2 th2 = new Thread11_2();
		th1.start();
		th2.start();
		startTime = System.currentTimeMillis();	//���۽ð�
		
		try {
			th1.join();	//**main������**�� th1�� �۾��� ���� ������ ��ٸ���.
			th2.join();	//main�����尡 th2�� �۾��� ���� ������ ��ٸ���.
		}catch (InterruptedException e) {}
		
		System.out.print("�ҿ�ð�: "+(System.currentTimeMillis() - startTime));
	}

}

class Thread11_1 extends Thread{
	public void run() {
		for(int i=0; i<50; i++)
			System.out.print("-");
	}
}

class Thread11_2 extends Thread{
	public void run() {
		for(int i=0; i<50; i++)
			System.out.print("|");
	}
}