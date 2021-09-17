package kr.or.kh02;

import java.util.Scanner;

class School{
	protected int kor;
	protected int eng;
	protected int mat;
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMat() {
		return mat;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}
	
	public String schoolInfo() {
		return "국어: "+kor+", 영어: "+eng+", 수학: "+mat;
	}
	
}

class ManMidSchool extends School{
	protected int gisul;

	public int getGisul() {
		return gisul;
	}

	public void setGisul(int gisul) {
		this.gisul = gisul;
	}
	public String manMidSchoolInfo() {
		return "국어: "+kor+", 영어: "+eng+", 수학: "+mat+", 기술: "+gisul;
	}
}

class WomanMidSchool extends School{
	protected int gajung;

	public int getGajung() {
		return gajung;
	}

	public void setGajung(int gajung) {
		this.gajung = gajung;
	}
	public String womanMidSchoolInfo() {
		return "국어: "+kor+", 영어: "+eng+", 수학: "+mat+", 가정: "+gajung;
	}
}

class ManTechHighSchool extends ManMidSchool{
	protected int tech;

	public int getTech() {
		return tech;
	}

	public void setTech(int tech) {
		this.tech = tech;
	}
	public String manTechHighSchoolInfo() {
		return "국어: "+kor+", 영어: "+eng+", 수학: "+mat+", 기술: "+gisul+", 공업: "+tech;
	}
}

class WomanComHighSchool extends WomanMidSchool{
	protected int com;

	public int getCom() {
		return com;
	}

	public void setCom(int com) {
		this.com = com;
	}
	public String womanComHighSchoolInfo() {
		return "국어: "+kor+", 영어: "+eng+", 수학: "+mat+", 가정: "+gajung+", 상업: "+com;
	}
}

public class SchoolTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("1.남자중학교 2.여자중학교 3. 남자공업고등학교 4. 여자상업고등학교");
			System.out.print("종료하시려면 0 >");
			int num = sc.nextInt();
			if(num==1) {
				ManMidSchool mms = new ManMidSchool();
				System.out.print("국어: ");
				mms.setKor(sc.nextInt());
				System.out.print("영어: ");
				mms.setEng(sc.nextInt());
				System.out.print("수학: ");
				mms.setMat(sc.nextInt());
				System.out.print("기술: ");
				mms.setGisul(sc.nextInt());
				System.out.println(mms.manMidSchoolInfo());
			} else if(num==2) {
				WomanMidSchool wms = new WomanMidSchool();
				System.out.print("국어: ");
				wms.setKor(sc.nextInt());
				System.out.print("영어: ");
				wms.setEng(sc.nextInt());
				System.out.print("수학: ");
				wms.setMat(sc.nextInt());
				System.out.print("가정: ");
				wms.setGajung(sc.nextInt());
				System.out.println(wms.womanMidSchoolInfo());
			} else if(num==3) {
				ManTechHighSchool mth = new ManTechHighSchool();
				System.out.print("국어: ");
				mth.setKor(sc.nextInt());
				System.out.print("영어: ");
				mth.setEng(sc.nextInt());
				System.out.print("수학: ");
				mth.setMat(sc.nextInt());
				System.out.print("기술: ");
				mth.setGisul(sc.nextInt());
				System.out.print("공업: ");
				mth.setTech(sc.nextInt());
				System.out.println(mth.manTechHighSchoolInfo());
			} else if(num==4) {
				WomanComHighSchool wch = new WomanComHighSchool();
				System.out.print("국어: ");
				wch.setKor(sc.nextInt());
				System.out.print("영어: ");
				wch.setEng(sc.nextInt());
				System.out.print("수학: ");
				wch.setMat(sc.nextInt());
				System.out.print("가정: ");
				wch.setGajung(sc.nextInt());
				System.out.print("상업: ");
				wch.setCom(sc.nextInt());
				System.out.println(wch.womanComHighSchoolInfo());
			} else if(num==0) System.exit(0);
			
		}

	}

}
