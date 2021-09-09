package kr.or.kh15;

public class SearchService {
	private Member[] members;

	public SearchService() {
		members = new Member[5];
		members[0] = new Member("kh����������",170,88,"���ѹα�");
		members[1] = new Member("kh��������������",174,80,"���ѹα�");
		members[2] = new Member("kh��������������",170,70,"���ѹα�");
		members[3] = new Member("kh�������������",160,66,"���ѹα�");
		members[4] = new Member("kh�������������¿�",155,60,"���ѹα�");
	}

	public boolean searchMember(String name) {
		boolean searchResult = false;
		for(int i=0;i<members.length;i++) {
			if(members[i].getName().equals(name)) {
				printInfo(members[i]);
				searchResult = true;
			}
		}
		return searchResult;
	}

	private void printInfo(Member member) {
		System.out.println(member.getName()+"���� ã�����");
		System.out.println("�̸�:"+member.getName()+"����:"+member.getHeight()+"������:"+member.getWeight()+"����"+member.getNation());
	}
}