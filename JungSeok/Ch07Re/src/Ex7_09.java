import java.util.Scanner;

class Product2{
	int price;
	int bonusPoint;
	
	Product2(int price){
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}
}

class Tv2 extends Product2{
	Tv2(){super(300);}
	public String toString() { return "Tv";}
}

class Computer2 extends Product2{
	Computer2(){super(200);}
	public String toString() { return "Computer";}
}

class Audio2 extends Product2{
	Audio2(){super(150);}
	public String toString() {	return "Audio";	}
}

class Buyer2{
	int money;
	int bonusPoint=0;
	
	Buyer2(int money){
		this.money = money;
	}
	//***1
	Product2[] cart = new Product2[10];	//cart�迭 �����
	int i = 0;	
	
	void buy(Product2 p) {
		if(money<p.price) {
			System.out.println(p+"��/�� �����ϱ⿡ �ܾ��� �����մϴ�.");
			return;
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		cart[i++] = p;	//�����ϸ� cart[i]�� ����
		System.out.println(p+"��/�� �����ϼ̽��ϴ�.");
	}
	//***2
	void summary() {
		int sum=0;
		String itemList="";
		
		for(int i=0; i<cart.length; i++) {
			if(cart[i]==null) break;
			//***3
			sum += cart[i].price;
			itemList += cart[i]+", ";
		}
		System.out.println("�����Ͻ� ��ǰ�� �� �ݾ��� "+sum+"�� �Դϴ�.");
		System.out.println("�����Ͻ� ��ǰ�� "+itemList+"�Դϴ�.");
	}
}


public class Ex7_09 {

	public static void main(String[] args) {
		System.out.print("�󸶸� ������ ��ʴϱ�? > ");
		Scanner scan = new Scanner(System.in);
//		int money = scan.nextInt();
		Buyer2 b = new Buyer2(scan.nextInt());
		b.buy(new Tv2());
		b.buy(new Computer2());
		b.buy(new Audio2());
		b.summary();
		System.out.println("���� �ܾ��� "+b.money+"���Դϴ�.");
		System.out.println("���� ���ʽ������� "+b.bonusPoint+"���Դϴ�.");
		scan.close();

	}

}
