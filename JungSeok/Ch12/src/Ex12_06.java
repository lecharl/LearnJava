enum Direction2{
	EAST(1, ">"), SOUTH(2, "V"), WEST(3, "<"), NORTH(4, "^");

	private static final Direction2[] DIR_ARR = Direction2.values();
	private final int value;
	private final String symbol;
	Direction2(int value, String symbol) {	//private 생략
		this.value = value;
		this.symbol = symbol;
	}
	
	public int getValue() {
		return value;
	}
	public String getSymbol() {
		return symbol;
	}
	
	//DIR_ARR[dir-1]의 열거형상수를 꺼내오는 메소드
	public static Direction2 of(int dir) {
		if(dir < 1 || dir > 4)	//1~4가 아니면
			throw new IllegalArgumentException("Invalid value: "+dir);
		return DIR_ARR[dir-1];	//***인덱스는 하나 작으니까!
	}
	
	//방향을 회전시키는 메소드. num의 값만큼 90도씩 시계방향으로 회전한다.
	public Direction2 rotate(int num) {
		num %= 4;	//**큰수가 나와도 되게 & 어차피 4방향이니
		
		if(num < 0)
			num += 4;	//***num이 음수일 때 시계반대방향으로 회전인데, 그게 +4한 것과 같음!
		return DIR_ARR[(value-1 + num)% 4];
		//***value가 뭔줄 알고 받는거지.....
		//아 메소드호출할때 열거형상수를 받는구나 
	}
	
	public String toString() { return name()+getSymbol();}
}



public class Ex12_06 {

	public static void main(String[] args) {
		for(Direction2 d : Direction2.values())
			System.out.printf("%s = %d%n", d.name(), d.getValue());
		//**d.getValue() 는 ordinal()과 다르다!! 값과 인덱스 다르듯이!!
		
		Direction2 d1 = Direction2.EAST;
		Direction2 d2 = Direction2.of(1);	//DIR_ARR[0]
		Direction2 d3 = Direction2.of(2);	//DIR_ARR[1]
//		Direction2 d4 = Direction2.of(6);	//예외발생
		
		System.out.printf("d1 = %s, %d%n", d1.name(), d1.getValue());
		System.out.printf("d2 = %s, %d%n", d2.name(), d2.getValue());
		System.out.printf("d3 = %s, %d%n", d3.name(), d3.getValue());
		
		//***toString()오버라이딩해서 결과가 저렇지, 안그러면 EAST(name())만 나온다!!
		System.out.println(d1);
		System.out.println(Direction2.EAST.rotate(1));
		//d1.rotate(1) 해도 됨!
		System.out.println(d1.rotate(1));
		//EAST에서 1번 시계방향으로 회전하라
		System.out.println(Direction2.EAST.rotate(2));
		System.out.println(Direction2.EAST.rotate(-1));
		System.out.println(Direction2.EAST.rotate(-2));

	}

}
