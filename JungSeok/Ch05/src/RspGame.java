import java.util.Arrays;

public class RspGame {

	public static void main(String[] args) {
		// �迭�� ���������� �־� �����ϰ� �̱�
		String[] rsp = {"����", "����", "��"};
		
		System.out.println(Arrays.toString(rsp));
		System.out.println("�����ϰ� �̱� : ");
		
		for(int i=0; i<10; i++) {
			int n = (int)(Math.random()*3);	//0~2
			System.out.println(rsp[n]);
		}

	}

}
