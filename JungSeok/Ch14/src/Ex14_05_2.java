import java.util.Random;
import java.util.stream.IntStream;

public class Ex14_05_2 {

	public static void main(String[] args) {
		IntStream intStream = new Random().ints();	//���ѽ�Ʈ��
		intStream.limit(5).forEach(System.out::println);	//limit()�ʼ�!!
		
		IntStream intStream3 = new Random().ints(3, 10);	//3~9
		intStream3.limit(5).forEach(System.out::println);	//limit()�ʼ�!!
		
		IntStream intStream2 = new Random().ints(5);//���ѽ�Ʈ��
		intStream2.forEach(System.out::println);
		
		IntStream intStream4 = new Random().ints(5, 3, 10);	//3~9
		intStream4.forEach(System.out::println);

	}

}
