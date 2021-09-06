package test2;

import java.util.ArrayList;

import com.kh.test.model.vo.Card;

public class ArrayListTest1 {

	public static void main(String[] args) {
		ArrayList array = new ArrayList();
		
		array.add("A");
		array.add(1);
		array.add(1.5);	//여러가지 다른 타입 다 됨!! 다 들어감
		array.add(true);
		//편하긴 하나 타입이 다를 경우 하나씩 꺼내서 사용하기 힘들다?
		
		ArrayList<String> sarray = new ArrayList<String>();
		//따라서 한 타입만 다룰 경우 이렇게! 단 기본형은 안되고 String 등 참조형 클래스만
		//다른 타입은 사용못하게 <>로 미리 막아놓는다.
		//test2예제로서 Card만 들어갈 수 있다.
		
		ArrayList<Card> array2 = new ArrayList<Card>();
		Card card = new Card("SPADE", 4);
		array.add(card);
		//		
		
		ArrayList<String> array3 = new ArrayList<String>();
		array3.add("한국");
		array3.add("미국");
		array3.add("미국");
		array3.add("미국3");
		for(int i=0; i<array3.size(); i++) {
			System.out.println(array3.get(i));//get()가져온다.
		}
//		array3.remove(0);
		array3.remove("미국");
		System.out.println(array3);
		

	}

}
