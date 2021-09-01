class Outer{
	InstanceInner iii = new InstanceInner();
	class InstanceInner{
		int iv = 10;
		static int cv = 100;	//????????
		final static int Const = 1000;
	}
	
	StaticInner sii = new StaticInner();
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
		LocalInner li = new LocalInner();	//iv3쓰려면
		System.out.println(li.iv3);
		System.out.println(LocalInner.cv3);
		System.out.println(LocalInner.Const3);
	}
}



public class Ex7_15 {

	public static void main(String[] args) {
		//인스턴스내부클래스 사용 방법
		//외부객체를 먼저 생성하고 내부객체를 생성해야 한다!
		Outer o = new Outer();
		Outer.InstanceInner ii = o.new InstanceInner();
		//***인스턴스 내부객체 생성방법
		
		System.out.println(ii.iv);
		System.out.println(o.iii.iv);
		System.out.println(Outer.InstanceInner.cv);		//객체생성없이 가능
		System.out.println(Outer.InstanceInner.Const);	//객체생성없이 가능
		
		//static내부클래스 사용 방법
		//외부객체 생성 안하고 바로 내부객체 생성 가능!
		Outer.StaticInner si = new Outer.StaticInner();
		//***static내부객체 생성방법
		
		System.out.println(si.iv2);
		System.out.println(o.sii.iv2);
		System.out.println(Outer.StaticInner.cv2);		//객체생성없이 가능
		System.out.println(Outer.StaticInner.Const2);	//객체생성없이 가능
		
		o.myMethod();

	}

}
