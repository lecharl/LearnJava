import javax.swing.JOptionPane;

class Ex13_05 {

	public static void main(String[] args) {
		//��Ƽ������
		Thread05_1 t1 = new Thread05_1();
		t1.start();
		
		String input = JOptionPane.showInputDialog("�ƹ� ���̳� �Է��ϼ���.");
		System.out.println("�Է��Ͻ� ���� "+input+"�Դϴ�.");

	}

}

class Thread05_1 extends Thread{
	public void run() {
		for(int i=10; i>0; i--) {
			System.out.println(i);
			try {
				sleep(1000);	//Thread�� �޼ҵ�
			} catch (Exception e) {
			}
		}
	}
}
