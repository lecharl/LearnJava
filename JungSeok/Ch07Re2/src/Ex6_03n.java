class Card{
	String kind;
	int n;
	static int length;
	static int width;
	//1�⺻������
//	Card() {	//���� ����� ������ �ڵ��߰�
//		super();	//������ �ȿ� ������ ȣ�� ������ �ڵ��߰�
//	}
	//2�⺻������, ����Ʈ�� ���鶧1
//	Card(){
//		super();	//������ �ȿ� ������ ȣ�� ������ �ڵ��߰�
//		kind = "diamond";
//		n = 8;
//		length = 99;
//		width = 88;
//	}
	//3�Ű�������
	Card(String kind, int n, int l, int w){
		super();	//������ �ȿ� ������ ȣ�� ������ �ڵ��߰�
		this.kind = kind;
		this.n = n;
		length = l;
		width = w;
	}
	//4�⺻������, ����Ʈ�� ���鶧2
	//**�Ű������� ����� this()
	Card(){
		this("clover", 3, 51, 61);	//������ �ȿ� ������ ȣ�� �����Ƿ� (O)
	}
}




public class Ex6_03n {

	public static void main(String[] args) {
		//1�⺻������
//		Card c1 = new Card();
//		c1.kind = "spade";
//		c1.n = 1;
//		Card.length = 25;
//		Card.width = 15;
//		System.out.printf("Card(): %s,%d,%d,%d%n", c1.kind,c1.n,Card.length,Card.width);
		
		//2�⺻������
//		Card c2 = new Card();
//		System.out.printf("Card(): %s,%d,%d,%d%n", c2.kind,c2.n,Card.length,Card.width);
		
		//3�Ű�������
		Card c3 = new Card("heart", 2, 33, 44);
		System.out.printf("Card(s,i,i,i): %s,%d,%d,%d%n", c3.kind,c3.n,Card.length,Card.width);
		
		//4�Ű�������
		Card c4 = new Card();
		System.out.printf("Card(): %s,%d,%d,%d%n", c4.kind,c4.n,Card.length,Card.width);

	}

}
