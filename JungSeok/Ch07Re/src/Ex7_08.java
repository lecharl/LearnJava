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
			System.out.println(p+"을/를 구입하기에 잔액이 부족합니다.");
			return;
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		System.out.println(p+"을/를 구입하셨습니다.");
	}
}


public class Ex7_08 {

	public static void main(String[] args) {
		System.out.print("얼마를 가지고 계십니까? > ");
		Scanner scan = new Scanner(System.in);
		int money = scan.nextInt();
		Buyer b = new Buyer(money);
		
		b.buy(new Tv());
		b.buy(new Computer());
		
		System.out.println("현재 잔액은 "+b.money+"원입니다.");
		System.out.println("현재 보너스점수는 "+b.bonusPoint+"점입니다.");

		scan.close();
	}

}
