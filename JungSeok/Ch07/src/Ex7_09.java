class Product2 {
	int price;
	int bonusPoint;
	
	Product2(int price) {
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}
}

class Tv22 extends Product2 {
	Tv22() {
		super(800);
	}
	public String toString() {
		return "Tv";
	}
}

class Computer2 extends Product2 {
	Computer2() {
		super(300);
	}
	public String toString() {
		return "Computer";
	}
}

class Audio2 extends Product2 {
	Audio2() {
		super(100);
	}
	public String toString() {
		return "Audio";
	}
}

class Buyer2 {
	int money = 1000;
	int bonusPoint = 0;
	
	Product2[] cart = new Product2[10];	//여기에 cart를 만드네?
	int i = 0;
	
	void buy(Product2 p) {
		if (money < p.price) {
			System.out.println("잔액이 부족하여 "+p+"을/를 구입할 수 없습니다.");
			//p.toString()
			return;
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		cart[i++] = p;	
		//구입한 제품의 주소를 Product2타입의 참조변수 배열 cart[i]에 저장
		System.out.println(p+"을/를 구입하셨습니다.");
		//p.toString()
	}
	
	void summary() {	//구매한 물품의 전체 정보
		int sum = 0;			//합계
		String itemList = "";	//구매 물품 목록
		
		for(int i=0; i<cart.length; i++) {
			if(cart[i]==null) break;
			//이거 어렵다. 더이상 구매하지 않았으면 반복문 빠져나오기
			sum += cart[i].price;
			itemList += cart[i]+", ";
			//cart[i].toString()
		}
		System.out.println("구입하신 물품의 총금액은 "+sum+"입니다.");
		System.out.println("구입하신 물품은 "+itemList+"입니다.");
	}
}


public class Ex7_09 {

	public static void main(String[] args) {
		Buyer2 b = new Buyer2();
		b.buy(new Tv22());
		b.buy(new Computer2());
		b.buy(new Audio2());
		
		b.summary();
		//이렇게 호출!! 
		System.out.println("현재 잔액은 "+b.money+"입니다.");
		System.out.println("현재 보너스점수는 "+b.bonusPoint+"입니다.");

	}

}
