class AA{
	int i=100;
	BB b = new BB();	//����Ŭ����BB ��ü ����
	
	class BB{
		void method() {
//			AA aa = new AA();	
			//��� ��! ��ü�������� �ܺ�Ŭ���� ��� ���� ����
			System.out.println(i);	//aa.i -> i 
		}
	}
}


public class InnerTest {

	public static void main(String[] args) {
//		BB b = new BB();	//����. �ۿ��� ����Ŭ���� �������� ����
//		b.method();
		AA aa = new AA();
		AA.BB bb = aa.new BB();	//1. �� �� ��!!
		bb.method();
		aa.b.method();	//2. ���赵 �� ��ü ����

	}

}
