package ch06.c1;

class Card {
	String kind;
	int number;
	
	static int width = 100;
	static int height = 250;
}


public class Ex6_3 {

	public static void main(String[] args) {
		// 카드
		
		System.out.println("Card.width = "+Card.width);
		System.out.println("Card.width = "+Card.height);
		
		Card c1 = new Card();
		c1.kind = "heart";
		c1.number = 7;
		
		Card c2 = new Card();
		c2.kind = "spade";
		c2.number = 4;
		
		System.out.println("c1은 "+c1.kind+", "+c1.number+"이고, 크기는 "+Card.width+", "+Card.height+"입니다.");
		System.out.println("c2는 "+c2.kind+", "+c2.number+"이고, 크기는 "+Card.width+", "+Card.height+"입니다.");
		System.out.println("c1의 width와 height를 각각 50, 80으로 변경합니다.");
		
		Card.width = 50;
		Card.width = 80;
		
		System.out.println("c1은 "+c1.kind+", "+c1.number+"이고, 크기는 "+Card.width+", "+Card.height+"입니다.");
		System.out.println("c2는 "+c2.kind+", "+c2.number+"이고, 크기는 "+Card.width+", "+Card.height+"입니다.");
		
	}

}
