class A{	//�ٸ� Ŭ������ �޼ҵ� ȣ��
	public void method(I b) {	//�������̽� I ������ ��üB, C�� �� �� ����!!!
		b.method();
	}
}
//������
interface I{
	void method();
}
//�˸���
class B implements I{
	public void method() {
		System.out.println("B�޼ҵ� ȣ��");
	}
}

class C implements I{
	public void method() {
		System.out.println("C�޼ҵ� ȣ��");
	}
}


public class InterfaceTest {

	public static void main(String[] args) {
		A a = new A();
		a.method(new B());	//A�� B, C�� ���(A�� B, C�� ����)
		a.method(new C());
	}

}
