
public class Ex7_12 {

	InstanceInner ii = new InstanceInner();	//iv������
	class InstanceInner{
		int iv = 10;
		static int cv = 100;	//????????
		final static int Const = 1000;
	}
	StaticInner si = new StaticInner();		//iv2������
	static class StaticInner{
		int iv2 = 20;
		static int cv2 = 200;
		final static int Const2 = 2000;
	}
	
	void myMethod() {
		class LocalInner{
			int iv3 = 30;
			static int cv3 = 300;	//???????
			final static int Const3 = 3000;
		}
		System.out.println(LocalInner.cv3);
		System.out.println(LocalInner.Const3);
		LocalInner li = new LocalInner();	//iv3������
		System.out.println(li.iv3);
	}

	public static void main(String[] args) {
		System.out.println(InstanceInner.cv);
		System.out.println(InstanceInner.Const);
		Ex7_12 ex = new Ex7_12();
		System.out.println(ex.ii.iv);	//�ȿ�����,�ۿ����� ��ü�����ؾ� ����
		System.out.println();
		
		System.out.println(StaticInner.cv2);
		System.out.println(StaticInner.Const2);
		System.out.println(ex.si.iv2);	//�ȿ�����,�ۿ����� ��ü�����ؾ� ����
		System.out.println();
		
//		System.out.println(LocalInner.cv3);	//�ȵ�! myMethod()�ȿ����� ����
		ex.myMethod();

	}

}
