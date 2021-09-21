import java.util.HashSet;
import java.util.Iterator;

public class Ex11_12 {

	public static void main(String[] args) {
		HashSet setA = new HashSet();
		HashSet setB = new HashSet();
		HashSet setHap = new HashSet();
		HashSet setGyo = new HashSet();
		HashSet setCha = new HashSet();
		
		setA.add("1"); setA.add("2"); setA.add("3");
		setA.add("4"); setA.add("5");
		System.out.println("A = "+setA);
		
		setB.add("4"); setB.add("5"); setB.add("6");
		setB.add("7"); setB.add("8");
		System.out.println("B = "+setB);
		
		//**간단하게 메소드활용하면??
//		setA.retainAll(setB); 교집합
//		setA.removeAll(setB); 차집합
//		setA.addAll(setB);	합집합
//		System.out.println(setA);
		
		//교집합..*B의 요소 하나하나를 A와 비교하기
		//둘의 위치는 바꿔도 된당!
		Iterator it = setB.iterator();
		while(it.hasNext()) {
			Object tmp = it.next();
			if(setA.contains(tmp))//***A 기준
				setGyo.add(tmp);
		}
		System.out.println("A∩B = "+setGyo);
		
		//차집합..***A-B이면, A의 요소 하나하나를 B와 비교하기
		it = setA.iterator();//**it는 한번만!!
		while(it.hasNext()) {
			Object tmp = it.next();
			if(!setB.contains(tmp))
				setCha.add(tmp);
		}
		System.out.println("A-B = "+setCha);
		
		//합집합..***각각 넣으면 됨. 왜?? 중복허용 안하니까!!
		it = setB.iterator();
		while(it.hasNext())
			setHap.add(it.next());
		
		it = setA.iterator();
		while(it.hasNext())
			setHap.add(it.next());
		System.out.println("A∪B = "+setHap);
	}

}
