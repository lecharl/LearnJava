package kr.or.kh24;
import java.util.ArrayList; 

class Student{
	int studentID; String studentName; ArrayList subjectList; 
	public Student(int studentID, String studentName) {
		this.studentID=studentID;
		this.studentName=studentName; 
		subjectList = new ArrayList();		
	}
	
	public void addSubject(String subjectName, int scorePoint) {
		Subject subject = new Subject(); 
		subject.setSubjectName(subjectName); 
		subject.setScorePoint(scorePoint); 
		subjectList.add(subject);
	}
	
	public void showStudentInfo() { 
		int total = 0; 
		for(Subject s : subjectList) {
			total+=s.getScorePoint(); 
			System.out.println(studentName+"�л��� "+s.getSubjectName()+"������ ������ " +s.getScorePoint()+"�Դϴ�.");
		} 
		System.out.println("������ "+total+"�Դϴ�."); 
	}
}

class Subject{
	private String subjectName; 
	private int scorePoint; 
	public String getSubjectName() {
		return subjectName; 
	}
	
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName; 
	} 
	public int getScorePoint() { return scorePoint; }
	
	public void setScorePoint(int scorePoint) { this.scorePoint = scorePoint; }
}

public class StudentTest {
	public static void main(String[] args) {
		Student studentLee = new Student(1001,"Lee"); 
		Student studentKim = new Student(1002,"Kim"); 
		studentLee.addSubject("����", 100); 
		studentLee.addSubject("����", 50); 
		studentKim.addSubject("����", 70); 
		studentKim.addSubject("����", 85); 
		studentKim.addSubject("����", 100); 
		studentLee.showStudentInfo(); 
		System.out.println("==========="); 
		studentKim.showStudentInfo();
	} 
}
