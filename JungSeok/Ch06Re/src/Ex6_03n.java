class Card{
	String kind;
	int n;
	static int length;
	static int width;
	
	Card(){		//������ ���� ������µ� �⺻������ ȣ�������Ƿ� �ݵ�� �ʿ�
		super();	//�ڵ��߰�, ObjectŬ���� ȣ��
	}
	
//	Card(){		//����Ʈ�� ����� ���� ��, �⺻������
//		super();	//�ڵ��߰�, ObjectŬ���� ȣ��
//		kind = "heart";
//		n = 6;	
//		length = 200;
//		width = 150;
//	}
	
//	Card(){		//����Ʈ�� ����� ���� ��, �⺻������
//		this("heart", 6, 200, 150);
//		//������ ȣ�������Ƿ� ���� �ʿ����!
//	}
//	
	
	Card(String k, int n, int l, int w){
		super();		//�ڵ��߰�, ObjectŬ���� ȣ��
		kind = k;
		this.n = n;		//*iv*�� lv�κ��� ����
		length = l;		//cv�� ������ ����ص� �Ǵϱ�!
		width = w;
	}
}



public class Ex6_03n {

	public static void main(String[] args) {
		Card c1 = new Card();	//�⺻������
		c1.kind = "spade";
		c1.n = 4;
		Card.length = 100;
		Card.width = 50;
		System.out.printf("�⺻������ ��� : %s, %d, %d, %d%n", c1.kind, c1.n, Card.length, Card.width);
		
		Card c2 = new Card();	//�⺻������2, �⺻������ �ϳ��� �ΰ� ��ü ����!(�翬������)
		c2.kind = "heart";
		c2.n = 6;
		Card.length = 200;
		Card.width = 150;
		System.out.printf("�⺻������2 ��� : %s, %d, %d, %d%n", c2.kind, c2.n, Card.length, Card.width);
		
		Card c3 = new Card("clover", 12, 300, 250);	//�Ű�������
		System.out.printf("�Ű������� ��� : %s, %d, %d, %d%n", c3.kind, c3.n, Card.length, Card.width);

	}

}
