import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex14_05_1 {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		//1. ��ü�� ��Ʈ������
		Stream<Integer> intStream = list.stream();	//list�� Stream����
		intStream.forEach(System.out::print);
//		intStream.forEach(System.out::print);	//����:intStream closed
		//��Ʈ���� ��ȸ���̰�, forEach()�� ���������̹Ƿ� ����!!
		//**�ٽ� �����ؾ� �Ѵ�!!!!
		intStream = list.stream();
		intStream.forEach(System.out::print);
		System.out.println();
		
		//2. �迭�� ��Ʈ������
		//1)Stream.of(��������)
		Stream<String> strStream = Stream.of("a","b","c");
		strStream.forEach(System.out::print);
		System.out.println();
		//2)Stream.of(T t)
		Stream<String> strStream2 = Stream.of(new String[] {"a","b","c"});
		strStream2.forEach(System.out::print);
		System.out.println();
		//���� �Ʒ� ������ ���� �� 
		String[] strArr = {"a","b","c"};
		Stream<String> strStream3 = Stream.of(strArr);
		strStream3.forEach(System.out::print);
		System.out.println();
		//3)Arrays.stream(T[])
		Stream<String> strStream4 = Arrays.stream(strArr);
		strStream4.forEach(System.out::print);
		System.out.println();
		
		int[] intArr = {1,2,3,4,5};
		IntStream intStream2 = Arrays.stream(intArr);
//		intStream2.forEach(System.out::print);
//		System.out.println(intStream2.count());
//		System.out.println(intStream2.sum());
		System.out.println("average="+intStream2.average());	//�� ���������̶� ����� �ʼ�!!
		//Stream<Integer>�� �ϰ� ������
		Integer[] intArr2 = {1,2,3,4,5};
		Stream<Integer> intStream3 = Arrays.stream(intArr2);
//		intStream3.forEach(System.out::print);
		System.out.println("count="+intStream3.count());	//�̰͹ۿ� ����!!!
	}

}
