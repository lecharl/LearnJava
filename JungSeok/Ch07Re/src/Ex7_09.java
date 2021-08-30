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
	Product2[] cart = new Product2[10];	//cart배열 만들기
	int i = 0;	
	
	void buy(Product2 p) {
		if(money<p.price) {
			System.out.println(p+"을/를 구입하기에 잔액이 부족합니다.");
			return;
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		cart[i++] = p;	//구입하면 cart[i]에 저장
		System.out.println(p+"을/를 구입하셨습니다.");
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
		System.out.println("구입하신 물품의 총 금액은 "+sum+"원 입니다.");
		System.out.println("구입하신 제품은 "+itemList+"입니다.");
	}
}


public class Ex7_09 {

	public static void main(String[] args) {
		System.out.print("얼마를 가지고 계십니까? > ");
		Scanner scan = new Scanner(System.in);
//		int money = scan.nextInt();
		Buyer2 b = new Buyer2(scan.nextInt());
		b.buy(new Tv2());
		b.buy(new Computer2());
		b.buy(new Audio2());
		b.summary();
		System.out.println("현재 잔액은 "+b.money+"원입니다.");
		System.out.println("현재 보너스점수는 "+b.bonusPoint+"점입니다.");
		scan.close();

	}

}
