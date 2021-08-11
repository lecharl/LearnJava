class Data2 {
	int x;
}

public class Ex6_7 {

	public static void main(String[] args) {
		// 참조형 매개변수(Reference Parameter)
		
		Data2 d = new Data2();
		d.x = 10;
		System.out.println("main() x = "+d.x);  // 10
		
		change(d);
		System.out.println("AfterChange(d)");
		System.out.println("main() x = "+d.x);  // 1000
	}
	
	static void change(Data2 d) {
		d.x = 1000;
		System.out.println("change() x = "+d.x);  // 1000
	}

}
