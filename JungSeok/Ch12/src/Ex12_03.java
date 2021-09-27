import java.util.ArrayList;

public class Ex12_03 {

	public static void main(String[] args) {
		FruitBox<Fruit> fBox = new FruitBox<>();
		FruitBox<Apple> aBox = new FruitBox<>();
		FruitBox<Grape> gBox = new FruitBox<>();
//		FruitBox<Grape> gBox = new FruitBox<Apple>();	//타입불일치
//		FruitBox<Fruit> gBox = new FruitBox<Apple>();	//타입불일치
//		FruitBox<Toy> tBox = new FruitBox<>();	//Toy는 FruitBox의 타입변수에 못들어감
		
		fBox.add(new Fruit());
		fBox.add(new Apple());	//다형성O
		fBox.add(new Grape());
		
		aBox.add(new Apple());
//		aBox.add(new Fruit());
//		aBox.add(new Grape());
		
		gBox.add(new Grape());
//		gBox.add(new Fruit());
//		gBox.add(new Apple());
		
		System.out.println(fBox.size());
		System.out.println(fBox);
		for(int i=0; i<fBox.size(); i++) {
			System.out.println(fBox.get(i));
		}
		
		System.out.println(aBox.size());
		System.out.println(aBox);
		for(int i=0; i<aBox.size(); i++) {
			System.out.println(aBox.get(i));
		}
		
		System.out.println(gBox.size());
		System.out.println(gBox);
		for(int i=0; i<gBox.size(); i++) {
			System.out.println(gBox.get(i));
		}

	}

}

interface Eatable {}

class Fruit implements Eatable{
	public String toString() {	return "맛있는Fruit";	}
}

class Apple extends Fruit{
	public String toString() {	return "아침엔Apple";	}
}

class Grape extends Fruit{
	public String toString() {	return "달디단Grape"; }
}

class Toy {
	public String toString() {	return "Toy";	}
}

class Box<T>{
	ArrayList<T> list = new ArrayList<>();
	void add(T item) {	list.add(item);}
	T get(int i) {	return list.get(i);}
	int size() {	return list.size();}
	public String toString() {	return list.toString();}
}

class FruitBox<T extends Fruit & Eatable> extends Box<T>{}

//타입변수: Fruit클래스를 상속받고(본인 또는 자손이고) Eatable인페를 구현한 클래스
//**따로 쓰지않고 &로 같이 함!!
//사실 여기서 Fruit가 Eatable을 구현하기에 (& Eatable)을 안써도 된다.
//Box<T>를 상속받음