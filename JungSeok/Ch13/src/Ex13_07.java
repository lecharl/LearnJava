
class Ex13_07 implements Runnable {
	static boolean autoSave = false;

	public static void main(String[] args) {
		Thread t = new Thread(new Ex13_07());	//Thread(Runnable r)
		
//		t.setDaemon(true);	//�� �κ��� ������ ������� �ʴ´�.
		t.start();
		
		for(int i=1; i<=20; i++) {
			try {
				Thread.sleep(1000);	//1�� �޽�
			} catch (InterruptedException e) {}
			//1�� ������ �Ʒ� ����, �� 1�ʸ��� i ���
			System.out.println(i);
			//5�� �Ǹ� autoSave=true�� �� autoSave()�ٷ� ����!
			//***�� �ڷδ� 3�� ���� ����!!!
			if(i==5) autoSave = true;
		}
		
		System.out.println("���α׷��� �����մϴ�.");
	}
	
	public void run() {
		while(true) {	//���ѷ������� �Ϲݾ����尡 ����Ǹ� ���󾲷���� �ڵ������̹Ƿ� ������
			try {
				Thread.sleep(3 * 1000);	//3�� �޽�
			} catch (InterruptedException e) {}
			//3�� ������ �Ʒ� ����
			//autoSave�� ���� true�� autoSave()ȣ��
			if(autoSave) autoSave();
		}
	}
	
	public void autoSave() {
		System.out.println("�۾������� �ڵ�����Ǿ����ϴ�.");
	}

}
