//				  0		 1		2	  3
enum Direction { EAST, SOUTH, WEST, NORTH }

public class Ex12_05 {

	public static void main(String[] args) {
		//***������ ����� �о���� ��� 3����
		Direction d1 = Direction.EAST;	//0
		Direction d2 = Direction.valueOf("WEST");	//2
		Direction d3 = Enum.valueOf(Direction.class, "EAST");	//0
		
		System.out.println("d1= "+d1);
		System.out.println("d2= "+d2);
		System.out.println("d3= "+d3);
		
		System.out.println("d1==d2 ? "+(d1==d2));
		System.out.println("d1==d3 ? "+(d1==d3));
		System.out.println("d2==d3 ? "+(d2==d3));
//		System.out.println("d2 >d3 ? "+(d2>d3));	//����
		System.out.println("d1.equals(d2) ? "+d1.equals(d2));
		System.out.println("d1.equals(d3) ? "+d1.equals(d3));
		System.out.println("d2.equals(d3) ? "+d2.equals(d3));
		
		System.out.println("d1.compareTo(d3) ? "+d1.compareTo(d3));
		System.out.println("d1.compareTo(d2) ? "+d1.compareTo(d2));
		
		switch (d1) {
		case EAST:	//Direction.EAST �ȵ�. ����Ʋ��
			System.out.println("the directoin is EAST.");
			break;
		case SOUTH:
			System.out.println("the directoin is SOUTH.");
			break;
		case WEST:
			System.out.println("the directoin is WEST.");
			break;
		case NORTH:
			System.out.println("the directoin is NORTH.");
			break;
		default:
			System.out.println("Invaalid direction.");
			break;
		}
		
		Direction[] dArr = Direction.values();
		//�������� ��� ����� �迭�� ��ȯ
//		System.out.println(dArr); �� �ϸ� �ȳ��´� ������ ������
		for(Direction d : dArr)
			//for(Direction d : Direction.values())
			System.out.printf("%s=%d%n", d.name(), d.ordinal());
		//�̸��� ���� ���
		
		
	}

}
