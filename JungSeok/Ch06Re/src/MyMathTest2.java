class MyMath2{
	//iv
	long a, b;
	
	//������ �ڵ��߰�
	MyMath2(){
		super();	//������ȣ�� �ڵ��߰�
	}
	
	//ins�޼ҵ�1
	long insAdd() {	
		return a+b;
	}
	
	//static�޼ҵ�1
	static long staticAdd1(long a, long b) {
		return a+b;	//�Ű������� ���� ��������lv
		//iv ������!!
	}
}

public class MyMathTest2 {
	
	long a=77L, b=88L;
	
	//ins�޼ҵ�2
	long insAdd() {	
		return a+b;
	}

	//static�޼ҵ�2
	static long staticAdd1(long a, long b) {
		return a+b;	//�Ű�����
	}
	
	public static void main(String[] args) {
		//ins�޼ҵ� : ��ü����+��������.
		MyMath2 mm1 = new MyMath2();	//�⺻������
		mm1.a = 11L;
		mm1.b = 22L;
		System.out.println("��_�ν��Ͻ��޼ҵ�1 : "+mm1.insAdd());
		
		//ins�޼ҵ� : ���� Ŭ������ ��ü����+��������.
		MyMathTest2 mm2 = new MyMathTest2();
		mm2.insAdd();
		System.out.println("��_�ν��Ͻ��޼ҵ�2 : "+mm2.insAdd());
		
		//static�޼ҵ� : �ٷ�! �ٸ� Ŭ������� +Ŭ������.
		System.out.println("��_static�޼ҵ�1 : "+MyMath2.staticAdd1(33L, 44L));
		
		//static�޼ҵ� : �ٷ�! ���� Ŭ������� �޼ҵ常 ���!!
		System.out.println("��_static�޼ҵ�2 : "+staticAdd1(55L, 66L));
		

	}

}
