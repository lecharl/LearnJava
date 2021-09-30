
public class Ex13_08 {

	public static void main(String[] args) {
		Thread08_1 t1 = new Thread08_1();
		Thread08_2 t2 = new Thread08_2();
		t1.start();
		t2.start();
		
		delay(2*1000);
		//sleep 안하면 아래 문장이 맨위에 바로 실행됨
		System.out.print("<<main 종료>>");
	}
	
	static void delay(long millis) {
		try {
			Thread.sleep(millis);	//***Thread.sleep()!!
		} catch (InterruptedException e) {}
		//필수예외라 안하면 바로 에러!
	}

}

class Thread08_1 extends Thread{
	public void run() {
		for(int i=0; i<100; i++)
			System.out.print("-");
		System.out.print("<<t1 종료>>");
	}
}

class Thread08_2 extends Thread{
	public void run() {
		for(int i=0; i<100; i++)
			System.out.print("|");
		System.out.print("<<t2 종료>>");
	}
}
