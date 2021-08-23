
public class Ex4_13 {

	public static void main(String[] args) {
		//100을 안넘게
		int i=0;
		int sum=0;
		
		while(sum<=100) {
			System.out.printf("%d - %d%n", i, sum);
			sum += ++i;
//			i++;
//			sum += i; //이렇게 할 수도 있다!
		}
	}

}
