
public class Ex13_10_2 {

	public static void main(String[] args) {
		MyThread th1 = new MyThread("*");
		MyThread th2 = new MyThread("**");
		MyThread th3 = new MyThread("***");
		th1.start();
		th2.start();
		th3.start();

		try {
			Thread.sleep(2000);//main 2초 재우기
			th1.suspend();	//th1 일시정지
			Thread.sleep(2000);
			th2.suspend();	//th2 일시정지
			Thread.sleep(3000);
			th1.resume();	//th1 재개
			Thread.sleep(3000);
			th1.stop();	//th1 종료
			th2.stop();	//th2 종료
			Thread.sleep(2000);
			th3.stop();	//th3 종료
		} catch (InterruptedException e) {}

	}//main

}

class MyThread implements Runnable{
	volatile boolean suspended = false;	
	volatile boolean stopped = false;
	//volatile이 있어야 마지막에 계속 실행되지 않고 끝난다.
	
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
