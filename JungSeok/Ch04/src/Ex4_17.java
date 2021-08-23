
public class Ex4_17 {

	public static void main(String[] args) {
		// continue, 2의 배수만 건너뛰기
		
		for(int i=0; i<=10; i++) {
			if(i%2 == 0)
				continue;
			System.out.println(i);
		}

	}

}
