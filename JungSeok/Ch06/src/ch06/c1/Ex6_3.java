package ch06.c1;

class Card {
	String kind;
	int number;
	
	static int width = 100;
	static int height = 250;
}


public class Ex6_3 {

	public static void main(String[] args) {
		// ī��
		
		System.out.println("Card.width = "+Card.width);
		System.out.println("Card.width = "+Card.height);
		
		Card c1 = new Card();
		c1.kind = "heart";
		c1.number = 7;
		
		Card c2 = new Card();
		c2.kind = "spade";
		c2.number = 4;
		
		System.out.println("c1�� "+c1.kind+", "+c1.number+"�̰�, ũ��� "+Card.width+", "+Card.height+"�Դϴ�.");
		System.out.println("c2�� "+c2.kind+", "+c2.number+"�̰�, ũ��� "+Card.width+", "+Card.height+"�Դϴ�.");
		System.out.println("c1�� width�� height�� ���� 50, 80���� �����մϴ�.");
		
		Card.width = 50;
		Card.width = 80;
		
		System.out.println("c1�� "+c1.kind+", "+c1.number+"�̰�, ũ��� "+Card.width+", "+Card.height+"�Դϴ�.");
		System.out.println("c2�� "+c2.kind+", "+c2.number+"�̰�, ũ��� "+Card.width+", "+Card.height+"�Դϴ�.");
		
	}

}