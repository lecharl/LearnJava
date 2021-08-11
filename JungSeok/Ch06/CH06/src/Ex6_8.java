
class Data3 {
	int x;
}

public class Ex6_8 {

	public static void main(String[] args) {
		// 참조형 매개변수와 참조형 반환타입
		
		Data3 d = new Data3();
		// 1. 인스턴스 생성. main 메소드의 지역변수 d 생성.
		// 2. 참조변수 d에 인스턴스의 주소(0x100) 저장
		
		d.x = 10;   // 3. 참조변수 d가 가리키는 인스턴스의 멤버변수 x에 10 저장.
		
		Data3 d2 = copy(d);  
		// 4. main 메소드의 지역변수 d2 생성.
		// 5. 참조변수 d의 값인 인스턴스의 주소(0x100)를 copy 메소드의 매개변수로 넣기.
		// 11. 지역변수이자 참조변수 d2에 tmp(0x200) 저장-> d2의 값은 인스턴스의 주소(0x200)
		// 12. copy 메소드 종료, copy의 지역변수인 tmp, d 사라짐
		
		System.out.println("d.x = "+d.x);  // 13. d.x == 10 출력
		System.out.println("d2.x = "+d2.x);  // 14. d2.x== 200 출력

	}
	
	static Data3 copy(Data3 d) {
		// 6. copy 메소드의 지역변수 d에 넘겨받은 인스턴스의 주소(0x100) 받음
		Data3 tmp = new Data3();   // 7. 새 객체 tmp 생성. copy 메소드의 지역변수 tmp.
		// 8. copy 메소드의 지역변수이자 참조변수 tmp는 인스턴스의 주소값(0x200:새 객체이므로)을 저장
		tmp.x = 20 * d.x;  
		// 9. 참조변수 tmp가 가리키는 인스턴스의 멤버변수 x에 d.x의 값인 10에 20을 곱해서 복사
		// -> tmp.x == 200
		return tmp; 
		// 10. 반환타입은 Data3타입 or 참조형으로 같은 타입인 tmp의 값인 주소(0x200) 반환
	}

}
