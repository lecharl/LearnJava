class Outer{
	InstanceInner iii = new InstanceInner();
	int ff = 77;
	class InstanceInner{
		int fi = ff;
		int iv = 10;
		static int cv = 100;	//????????
		final static int Const = 1000;
	}
	
	StaticInner sii = new StaticInner();
	static class StaticInner{
//		int fi2 = ff;	//�ܺ�Ŭ������ iv�� ���� �Ұ���
		int iv2 = 20;
		static int cv2 = 200;
		final static int Const2 = 2000;
	}
	void myMethod() {
		int f = 55;		//�̰� ������??
		class LocalInner{
			int iv3 = 30;
			static int cv3 = 300;	//???????
			final static int Const3 = 3000;
		}
		System.out.println(f);
		LocalInner li = new LocalInner();	//iv3������
		System.out.println(li.iv3);
		System.out.println(LocalInner.cv3);
		System.out.println(LocalInner.Const3);
	}
}



public class Ex7_15 {

	public static void main(String[] args) {
		//�ν��Ͻ�����Ŭ���� ��� ���
		//�ܺΰ�ü�� ���� �����ϰ� ���ΰ�ü�� �����ؾ� �Ѵ�!
		Outer o = new Outer();
		Outer.InstanceInner ii = o.new InstanceInner();
		//***�ν��Ͻ� ���ΰ�ü �������
		
		System.out.println(ii.iv);
		System.out.println(o.iii.iv);
		System.out.println(ii.fi);
		System.out.println(Outer.InstanceInner.cv);		//��ü�������� ����
		System.out.println(Outer.InstanceInner.Const);	//��ü�������� ����
		
		//static����Ŭ���� ��� ���
		//�ܺΰ�ü ���� ���ϰ� �ٷ� ���ΰ�ü ���� ����!
		Outer.StaticInner si = new Outer.StaticInner();
		//***static���ΰ�ü �������
		
		System.out.println(si.iv2);
		System.out.println(o.sii.iv2);
		System.out.println(Outer.StaticInner.cv2);		//��ü�������� ����
		System.out.println(Outer.StaticInner.Const2);	//��ü�������� ����
		
		o.myMethod();

	}

}
