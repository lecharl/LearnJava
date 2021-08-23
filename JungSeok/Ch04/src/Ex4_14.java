import java.util.Scanner;

public class Ex4_14 {

	public static void main(String[] args) {
		//입력받은 각 자릿수의 합
		
		//'%10'-> 마지막 자리를 얻는다.
		//예) 12345%10 -> 5
		int sum=0;
		System.out.print("정수를 입력하세요. (예: 12345) : ");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		scan.close();
		
		//12345, 1234, 123, 12, 1 을 뽑아낸다!!
		for(; num>0; num /= 10) {	//생각해내기 너무 어렵다.
			System.out.println(num);
			sum += num%10;
		}
		System.out.println("각 자릿수의 합은? : "+sum);
	}

}
