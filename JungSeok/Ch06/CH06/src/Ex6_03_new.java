class Card2 {
	String kind;	// iv
	int number;
	
	static int length;	// StaticV 
	static int width;
	
	Card2 (){}	// �⺻������
	Card2 (String k, int n, int l, int w){	// ������
		kind = k;
		number = n;
		length = l;		// sv �ᵵ �ǳ�?
		width = w;
	}
	
	
	
}

public class Ex6_03_new {

	public static void main(String[] args) {
		// ������ ����. ex06_3. java_19
		// iv ���
		Card2 c1 = new Card2();
		c1.kind = "spade";
		c1.number = 4;
		System.out.println("c1�� kind : "+c1.kind+", number : "+c1.number);
		
		// StaticV ���
		Card2.length = 250;
		Card2.width = 180;
		System.out.println("c1�� length : "+Card2.length+", width : "+Card2.width);
		
		// ������
		Card2 c2 = new Card2("heart", 10, 500, 300);
		System.out.println("c2�� kind : "+c2.kind+", number : "+c2.number);
		System.out.println("c2�� length : "+Card2.length+", width : "+Card2.width);
		// ���⵵ sv�̹Ƿ� Ŭ���������� ȣ���ؾ� �Ѵ�!!
		//�׷��� �ƿ� �ٲ���°�?
		System.out.println("c1�� length : "+Card2.length+", width : "+Card2.width);
		//�׷���.

	}

}
