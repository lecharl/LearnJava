class Product{
	int price;
	int bonusPoint;
	
	public Product(int price) {	//�Ű�������
		super();	//������ ù�ٿ� ������ ȣ���� �����Ƿ� �ڵ�����
		this.price = price;
		bonusPoint = (int) (price/10.0);
	}
}

class Tvv extends Product{

	public Tvv(int price) {	//�Ű�������
		super(price);	//������ ù�ٿ� ������ ȣ���� ����(������ super() �ڵ�����)
	}
	
	public String toString() { return "Tv";}
	
}

class Computer extends Product{

	public Computer(int price) {	//�Ű�������
		super(price);
	}
	public String toString() { return "Computer";}
	
}

class Buyer{
	int money;
	int bonusPoint;
	
	public Buyer(int money) {	//�Ű�������
		super();	//������ ù�ٿ� ������ ȣ���� �����Ƿ� �ڵ�����
		this.money = money;
		bonusPoint = 0;
		System.out.println("���� �����ݾ��� "+money+"���Դϴ�.");
		System.out.println("���� ���ʽ������� "+bonusPoint+"���Դϴ�.");
	}
	
	void buy(Product p) {
		if(money<p.price) {
			System.out.println("�ݾ��� �����Ͽ� "+p+"��/�� �����Ͻ� �� �����ϴ�.");
			//******return; ���� �ȳ����� ���� ������� �����!!!
			return;
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		System.out.println(p+"��/�� �����ϼ̽��ϴ�.");
	}
}

public class Ex7_08 {

	public static void main(String[] args) {
		Buyer b = new Buyer(1000);
		b.buy(new Tvv(500));
		b.buy(new Computer(3000));

		System.out.println("�ܾ��� "+b.money+"���Դϴ�.");
		System.out.println("���ʽ������� "+b.bonusPoint+"���Դϴ�.");
	}

}
