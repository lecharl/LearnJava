
public class Ex13_01 {

	public static void main(String[] args) {
		//1. Thread ��� ���
		Thread01_1 t1 = new Thread01_1();
		
		
		//2. Runnable ���� ���
		Runnable r = new Thread01_2();
		Thread t2 = new Thread(r);
		//���̸� : Thread t2 = new Thread(new Threadex2());
		
		t1.start();
		t2.start();
		
		for(int i=0; i<20; i++){
			System.out.print(0);	//thread�� �̸� ��ȯ
			//������ ThreadŬ������ �޼ҵ�. this ���� ����
		}
		
		for(int i=0; i<20; i++) {
			System.out.print(1);
			//��� �������� �̷��� ȣ���Ѵٴ� ���� ����ϸ� ��
		}

	}

}

class Thread01_1 extends Thread{
	public void run() {
		for(int i=0; i<20; i++){
			System.out.print(this.getName());	//thread�� �̸� ��ȯ
			//������ ThreadŬ������ �޼ҵ�. this ���� ����
		}
	}
}

class Thread01_2 implements Runnable{
	public void run() {
		for(int i=0; i<20; i++) {
			System.out.print(Thread.currentThread().getName());
			//��� �������� �̷��� ȣ���Ѵٴ� ���� ����ϸ� ��
		}
	}
}