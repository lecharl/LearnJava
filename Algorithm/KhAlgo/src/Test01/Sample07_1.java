package Test01;

import java.util.Scanner;

public class Sample07_1 {

	public static void main(String[] args) {
		//0 + 1 + 2 + 3 + 4 + 5 = 합
		System.out.println("정수를 입력하세요.");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int sum = 0;
		for(int i=0; i<=n; i++) {
			if(i==0) {
				System.out.print(i);
			} else {
				System.out.print(" + "+i);
			}
			sum += i;
		}
		
		System.out.println(" = "+sum);
		scan.close();
	}

}
