import java.util.ArrayList;

public class Ex13_13 {

	public static void main(String[] args) throws Exception{
		Table table = new Table();
		
		Cook c = new Cook(table);
		Thread th1 = new Thread(c, "COOK");
		th1.start();	//이 세줄을 줄인 게 아래 방식***
		
		new Thread(new Customer(table, "donut"), "CUST1").start();
		new Thread(new Customer(table, "burger"), "CUST2").start();
		
		Thread.sleep(2000);	//**이걸 사용하려면 위에 throws Exception 해야한다.ㅠㅠ??
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
			//**메뉴판 0, 1:donut, 2:burger 을 추가
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {}
		}
	}
	
	
}

class Table{
	String[] dishNames = {"donut", "donut", "burger"};	//donut확률 높이기
	final int MAX_FOOD = 6;
	private ArrayList<String> dishes = new ArrayList<>();

	//음식 추가
	public synchronized void add(String dish) {
		//***음식이 꽉 찼을 때는
		while(dishes.size() >= MAX_FOOD) {
			String name = Thread.currentThread().getName();
			System.out.println(name+" is waiting.");
			try {
				wait(); //COOK 쓰레드 기다리게
				//**음식이 꽉 찼을 땐 요리사 기다리게
			} catch (InterruptedException e) {}
		}
		//음식 다 안찼을때는 항상 음식 추가
		dishes.add(dish);
		notify();
		//**음식이 추가되면 기다리고 있는 손님 깨우기
		System.out.println("Dishes: "+dishes.toString());
	}//synchronized add
	
	//손님이 음식 먹기
	public void remove(String dishName) {
		synchronized (this) {
			String name = Thread.currentThread().getName();
			
			//***음식이 없으면
			while(dishes.size()==0) {
				System.out.println(name + " is waiting.");
				try {
					wait(); //CUST 쓰레드 기다리게
					//**음식이 없으면 손님 기다리게
					Thread.sleep(500);
				} catch (InterruptedException e) {}
			}
			
			//***원하는 음식이 있을 때까지 dishes 뒤지기
			while(true) {
				for(int i=0; i<dishes.size(); i++) {
					//***원하는 음식이 있으면
					if(dishName.equals(dishes.get(i))) {
						dishes.remove(i);
						notify(); //기다리고 있는 COOK 깨우기
						//**손님이 음식 먹으면, 기다리고 있는 요리사 깨우기
						return;
					}
				}//for
				
				//***원하는 음식이 없으면
				try {
					System.out.println(name + " is waiting.");
					wait(); //CUST 쓰레드 기다리게
					//**원하는 음식이 없으면 손님 기다리게
					Thread.sleep(500);
				} catch (InterruptedException e) {}
			}//while
		}//synchronized
	}//remove
	public int dishNum() {return dishNames.length;}
}
