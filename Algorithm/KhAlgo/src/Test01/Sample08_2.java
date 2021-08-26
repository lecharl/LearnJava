package Test01;

import java.util.Scanner;

public class Sample08_2 {

	public static void main(String[] args) {
		//0. + 2. + 4. = .6
		Scanner scan = new Scanner(System.in);
		System.out.println("정수를 입력하시오.");
		int n = scan.nextInt();
		int sum = 0;
		String s = "";
		
//		for(int i=0; i<=n; i+=2) {
//			if(i == 0) {
//				s += "" + i;
//			} else {
//				s += " + " + i;
//			}
//			sum += i;
//		}
		for(int i=0; i<=n; i+=2) {
			s += (i == 0)? ("" + i) : (" + " + i);
			sum += i;
		}
		
		System.out.println(s+" = "+sum);
		scan.close();

	}

}
