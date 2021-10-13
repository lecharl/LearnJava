class Student2{
	String name;
	boolean isMale;
	int hak;
	int ban;
	int score;
	
	Student2(String name, boolean isMale, int hak, int ban, int score){
		this.name = name;
		this.isMale = isMale;
		this.hak = hak;
		this.ban = ban;
		this.score = score;
	}

	public String getName() {return name;}
	public boolean isMale() {return isMale;	}
	public int getHak() {return hak;}
	public int getBan() {return ban;}
	public int getScore() {return score;}

	@Override
	public String toString() {
		return String.format("[%s, %s, %d�г� %d��, %3d��]",
				name, isMale? "��" : "��", hak, ban, score);
	}
	
	//***groupingBy()���� ���
	enum Level{	HIGH, MID, LOW}	//������ ��, ��, �� �� �ܰ�� �з�
	
	
}


public class Ex14_10 {

	public static void main(String[] args) {
		Student2[] stuArr = {
				new Student2("���ڹ�", true,  1, 1, 300),	
				new Student2("������", false, 1, 1, 250),	
				new Student2("���ڹ�", true,  1, 1, 200),	
				new Student2("������", false, 1, 2, 150),	
				new Student2("���ڹ�", true,  1, 2, 100),	
				new Student2("������", false, 1, 2,  50),	
				new Student2("Ȳ����", false, 1, 3, 100),	
				new Student2("������", false, 1, 3, 150),	
				new Student2("���ڹ�", true,  1, 3, 200),	
				new Student2("���ڹ�", true,  2, 1, 300),	
				new Student2("������", false, 2, 1, 250),	
				new Student2("���ڹ�", true,  2, 1, 200),	
				new Student2("������", false, 2, 2, 150),	
				new Student2("���ڹ�", true,  2, 2, 100),	
				new Student2("������", false, 2, 2,  50),	
				new Student2("Ȳ����", false, 2, 3, 100),	
				new Student2("������", false, 2, 3, 150),	
				new Student2("���ڹ�", true,  2, 3, 200)	
		};
		
		

	}

}
