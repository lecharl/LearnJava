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
		System.out.println("========== �޴����� ==========");
	}
	
	void bar() {
		System.out.println("--------------------");
	}
	
	void select(Scanner sc) {
		System.out.print("��ȣ�� ������ �ּ���.. ");
		sc.next();
	}
	
	void selectexit(Scanner sc) {
		System.out.println("��� �Ͻ÷��� 1, ���� �Ͻ÷��� 0�� �Է��� �ּ���..");
	}
	
	
}

public class AcademyManage {

	public static void main(String[] args) {
		ArrayList<Person> al = new ArrayList<Person>();
		al.add(new Person(10, "��ȿ��", "2006"));
		al.add(new Person(10, "��ȿ��", "1111"));
		al.add(new Person(30, "�ڹٸ�", "java basic"));
		al.add(new Person(35, "�ڹٰ�", "IT"));
		
		
		Scanner sc = new Scanner(System.in);
		do {
			//�޴�����, 1~4, ��, 0, ��, ��ȣ����
			int n;// = 1;
			if(n==0) {
				break;
			} else if(n==1) {
				//���
				
			} else if(n==2) {
				//ã��
				System.out.println("ã�� �̸��� �Է��� �ּ���.");
				System.out.print("�̸� : ");
				String sFind = sc.nextLine();
				if(sFind.equals("")) {
					
				}
				
			} else if(n==3) {
				//����
				System.out.println("������ ����� �̸��� �Է��� �ּ���.");
				System.out.print("�̸� : ");
				String sDelete = sc.nextLine();
				if(sDelete.equals("")) {
//					a1.remove("")
				}
				
			} else if(n==4) {
				for(int i=0; i<al.size(); i++) {
					System.out.print("�̸� : "+al.get(i).getName()+"\t");
					System.out.print("���� : "+al.get(i).getAge()+"\t\t");
//					System.out.print("al.get(i).getPosition());
				}
			} else {
				System.out.println("�ٽ� �Է����ּ���.");
			}
			
			
		} while (true);
		
		System.out.println("���α׷��� �����մϴ�.");

	}

}
