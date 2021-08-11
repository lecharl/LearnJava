class Data1 {
	int x;
}

public class Ex6_6 {

	public static void main(String[] args) {
		// 기본형 매개변수(Primitive Parameter)
		
		Data1 d = new Data1();
		d.x = 10;
		System.out.println("main() x = "+d.x);  // 10
		
		change(d.x);
		System.out.println("AfterChange(d.x)");
		System.out.println("main() x = "+d.x);  // 10
		
	}
	
	static void change(int x) {
		x = 1000;
		System.out.println("change() x = "+x);  // 1000
	}

}
