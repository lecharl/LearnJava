
public class Main {

	public static void main(String[] args) {
		
		String a = "Man";
		int b = 0;
		
		if(a.equals("Man"))
		{
			System.out.println("남자입니다.");
		}
		else
		{
			System.out.println("남자가 아닙니다.");
		}
		
		if(b == 3)
		{
			System.out.println("b는 3입니다.");
		}
		else
		{
			System.out.println("3이 아닙니다.");
		}
		
		if(a.equalsIgnoreCase("man") && b == 0)
		{
			System.out.println("참입니다.");
		}
		else
		{
			System.out.println("거짓입니다.");
		}
	}

}
