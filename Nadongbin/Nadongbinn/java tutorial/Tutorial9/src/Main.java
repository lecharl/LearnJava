
public class Main {

	// ��ȯ��, �Լ���(�Ű�����1, 2,,..)
	public static int Maxgong(int a, int b, int c)
	{
		int min;
		if (a>b)
		{
			if (b>c)
			{
				min =  c;
			}
			else
			{
				min =  b;
			}
		}
		else
		{
			if (a>c)
			{
				min = c;
			}
			else
			{
				min = a;
			}
		}
		for(int i = min; i > 0; i--)  // ��κ��� �� �ȶ��ø�!!**
		{
			if(a % i == 0 && b % i == 0 && c % i == 0)
			{
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		// 3���� �ִ����� ���ϱ�
		// �ټ��� �Է¹��� ��� �迭�� ����� �ϱ⿡ �׳� ���÷� ���⿡�� ����.
		
		System.out.println("400, 300, 750 �� �ִ�������? : " + Maxgong(400, 300, 750));
		
	}

}