package kr.or.kh18;

import java.util.Calendar;

class Company {
	
	private static Company instance = new Company();
	//****�̷��� ����
	
	private Company() {	
		//private�̹Ƿ� �ۿ��� new�� ���� ��ü���� ����
		//���ο��� ��ü�����ϰڴٴ� �ǹ�
	}
	
	//�ܺο��� ����� �� �ֵ��� public + ��ü �������ص� ����� �� �ִ� static�޼ҵ� ��������!!!
	public static Company getInstance() {
		if(instance == null) {
			//��ü�� �ϳ��� �����ȵǸ� ������ �� �ְ� ���ְ�????
			instance = new Company();
		}
		return instance;	//��ü �ִٸ� instance�� return
	}

}

public class CompanyTest{
	
	public static void main(String[] args) {
		Company com1 = Company.getInstance();
		Company com2 = Company.getInstance();
		//Calendar �����϶�!!!
		Calendar cal = Calendar.getInstance();
		
		System.out.println(com1);
		System.out.println(com2);
		//com1, com2�� �ּҰ��� ����!!!!
		System.out.println(cal);
		
		
	}
	
}
