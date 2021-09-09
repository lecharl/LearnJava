package kr.or.kh15;

import java.util.Scanner;

public class SearchMain {
	public static void main(String[] args) {

		SearchService sv = new SearchService();
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.print("검색할 회원이름을 입력하세요:");
			String name = scanner.next();
			boolean searchResult = sv.searchMember(name);
			if(searchResult==true) break;
			System.out.println("해당회원이 없습니다.");			
		}while(true);

	}
}
