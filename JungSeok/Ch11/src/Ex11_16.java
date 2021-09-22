import java.util.HashMap;
import java.util.Scanner;

public class Ex11_16 {

	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("myID", "1234");
		map.put("asdf", "1111");
		System.out.println(map);
		map.put("asdf", "1234");
		System.out.println(map);
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("id와 password를 입력해주세요.");
			System.out.print("id : ");
			String id = sc.nextLine().trim();	//String 앞뒤 공백제거
			System.out.print("password : ");
			String password = sc.nextLine().trim();
			
			//***key일치 확인 : equals가 아닌 containsKey!!
			//boolean equals(Object o) 맵과 o과 같은지 비교 이므로 안됨!!
			if(!map.containsKey(id)) {
				System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요.");
				continue;	//***반복문 끝으로 가고 다시 다음 반복으로
			}
			
			//*****key를 반환하고 난 다음에 해당 key의 짝꿍value비교!!! 
			//이럴땐 containsValue하면 안된다!!
			//***value일치 확인 : key일치 확인 후 -> equals
			if(!(map.get(id)).equals(password)) {
				System.out.println("password가 일치하지 않습니다. 다시 입력해주세요.");
			} else {
				System.out.println("id와 password가 일치합니다.");
				System.out.println("로그인 성공 ... WELCOME!!");
				break;	//반복문 나가기
			}
		}

	}

}
