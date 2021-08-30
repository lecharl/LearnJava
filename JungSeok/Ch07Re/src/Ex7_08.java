import java.util.Scanner;

class Product{
	int price;
	int bonusPoint;
	
	Product(int price) {
		this.price = price;
		bonusPoint = (int)(price / 10.0);
	}
}

class Tv extends Product{
	Tv(){
		super(1100);
	}
	public String toString() { return "Tv";}
}

class Computer extends Product{
	Computer() {
		super(300);
	}
	public String toString() { return "Computer";}
}

class Buyer{
	int money;
	int bonusPoint = 0;
	
	Buyer(int money){
		this.money = money;
	}
	
	void buy(Product p) {
		if(money < p.price) {
			System.out.println(p+"��/�� �����ϱ⿡ �ܾ��� �����մϴ�.");
			return;
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		System.out.println(p+"��/�� �����ϼ̽��ϴ�.");
	}
}


public class Ex7_08 {

	public static void main(String[] args) {
		System.out.print("�󸶸� ������ ��ʴϱ�? > ");
		Scanner scan = new Scanner(System.in);
		int money = scan.nextInt();
		Buyer b = new Buyer(money);
		
		b.buy(new Tv());
		b.buy(new Computer());
		
		System.out.println("���� �ܾ��� "+b.money+"���Դϴ�.");
		System.out.println("���� ���ʽ������� "+b.bonusPoint+"���Դϴ�.");

		scan.close();
	}

}
