import java.util.ArrayList;

public class Ex13_13 {

	public static void main(String[] args) throws Exception{
		Table table = new Table();
		
		Cook c = new Cook(table);
		Thread th1 = new Thread(c, "COOK");
		th1.start();	//�� ������ ���� �� �Ʒ� ���***
		
		new Thread(new Customer(table, "donut"), "CUST1").start();
		new Thread(new Customer(table, "burger"), "CUST2").start();
		
		Thread.sleep(2000);	//**�̰� ����Ϸ��� ���� throws Exception �ؾ��Ѵ�.�Ф�??
		System.exit(0);
	}

}

class Customer implements Runnable{
	private Table table;
	private String food;
	
	Customer(Table table, String food){
		this.table = table;
		this.food = food;
	}
	
	public void run() {
		while(true) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {}
			String name = Thread.currentThread().getName();
			
			table.remove(food);
			System.out.println(name+" ate a "+food);
		}
	}
}

class Cook implements Runnable{
	private Table table;
	
	Cook(Table table) {
		this.table = table;
	}
	
	public void run() {
		while(true) {
			//0<= x <3 -> 0,1,2
			int idx = (int)(Math.random() * table.dishNum());
			table.add(table.dishNames[idx]);
			//**�޴��� 0, 1:donut, 2:burger �� �߰�
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {}
		}
	}
	
	
}

class Table{
	String[] dishNames = {"donut", "donut", "burger"};	//donutȮ�� ���̱�
	final int MAX_FOOD = 6;
	private ArrayList<String> dishes = new ArrayList<>();

	//���� �߰�
	public synchronized void add(String dish) {
		//***������ �� á�� ����
		while(dishes.size() >= MAX_FOOD) {
			String name = Thread.currentThread().getName();
			System.out.println(name+" is waiting.");
			try {
				wait(); //COOK ������ ��ٸ���
				//**������ �� á�� �� �丮�� ��ٸ���
			} catch (InterruptedException e) {}
		}
		//���� �� ��á������ �׻� ���� �߰�
		dishes.add(dish);
		notify();
		//**������ �߰��Ǹ� ��ٸ��� �ִ� �մ� �����
		System.out.println("Dishes: "+dishes.toString());
	}//synchronized add
	
	//�մ��� ���� �Ա�
	public void remove(String dishName) {
		synchronized (this) {
			String name = Thread.currentThread().getName();
			
			//***������ ������
			while(dishes.size()==0) {
				System.out.println(name + " is waiting.");
				try {
					wait(); //CUST ������ ��ٸ���
					//**������ ������ �մ� ��ٸ���
					Thread.sleep(500);
				} catch (InterruptedException e) {}
			}
			
			//***���ϴ� ������ ���� ������ dishes ������
			while(true) {
				for(int i=0; i<dishes.size(); i++) {
					//***���ϴ� ������ ������
					if(dishName.equals(dishes.get(i))) {
						dishes.remove(i);
						notify(); //��ٸ��� �ִ� COOK �����
						//**�մ��� ���� ������, ��ٸ��� �ִ� �丮�� �����
						return;
					}
				}//for
				
				//***���ϴ� ������ ������
				try {
					System.out.println(name + " is waiting.");
					wait(); //CUST ������ ��ٸ���
					//**���ϴ� ������ ������ �մ� ��ٸ���
					Thread.sleep(500);
				} catch (InterruptedException e) {}
			}//while
		}//synchronized
	}//remove
	public int dishNum() {return dishNames.length;}
}
