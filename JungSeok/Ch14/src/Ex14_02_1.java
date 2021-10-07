import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Ex14_02_1 {

	public static void main(String[] args) {
		Supplier<Integer> s = () -> (int)(Math.random()*100)+1;	//1<=x<101
		Consumer<Integer> c = i -> System.out.print(i+", ");	//���
		Predicate<Integer> p = i -> i%2==0;	//¦������ �˻�
		Function<Integer, Integer> f = i -> i/10*10;	//**���� �ڸ� ���ֱ�
		
		List<Integer> list = new ArrayList<>();
		makeRandomList(s, list);
		System.out.println(list);
		
		printEvenNum(p, c, list);
		
		List<Integer> list2 = eraseIll(f, list);
		System.out.println(list2);
		
	}
	
	//Supplier s�� �޾�(1~100 ������ �޾�) list�� �߰�
	static <T> void makeRandomList(Supplier<T> s, List<T> list) {
		for(int i=0; i<10; i++)
			list.add(s.get());
	}
	
	//list�� �޾� Predicate p�� ¦������ �˻��ϰ�, Consumer c�� ���
	static <T> void printEvenNum(Predicate<T> p, Consumer<T> c, List<T> list) {
		System.out.print("[");
		for(T i : list) {	//**list�� ����� �ϳ��ϳ��� Integer i�� �־ 
			if(p.test(i))	//i�� ¦���� true, Ȧ���� false
				c.accept(i);//¦���� Consumer ���ٽĴ�� ���
		}
		System.out.println("]");
	}
	
	//list�� ���� ũ���� �� List�� �����, Function f�� ���� �ڸ� ���ְ� �� �� List�� ����
	static <T> List<T> eraseIll(Function<T, T> f, List<T> list) {
		List<T> newList = new ArrayList<T>(list.size());	//new ArrayList<T>(ũ��)
		for(T i : list)
			newList.add(f.apply(i));	//���� �ڸ��� ���ּ� �� newList�� ����
		return newList;	//�� newList ��ȯ, [���1, ���2, ...]
		
	}
}
