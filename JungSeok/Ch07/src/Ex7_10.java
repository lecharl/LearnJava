abstract class Unit{
	int x, y;		//현재 위치
	abstract void move(int x, int y);	/*지정된 위치로 이동*/
	void stop()				{/*현재 위치에 정지*/}
}

class Marine extends Unit{		//보병
	void move(int x, int y) {
		System.out.printf("보병 지정된 위치로 이동 : [%d, %d]%n", x, y);
	}
	void stimPack() 		{/*스팀팩을 사용*/}
}
class Tank extends Unit{		//탱크
	void move(int x, int y) {
		System.out.printf("탱크 지정된 위치로 이동 : [%d, %d]%n", x, y);
	}
	void changeMode()		{/*공격모드를 변환*/}
}
class DropShip extends Unit{	//수송선
	void move(int x, int y) {
		System.out.printf("수송선 지정된 위치로 이동 : [%d, %d]%n", x, y);
	}
	void load() 			{/*선택된 대상 태움*/}
	void unload()			{/*선택된 대상 내림*/}
}


public class Ex7_10 {

	public static void main(String[] args) {
		
		Unit[] group = { new Marine(), new Tank(), new DropShip()};
		/*
		Unit[] group = new Unit[3];
		group[0] = new Marine();
		group[1] = new Tank();
		group[2] = new DropShip(); 을 줄인 것!
		 */
		for(int i=0; i<group.length; i++) {	//group[i].length 아니다!!
			group[i].move(100, 200);
		}

	}

}
