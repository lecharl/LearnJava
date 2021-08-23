
public class Ex4_07 {

	public static void main(String[] args) {
		
		// quiz1. 1~10의 정수인 난수 20개 출력
		for(int i=1; i<=20; i++) {
			System.out.print((int)(Math.random()*10)+1+" ");
			//1<= x <11
		}
		System.out.println();
		// quiz2. -5~5의 정수인 난수 20개 출력
		for(int i=1; i<=20; i++) {
			System.out.print((int)(Math.random()*11)-5+" ");
			//-5<= x <6
		}

	}

}
