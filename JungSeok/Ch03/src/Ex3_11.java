
public class Ex3_11 {

	public static void main(String[] args) {
		
		double pi = 3.141592;
		
		//�Ҽ� ù°�ڸ����� �ݿø��ϱ�->����, 3
		long ollimPi = Math.round(pi);	//�߿�!! long���� �ޱ�
		System.out.println(ollimPi);
		
		//4��° �ڸ����� �ݿø��ϱ�, 3.142
		double shortPi = Math.round(pi * 1000) / 1000.0;
		double shortPi2 = ((int)(pi * 1000 + 0.5)) / 1000.0;
		//�߿�!! 1000.0���� Ÿ���� ������
		System.out.println(shortPi);
		System.out.println(shortPi2);
		
		//4��° �ڸ�����, 5��°���� ����, 3.141
		double flPi = Math.floor(pi * 1000) / 1000.0;
		System.out.println(flPi);
		//����ȯ(int)�ص� �ȴ�.
		
		//4��° �ڸ�����, 5��°���� �ø�, 3.142
		double cePi = Math.ceil(pi * 1000) / 1000.0;
		System.out.println(cePi);
	}

}
