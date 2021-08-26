package Test01;

import java.util.Scanner;

public class Sample07_2 {
	
	public static void main(String[] args) {
		//0 + 1 + 2 + 3 + 4 + 5 = 합
		System.out.println("정수를 입력하세요.");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int sum = 0;
		String s = "";	
		//문자열로 만드는? 변수?? 삼항연산자를 사용하기 위해 변수가 필요하니까?
		for(int i=0; i<=n; i++) {
//			if(i==0) {
//				s += "" + i;	//어떤 타입이든 문자열과 +하면 문자열로 된다.
//			} else {
//				s += " + " + i;	//그걸 계속 +하기=결합하기
//			}
			s += (i==0)? ("" + i) : (" + " + i);
			sum += i;
		}
		
		System.out.println(s+" = "+sum);
		scan.close();
	}


}
