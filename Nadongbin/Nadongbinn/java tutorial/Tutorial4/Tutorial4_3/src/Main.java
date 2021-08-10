
public class Main {

	public static void main(String[] args) {
		
		int a = 50;
		int b = 50;
		
		System.out.println("a와 b는 같은가요? " + (a == b));
		System.out.println("a가 b보다 큰가요? " + (a > b));
		System.out.println("a가 b와 같으면서 a가 30보다 큰가요? " + ((a == b)&&(a > 30)));
		System.out.println("a와 b는 다른가요? 다르면 true.. " + (a != b));
		System.out.println("a는 50이 아닌가요? 아니면 false.. " + !(a == 50));

	}

}
