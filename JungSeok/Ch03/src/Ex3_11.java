
public class Ex3_11 {

	public static void main(String[] args) {
		
		double pi = 3.141592;
		
		//소수 첫째자리에서 반올림하기->정수, 3
		long ollimPi = Math.round(pi);	//중요!! long으로 받기
		System.out.println(ollimPi);
		
		//4번째 자리에서 반올림하기, 3.142
		double shortPi = Math.round(pi * 1000) / 1000.0;
		double shortPi2 = ((int)(pi * 1000 + 0.5)) / 1000.0;
		//중요!! 1000.0으로 타입이 맞춰짐
		System.out.println(shortPi);
		System.out.println(shortPi2);
		
		//4번째 자리까지, 5번째부터 버림, 3.141
		double flPi = Math.floor(pi * 1000) / 1000.0;
		System.out.println(flPi);
		//형변환(int)해도 된다.
		
		//4번째 자리까지, 5번째에서 올림, 3.142
		double cePi = Math.ceil(pi * 1000) / 1000.0;
		System.out.println(cePi);
	}

}
