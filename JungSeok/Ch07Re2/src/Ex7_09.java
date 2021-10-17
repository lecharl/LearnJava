class Product22{
	int price;
	int bonusPoint;
	
	public Product22(int price) {	//매개생성자
		super();	//생성자 첫줄에 생성자 호출이 없으면 자동으로 추가
		this.price = price;
		bonusPoint = (int) (price / 10.0);
	}
}

class Tv22 extends Product22{
	public Tv22(int price) {	//매개생성자
		super(price);	//생성자 첫줄에 생성자 호출
	}
	public String toString() { return "Tv";}
}

class Computer22 extends Product22{
	public Computer22(int price) {	//매개생성자
		super(price);	//생성자 첫줄에 생성자 호출
	}
	public String toString() { return "Computer";}
}

class Buyer22{
	int money;
	int bonusPoint;
//	Product22[] cart = new Product22[10];;	//**장바구니, 포함관계
	Product22[] cart;
	
	public Buyer22(int money) {
		this.money = money;
		bonusPoint = 0;
		cart = new Product22[10];;
		System.out.println("현재 소지금액은 "+money+"원입니다.");
		System.out.println("현재 보너스점수는 "+bonusPoint+"점입니다.");
	}
	int i=0;
	void buy(Product22 p) {
		if(money<p.price) {
			System.out.println("금액이 부족하여 "+p+"을/를 구입할 수 없습니다.");
			return;	//***
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		System.out.println(p+"을/를 구입하셨습니다.");
		cart[i++] = p;	//*******
	}
	
	void summary() {
		int sum = 0;	//합계****
		String itemList = "";	//구매목록****
		System.out.print("구입하신 제품은 ");
		if(cart[0] == null) {
			System.out.println("없습니다.");
		} else {
			for(int i=0; i<=cart.length; i++) {
				if(cart[i]==null) break;	//*****
				sum += cart[i].price;
				itemList += cart[i]+", ";	//****
			}
			System.out.println(itemList+"입니다.");
		}
		System.out.println("총 지출은 "+sum+"원입니다.");
		System.out.println("잔액은 "+money+"원입니다.");
		System.out.println("보너스점수는 "+bonusPoint+"점입니다.");
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
