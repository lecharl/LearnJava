abstract class Unit2{
	int x, y;
	abstract void move(int x, int y);
	void stop() {
		System.out.println("멈춥니다.");
	};
}

interface Fightable{
	void move(int x, int y);	//public abstract 생략
	void attack(Fightable f);	//마찬가지
}

class Fighter extends Unit2 implements Fightable{
	//오버라이딩 규칙 : 제어자가 조상(public)보다 범위가 좁으면 안된다!! 
	public void move(int x, int y) {
		System.out.printf("[%d, %d]로 이동%n", x, y);
	}
	public void attack(Fightable f) {
		System.out.println(f+"를 공격");	//toString()
	}
	//싸울 수 있는 상대를 불러온다.
	Fightable getFightable() {
		return (Fightable)new Fighter();	//Fighter를 생성해서 반환 
		//***메소드 반환타입Fightable과 일치! 
		//Fighter f = new Fighter(); return (Fightable)f;
		//Fightable f = new Fighter(); return f; 둘다 가능!
	}
}

public class FighterTest {

	public static void main(String[] args) {
		Fighter f = new Fighter();
		f.move(100, 200);
		f.attack(new Fighter());
		f.stop();
		Fightable ff = f.getFightable();	//***메소드 반환타입Fightable과 일치!!
		System.out.println(ff+"와/과 싸웁니다.");
		System.out.println();
		
		Unit2 u = new Fighter();
		u.move(100, 200);
//		u.attack(new Fighter());	//Unit2에는 attack()이 없으므로 에러
		u.stop();
//		Fightable uu = u.getFightable();	//Unit2에는 getFightable()이 없으므로 에러
		System.out.println();
		
		Fightable f2 = new Fighter();
		f2.move(100, 200);
		f2.attack(f2);
//		f2.stop();	//Fightable에는 stop()이 없으므로 에러
//		Fightable ff2 = f2.getFightable();	//Fightable에는 getFightable()이 없으므로 에러

	}

}
