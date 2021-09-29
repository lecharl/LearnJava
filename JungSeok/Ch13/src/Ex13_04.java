import javax.swing.JOptionPane;

public class Ex13_04 {

	public static void main(String[] args) {
		//싱글쓰레드
		String input = JOptionPane.showInputDialog("아무 값이나 입력하세요.");
		System.out.println("입력하신 값은 "+input+"입니다.");
		
		for(int i=10; i>0; i--) {
			System.out.println(i);
			try {
				Thread.sleep(1000);	//Thread클의 메소드,1초간 시간을 지연한다.
			} catch (Exception e) {
			}
		}
		

	}

}
