package sample02;

import java.util.ArrayList;
import java.util.Scanner;

public class HaksaProject {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//********학생/교수/관리자 배열을 만든다.
		ArrayList<StudentDTO> sList = new ArrayList<StudentDTO>();
		ArrayList<ProfessorDTO> pList = new ArrayList<ProfessorDTO>();
		ArrayList<ManagerDTO> mList = new ArrayList<ManagerDTO>();
		//DTO???data transfer object==VO??value Object
		String line = "======";
		String title = " 메뉴선택 ";
		String line1 = "-------------------";
		while(true) {//반복문 시작
			System.out.print(line);
			System.out.print(title);
			System.out.println(line);
			System.out.println("1.등록");
			System.out.println("2.찾기");
			System.out.println("3.삭제");
			System.out.println("4.전체출력");
			System.out.println(line1);
			System.out.println("0.종료");
			System.out.println(line1);
			System.out.print("번호를 선택해 주세요.. ");
			int bunho = sc.nextInt();
			if(bunho==1) {
				System.out.println();
				System.out.print(line);
				System.out.print(title);
				System.out.println(line);
				System.out.println("1.학생");
				System.out.println("2.교수");
				System.out.println("3.관리자");
				System.out.println("4.이전메뉴");//*****주의!!
				System.out.println(line1);
				System.out.print("번호를 선택해 주세요.. ");
				bunho = sc.nextInt();//주의!!
				if(bunho==1) {
					//*****객체배열문제처럼 가리킬 객체를 생성해야 한다!!
					StudentDTO sDTO = new StudentDTO();//sDTO[i]
					//지역변수라 벗어나면 사라짐!
					System.out.print("나이:");
					String age = sc.next();
					System.out.print("이름:");
					String name = sc.next();
					System.out.print("학번:");
					String hakbun = sc.next();
					//여기다가 세팅!!!!***
					sDTO.setAge(age);
					sDTO.setName(name);
					sDTO.setHakbun(hakbun);
					//***?? 사라지기 전에 외부에서 이미 만들어놓은 거에 담아두기
					sList.add(sDTO);
					System.out.println("학생이 등록되었습니다.");
					
				}else if(bunho==2) {
					//****
					ProfessorDTO pDTO = new ProfessorDTO();//pDTO[i]
					System.out.print("나이:");
					String age = sc.next();
					System.out.print("이름:");
					String name = sc.next();
					System.out.print("과목:");
					String subject = sc.next();//버퍼의 문제라 nextline하면 그냥넘어감
					//
					pDTO.setAge(age);
					pDTO.setName(name);
					pDTO.setSubject(subject);
					//
					pList.add(pDTO);
					System.out.println("교수가 등록되었습니다.");
					
				}else if(bunho==3) {
					ManagerDTO mDTO = new ManagerDTO();//mDTO[i]
					System.out.print("나이:");
					String age = sc.next();
					System.out.print("이름:");
					String name = sc.next();
					System.out.print("부서:");
					String part = sc.next();
					//
					mDTO.setAge(age);
					mDTO.setName(name);
					mDTO.setPart(part);
					//
					mList.add(mDTO);
					System.out.println("관리자가 등록되었습니다.");
					
				}else if(bunho==4) {
					continue;//******주의!!! 반복문의 끝으로 가 다음 반복문으로
					//바로 위 전단계로 감
				}else {
					System.out.println("번호가 유효하지 않습니다.");
				}
			}else if(bunho==2) {
				System.out.println("찾을 이름을 입력해 주세요.");
				System.out.print("이름:");
				String name = sc.next();
				System.out.println("1.학생 2.교수 3.관리자");
				char search = sc.next().charAt(0);
				boolean result = false;	
				//***찾을때까지 돌면서 학생이 없다고 뜨니까 flag만들기인가?
				if(search=='1') {//분야를 나누자**
					for(int i=0; i<sList.size(); i++) {
						if(name.equals(sList.get(i).getName())) {
							System.out.print("이름:");
							System.out.print(sList.get(i).getName()+"\t");
							System.out.print("나이:");
							System.out.print(sList.get(i).getAge()+"\t");
							System.out.print("학번:");
							System.out.print(sList.get(i).getHakbun()+"\n");
							result = true;	//***
						}else {
							if(result==false) {//***
								System.out.println("찾으시는 학생이 없습니다.");
								result = true;
							}
						}
					}
				} else if(search=='2') {
					for(int i=0; i<pList.size(); i++) {
						if(name.equals(pList.get(i).getName())) {
							System.out.print("이름:");
							System.out.print(pList.get(i).getName()+"\t");
							System.out.print("나이:");
							System.out.print(pList.get(i).getAge()+"\t");
							System.out.print("과목:");
							System.out.print(pList.get(i).getSubject()+"\n");
							result = true;	//***
						}else {
							if(result==false) {//***
								System.out.println("찾으시는 교수가 없습니다.");
								result = true;
							}
						}
					}
				} else if(search=='3') {
					for(int i=0; i<mList.size(); i++) {
						if(name.equals(mList.get(i).getName())) {
							System.out.print("이름:");
							System.out.print(mList.get(i).getName()+"\t");
							System.out.print("나이:");
							System.out.print(mList.get(i).getAge()+"\t");
							System.out.print("부서:");
							System.out.print(mList.get(i).getPart()+"\n");
							result = true;	//***
						}else {
							if(result==false) {//***
								System.out.println("찾으시는 관리자가 없습니다.");
								result = true;
							}
						}
					}
				}else {
					System.out.println("찾으시는 대상이 없습니다.");
				}
				
				System.out.print("계속하시려면 1, 종료하시려면 0을 입력해 주세요.. ");
				bunho = sc.nextInt();
				if(bunho==1) {	//*******
					continue;
				}else {
					System.exit(0);
				}
			}else if(bunho==3) {
				System.out.println("삭제할 사람의 이름을 입력해 주세요.");
				System.out.print("이름:");
				String name = sc.next();
				System.out.println("1.학생 2.교수 3.관리자");
				char delete = sc.next().charAt(0);
				if(delete=='1') {
					for(int i=0; i<sList.size(); i++) {	//여기도 반복문***
						if(name.equals(sList.get(i).getName())) {
							System.out.println(name+"님을 삭제하였습니다.");
							sList.remove(i);
						}
					}
				}else if(delete=='2') {
					for(int i=0; i<pList.size(); i++) {
						if(name.equals(pList.get(i).getName())) {
							System.out.println(name+"님을 삭제하였습니다.");
							pList.remove(i);
						}
					}
				}else if(delete=='3') {
					for(int i=0; i<mList.size(); i++) {
						if(name.equals(mList.get(i).getName()))	{
							System.out.println(name+"님을 삭제하였습니다.");
							mList.remove(i);
						}
					}
					
				}
				
				
				System.out.print("계속하시려면 1, 종료하시려면 0을 입력해 주세요.. ");
				bunho = sc.nextInt();
				if(bunho==1) {	//*******
					continue;
				}else {
					System.exit(0);
				}
			}else if(bunho==4) {
				for(int i=0; i<sList.size(); i++) {
					//StudentDTO sDTO = sList.get(i); 해서 아래에
					//sDTO.get(i).getName() 하면 가독성이 좋다.
					System.out.print("이름:");
					System.out.print(sList.get(i).getName()+"\t");
					System.out.print("나이:");
					System.out.print(sList.get(i).getAge()+"\t");
					System.out.print("학번:");
					System.out.print(sList.get(i).getHakbun()+"\n");
				}
				for(int i=0; i<pList.size(); i++) {
					System.out.print("이름:");
					System.out.print(pList.get(i).getName()+"\t");
					System.out.print("나이:");
					System.out.print(pList.get(i).getAge()+"\t");
					System.out.print("과목:");
					System.out.print(pList.get(i).getSubject()+"\n");
				}
				for(int i=0; i<mList.size(); i++) {
					System.out.print("이름:");
					System.out.print(mList.get(i).getName()+"\t");
					System.out.print("나이:");
					System.out.print(mList.get(i).getAge()+"\t");
					System.out.print("부서:");
					System.out.print(mList.get(i).getPart()+"\n");
				}
				System.out.print("계속하시려면 1, 종료하시려면 0을 입력해 주세요.. ");
				bunho = sc.nextInt();
				if(bunho==1) {	//*******
					continue;
				}else {
					System.exit(0);
				}
			}else if(bunho==0) {
				System.out.println("프로그램 종료");
				System.exit(0);//주의!!
			}else {
				System.out.println("번호가 유효하지 않습니다.");
			}
		}//반복문 끝
	}

}
