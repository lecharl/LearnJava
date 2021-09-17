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
		return "����: "+kor+", ����: "+eng+", ����: "+mat;
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
		return "����: "+kor+", ����: "+eng+", ����: "+mat+", ���: "+gisul;
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
		return "����: "+kor+", ����: "+eng+", ����: "+mat+", ����: "+gajung;
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
		return "����: "+kor+", ����: "+eng+", ����: "+mat+", ���: "+gisul+", ����: "+tech;
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
		return "����: "+kor+", ����: "+eng+", ����: "+mat+", ����: "+gajung+", ���: "+com;
	}
}

public class SchoolTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("1.�������б� 2.�������б� 3. ���ڰ�������б� 4. ���ڻ������б�");
			System.out.print("�����Ͻ÷��� 0 >");
			int num = sc.nextInt();
			if(num==1) {
				ManMidSchool mms = new ManMidSchool();
				System.out.print("����: ");
				mms.setKor(sc.nextInt());
				System.out.print("����: ");
				mms.setEng(sc.nextInt());
				System.out.print("����: ");
				mms.setMat(sc.nextInt());
				System.out.print("���: ");
				mms.setGisul(sc.nextInt());
				System.out.println(mms.manMidSchoolInfo());
			} else if(num==2) {
				WomanMidSchool wms = new WomanMidSchool();
				System.out.print("����: ");
				wms.setKor(sc.nextInt());
				System.out.print("����: ");
				wms.setEng(sc.nextInt());
				System.out.print("����: ");
				wms.setMat(sc.nextInt());
				System.out.print("����: ");
				wms.setGajung(sc.nextInt());
				System.out.println(wms.womanMidSchoolInfo());
			} else if(num==3) {
				ManTechHighSchool mth = new ManTechHighSchool();
				System.out.print("����: ");
				mth.setKor(sc.nextInt());
				System.out.print("����: ");
				mth.setEng(sc.nextInt());
				System.out.print("����: ");
				mth.setMat(sc.nextInt());
				System.out.print("���: ");
				mth.setGisul(sc.nextInt());
				System.out.print("����: ");
				mth.setTech(sc.nextInt());
				System.out.println(mth.manTechHighSchoolInfo());
			} else if(num==4) {
				WomanComHighSchool wch = new WomanComHighSchool();
				System.out.print("����: ");
				wch.setKor(sc.nextInt());
				System.out.print("����: ");
				wch.setEng(sc.nextInt());
				System.out.print("����: ");
				wch.setMat(sc.nextInt());
				System.out.print("����: ");
				wch.setGajung(sc.nextInt());
				System.out.print("���: ");
				wch.setCom(sc.nextInt());
				System.out.println(wch.womanComHighSchoolInfo());
			} else if(num==0) System.exit(0);
			
		}

	}

}
