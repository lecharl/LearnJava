import java.util.ArrayList;

class Product33{
	int price;
	int bonusPoint;
	
	public Product33(int price) {	//�Ű�������
		super();	//������ ù�ٿ� ������ ȣ���� ������ �ڵ����� �߰�
		this.price = price;
		bonusPoint = (int) (price / 10.0);
	}
}

class Tv33 extends Product33{
	public Tv33(int price) {	//�Ű�������
		super(price);	//������ ù�ٿ� ������ ȣ��
	}
	public String toString() { return "Tv";}
}

class Computer33 extends Product33{
	public Computer33(int price) {	//�Ű�������
		super(price);	//������ ù�ٿ� ������ ȣ��
	}
	public String toString() { return "Computer";}
}

class Buyer33{
	int money;
	int bonusPoint;
//	Product22[] cart = new Product22[10];;	//**��ٱ���, ���԰���
	ArrayList<Product33> list = new ArrayList<Product33>();
//	Product33[] cart;
	
	public Buyer33(int money) {
		this.money = money;
		bonusPoint = 0;
//		cart = new Product33[10];;
		System.out.println("���� �����ݾ��� "+money+"���Դϴ�.");
		System.out.println("���� ���ʽ������� "+bonusPoint+"���Դϴ�.");
	}
	int i=0;
	void buy(Product33 p) {
		if(money<p.price) {
			System.out.println("�ݾ��� �����Ͽ� "+p+"��/�� ������ �� �����ϴ�.");
			return;	//***
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		System.out.println(p+"��/�� �����ϼ̽��ϴ�.");
		list.add(p);	//********
	}
	
	void summary() {
		int sum = 0;	//�հ�****
		System.out.print("�����Ͻ� ��ǰ�� ");
		if(list.isEmpty()) {
			System.out.println("�����ϴ�.");
		} else {
			for(int i=0; i<list.size(); i++)
				sum += list.get(i).price;
			System.out.println(list+" �Դϴ�.");
		}
		System.out.println("�� ������ "+sum+"���Դϴ�.");
		System.out.println("�ܾ��� "+money+"���Դϴ�.");
		System.out.println("���ʽ������� "+bonusPoint+"���Դϴ�.");
	}
}




public class EX7_09_2 {

	public static void main(String[] args) {
		Buyer33 b = new Buyer33(1000);
		b.buy(new Tv33(1200));
//		b.buy(new Computer33(400));
//		b.buy(new Tv33(500));
		b.summary();

	}

}
