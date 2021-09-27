import java.util.ArrayList;

class Fruit2{	public String toString() {	return "Fruit";}}
class Apple2 extends Fruit2{	public String toString() {	return "Apple";}}
class Grape2 extends Fruit2{	public String toString() {	return "Grape";}}

class Juice{
	String name;
	Juice(String name){
		this.name = name + "Juice";
	}
	public String toString() {	return name;}
}

class Juicer{
	static Juice makeJuice(FruitBox2<? extends Fruit2> box) {
		String tmp="";
		for(Fruit2 f : box.getList())
			tmp += f + " ";
		return new Juice(tmp);
	}
}

public class Ex12_04 {

	public static void main(String[] args) {
		FruitBox2<Fruit2> fBox = new FruitBox2<>();
		FruitBox2<Apple2> aBox = new FruitBox2<>();
		
		fBox.add(new Fruit2());
		fBox.add(new Apple2());
		fBox.add(new Grape2());
		
		aBox.add(new Apple2());
		aBox.add(new Apple2());
		
		System.out.println("fBox: "+fBox);
		System.out.println("getList(): "+fBox.getList());
		System.out.println("size(): "+fBox.size());
		System.out.println("makeJuice(fBox): "+Juicer.makeJuice(fBox));
		System.out.println(fBox.get(0));
		System.out.println(fBox.get(1));
		System.out.println(fBox.get(2));
		
		System.out.println("aBox: "+aBox);
		System.out.println("getList(): "+aBox.getList());
		System.out.println("size(): "+aBox.size());
		System.out.println("makeJuice(fBox): "+Juicer.makeJuice(aBox));
		System.out.println(aBox.get(0));
		System.out.println(aBox.get(1));
		

	}

}

class FruitBox2<T extends Fruit2> extends Box2<T>{}

class Box2<T>{
	ArrayList<T> list = new ArrayList<>();
	void add(T item) { list.add(item);}
	T get(int i) { return list.get(i);}
	//****??? 맨아래에 있는데 왜 또만들지?? 이런식으로 할수있다 이건가???
	//아 Juicer에 사용하기 위해서 인가
	ArrayList<T> getList() { return list;}
	int size() { return list.size();}
	public String toString() { return list.toString();}
}
