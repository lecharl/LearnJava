
public class Ex13_01 {

	public static void main(String[] args) {
		//1. Thread 상속 방법
		Thread01_1 t1 = new Thread01_1();
		
		
		//2. Runnable 구현 방법
		Runnable r = new Thread01_2();
		Thread t2 = new Thread(r);
		//줄이면 : Thread t2 = new Thread(new Threadex2());
		
		t1.start();
		t2.start();
		
		for(int i=0; i<20; i++){
			System.out.print(0);	//thread의 이름 반환
			//조상인 Thread클래스의 메소드. this 생략 가능
		}
		
		for(int i=0; i<20; i++) {
			System.out.print(1);
			//깊게 생각말고 이렇게 호출한다는 점을 기억하면 됨
		}

	}

}

class Thread01_1 extends Thread{
	public void run() {
		for(int i=0; i<20; i++){
			System.out.print(this.getName());	//thread의 이름 반환
			//조상인 Thread클래스의 메소드. this 생략 가능
		}
	}
}

class Thread01_2 implements Runnable{
	public void run() {
		for(int i=0; i<20; i++) {
			System.out.print(Thread.currentThread().getName());
			//깊게 생각말고 이렇게 호출한다는 점을 기억하면 됨
		}
	}
}