class Parent{
	void parentMethod() {}
}

class Child extends Parent{

	@Override
	@Deprecated
	void parentMethod() {}
//	void parentmethod() {}	//���� �ֳ����̼��� ������ ������ ���� �ʴ´�.
	
}

@FunctionalInterface	//�Լ��� �������̽��� �ϳ��� �߻�޼ҵ常 ����!
interface Testable{
	void test();	//�߻�޼ҵ�
//	void check();	//�߻�޼ҵ�
}	//���� �ֳ����̼��� ������ ������ ���� �ʴ´�.


public class Ex12_07 {
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Child c = new Child();
		c.parentMethod();

	}

}
