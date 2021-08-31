abstract class Unit{
	int x, y;		//���� ��ġ
	abstract void move(int x, int y);	/*������ ��ġ�� �̵�*/
	void stop()				{/*���� ��ġ�� ����*/}
}

class Marine extends Unit{		//����
	void move(int x, int y) {
		System.out.printf("���� ������ ��ġ�� �̵� : [%d, %d]%n", x, y);
	}
	void stimPack() 		{/*�������� ���*/}
}
class Tank extends Unit{		//��ũ
	void move(int x, int y) {
		System.out.printf("��ũ ������ ��ġ�� �̵� : [%d, %d]%n", x, y);
	}
	void changeMode()		{/*���ݸ�带 ��ȯ*/}
}
class DropShip extends Unit{	//���ۼ�
	void move(int x, int y) {
		System.out.printf("���ۼ� ������ ��ġ�� �̵� : [%d, %d]%n", x, y);
	}
	void load() 			{/*���õ� ��� �¿�*/}
	void unload()			{/*���õ� ��� ����*/}
}


public class Ex7_10 {

	public static void main(String[] args) {
		
		Unit[] group = { new Marine(), new Tank(), new DropShip()};
		/*
		Unit[] group = new Unit[3];
		group[0] = new Marine();
		group[1] = new Tank();
		group[2] = new DropShip(); �� ���� ��!
		 */
		for(int i=0; i<group.length; i++) {	//group[i].length �ƴϴ�!!
			group[i].move(100, 200);
		}

	}

}
