
public class MM2_new {

	public static void main(String[] args) {
		// MyMathTest2�� ������ ����, JAVA_22
		// static
		System.out.println("static : "+MM22.staticadd(10L, 1L));
		// ��ü���� �ٷ� ȣ��
		
		// �ν��Ͻ�
		MM22 mm2 = new MM22();	// ��ü ����
		mm2.a = 20L;	// ��������.iv
		mm2.b = 2L;
		System.out.println("instance : "+mm2.instancadd());
		// ��������.�ν��Ͻ��޼ҵ�
		
		// ������
		MM22 mm3 = new MM22 (30L, 3L);
		System.out.println("lv+structor : "+(mm3.a+mm3.b));
		
	}

}

class MM22 {
	long a, b;	// iv
	
	// static �޼ҵ�
	static long staticadd(long x, long y) {	// �Ű��������� lv
		 return x+y;
	}
	
	// �ν��Ͻ� �޼ҵ�
	long instancadd(){
		return a+b;	// iv
	}
	
	// �Ű������� �ִ� ������ (�޼ҵ�)
	MM22 (){}
	MM22(long x, long y) {	// ��ȯŸ���� ����.
		a = x;	// iv
		b = y;
	}
	
}
