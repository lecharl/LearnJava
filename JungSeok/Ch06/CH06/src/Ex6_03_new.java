class Card2 {
	String kind;	// iv
	int number;
	
	static int length;	// StaticV 
	static int width;
	
	Card2 (){}	// 기본생성자
	Card2 (String k, int n, int l, int w){	// 생성자
		kind = k;
		number = n;
		length = l;		// sv 써도 되네?
		width = w;
	}
	
	
	
}

public class Ex6_03_new {

	public static void main(String[] args) {
		// 생성자 버전. ex06_3. java_19
		// iv 사용
		Card2 c1 = new Card2();
		c1.kind = "spade";
		c1.number = 4;
		System.out.println("c1의 kind : "+c1.kind+", number : "+c1.number);
		
		// StaticV 사용
		Card2.length = 250;
		Card2.width = 180;
		System.out.println("c1의 length : "+Card2.length+", width : "+Card2.width);
		
		// 생성자
		Card2 c2 = new Card2("heart", 10, 500, 300);
		System.out.println("c2의 kind : "+c2.kind+", number : "+c2.number);
		System.out.println("c2의 length : "+Card2.length+", width : "+Card2.width);
		// 여기도 sv이므로 클래스명으로 호출해야 한다!!
		//그러면 아예 바뀌었는가?
		System.out.println("c1의 length : "+Card2.length+", width : "+Card2.width);
		//그렇다.

	}

}
