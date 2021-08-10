
public class Main {

	public static void main(String[] args) {
		
		for (char i = 'a'; i <= 'z'; i++)
		{
			System.out.print(i + " ");
		}
		System.out.println("\n");
		
		for (char k = 'a'; k <= 'z'; k++)
		{
			System.out.print(k + ' ' + " ");
		}
		System.out.println("\n");
		
		// 참고로 "a" 는 String 이기 때문에 안된다!
		// String k = "a"; 요런식으로 해야함. 그러나 i++가 안되기 때문에 애초에 불가능
		
		
		for (int j = 'a'; j <= 'z'; j++)
		{
			System.out.print(j + " ");
		}
		
		// 애초에 정수로 인식했기에 아스키코드로 처리
		// 만약 " " 대신 ' '로 한다면 두번째와 같은 결과가 나옴
}
}
