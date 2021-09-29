enum Direction2{
	EAST(1, ">"), SOUTH(2, "V"), WEST(3, "<"), NORTH(4, "^");

	private static final Direction2[] DIR_ARR = Direction2.values();
	private final int value;
	private final String symbol;
	Direction2(int value, String symbol) {	//private ����
		this.value = value;
		this.symbol = symbol;
	}
	
	public int getValue() {
		return value;
	}
	public String getSymbol() {
		return symbol;
	}
	
	//DIR_ARR[dir-1]�� ����������� �������� �޼ҵ�
	public static Direction2 of(int dir) {
		if(dir < 1 || dir > 4)	//1~4�� �ƴϸ�
			throw new IllegalArgumentException("Invalid value: "+dir);
		return DIR_ARR[dir-1];	//***�ε����� �ϳ� �����ϱ�!
	}
	
	//������ ȸ����Ű�� �޼ҵ�. num�� ����ŭ 90���� �ð�������� ȸ���Ѵ�.
	public Direction2 rotate(int num) {
		num %= 4;	//**ū���� ���͵� �ǰ� & ������ 4�����̴�
		
		if(num < 0)
			num += 4;	//***num�� ������ �� �ð�ݴ�������� ȸ���ε�, �װ� +4�� �Ͱ� ����!
		return DIR_ARR[(value-1 + num)% 4];
		//***value�� ���� �˰� �޴°���.....
		//�� �޼ҵ�ȣ���Ҷ� ����������� �޴±��� 
	}
	
	public String toString() { return name()+getSymbol();}
}



public class Ex12_06 {

	public static void main(String[] args) {
		for(Direction2 d : Direction2.values())
			System.out.printf("%s = %d%n", d.name(), d.getValue());
		//**d.getValue() �� ordinal()�� �ٸ���!! ���� �ε��� �ٸ�����!!
		
		Direction2 d1 = Direction2.EAST;
		Direction2 d2 = Direction2.of(1);	//DIR_ARR[0]
		Direction2 d3 = Direction2.of(2);	//DIR_ARR[1]
//		Direction2 d4 = Direction2.of(6);	//���ܹ߻�
		
		System.out.printf("d1 = %s, %d%n", d1.name(), d1.getValue());
		System.out.printf("d2 = %s, %d%n", d2.name(), d2.getValue());
		System.out.printf("d3 = %s, %d%n", d3.name(), d3.getValue());
		
		//***toString()�������̵��ؼ� ����� ������, �ȱ׷��� EAST(name())�� ���´�!!
		System.out.println(d1);
		System.out.println(Direction2.EAST.rotate(1));
		//d1.rotate(1) �ص� ��!
		System.out.println(d1.rotate(1));
		//EAST���� 1�� �ð�������� ȸ���϶�
		System.out.println(Direction2.EAST.rotate(2));
		System.out.println(Direction2.EAST.rotate(-1));
		System.out.println(Direction2.EAST.rotate(-2));

	}

}
