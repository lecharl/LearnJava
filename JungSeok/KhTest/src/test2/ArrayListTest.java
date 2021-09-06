package test2;

import java.util.ArrayList;

/*
ArrayList클래스의 특징
1. arraylist는 요소를 추가하면 차례대로 0번인덱스 위치부터 요소가 추가되는 형태
따라서 순차적인 접근이나 뒤에서부터 데이터를 추가하거나 삭제할 때 효과적이다.
끝부분에 요소 추가
요소를 추가하면 해당 인덱스에 요소가 정렬(오름차순/내림차순)되면서 추가된다.
요소하나 추가시 ArrayList array1 = new ArrayList();
(ArrayList자체가 배열이기 때문에 []쓸 필요 없다.)


 */


public class ArrayListTest {

	public static void main(String[] args) {

		ArrayList array1 = new ArrayList();
		
		array1.add("A");	//[0] = "A"
		array1.add("B");	//[1] = "B"
		array1.add("C");	//[2] = "C"
		array1.add("D");	//[3] = "D"
		array1.add("E");	//[4] = "E"
		System.out.println(array1);
		
		array1.remove(2);	//index=2
		System.out.println(array1);
		//삭제되며 공간이 땅겨진다!! 정렬! : 일반배열과 다른점
		//[0]=A [1]=B [2]=D [3]=E
		//그래서 실무에선 이걸 많이 쓰인다.
		
		array1.add(2, "C");	//index=2 에 문자열을 넣어라.
		//공간을 뒤로 밀어버린다!! 다른점2
		System.out.println(array1);
		array1.add(2, "G");
		System.out.println(array1);
		
		//따라서 공간을 자유롭게 줄였다 늘였다 할 수 있다.
	}

}
