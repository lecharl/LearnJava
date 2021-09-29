
public class Ex13_06 {

	public static void main(String[] args) {
		Thread06_1 t1 = new Thread06_1();
		Thread06_2 t2 = new Thread06_2();
		
//		t1.setPriority(5);	//기본. 설정안해도 5가 기본
		t2.setPriority(7);
		
		System.out.println("Priority of t1(-) : "+t1.getPriority());
		System.out.println("Priority of t2(|) : "+t2.getPriority());
		t1.start();
		t2.start();

	}

}

class Thread06_1 extends Thread{
	public void run() {
		for(int i=0; i<300; i++) {
			System.out.print("-");
			for(int x=0; x<10000000; x++);	//시간지연용 for문
		}
	}
}

class Thread06_2 extends Thread{
	public void run() {
		for(int i=0; i<300; i++) {
			System.out.print("|");
			for(int x=0; x<10000000; x++);	//시간지연용 for문
		}
	}
}
