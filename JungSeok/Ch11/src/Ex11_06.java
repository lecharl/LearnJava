import java.util.Arrays;

public class Ex11_06 {

	public static void main(String[] args) {
		int[] 	arr = {0, 1, 2, 3, 4};
		int[][] arr2D = {{11,22,33}, {21,22,23}};
		
		//출력
		System.out.println("arr = "+Arrays.toString(arr));
		System.out.println("arr2D = "+Arrays.deepToString(arr2D));
		
		//복사
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
		
		//채우기
		int[] arr7 = new int[5];
		Arrays.fill(arr7, 9);
		System.out.println("arr7 = "+Arrays.toString(arr7));
		
		//*****람다식?????????
		Arrays.setAll(arr7, i -> (int)(Math.random()*6 + 1));//1<= x <7
		System.out.println("arr7 = "+Arrays.toString(arr7));
		
		//***향상된 for문. 우항(배열)의 모든 요소를 좌항에 집어넣고 본문 시행
		for(int i : arr7) {
//		for (int x = 0; x < arr7.length; x++) {
//			int i = arr7[x];
			char[] graph = new char[i];	//랜덤값만큼의 길이를 갖는 문자 배열 생성
			Arrays.fill(graph, '*');	//그 길이만큼 *로 채운다.
			System.out.println(new String(graph)+i);
			//***String과 char[]의 변환방법 -> JAVA_48
		}
		
		//비교
		String[][] str2D = {{"aaa", "bbb"}, {"AAA", "BBB"}};
		String[][] str2D2 = {{"aaa", "bbb"}, {"AAA", "BBB"}};
		
		System.out.println(Arrays.equals(str2D, str2D2));		//1차원
		System.out.println(Arrays.deepEquals(str2D, str2D2));	//다차원
		
		//정렬과 이진검색
		char[] chArr = {'c','d','a','e','b'};
		
		System.out.println("chArr = "+Arrays.toString(chArr));
		System.out.println("index of 'b' = "+Arrays.binarySearch(chArr, 'b'));
		System.out.println("== After Sorting ==");
		Arrays.sort(chArr);//**binarySearch하기 전엔 반드시 정렬먼저!!!
		System.out.println("chArr = "+Arrays.toString(chArr));
		System.out.println("index of 'b' = "+Arrays.binarySearch(chArr, 'b'));
		
		

	}

}
