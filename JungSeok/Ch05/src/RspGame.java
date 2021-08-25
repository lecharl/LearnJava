import java.util.Arrays;

public class RspGame {

	public static void main(String[] args) {
		// 배열에 가위바위보 넣어 랜덤하게 뽑기
		String[] rsp = {"가위", "바위", "보"};
		
		System.out.println(Arrays.toString(rsp));
		System.out.println("랜덤하게 뽑기 : ");
		
		for(int i=0; i<10; i++) {
			int n = (int)(Math.random()*3);	//0~2
			System.out.println(rsp[n]);
		}

	}

}
