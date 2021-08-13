class MyMath3 {
	
	int add(int a, int b) {
		System.out.print("int add(int a, int b) -> ");
		return a+b;
	}
	
	long add(long a, int b) {
		System.out.print("long add(long a, int b) -> ");
		return a+b;
	}
	
	long add(int a, long b) {
		System.out.print("long add(int a, long b) -> ");
		return a+b;
	}
	long add(long a, long b) {
		System.out.print("long add(long a, long b) -> ");
		return a+b;
	}
	int add(int [] a) {     // 연습하자.
		System.out.print("int add (int [] a) -> ");
		int result = 0;
		for(int i=0; i<a.length; i++)
		{
			result += a[i];
		}
		return result;
	}
}


public class Ex6_10 {

	public static void main(String[] args) {
		// 오버로딩
		MyMath3 mm = new MyMath3();
		System.out.println("mm.add(3, 5)의 결과 : "+mm.add(3, 5));
		System.out.println("mm.add(3L, 5)의 결과 : "+mm.add(3L, 5));		
		System.out.println("mm.add(3, 5L)의 결과 : "+mm.add(3, 5L));
		System.out.println("mm.add(3L, 5L)의 결과 : "+mm.add(3L, 5L));
		
		int [] a = {100, 200, 300};
		System.out.println("mm.add(a)의 결과 : "+mm.add(a));

	}

}
