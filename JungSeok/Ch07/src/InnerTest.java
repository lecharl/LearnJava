class AA{
	int i=100;
	BB b = new BB();	//����Ŭ����BB ��ü ����
	
	class BB{
		void method() {
//			AA a = new AA();	
			//��� ��! ��ü�������� �ܺ�Ŭ���� ��� ���� ����
			System.out.println(i);	//a.i -> i 
		}
	}
}


public class InnerTest {

	public static void main(String[] args) {
//		BB b = new BB();	//����. �ۿ��� ����Ŭ���� �������� ����
//		b.method();
		AA a = new AA();
		a.b.method();

	}

}
