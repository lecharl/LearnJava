class Product {
	int price;
	int bonusPoint;
	
	Product(int price){	//������
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}
}

class Tv1 extends Product {
	Tv1(){	//������
		super(1100);	//����Ŭ�� �����ڸ� super����� ȣ���ϰ� this.~ �ʱ�ȭ
	}
	
	//ObjectŬ�� toString() �������̵�, public�� ���� �ִ� ��
	public String toString() {
		return "Tv";
	}
	
}
class Computer extends Product {
	Computer(){
		super(300);
	}
	
	public String toString() {
		return "Computer";
	}
}

class Buyer {
	int money = 1000;
	int bonusPoint = 0;
	
	//(Tv1 t)...�� �ݺ��ϴ� �ͺ��� ������ (Product p)��
	void buy(Product p) {
		if(money < p.price) {
			System.out.println(p+"��/�� �����ϱ⿡ �ܾ��� �����մϴ�.");
			return;
		}
			
		money -= p.price;
		bonusPoint += p.bonusPoint;
		System.out.println(p+"��/�� �����ϼ̽��ϴ�.");
		//p.toString()
	}
}

public class Ex7_08 {

	public static void main(String[] args) {
		Buyer b = new Buyer();
		
//		Product p = new Tv1();
//		b.buy(p);	
		//p�� ���� ���� ����ְų�(p�� ���� ����� ���� �ִ� ��� �����)
		//�Ʒ�ó�� �ٷ� ���� �� �ִ�.
		b.buy(new Tv1());		//buy�޼ҵ� ȣ��
		b.buy(new Computer());	
		//�� �Ű������� ��������, �� �ּҰ�
		//new ~�� ���� ��ü ������?
		
		System.out.println("���� ���� ���� "+b.money+"�Դϴ�.");
		System.out.println("���� ���ʽ������� "+b.bonusPoint+"�Դϴ�.");

	}

}
