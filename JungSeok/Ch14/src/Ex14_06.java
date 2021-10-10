import java.io.File;
import java.util.stream.Stream;

public class Ex14_06 {

	public static void main(String[] args) {
		File[] fileArr = { new File("Ex1.java"), new File("Ex1.bak"),
				new File("Ex2.java"), new File("Ex1"),
				new File("Ex1.txt")	};
		
		Stream<File> fileStream = Stream.of(fileArr);
		Stream<String> nameStream = fileStream.map(f->f.getName());
		//***인스턴스메소드이므로 참조변수f 필요
		//??????근데 매개변수로 아무것도 안받던데 ()비워둬야 하지 않나???
		nameStream.forEach(System.out::println);
		System.out.println();
		
		//**fileStream 부터 스트림 다시 생성**, nameStream 안만들고 바로 아래처럼!
		fileStream = Stream.of(fileArr);
		
		fileStream.map(File::getName)
		.filter(s -> s.indexOf('.')!=-1)	//확장자 있는 것만
		.peek(s->System.out.printf("filename= %s%n", s))
		//***인스턴스substring(int인덱스) 인덱스~부터 해당하는 문자열 잘라내서 반환
		//확장자만 추출
		.map(s -> s.substring(s.indexOf('.')+1))
		.peek(s->System.out.printf("extensoin= %s%n", s))
		.map(String::toUpperCase)
		.distinct()	//.java가 두개인데 중복제거로 하나만!
		.forEach(System.out::println);
		
	}

}
