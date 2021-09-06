package test2;

import com.kh.test.person.model.vo.Car.Car;

public class Test2_1 {

	public static void main(String[] args) {
		
		Car[] car = new Car[3];
		car[0] = new Car();	//1. 요 세줄이 있어야 한다.
		car[1] = new Car();
		car[2] = new Car();
		
		car[0].setName("현대자동차");	//요렇게 넣어주면
		car[1].setName("기아자동차");
		car[2].setName("삼성자동차");
		
		for(int i=0;i<=car.length;i++) {	//2. i<car.length
			
			System.out.println(car[i].getName());
			
		}

	}

}





/*원인 
1. 기본형배열과 달리 객체배열의 생성은 객체를 가리킬 수 있는 공간을 만들어놨다는 의미일뿐, 실제로 객체가 생성되었다는 의미가 아니기 때문에.
아무것도 가리키는게 없으므로 NullPointException이 된다.
따라서 각 배열마다 객체를 생성하여 초기화해줘야 한다.?

2. 배열의 크기가 벗어나게 되므로 car.length
​

조치내용 

		car[0] = new Car();	//요 세줄이 있어야 한다.
		car[1] = new Car();
		car[2] = new Car();
		
		
		i<car.length //요거 추가

​*/