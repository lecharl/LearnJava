class Product {
	int price;
	int bonusPoint;
	
	Product(int price){	//생성자
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}
}

class Tv1 extends Product {
	Tv1(){	//생성자
		super(1100);	//조상클의 생성자를 super사용해 호출하고 this.~ 초기화
	}
	
	//Object클의 toString() 오버라이딩, public은 원래 있던 거
	public String toString() {
		return "Tv";
	}
	
}
class Computer extends Product {
	Computer(){
		super(300);
	}
	
	public String toString() {
		return "Computer";
	}
}

class Buyer {
	int money = 1000;
	int bonusPoint = 0;
	
	//(Tv1 t)...를 반복하는 것보다 조상인 (Product p)로
	void buy(Product p) {
		if(money < p.price) {
			System.out.println(p+"을/를 구입하기에 잔액이 부족합니다.");
			return;
		}
			
		money -= p.price;
		bonusPoint += p.bonusPoint;
		System.out.println(p+"을/를 구입하셨습니다.");
		//p.toString()
	}
}

public class Ex7_08 {

	public static void main(String[] args) {
		Buyer b = new Buyer();
		
//		Product p = new Tv1();
//		b.buy(p);	
		//p를 따로 만들어서 집어넣거나(p를 따로 사용할 데가 있는 경우 만들고)
		//아래처럼 바로 넣을 수 있다.
		b.buy(new Tv1());		//buy메소드 호출
		b.buy(new Computer());	
		//각 매개변수는 참조변수, 즉 주소값
		//new ~를 통해 객체 생성함?
		
		System.out.println("현재 남은 돈은 "+b.money+"입니다.");
		System.out.println("현재 보너스점수는 "+b.bonusPoint+"입니다.");

	}

}
