package kr.or.kh15;

import java.util.Scanner;

public class SearchMain {
	public static void main(String[] args) {

		SearchService sv = new SearchService();
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.print("�˻��� ȸ���̸��� �Է��ϼ���:");
			String name = scanner.next();
			boolean searchResult = sv.searchMember(name);
			if(searchResult==true) break;
			System.out.println("�ش�ȸ���� �����ϴ�.");			
		}while(true);

	}
}
