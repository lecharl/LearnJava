class Product22{
	int price;
	int bonusPoint;
	
	public Product22(int price) {	//�Ű�������
		super();	//������ ù�ٿ� ������ ȣ���� ������ �ڵ����� �߰�
		this.price = price;
		bonusPoint = (int) (price / 10.0);
	}
}

class Tv22 extends Product22{
	public Tv22(int price) {	//�Ű�������
		super(price);	//������ ù�ٿ� ������ ȣ��
	}
	public String toString() { return "Tv";}
}

class Computer22 extends Product22{
	public Computer22(int price) {	//�Ű�������
		super(price);	//������ ù�ٿ� ������ ȣ��
	}
	public String toString() { return "Computer";}
}

class Buyer22{
	int money;
	int bonusPoint;
//	Product22[] cart = new Product22[10];;	//**��ٱ���, ���԰���
	Product22[] cart;
	
	public Buyer22(int money) {
		this.money = money;
		bonusPoint = 0;
		cart = new Product22[10];;
		System.out.println("���� �����ݾ��� "+money+"���Դϴ�.");
		System.out.println("���� ���ʽ������� "+bonusPoint+"���Դϴ�.");
	}
	int i=0;
	void buy(Product22 p) {
		if(money<p.price) {
			System.out.println("�ݾ��� �����Ͽ� "+p+"��/�� ������ �� �����ϴ�.");
			return;	//***
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		System.out.println(p+"��/�� �����ϼ̽��ϴ�.");
		cart[i++] = p;	//*******
	}
	
	void summary() {
		int sum = 0;	//�հ�****
		String itemList = "";	//���Ÿ��****
		System.out.print("�����Ͻ� ��ǰ�� ");
		if(cart[0] == null) {
			System.out.println("�����ϴ�.");
		} else {
			for(int i=0; i<=cart.length; i++) {
				if(cart[i]==null) break;	//*****
				sum += cart[i].price;
				itemList += cart[i]+", ";	//****
			}
			System.out.println(itemList+"�Դϴ�.");
		}
		System.out.println("�� ������ "+sum+"���Դϴ�.");
		System.out.println("�ܾ��� "+money+"���Դϴ�.");
		System.out.println("���ʽ������� "+bonusPoint+"���Դϴ�.");
	}
}


public class Ex7_09 {

	public static void main(String[] args) {
		Buyer22 b = new Buyer22(1000);
		b.buy(new Tv22(1200));
		b.buy(new Computer22(400));
		b.buy(new Tv22(500));
		b.summary();

	}

}
