class Card{
	String kind;
	int n;
	static int length;
	static int width;
	
	Card(){		//생성자 따로 만들었는데 기본생성자 호출했으므로 반드시 필요
		super();	//자동추가, Object클래스 호출
	}
	
//	Card(){		//디폴트값 만들고 싶을 때, 기본생성자
//		super();	//자동추가, Object클래스 호출
//		kind = "heart";
//		n = 6;	
//		length = 200;
//		width = 150;
//	}
	
//	Card(){		//디폴트값 만들고 싶을 때, 기본생성자
//		this("heart", 6, 200, 150);
//		//생성자 호출했으므로 따로 필요없음!
//	}
//	
	
	Card(String k, int n, int l, int w){
		super();		//자동추가, Object클래스 호출
		kind = k;
		this.n = n;		//*iv*를 lv로부터 구분
		length = l;		//cv는 언제나 사용해도 되니까!
		width = w;
	}
}



public class Ex6_03n {

	public static void main(String[] args) {
		Card c1 = new Card();	//기본생성자
		c1.kind = "spade";
		c1.n = 4;
		Card.length = 100;
		Card.width = 50;
		System.out.printf("기본생성자 방식 : %s, %d, %d, %d%n", c1.kind, c1.n, Card.length, Card.width);
		
		Card c2 = new Card();	//기본생성자2, 기본생성자 하나로 두개 객체 생성!(당연하지만)
		c2.kind = "heart";
		c2.n = 6;
		Card.length = 200;
		Card.width = 150;
		System.out.printf("기본생성자2 방식 : %s, %d, %d, %d%n", c2.kind, c2.n, Card.length, Card.width);
		
		Card c3 = new Card("clover", 12, 300, 250);	//매개생성자
		System.out.printf("매개생성자 방식 : %s, %d, %d, %d%n", c3.kind, c3.n, Card.length, Card.width);

	}

}
