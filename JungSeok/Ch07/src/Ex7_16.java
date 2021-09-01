class Outer2{
	int value = 10;
	
	class Inner2{
		int value = 20;
		
		void method() {
			int value = 30;
			
			System.out.println("value = "+value);
			System.out.println("this.value = "+this.value);
			System.out.println("Outer2.this.value = "+Outer2.this.value);
		}
	}
	
}



public class Ex7_16 {

	public static void main(String[] args) {
		Outer2 o = new Outer2();
		Outer2.Inner2 i = o.new Inner2();	//ÀÌ°Å ²Ï³ª Çò°¥¸°´Ù. ¿À ÂÀ ´º!!!
		i.method();

	}

}
