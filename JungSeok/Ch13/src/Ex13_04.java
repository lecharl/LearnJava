import javax.swing.JOptionPane;

public class Ex13_04 {

	public static void main(String[] args) {
		//�̱۾�����
		String input = JOptionPane.showInputDialog("�ƹ� ���̳� �Է��ϼ���.");
		System.out.println("�Է��Ͻ� ���� "+input+"�Դϴ�.");
		
		for(int i=10; i>0; i--) {
			System.out.println(i);
			try {
				Thread.sleep(1000);	//ThreadŬ�� �޼ҵ�,1�ʰ� �ð��� �����Ѵ�.
			} catch (Exception e) {
			}
		}
		

	}

}
