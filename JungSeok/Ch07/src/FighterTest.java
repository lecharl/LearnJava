abstract class Unit2{
	int x, y;
	abstract void move(int x, int y);
	void stop() {
		System.out.println("����ϴ�.");
	};
}

interface Fightable{
	void move(int x, int y);	//public abstract ����
	void attack(Fightable f);	//��������
}

class Fighter extends Unit2 implements Fightable{
	//�������̵� ��Ģ : �����ڰ� ����(public)���� ������ ������ �ȵȴ�!! 
	public void move(int x, int y) {
		System.out.printf("[%d, %d]�� �̵�%n", x, y);
	}
	public void attack(Fightable f) {
		System.out.println(f+"�� ����");	//toString()
	}
	//�ο� �� �ִ� ��븦 �ҷ��´�.
	Fightable getFightable() {
		return (Fightable)new Fighter();	//Fighter�� �����ؼ� ��ȯ 
		//***�޼ҵ� ��ȯŸ��Fightable�� ��ġ! 
		//Fighter f = new Fighter(); return (Fightable)f;
		//Fightable f = new Fighter(); return f; �Ѵ� ����!
	}
}

public class FighterTest {

	public static void main(String[] args) {
		Fighter f = new Fighter();
		f.move(100, 200);
		f.attack(new Fighter());
		f.stop();
		Fightable ff = f.getFightable();	//***�޼ҵ� ��ȯŸ��Fightable�� ��ġ!!
		System.out.println(ff+"��/�� �ο�ϴ�.");
		System.out.println();
		
		Unit2 u = new Fighter();
		u.move(100, 200);
//		u.attack(new Fighter());	//Unit2���� attack()�� �����Ƿ� ����
		u.stop();
//		Fightable uu = u.getFightable();	//Unit2���� getFightable()�� �����Ƿ� ����
		System.out.println();
		
		Fightable f2 = new Fighter();
		f2.move(100, 200);
		f2.attack(f2);
//		f2.stop();	//Fightable���� stop()�� �����Ƿ� ����
//		Fightable ff2 = f2.getFightable();	//Fightable���� getFightable()�� �����Ƿ� ����

	}

}
