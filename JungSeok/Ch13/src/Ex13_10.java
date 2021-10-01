
public class Ex13_10 {

	public static void main(String[] args) {
		RunThread10 r = new RunThread10();
		Thread th1 = new Thread(r, "*");	
		//***Thread������(Runnable target, String name)
		Thread th2 = new Thread(r, "**");
		Thread th3 = new Thread(r, "***");
		th1.start();
		th2.start();
		th3.start();
		
		try {
			Thread.sleep(2000);//main 2�� ����
			th1.suspend();	//th1 �Ͻ�����
			Thread.sleep(2000);
			th2.suspend();	//th2 �Ͻ�����
			Thread.sleep(3000);
			th1.resume();	//th1 �簳
			Thread.sleep(3000);
			th1.stop();	//th1 ����
			th2.stop();	//th2 ����
			Thread.sleep(2000);
			th3.stop();	//th3 ����
		} catch (InterruptedException e) {}

	}//main

}

class RunThread10 implements Runnable{
	public void run() {
		while(true) {
			//1�ʸ��� �������� �̸��� ����ϴ� �޼ҵ�
			System.out.println(Thread.currentThread().getName());
			//***getName()�� ���ؼ� currentThread()�� �ʿ��ϴ�!!
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
		}//while
	}//run
}