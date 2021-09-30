
public class Ex13_08 {

	public static void main(String[] args) {
		Thread08_1 t1 = new Thread08_1();
		Thread08_2 t2 = new Thread08_2();
		t1.start();
		t2.start();
		
		delay(2*1000);
		//sleep ���ϸ� �Ʒ� ������ ������ �ٷ� �����
		System.out.print("<<main ����>>");
	}
	
	static void delay(long millis) {
		try {
			Thread.sleep(millis);	//***Thread.sleep()!!
		} catch (InterruptedException e) {}
		//�ʼ����ܶ� ���ϸ� �ٷ� ����!
	}

}

class Thread08_1 extends Thread{
	public void run() {
		for(int i=0; i<100; i++)
			System.out.print("-");
		System.out.print("<<t1 ����>>");
	}
}

class Thread08_2 extends Thread{
	public void run() {
		for(int i=0; i<100; i++)
			System.out.print("|");
		System.out.print("<<t2 ����>>");
	}
}
