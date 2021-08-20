class Product2 {
	int price;
	int bonusPoint;
	
	Product2(int price) {
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}
}

class Tv22 extends Product2 {
	Tv22() {
		super(800);
	}
	public String toString() {
		return "Tv";
	}
}

class Computer2 extends Product2 {
	Computer2() {
		super(300);
	}
	public String toString() {
		return "Computer";
	}
}

class Audio2 extends Product2 {
	Audio2() {
		super(100);
	}
	public String toString() {
		return "Audio";
	}
}

class Buyer2 {
	int money = 1000;
	int bonusPoint = 0;
	
	Product2[] cart = new Product2[10];	//���⿡ cart�� �����?
	int i = 0;
	
	void buy(Product2 p) {
		if (money < p.price) {
			System.out.println("�ܾ��� �����Ͽ� "+p+"��/�� ������ �� �����ϴ�.");
			//p.toString()
			return;
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		cart[i++] = p;	
		//������ ��ǰ�� �ּҸ� Product2Ÿ���� �������� �迭 cart[i]�� ����
		System.out.println(p+"��/�� �����ϼ̽��ϴ�.");
		//p.toString()
	}
	
	void summary() {	//������ ��ǰ�� ��ü ����
		int sum = 0;			//�հ�
		String itemList = "";	//���� ��ǰ ���
		
		for(int i=0; i<cart.length; i++) {
			if(cart[i]==null) break;
			//�̰� ��ƴ�. ���̻� �������� �ʾ����� �ݺ��� ����������
			sum += cart[i].price;
			itemList += cart[i]+", ";
			//cart[i].toString()
		}
		System.out.println("�����Ͻ� ��ǰ�� �ѱݾ��� "+sum+"�Դϴ�.");
		System.out.println("�����Ͻ� ��ǰ�� "+itemList+"�Դϴ�.");
	}
}


public class Ex7_09 {

	public static void main(String[] args) {
		Buyer2 b = new Buyer2();
		b.buy(new Tv22());
		b.buy(new Computer2());
		b.buy(new Audio2());
		
		b.summary();
		//�̷��� ȣ��!! 
		System.out.println("���� �ܾ��� "+b.money+"�Դϴ�.");
		System.out.println("���� ���ʽ������� "+b.bonusPoint+"�Դϴ�.");

	}

}
