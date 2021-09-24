package test3;

public class STest {

	public static void main(String[] args) {
		
		String str = "Apple, Kiwi, Strawberry, Banana";
		
		String[] sArr = str.split(", ");
		
		System.out.println(sArr[1]);
		
		for(int i=0; i<sArr.length; i++) {
			System.out.println(sArr[i]);
		}
		

	}

}
