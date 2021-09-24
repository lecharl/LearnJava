import javax.swing.JOptionPane;

class Ex13_05 {

	public static void main(String[] args) {
		//멀티쓰레드
		Thread05_1 t1 = new Thread05_1();
		t1.start();
		
		String input = JOptionPane.showInputDialog("아무 값이나 입력하세요.");
		System.out.println("입력하신 값은 "+input+"입니다.");

	}

}

class Thread05_1 extends Thread{
	public void run() {
		for(int i=10; i>0; i--) {
			System.out.println(i);
			try {
				sleep(1000);	//Thread의 메소드
			} catch (Exception e) {
			}
		}
	}
}
