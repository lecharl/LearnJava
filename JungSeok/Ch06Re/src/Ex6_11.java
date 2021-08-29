class Data_1{
	int value;
	
	Data_1(){		//생성자가 없으면 컴파일러가 기본생성자 자동추가
		super();	//생성자 첫줄에 생성자 호출이 없으면 컴파일러가 자동추가, Object클 호출
	}
}

class Data_2{
	int value;
	
	Data_2(){		//이걸 추가해야 30줄이 에러가 안남
		this(7);	//생성자호출했으므로 ok
	}
	
	Data_2(int x){	// 매개변수 있는 생성자 만듦
		super();	//자동추가, Object클 호출
		value = x;
	}
}


public class Ex6_11 {

	public static void main(String[] args) {
		Data_1 d1 = new Data_1();	//기본생성자 호출
		d1.value = 3;
		System.out.println(d1.value);
		
		Data_2 d2 = new Data_2();	//기본생성자 호출인데
		/*기본생성자가 아닌 생성자를 내가 만들어 놨기에, 기본생성자가 없어서 에러임
		 *만약 내가 만든 생성자가 없다면?? 컴파일러가 기본생성자를 만들기에 에러가 안남!
		 */
		System.out.println(d2.value);
		
		Data_2 d3 = new Data_2(10);	//매개변수 있는 생성자 호출
		/*기본생성자가 아닌 매개변수 있는 호출인데
		 *위에 내가 만들었기에 에러가 안난다.
		 */
		System.out.println(d3.value);
	}
} 
