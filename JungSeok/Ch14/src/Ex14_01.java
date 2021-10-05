
public class Ex14_01 {

	public static void main(String[] args) {
		//1. �͸�Ŭ������
		MyFunction f1 = new MyFunction() {
			@Override
			public void run() {
				System.out.println("f1.run!");
			}
		};
		f1.run();
		
		//2. ���ٽ�����
		MyFunction f2 = () -> System.out.println("f2.run!!");
		f2.run();
		
		//3. �Լ������並 �Ű������� ���, ���ٽ��� ȣ���ϴ� �޼ҵ�
		MyFunction f3 = () -> System.out.println("f3.run!!!");
		execute(f3);	//�� ������ ���̸�
		execute(() -> System.out.println("f3.run!!!"));
		
		//4. �Լ������䰡 ��ȯŸ��, ���ٽ��� ���� �޼ҵ�
		MyFunction f4 = getMyFunction();
		f4.run();
		//�̷��� �ٷε� �ȴ�!
		getMyFunction().run();
		

	}//main
	
	static void execute(MyFunction f) {
		f.run();	//���ٽ��� ȣ���ϴ� �޼ҵ�
	}
	
	static MyFunction getMyFunction() {
//		MyFunction f = () -> System.out.println("f4.run!!!!");
//		return f;
		return () -> System.out.println("f4.run!!!!");
	}

}

@FunctionalInterface
interface MyFunction{
	void run();
}
