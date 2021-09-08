package sample02;

import java.util.ArrayList;
import java.util.Scanner;

class Person{
	int age;
	String name;
	String position;
	
	Person(int age, String name, String position){
		this.age = age;
		this.name = name;
		this.position = position;
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	public String getPosition() {
		return position;
	}
	
	void String posName() {
		
	}
	
}

class Atable{
	Person 
	
	
	Atable(){
		
	}
	
	
	
	void menubar() {
		System.out.println("========== 메뉴선택 ==========");
	}
	
	void bar() {
		System.out.println("--------------------");
	}
	
	void select(Scanner sc) {
		System.out.print("번호를 선택해 주세요.. ");
		sc.next();
	}
	
	void selectexit(Scanner sc) {
		System.out.println("계속 하시려면 1, 종료 하시려면 0을 입력해 주세요..");
	}
	
	
}

public class AcademyManage {

	public static void main(String[] args) {
		ArrayList<Person> al = new ArrayList<Person>();
		al.add(new Person(10, "안효인", "2006"));
		al.add(new Person(10, "안효인", "1111"));
		al.add(new Person(30, "자바맨", "java basic"));
		al.add(new Person(35, "자바걸", "IT"));
		
		
		Scanner sc = new Scanner(System.in);
		do {
			//메뉴선택, 1~4, 바, 0, 바, 번호선택
			int n;// = 1;
			if(n==0) {
				break;
			} else if(n==1) {
				//출력
				
			} else if(n==2) {
				//찾기
				System.out.println("찾을 이름을 입력해 주세요.");
				System.out.print("이름 : ");
				String sFind = sc.nextLine();
				if(sFind.equals("")) {
					
				}
				
			} else if(n==3) {
				//삭제
				System.out.println("삭제할 사람의 이름을 입력해 주세요.");
				System.out.print("이름 : ");
				String sDelete = sc.nextLine();
				if(sDelete.equals("")) {
//					a1.remove("")
				}
				
			} else if(n==4) {
				for(int i=0; i<al.size(); i++) {
					System.out.print("이름 : "+al.get(i).getName()+"\t");
					System.out.print("나이 : "+al.get(i).getAge()+"\t\t");
//					System.out.print("al.get(i).getPosition());
				}
			} else {
				System.out.println("다시 입력해주세요.");
			}
			
			
		} while (true);
		
		System.out.println("프로그램을 종료합니다.");

	}

}
