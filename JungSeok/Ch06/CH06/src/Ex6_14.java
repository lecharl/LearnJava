class Car2 {
	String color;	// iv <- ���� this.color ...
	String geartype;
	int door;
	
	Car2(){
		this("yellow", "auto", 2);	// ����° �� ������ ȣ��
	}
	
	Car2(String color, int door){
		this(color, "semi", door);		// ��������. �� �Ű������� ���� �ް�
	}
	
	Car2(String color, String geartype, int door) {
		this.color = color;		// �������� this
		this.geartype = geartype;	// **�׷��� �ñ��ϴ�!! �� �ΰ� ���ֵ� �� �۵���.
		this.door = door;		// �⺻�����ڰ� ���µ� ���??
	}
}


public class Ex6_14 {

	public static void main(String[] args) {
		// ex6_12 this ����
		
		// ������ this();Ȱ��
		Car2 c1 = new Car2();
		System.out.println("c1�� color : "+c1.color+", geartype : "+c1.geartype+", door : "+c1.door);
		
		Car2 c2 = new Car2("grey", 6);
		System.out.println("c2�� color : "+c2.color+", geartype : "+c2.geartype+", door : "+c2.door);
		
		// ��������this Ȱ��
		Car2 c3 = new Car2("blue", "manual", 4);
		System.out.println("c3�� color : "+c3.color+", geartype : "+c3.geartype+", door : "+c3.door);
		
		

	}

}
