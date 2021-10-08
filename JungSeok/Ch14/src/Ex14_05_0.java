import java.util.function.Function;
import java.util.function.Supplier;

public class Ex14_05_0 {

	public static void main(String[] args) {
		//매개변수 없는 생성자
		Supplier<MyClass1> s = () -> new MyClass1();
		Supplier<MyClass1> s1 = MyClass1::new;
		System.out.println(s.get());
		System.out.println(s.get().iv);
		System.out.println(s1.get());
		System.out.println(s1.get().iv);
		
		//매개변수 있는 생성자
		Function<Integer, MyClass1> f = (i) -> new MyClass1(i);
		Function<Integer, MyClass1> f1 = MyClass1::new;
		System.out.println(f.apply(100));
		System.out.println(f.apply(100).iv);
		System.out.println(f1.apply(200));
		System.out.println(f1.apply(200).iv);
		
		//배열 생성
		//***배열을 생성할 땐 꼭 Function!! 배열의 길이Integer가 필요하기 때문에
		Function<Integer, int[]> f2 = (x) -> new int[x];
		Function<Integer, int[]> f3 = int[]::new;
		System.out.println(f2.apply(55));
		System.out.println(f2.apply(55).length);
		System.out.println(f3.apply(66));
		System.out.println(f3.apply(66).length);
		
	}

}

class MyClass1{
	int iv;
	
	MyClass1(){	this.iv = 777;	}
	
	MyClass1(int i){ this.iv = i;}
}

