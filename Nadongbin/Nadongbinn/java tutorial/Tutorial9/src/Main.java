
public class Main {

	// 반환형, 함수명(매개변수1, 2,,..)
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
		for(int i = min; i > 0; i--)  // 요부분이 잘 안떠올림!!**
		{
			if(a % i == 0 && b % i == 0 && c % i == 0)
			{
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		// 3개의 최대공약수 구하기
		// 다수를 입력받을 경우 배열을 배워야 하기에 그냥 예시로 여기에다 쓴다.
		
		System.out.println("400, 300, 750 의 최대공약수는? : " + Maxgong(400, 300, 750));
		
	}

}
