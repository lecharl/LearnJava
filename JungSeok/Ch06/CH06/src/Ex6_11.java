class Data_1{
	int value;
	
	Data_1(){}			// 생성자가 없으므로 없어도 됨!
}

class Data_2{
	int value;
	
	Data_2(){}			// 생성자가 있으므로 기본생성자 필수!!
	
	Data_2(int x){		// (매개변수가 있는)생성자
		value = x;
	}
}

public class Ex6_11 {

	public static void main(String[] args) {
		// 기본생성자와 생성자
		
		Data_1 d1 = new Data_1();
		Data_2 d2 = new Data_2();

	}

}
