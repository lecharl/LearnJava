package kr.or.kh18;

import java.util.Calendar;

class Company {
	
	private static Company instance = new Company();
	//****이렇게 생성
	
	private Company() {	
		//private이므로 밖에서 new를 통해 객체생성 못함
		//내부에서 객체생성하겠다는 의미
	}
	
	//외부에서 사용할 수 있도록 public + 객체 생성안해도 사용할 수 있는 static메소드 만들어야함!!!
	public static Company getInstance() {
		if(instance == null) {
			//객체가 하나도 생성안되면 생성할 수 있게 해주고????
			instance = new Company();
		}
		return instance;	//객체 있다면 instance을 return
	}

}

public class CompanyTest{
	
	public static void main(String[] args) {
		Company com1 = Company.getInstance();
		Company com2 = Company.getInstance();
		//Calendar 생각하라!!!
		Calendar cal = Calendar.getInstance();
		
		System.out.println(com1);
		System.out.println(com2);
		//com1, com2의 주소값이 같다!!!!
		System.out.println(cal);
		
		
	}
	
}
