import java.util.Scanner;

public class Ex4_15 {

	public static void main(String[] args) {
		// 1이상~100이하 랜덤숫자를 맞히기
		System.out.println("1~100 사이의 정수를 맞히시오.");
		int answer = (int) (Math.random()*100) + 1;
		System.out.println("Answer : "+answer);
		
		System.out.print("입력하시오. : ");
		Scanner scan = new Scanner(System.in);
		int num;
		do {
			num = scan.nextInt();
			if (num>answer) {
				System.out.println("더 작은 수로 시도해 보세요.");
			} else if(num<answer){	//else if 다!! 
				System.out.println("더 큰 수로 시도해 보세요.");
			}
		} while(num != answer);
//			num = scan.nextInt();  //while로 하면 한번 더 써야 하므로
		scan.close();		
		System.out.println("정답입니다.");

	}

}
