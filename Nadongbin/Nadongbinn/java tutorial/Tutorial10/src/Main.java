
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
		// 약수 중 k번째로 작은 수 찾기
		int result = function(96, 11);
		if(result == -1)
		{
			System.out.println("96의 11번째 약수는 없습니다.");
		}
		else
		{
			System.out.println("96의 11번째 약수는 : " + result + "입니다.");
		}

	}

}
