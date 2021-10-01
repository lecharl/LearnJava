
public class Ex13_10_2 {

	public static void main(String[] args) {
		MyThread th1 = new MyThread("*");
		MyThread th2 = new MyThread("**");
		MyThread th3 = new MyThread("***");
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

class MyThread implements Runnable{
	volatile boolean suspended = false;	
	volatile boolean stopped = false;
	//volatile�� �־�� �������� ��� ������� �ʰ� ������.
	
	Thread th;
	
	MyThread(String name){
		th = new Thread(this, name);
	}
	
	public void run() {
		while(!stopped) {
			if(!suspended) {
				System.out.println(Thread.currentThread().getName());
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {}
			}
		}//while
	}//run
	
	void start() { th.start();}
	void suspend() { suspended = true;}
	void resume() { suspended = false;}
	void stop() { stopped = true;}
}
