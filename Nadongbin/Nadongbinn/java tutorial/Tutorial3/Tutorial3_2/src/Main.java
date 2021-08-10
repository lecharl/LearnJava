
public class Main {

	public static void main(String[] args) {
		
		int a = 200;
		
		System.out.println("10진수 : " + a);
		System.out.format("8진수 : %o\n", a);
		System.out.format("16진수 : %x\n", a);
		
		String name = "Jone Doe";
		System.out.println(name);
		System.out.println(name.substring(0, 1));
		System.out.println(name.substring(3, 6));
		System.out.println(name.substring(5, 8));
		System.out.println(name.substring(0, 4));
		
	}

}
