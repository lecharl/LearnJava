package sample02;

import java.util.ArrayList;

class Test{
	String subject;
	double score;
	Test(String subject, double score){
		this.subject = subject;
		this.score = score;		
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	
}


public class MyCollection {
	void test(){
		ArrayList<Test> list = new ArrayList<Test>();
		Test test1 = new Test("자바", 93.5);
		Test test2 = new Test("디비", 74.1);
		Test test3 = new Test("서버", 82.7);
		list.add(test1);
		list.add(test2);
		list.add(test3);
		
		for(int i=0; i<list.size();i++) {
			System.out.print(list.get(i).getSubject()+" ");
			System.out.println(list.get(i).getScore());
		}
	}
	public static void main(String[] args) {
		MyCollection mc = new MyCollection();
		mc.test();
	}

}
