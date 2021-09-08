package test2;

//ArrayList를 이용해 다수의 Fruit객체를 저장 후 출력하려고 하는데 문제가 생겼다. 
//문제가 생긴 곳을 찾아 이유와 함께 [원인](25점)에 기술하고, 이를 해결한 코드를 [조치내용](25점)에 기술하시오. (50점


import java.util.ArrayList;

import com.kh.test.model.vo.Card;



public class MyCollection {

	public void test() {

		ArrayList<Card> list = new ArrayList<Card>();

		//Card card1 = new Card("SPADE", 4);
		//list.add(card1);	이런 식으로 해도 된다!
		
		list.add(new Card("SPADE",4));
		list.add(new Card("HEART",7));
		list.add(new Card("DIAMOND",6));	//공간 3개

		//list.add("재밌는 게임"); //1. 요게 에러

		for(int i=0;i<list.size();i++) { //2. i<list.size()
			System.out.print(list.get(i).getKind());	//3. list.get(i).getKind() 로 
			System.out.print(list.get(i).getNumber()+"\n");	//3. 요것도 추가
		} 

	}
	
	public static void main(String[] args) {
		MyCollection mykh = new MyCollection();
		mykh.test();
		
	}

}



/*원인 
1. 제네릭규정에 맞지 않기 때문에.
제네릭규정: <> 영역안에 있는 타입만 들어갈 수 있다. 현재 list참조공간 안에는 Card만 들어갈 수 있다. 
String도 타입이기에, Card와 String은 다른 타입이므로 에러가 난다.
​
2. 현재 크기가 3인데 ~<=~로 하면 0123 으로 범위를 벗어나게 된다.

조치내용 ​


2. i<list.size()

3.
 list.get(i).getKind() 로 
System.out.print(list.get(i).getNumber()+"\n");

 */