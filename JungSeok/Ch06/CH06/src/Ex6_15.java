
public class Ex6_15 {

	public static void main(String[] args) {
		// cv�ʱ�ȭ ����� static{} ����ϱ�
		
		for(int i=0; i<arr.length; i++) {
			System.out.println("arr["+i+"] = "+arr[i]);
		}

	}

	static int[] arr = new int[10];		// 10ĭ¥�� �迭 ����
	
	static {		// static{} : cv �ʱ�ȭ
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*10) + 1;
			// 1�̻� 10������ ������ �����ϰ� �̾Ƽ� �迭�� �ֱ�
		}
	}

}
