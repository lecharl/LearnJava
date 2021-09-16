import java.util.*;

public class Ex11_04 {
	static Queue q = new LinkedList();
	static final int MAX_SIZE = 5;	//Queue에 최대 5개까지만 저장하도록
	//****static 이유 : iv가 아닌 cv만을 static메소드가 사용할 수 있으니까!!!

	public static void main(String[] args) {
		System.out.println("help를 입력하면 도움말을 볼 수 있습니다.");
		
		while(true) {
			System.out.print(">> ");
			try {
				Scanner sc = new Scanner(System.in);
				String input = sc.nextLine().trim();
				//앞뒤공백제거, 한줄 단위로
				
				if("".equals(input)) continue;	//맨밑으로가 다음 반복으로
				//***두 문자열의 위치가 바뀐다면?? input이 null일 경우 오류가 나기에 방지차원!!!
				
				if(input.equalsIgnoreCase("q")) {
					System.exit(0);
				//???? 아래 else는 안해도 될 것 같은데??	
				} else if(input.equalsIgnoreCase("help")) {
					System.out.println("help : 도움말을 보여줍니다.");
					System.out.println("q 또는 Q : 프로그램을 종료합니다.");
					System.out.println("history : 최근에 입력한 명령어를 "+MAX_SIZE+"개 보여줍니다.");
				} else if(input.equalsIgnoreCase("history")) {
					//우선 입력받은 명령어 history 저장하고
					save(input);
					
					//LL의 내용을 보여준다.
					LinkedList list = (LinkedList)q;
					//***q로는 못하니까(인터페이스!) -> 새로운 리모콘+q를 형변환해서 넣기
					final int SIZE = list.size();
					//이렇게 하는게 더 좋은 코드!!
					for(int i=0; i<SIZE; i++) {
						System.out.println((i+1)+". "+list.get(i));
					}
				} else {	//history 입력안하고 다른 명령어 입력하면 저장하고 출력
					save(input);
					System.out.println(input);
				}
				
			} catch (Exception e) {
				System.out.println("입력오류입니다.");
			}
			
			
		}//while(true) 끝

	}//main 끝
	
	public static void save(String input) {
		//input이 공백이 아니면 queue에 저장
		if(!"".equals(input)) q.offer(input);
		
		//***queue의 최대크기를 넘으면 제일 처음 입력된 것을 삭제
		if(q.size()>MAX_SIZE) q.poll();
		//size() - Collection인터페이스에 정의
	}

}
