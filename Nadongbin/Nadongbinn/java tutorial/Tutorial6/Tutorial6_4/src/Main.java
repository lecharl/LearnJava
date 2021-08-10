
public class Main {

	final static int N = 10;
	
	public static void main(String[] args) {
		
		// 원의 중심이 (0, 0)일 때, 원의 임의의 점 (x, y)일 때,
		// 원의 방정식 x^2 + y^2 = r^2 
		for(int i = -N; i <= N; i++)
		{
			for(int j = -N; j <= N; j++)
			{
				if(i * i + j * j <= N * N)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(".");
				}
			}
			System.out.println();
		}
		
	}
	
}
