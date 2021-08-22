
public class Ex3_9 {

	public static void main(String[] args) {
		int a = 1_000_000;	//10의 6제곱
		int b = 2_000_000;	//10의 6제곱*2
		
		long c = a * b;		//10의 12제곱	> int의 범위 10의 9제곱이므로
		System.out.println(c);	//오버플로우!!
		
		long d = (long)a * b;
		//둘 중 하나만 형변환만 해주면 나머지도 알아서 형변환 되므로
		System.out.println(d);
	}

}
