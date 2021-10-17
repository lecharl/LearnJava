class Product{
	int price;
	int bonusPoint;
	
	public Product(int price) {	//매개생성자
		super();	//생성자 첫줄에 생성자 호출이 없으므로 자동으로
		this.price = price;
		bonusPoint = (int) (price/10.0);
	}
}

class Tvv extends Product{

	public Tvv(int price) {	//매개생성자
		super(price);	//생성자 첫줄에 생성자 호출이 있음(없으면 super() 자동으로)
	}
	
	public String toString() { return "Tv";}
	
}

class Computer extends Product{

	public Computer(int price) {	//매개생성자
		super(price);
	}
	public String toString() { return "Computer";}
	
}

class Buyer{
	int money;
	int bonusPoint;
	
	public Buyer(int money) {	//매개생성자
		super();	//생성자 첫줄에 생성자 호출이 없으므로 자동으로
		this.money = money;
		bonusPoint = 0;
		System.out.println("현재 소지금액은 "+money+"원입니다.");
		System.out.println("현재 보너스점수는 "+bonusPoint+"점입니다.");
	}
	
	void buy(Product p) {
		if(money<p.price) {
			System.out.println("금액이 부족하여 "+p+"을/를 구입하실 수 없습니다.");
			//******return; 으로 안끝내면 다음 문장들이 실행됨!!!
			return;
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		System.out.println(p+"을/를 구입하셨습니다.");
	}
}

public class Ex7_08 {

	public static void main(String[] args) {
		Buyer b = new Buyer(1000);
		b.buy(new Tvv(500));
		b.buy(new Computer(3000));

		System.out.println("잔액은 "+b.money+"원입니다.");
		System.out.println("보너스점수는 "+b.bonusPoint+"점입니다.");
	}

}
