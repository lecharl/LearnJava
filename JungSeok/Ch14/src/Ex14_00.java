
class Ex14_00 {
	
	public static void main(String[] args) {
		//�Ϲݽ�?
		MyFunction2 f = new MyFunction2() {
			@Override
			public int max(int a, int b) {	//***public!!
				return a>b? a:b;
			}
		};//MF
		int value = f.max(3, 5);
		System.out.println("value= "+value);
		
		//���ٽ�***
		MyFunction2 f2 = (a, b) -> a>b? a:b;
		int value2 = f2.max(3, 5);
		System.out.println("value2= "+value2);
	}//main

}

@FunctionalInterface
interface MyFunction2{
	public abstract int max(int a, int b);
}




//
//class MakingLambda{
//	
//	//�޼ҵ� -> ���ٽ����� �ٲ㺸��
//	//1.
//	int max(int a, int b) {
//		return a > b ? a : b;
//	}
//	//->
////	Object obj = (a, b) -> a>b ? a:b;
//	
//	Object obj = new Object() {
//		int max(int a, int b) {
//			return a>b ? a:b;
//		}
//	};
//	
//	int value = obj.max(3, 5);
//	
//	
//			
//	//2
//	void printVar(String name, int i) {
//		System.out.println(name+ "="+i);
//	}
//	//->
//	(name, i) -> System.out.println(name+"="+i)
//	
//	//3
//	int square(int x) {
//		return x*x;
//	}
//	//->
//	x -> x*x
//	
//	
//	//4
//	int roll() {
//		return (int)(Math.random()*6);
//	}
//	//->***�Ű������� ���� �� ��ȣ()���� �ȵ�!!
//	() -> (int)(Math.random()*6)
//}