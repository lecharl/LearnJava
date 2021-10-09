import java.util.Comparator;
import java.util.stream.Stream;

public class Ex14_05 {

	public static void main(String[] args) {
		Stream<Student> stuStream = Stream.of(
				new Student("이자바", 3, 300),
				new Student("김자바", 1, 200),
				new Student("안자바", 2, 100),
				new Student("박자바", 2, 150),
				new Student("소자바", 1, 200),
				new Student("나자바", 3, 290),
				new Student("감자바", 3, 180)
			);
		
//		stuStream.sorted().forEach(System.out::println);	//기본정렬:총점 내림차순
		stuStream.sorted(Comparator.comparing(Student::getBan).reversed()	//반별 정렬
//		.thenComparing(Comparator.naturalOrder()))	//기본정렬(총점 내림차순)
		.thenComparing(Comparator.naturalOrder()).reversed())	//기본 반대정렬(총점 올림차순)
//		.thenComparing(Comparator.reverseOrder()))	//기본 반대정렬(총점 올림차순)
		.forEach(System.out::println);
		

	}//main

}

class Student implements Comparable<Student>{
	String name;
	int ban;
	int totalScore;
	
	public String getName() {return name;}
	public int getBan() {return ban;}
	public int getTotalScore() {return totalScore;}

	Student(String name, int ban, int totalScore) {
		this.name = name;
		this.ban = ban;
		this.totalScore = totalScore;
	}
	
	//****기본정렬을 총점 내림차순으로 한다.
	//오버라이드 필수로 해야한다!!
	@Override
	public int compareTo(Student s) {
		return s.totalScore - this.totalScore;
	}
	//***
	public String toString() {
		return String.format("[%s, %d, %d]", name, ban, totalScore);
	}
	
}
