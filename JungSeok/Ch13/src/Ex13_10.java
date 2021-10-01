
public class Ex13_10 {

	public static void main(String[] args) {
		RunThread10 r = new RunThread10();
		Thread th1 = new Thread(r, "*");	
		//***Thread생성자(Runnable target, String name)
		Thread th2 = new Thread(r, "**");
		Thread th3 = new Thread(r, "***");
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

class RunThread10 implements Runnable{
	public void run() {
		while(true) {
			//1초마다 쓰레드의 이름을 출력하는 메소드
			System.out.println(Thread.currentThread().getName());
			//***getName()을 위해선 currentThread()가 필요하다!!
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
		}//while
	}//run
}