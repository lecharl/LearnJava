import java.util.Arrays;

public class Ex11_06 {

	public static void main(String[] args) {
		int[] 	arr = {0, 1, 2, 3, 4};
		int[][] arr2D = {{11,22,33}, {21,22,23}};
		
		//���
		System.out.println("arr = "+Arrays.toString(arr));
		System.out.println("arr2D = "+Arrays.deepToString(arr2D));
		
		//����
		int[] arr2 = Arrays.copyOf(arr, arr.length);
		int[] arr3 = Arrays.copyOf(arr, 3);
		int[] arr4 = Arrays.copyOf(arr, 7);
		int[] arr5 = Arrays.copyOfRange(arr, 2, 4);	//index2~3
		int[] arr6 = Arrays.copyOfRange(arr, 0, 7);	//index0~6
		
		System.out.println("arr2 = "+Arrays.toString(arr2));
		System.out.println("arr3 = "+Arrays.toString(arr3));
		System.out.println("arr4 = "+Arrays.toString(arr4));
		System.out.println("arr5 = "+Arrays.toString(arr5));
		System.out.println("arr6 = "+Arrays.toString(arr6));
		
		//ä���
		int[] arr7 = new int[5];
		Arrays.fill(arr7, 9);
		System.out.println("arr7 = "+Arrays.toString(arr7));
		
		//*****���ٽ�?????????
		Arrays.setAll(arr7, i -> (int)(Math.random()*6 + 1));//1<= x <7
		System.out.println("arr7 = "+Arrays.toString(arr7));
		
		//***���� for��. ����(�迭)�� ��� ��Ҹ� ���׿� ����ְ� ���� ����
		for(int i : arr7) {
//		for (int x = 0; x < arr7.length; x++) {
//			int i = arr7[x];
			char[] graph = new char[i];	//��������ŭ�� ���̸� ���� ���� �迭 ����
			Arrays.fill(graph, '*');	//�� ���̸�ŭ *�� ä���.
			System.out.println(new String(graph)+i);
			//***String�� char[]�� ��ȯ��� -> JAVA_48
		}
		
		//��
		String[][] str2D = {{"aaa", "bbb"}, {"AAA", "BBB"}};
		String[][] str2D2 = {{"aaa", "bbb"}, {"AAA", "BBB"}};
		
		System.out.println(Arrays.equals(str2D, str2D2));		//1����
		System.out.println(Arrays.deepEquals(str2D, str2D2));	//������
		
		//���İ� �����˻�
		char[] chArr = {'c','d','a','e','b'};
		
		System.out.println("chArr = "+Arrays.toString(chArr));
		System.out.println("index of 'b' = "+Arrays.binarySearch(chArr, 'b'));
		System.out.println("== After Sorting ==");
		Arrays.sort(chArr);//**binarySearch�ϱ� ���� �ݵ�� ���ĸ���!!!
		System.out.println("chArr = "+Arrays.toString(chArr));
		System.out.println("index of 'b' = "+Arrays.binarySearch(chArr, 'b'));
		
		

	}

}
