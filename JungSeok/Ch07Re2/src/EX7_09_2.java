import java.util.ArrayList;

class Product33{
	int price;
	int bonusPoint;
	
	public Product33(int price) {	//매개생성자
		super();	//생성자 첫줄에 생성자 호출이 없으면 자동으로 추가
		this.price = price;
		bonusPoint = (int) (price / 10.0);
	}
}

class Tv33 extends Product33{
	public Tv33(int price) {	//매개생성자
		super(price);	//생성자 첫줄에 생성자 호출
	}
	public String toString() { return "Tv";}
}

class Computer33 extends Product33{
	public Computer33(int price) {	//매개생성자
		super(price);	//생성자 첫줄에 생성자 호출
	}
	public String toString() { return "Computer";}
}

class Buyer33{
	int money;
	int bonusPoint;
//	Product22[] cart = new Product22[10];;	//**장바구니, 포함관계
	ArrayList<Product33> list = new ArrayList<Product33>();
//	Product33[] cart;
	
	public Buyer33(int money) {
		this.money = money;
		bonusPoint = 0;
//		cart = new Product33[10];;
		System.out.println("현재 소지금액은 "+money+"원입니다.");
		System.out.println("현재 보너스점수는 "+bonusPoint+"점입니다.");
	}
	int i=0;
	void buy(Product33 p) {
		if(money<p.price) {
			System.out.println("금액이 부족하여 "+p+"을/를 구입할 수 없습니다.");
			return;	//***
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		System.out.println(p+"을/를 구입하셨습니다.");
		list.add(p);	//********
	}
	
	void summary() {
		int sum = 0;	//합계****
		System.out.print("구입하신 제품은 ");
		if(list.isEmpty()) {
			System.out.println("없습니다.");
		} else {
			for(int i=0; i<list.size(); i++)
				sum += list.get(i).price;
			System.out.println(list+" 입니다.");
		}
		System.out.println("총 지출은 "+sum+"원입니다.");
		System.out.println("잔액은 "+money+"원입니다.");
		System.out.println("보너스점수는 "+bonusPoint+"점입니다.");
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
