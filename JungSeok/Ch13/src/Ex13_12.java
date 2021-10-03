
public class Ex13_12 {

	public static void main(String[] args) {
		//***
		Runnable r = new RunnableThread1();
		new Thread(r).start();
		new Thread(r).start();

	}

}

class Account{
	private int balance = 1000;	//잔고
	//***private으로 해야 동기화가 의미가 있다.
	
	public synchronized int getBalance() {return balance;}
	//***읽을 때도 붙여야 한다. 읽는 동안 값이 바뀌면 안되니까!!
	public synchronized void withdraw(int money) {
		if(balance >= money) {
			try {
				Thread.sleep(1000);	//결과를 보기 쉽게 하기 위함
			} catch (InterruptedException e) {}
			balance -= money;
		}
	}//withdraw
}

class RunnableThread1 implements Runnable{
	Account acc = new Account();
	
	public void run() {
		while(acc.getBalance() > 0) {
			//***0<= x < 4의 정수 0,1,2,3 * 100 = 0, 100, 200, 300
			int money = (int)(Math.random()*3 + 1) * 100;
			acc.withdraw(money);
			System.out.println("balance: "+ acc.getBalance());
		}
	}
}
