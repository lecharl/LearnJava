package kr.or.kh15;

public class Member {
	private String name;//회원이름
	private int height; //키
	private int weight;//몸무게
	private String nation;//국가
	
	public Member(String name,int height,int weight,String nation) {
		this.name = name;
		this.height = height;
		this.weight = weight;
		this.nation = nation;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getNation() {
		return nation;
	}

	public void setNation(String nation) {
		this.nation = nation;
	}
}
