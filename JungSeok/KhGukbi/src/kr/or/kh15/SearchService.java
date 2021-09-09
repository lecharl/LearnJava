package kr.or.kh15;

public class SearchService {
	private Member[] members;

	public SearchService() {
		members = new Member[5];
		members[0] = new Member("kh정보교육원",170,88,"대한민국");
		members[1] = new Member("kh정보교육원강남",174,80,"대한민국");
		members[2] = new Member("kh정보교육원종로",170,70,"대한민국");
		members[3] = new Member("kh정보교육원당산",160,66,"대한민국");
		members[4] = new Member("kh정보교육원이태원",155,60,"대한민국");
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
		System.out.println(member.getName()+"으로 찾은결과");
		System.out.println("이름:"+member.getName()+"신장:"+member.getHeight()+"몸무게:"+member.getWeight()+"국가"+member.getNation());
	}
}