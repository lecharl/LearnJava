class Card{
	String kind;
	int n;
	static int length;
	static int width;
	//1기본생성자
//	Card() {	//따로 만든게 없으면 자동추가
//		super();	//생성자 안에 생성자 호출 없으면 자동추가
//	}
	//2기본생성자, 디폴트값 만들때1
//	Card(){
//		super();	//생성자 안에 생성자 호출 없으면 자동추가
//		kind = "diamond";
//		n = 8;
//		length = 99;
//		width = 88;
//	}
	//3매개생성자
	Card(String kind, int n, int l, int w){
		super();	//생성자 안에 생성자 호출 없으면 자동추가
		this.kind = kind;
		this.n = n;
		length = l;
		width = w;
	}
	//4기본생성자, 디폴트값 만들때2
	//**매개생성자 만들고 this()
	Card(){
		this("clover", 3, 51, 61);	//생성자 안에 생성자 호출 했으므로 (O)
	}
}




public class Ex6_03n {

	public static void main(String[] args) {
		//1기본생성자
//		Card c1 = new Card();
//		c1.kind = "spade";
//		c1.n = 1;
//		Card.length = 25;
//		Card.width = 15;
//		System.out.printf("Card(): %s,%d,%d,%d%n", c1.kind,c1.n,Card.length,Card.width);
		
		//2기본생성자
//		Card c2 = new Card();
//		System.out.printf("Card(): %s,%d,%d,%d%n", c2.kind,c2.n,Card.length,Card.width);
		
		//3매개생성자
		Card c3 = new Card("heart", 2, 33, 44);
		System.out.printf("Card(s,i,i,i): %s,%d,%d,%d%n", c3.kind,c3.n,Card.length,Card.width);
		
		//4매개생성자
		Card c4 = new Card();
		System.out.printf("Card(): %s,%d,%d,%d%n", c4.kind,c4.n,Card.length,Card.width);

	}

}
