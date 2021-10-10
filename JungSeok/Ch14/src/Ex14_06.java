import java.io.File;
import java.util.stream.Stream;

public class Ex14_06 {

	public static void main(String[] args) {
		File[] fileArr = { new File("Ex1.java"), new File("Ex1.bak"),
				new File("Ex2.java"), new File("Ex1"),
				new File("Ex1.txt")	};
		
		Stream<File> fileStream = Stream.of(fileArr);
		Stream<String> nameStream = fileStream.map(f->f.getName());
		//***�ν��Ͻ��޼ҵ��̹Ƿ� ��������f �ʿ�
		//??????�ٵ� �Ű������� �ƹ��͵� �ȹ޴��� ()����־� ���� �ʳ�???
		nameStream.forEach(System.out::println);
		System.out.println();
		
		//**fileStream ���� ��Ʈ�� �ٽ� ����**, nameStream �ȸ���� �ٷ� �Ʒ�ó��!
		fileStream = Stream.of(fileArr);
		
		fileStream.map(File::getName)
		.filter(s -> s.indexOf('.')!=-1)	//Ȯ���� �ִ� �͸�
		.peek(s->System.out.printf("filename= %s%n", s))
		//***�ν��Ͻ�substring(int�ε���) �ε���~���� �ش��ϴ� ���ڿ� �߶󳻼� ��ȯ
		//Ȯ���ڸ� ����
		.map(s -> s.substring(s.indexOf('.')+1))
		.peek(s->System.out.printf("extensoin= %s%n", s))
		.map(String::toUpperCase)
		.distinct()	//.java�� �ΰ��ε� �ߺ����ŷ� �ϳ���!
		.forEach(System.out::println);
		
	}

}
