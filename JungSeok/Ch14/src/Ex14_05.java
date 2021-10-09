import java.util.Comparator;
import java.util.stream.Stream;

public class Ex14_05 {

	public static void main(String[] args) {
		Stream<Student> stuStream = Stream.of(
				new Student("���ڹ�", 3, 300),
				new Student("���ڹ�", 1, 200),
				new Student("���ڹ�", 2, 100),
				new Student("���ڹ�", 2, 150),
				new Student("���ڹ�", 1, 200),
				new Student("���ڹ�", 3, 290),
				new Student("���ڹ�", 3, 180)
			);
		
//		stuStream.sorted().forEach(System.out::println);	//�⺻����:���� ��������
		stuStream.sorted(Comparator.comparing(Student::getBan).reversed()	//�ݺ� ����
//		.thenComparing(Comparator.naturalOrder()))	//�⺻����(���� ��������)
		.thenComparing(Comparator.naturalOrder()).reversed())	//�⺻ �ݴ�����(���� �ø�����)
//		.thenComparing(Comparator.reverseOrder()))	//�⺻ �ݴ�����(���� �ø�����)
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
	
	//****�⺻������ ���� ������������ �Ѵ�.
	//�������̵� �ʼ��� �ؾ��Ѵ�!!
	@Override
	public int compareTo(Student s) {
		return s.totalScore - this.totalScore;
	}
	//***
	public String toString() {
		return String.format("[%s, %d, %d]", name, ban, totalScore);
	}
	
}
