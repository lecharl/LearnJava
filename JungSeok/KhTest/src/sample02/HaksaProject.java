package sample02;

import java.util.ArrayList;
import java.util.Scanner;

public class HaksaProject {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//********�л�/����/������ �迭�� �����.
		ArrayList<StudentDTO> sList = new ArrayList<StudentDTO>();
		ArrayList<ProfessorDTO> pList = new ArrayList<ProfessorDTO>();
		ArrayList<ManagerDTO> mList = new ArrayList<ManagerDTO>();
		//DTO???data transfer object==VO??value Object
		String line = "======";
		String title = " �޴����� ";
		String line1 = "-------------------";
		while(true) {//�ݺ��� ����
			System.out.print(line);
			System.out.print(title);
			System.out.println(line);
			System.out.println("1.���");
			System.out.println("2.ã��");
			System.out.println("3.����");
			System.out.println("4.��ü���");
			System.out.println(line1);
			System.out.println("0.����");
			System.out.println(line1);
			System.out.print("��ȣ�� ������ �ּ���.. ");
			int bunho = sc.nextInt();
			if(bunho==1) {
				System.out.println();
				System.out.print(line);
				System.out.print(title);
				System.out.println(line);
				System.out.println("1.�л�");
				System.out.println("2.����");
				System.out.println("3.������");
				System.out.println("4.�����޴�");//*****����!!
				System.out.println(line1);
				System.out.print("��ȣ�� ������ �ּ���.. ");
				bunho = sc.nextInt();//����!!
				if(bunho==1) {
					//*****��ü�迭����ó�� ����ų ��ü�� �����ؾ� �Ѵ�!!
					StudentDTO sDTO = new StudentDTO();//sDTO[i]
					//���������� ����� �����!
					System.out.print("����:");
					String age = sc.next();
					System.out.print("�̸�:");
					String name = sc.next();
					System.out.print("�й�:");
					String hakbun = sc.next();
					//����ٰ� ����!!!!***
					sDTO.setAge(age);
					sDTO.setName(name);
					sDTO.setHakbun(hakbun);
					//***?? ������� ���� �ܺο��� �̹� �������� �ſ� ��Ƶα�
					sList.add(sDTO);
					System.out.println("�л��� ��ϵǾ����ϴ�.");
					
				}else if(bunho==2) {
					//****
					ProfessorDTO pDTO = new ProfessorDTO();//pDTO[i]
					System.out.print("����:");
					String age = sc.next();
					System.out.print("�̸�:");
					String name = sc.next();
					System.out.print("����:");
					String subject = sc.next();//������ ������ nextline�ϸ� �׳ɳѾ
					//
					pDTO.setAge(age);
					pDTO.setName(name);
					pDTO.setSubject(subject);
					//
					pList.add(pDTO);
					System.out.println("������ ��ϵǾ����ϴ�.");
					
				}else if(bunho==3) {
					ManagerDTO mDTO = new ManagerDTO();//mDTO[i]
					System.out.print("����:");
					String age = sc.next();
					System.out.print("�̸�:");
					String name = sc.next();
					System.out.print("�μ�:");
					String part = sc.next();
					//
					mDTO.setAge(age);
					mDTO.setName(name);
					mDTO.setPart(part);
					//
					mList.add(mDTO);
					System.out.println("�����ڰ� ��ϵǾ����ϴ�.");
					
				}else if(bunho==4) {
					continue;//******����!!! �ݺ����� ������ �� ���� �ݺ�������
					//�ٷ� �� ���ܰ�� ��
				}else {
					System.out.println("��ȣ�� ��ȿ���� �ʽ��ϴ�.");
				}
			}else if(bunho==2) {
				System.out.println("ã�� �̸��� �Է��� �ּ���.");
				System.out.print("�̸�:");
				String name = sc.next();
				System.out.println("1.�л� 2.���� 3.������");
				char search = sc.next().charAt(0);
				boolean result = false;	
				//***ã�������� ���鼭 �л��� ���ٰ� �ߴϱ� flag������ΰ�?
				if(search=='1') {//�о߸� ������**
					for(int i=0; i<sList.size(); i++) {
						if(name.equals(sList.get(i).getName())) {
							System.out.print("�̸�:");
							System.out.print(sList.get(i).getName()+"\t");
							System.out.print("����:");
							System.out.print(sList.get(i).getAge()+"\t");
							System.out.print("�й�:");
							System.out.print(sList.get(i).getHakbun()+"\n");
							result = true;	//***
						}else {
							if(result==false) {//***
								System.out.println("ã���ô� �л��� �����ϴ�.");
								result = true;
							}
						}
					}
				} else if(search=='2') {
					for(int i=0; i<pList.size(); i++) {
						if(name.equals(pList.get(i).getName())) {
							System.out.print("�̸�:");
							System.out.print(pList.get(i).getName()+"\t");
							System.out.print("����:");
							System.out.print(pList.get(i).getAge()+"\t");
							System.out.print("����:");
							System.out.print(pList.get(i).getSubject()+"\n");
							result = true;	//***
						}else {
							if(result==false) {//***
								System.out.println("ã���ô� ������ �����ϴ�.");
								result = true;
							}
						}
					}
				} else if(search=='3') {
					for(int i=0; i<mList.size(); i++) {
						if(name.equals(mList.get(i).getName())) {
							System.out.print("�̸�:");
							System.out.print(mList.get(i).getName()+"\t");
							System.out.print("����:");
							System.out.print(mList.get(i).getAge()+"\t");
							System.out.print("�μ�:");
							System.out.print(mList.get(i).getPart()+"\n");
							result = true;	//***
						}else {
							if(result==false) {//***
								System.out.println("ã���ô� �����ڰ� �����ϴ�.");
								result = true;
							}
						}
					}
				}else {
					System.out.println("ã���ô� ����� �����ϴ�.");
				}
				
				System.out.print("����Ͻ÷��� 1, �����Ͻ÷��� 0�� �Է��� �ּ���.. ");
				bunho = sc.nextInt();
				if(bunho==1) {	//*******
					continue;
				}else {
					System.exit(0);
				}
			}else if(bunho==3) {
				System.out.println("������ ����� �̸��� �Է��� �ּ���.");
				System.out.print("�̸�:");
				String name = sc.next();
				System.out.println("1.�л� 2.���� 3.������");
				char delete = sc.next().charAt(0);
				if(delete=='1') {
					for(int i=0; i<sList.size(); i++) {	//���⵵ �ݺ���***
						if(name.equals(sList.get(i).getName())) {
							System.out.println(name+"���� �����Ͽ����ϴ�.");
							sList.remove(i);
						}
					}
				}else if(delete=='2') {
					for(int i=0; i<pList.size(); i++) {
						if(name.equals(pList.get(i).getName())) {
							System.out.println(name+"���� �����Ͽ����ϴ�.");
							pList.remove(i);
						}
					}
				}else if(delete=='3') {
					for(int i=0; i<mList.size(); i++) {
						if(name.equals(mList.get(i).getName()))	{
							System.out.println(name+"���� �����Ͽ����ϴ�.");
							mList.remove(i);
						}
					}
					
				}
				
				
				System.out.print("����Ͻ÷��� 1, �����Ͻ÷��� 0�� �Է��� �ּ���.. ");
				bunho = sc.nextInt();
				if(bunho==1) {	//*******
					continue;
				}else {
					System.exit(0);
				}
			}else if(bunho==4) {
				for(int i=0; i<sList.size(); i++) {
					//StudentDTO sDTO = sList.get(i); �ؼ� �Ʒ���
					//sDTO.get(i).getName() �ϸ� �������� ����.
					System.out.print("�̸�:");
					System.out.print(sList.get(i).getName()+"\t");
					System.out.print("����:");
					System.out.print(sList.get(i).getAge()+"\t");
					System.out.print("�й�:");
					System.out.print(sList.get(i).getHakbun()+"\n");
				}
				for(int i=0; i<pList.size(); i++) {
					System.out.print("�̸�:");
					System.out.print(pList.get(i).getName()+"\t");
					System.out.print("����:");
					System.out.print(pList.get(i).getAge()+"\t");
					System.out.print("����:");
					System.out.print(pList.get(i).getSubject()+"\n");
				}
				for(int i=0; i<mList.size(); i++) {
					System.out.print("�̸�:");
					System.out.print(mList.get(i).getName()+"\t");
					System.out.print("����:");
					System.out.print(mList.get(i).getAge()+"\t");
					System.out.print("�μ�:");
					System.out.print(mList.get(i).getPart()+"\n");
				}
				System.out.print("����Ͻ÷��� 1, �����Ͻ÷��� 0�� �Է��� �ּ���.. ");
				bunho = sc.nextInt();
				if(bunho==1) {	//*******
					continue;
				}else {
					System.exit(0);
				}
			}else if(bunho==0) {
				System.out.println("���α׷� ����");
				System.exit(0);//����!!
			}else {
				System.out.println("��ȣ�� ��ȿ���� �ʽ��ϴ�.");
			}
		}//�ݺ��� ��
	}

}
