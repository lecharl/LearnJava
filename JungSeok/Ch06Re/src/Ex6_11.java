class Data_1{
	int value;
	
	Data_1(){		//�����ڰ� ������ �����Ϸ��� �⺻������ �ڵ��߰�
		super();	//������ ù�ٿ� ������ ȣ���� ������ �����Ϸ��� �ڵ��߰�, ObjectŬ ȣ��
	}
}

class Data_2{
	int value;
	
	Data_2(){		//�̰� �߰��ؾ� 30���� ������ �ȳ�
		this(7);	//������ȣ�������Ƿ� ok
	}
	
	Data_2(int x){	// �Ű����� �ִ� ������ ����
		super();	//�ڵ��߰�, ObjectŬ ȣ��
		value = x;
	}
}


public class Ex6_11 {

	public static void main(String[] args) {
		Data_1 d1 = new Data_1();	//�⺻������ ȣ��
		d1.value = 3;
		System.out.println(d1.value);
		
		Data_2 d2 = new Data_2();	//�⺻������ ȣ���ε�
		/*�⺻�����ڰ� �ƴ� �����ڸ� ���� ����� ���⿡, �⺻�����ڰ� ��� ������
		 *���� ���� ���� �����ڰ� ���ٸ�?? �����Ϸ��� �⺻�����ڸ� ����⿡ ������ �ȳ�!
		 */
		System.out.println(d2.value);
		
		Data_2 d3 = new Data_2(10);	//�Ű����� �ִ� ������ ȣ��
		/*�⺻�����ڰ� �ƴ� �Ű����� �ִ� ȣ���ε�
		 *���� ���� ������⿡ ������ �ȳ���.
		 */
		System.out.println(d3.value);
	}
} 
