
public class MM2_new {

	public static void main(String[] args) {
		// MyMathTest2�� ������ ����, JAVA_22
		// static
		System.out.println("static : "+MM2_new2.staticadd(10L, 1L));
		// ��ü���� �ٷ� ȣ��
		
		// �ν��Ͻ�
		MM2_new2 mm2 = new MM2_new2();	// ��ü ����
		mm2.a = 20L;	// ��������.iv
		mm2.b = 2L;
		System.out.println("instance : "+mm2.instancadd());
		// ��������.�ν��Ͻ��޼ҵ�
		
		// ������
		MM2_new2 mm3 = new MM2_new2 (30L, 3L);
		System.out.println("lv+structor : "+(mm3.a+mm3.b));

	}

}

class MM2_new2 {
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
	MM2_new2 (){}
	MM2_new2(long x, long y) {	// ��ȯŸ���� ����.
		a = x;	// iv
		b = y;

	}
}
