
public class Ex13_12 {

	public static void main(String[] args) {
		//***
		Runnable r = new RunnableThread1();
		new Thread(r).start();
		new Thread(r).start();

	}

}

class Account{
	private int balance = 1000;	//�ܰ�
	//***private���� �ؾ� ����ȭ�� �ǹ̰� �ִ�.
	
	public synchronized int getBalance() {return balance;}
	//***���� ���� �ٿ��� �Ѵ�. �д� ���� ���� �ٲ�� �ȵǴϱ�!!
	public synchronized void withdraw(int money) {
		if(balance >= money) {
			try {
				Thread.sleep(1000);	//����� ���� ���� �ϱ� ����
			} catch (InterruptedException e) {}
			balance -= money;
		}
	}//withdraw
}

class RunnableThread1 implements Runnable{
	Account acc = new Account();
	
	public void run() {
		while(acc.getBalance() > 0) {
			//***0<= x < 4�� ���� 0,1,2,3 * 100 = 0, 100, 200, 300
			int money = (int)(Math.random()*3 + 1) * 100;
			acc.withdraw(money);
			System.out.println("balance: "+ acc.getBalance());
		}
	}
}
