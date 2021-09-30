import javax.swing.JOptionPane;

class Ex13_09 {

	public static void main(String[] args) throws Exception {
		Thread09_1 th1 = new Thread09_1();
		th1.start();
		System.out.println("isInterrupted(): " + th1.isInterrupted());

		String input = JOptionPane.showInputDialog("계속하시려면 아무 키나 눌러주세요.");
		System.out.println(input + ": 계속합니다.");
		th1.interrupt(); // th1의 interrupted상태 -> true 로
		System.out.println("ㅁisInterrupted(): "+th1.isInterrupted());
		
		//***interrupted()는 static!! 자기자신Thread만!!
		//main쓰레드가 interrupt되었는지 확인
		System.out.println("메인:interrupted(): "+Thread.interrupted());
		//main을 interrupt()하지 않았으니 당연 false
		System.out.println("ㄴisInterrupted(): "+th1.isInterrupted());
		System.out.println("메인 종료");

	}

}

//***게임에서 "계속 하시겠습니까?" 카운트다운하는 알고리즘
class Thread09_1 extends Thread {
	public void run() {
		int i = 10;
		// 아직 시간 남아있고 && interrupted상태가==false이면(==interrupt();호출 안했으면)
		while (i != 0 && !isInterrupted()) {
			try {
				sleep(1000);
				System.out.println(i--);
			} catch (InterruptedException e) {
				interrupt();
			}
//			for (long x = 0; x < 2500000000000L; x++); // 시간지연
		}

		//위에서 th1.interrupt()했어도 false다. 왜?? 
		//????쓰레드가 잠들어있는 동안 th1.interrupt호출되면 예외가 발생하면서 interrupted상태가 false로 초기화되기 때문!!
		//***따라서 catch에 interrupt()호출로 다시 true로 만들어야 한다.
		System.out.println("isInterrupted(): " + this.isInterrupted());
		//**th1쓰레드가 interrupt되었는지 확인하려면 여기다가, true, 그리고 false로 초기화
		System.out.println("interrupted(): " + Thread.interrupted());
		System.out.println("isInterrupted(): " + this.isInterrupted());
		System.out.println("interrupted(): " + Thread.interrupted());
		//셋다 this.나 Thread. 안해도 된다.

		System.out.println("카운트다운이 종료되었습니다.");
	}
}
