class Data_1{
	int value;
	
	Data_1(){}			// �����ڰ� �����Ƿ� ��� ��!
}

class Data_2{
	int value;
	
	Data_2(){}			// �����ڰ� �����Ƿ� �⺻������ �ʼ�!!
	
	Data_2(int x){		// (�Ű������� �ִ�)������
		value = x;
	}
}

public class Ex6_11 {

	public static void main(String[] args) {
		// �⺻�����ڿ� ������
		
		Data_1 d1 = new Data_1();
		Data_2 d2 = new Data_2();

	}

}
