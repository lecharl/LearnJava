class MyMath2 {
	
	long a, b;  //�ν��Ͻ� �޼ҵ�
	
	long instanceadd() {   //�ν��Ͻ� �޼ҵ�
		return a+b;	
	}
	
	static long staticadd(long a, long b) {    //static �޼ҵ�, ��������lv
		return a+b;    //��������lv
	}
}


public class MyMathTest2 {

	public static void main(String[] args) {
		// static �����ϱ�
		// static�� �䷸��
		System.out.println("static �޼ҵ� : "+MyMath2.staticadd(20L, 10L));
		// ��ü���� �ٷ� ȣ��

		// �ν��Ͻ��� �䷸��
		MyMath2 mm = new MyMath2();    // ��ü ���� �ʼ�
		mm.a = 22L;    // ��ü ���� �� ���������� �ν��Ͻ� ���� �ҷ���
		mm.b = 11L;    // ��������.�ν��Ͻ�����
		System.out.println("�ν��Ͻ� �޼ҵ� : "+mm.instanceadd());
		// ��������.�ν��Ͻ��޼ҵ�

	}

}
