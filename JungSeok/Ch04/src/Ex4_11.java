
public class Ex4_11 {

	public static void main(String[] args) {
		// ������!
		int i=2;
		for(; i<10; i++) {
			for(int j=1; j<10; j++) {
				System.out.printf("%d*%d = %d%n", i, j, i*j);
			}
			System.out.println();
		}
		System.out.println("������ "+(i--)+"�ܱ���");

	}

}
