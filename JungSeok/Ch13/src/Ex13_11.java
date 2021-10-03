
public class Ex13_11 {
	static long startTime = 0;

	public static void main(String[] args) {
		Thread11_1 th1 = new Thread11_1();
		Thread11_2 th2 = new Thread11_2();
		th1.start();
		th2.start();
		startTime = System.currentTimeMillis();	//시작시간
		
		try {
			th1.join();	//**main쓰레드**가 th1의 작업이 끝날 때까지 기다린다.
			th2.join();	//main쓰레드가 th2의 작업이 끝날 때까지 기다린다.
		}catch (InterruptedException e) {}
		
		System.out.print("소요시간: "+(System.currentTimeMillis() - startTime));
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