
public class Main {
	
	public static int function(int number, int k) {
		for(int i = 1; i <= number; i++)
		{
			if(number % i == 0)
			{
				k--;
				if(k == 0)
				{
					return i;
				}
			}
		}
		return -1;		
	}
	
	public static void main(String[] args) {
		// ��� �� k��°�� ���� �� ã��
		int result = function(96, 11);
		if(result == -1)
		{
			System.out.println("96�� 11��° ����� �����ϴ�.");
		}
		else
		{
			System.out.println("96�� 11��° ����� : " + result + "�Դϴ�.");
		}

	}

}
