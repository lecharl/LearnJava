import java.util.ArrayList;

public class Ex12_03 {

	public static void main(String[] args) {
		FruitBox<Fruit> fBox = new FruitBox<>();
		FruitBox<Apple> aBox = new FruitBox<>();
		FruitBox<Grape> gBox = new FruitBox<>();
//		FruitBox<Grape> gBox = new FruitBox<Apple>();	//Ÿ�Ժ���ġ
//		FruitBox<Fruit> gBox = new FruitBox<Apple>();	//Ÿ�Ժ���ġ
//		FruitBox<Toy> tBox = new FruitBox<>();	//Toy�� FruitBox�� Ÿ�Ժ����� ����
		
		fBox.add(new Fruit());
		fBox.add(new Apple());	//������O
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
	public String toString() {	return "���ִ�Fruit";	}
}

class Apple extends Fruit{
	public String toString() {	return "��ħ��Apple";	}
}

class Grape extends Fruit{
	public String toString() {	return "�޵��Grape"; }
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

//Ÿ�Ժ���: FruitŬ������ ��ӹް�(���� �Ǵ� �ڼ��̰�) Eatable���並 ������ Ŭ����
//**���� �����ʰ� &�� ���� ��!!
//��� ���⼭ Fruit�� Eatable�� �����ϱ⿡ (& Eatable)�� �Ƚᵵ �ȴ�.
//Box<T>�� ��ӹ���