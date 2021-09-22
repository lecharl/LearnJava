import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Ex11_18 {

	public static void main(String[] args) {
		String[] data = { "A","K","A","K","D","K","A","K","K","K","Z","D" };
		
		HashMap map = new HashMap();
		
		for(int i=0; i<data.length; i++) {
			if(map.containsKey(data[i])) {
				int value = (int)map.get(data[i]);
				//get(Object key) : key에 대응하는 ***value반환이다***
				//**** 있으면 +1 
				map.put(data[i], value+1);
			}else {
				map.put(data[i], 1);
			}
		}
		//Set set = map.entrySet();
		Iterator it = map.entrySet().iterator();
		
		while(it.hasNext()) {
			Map.Entry e = (Map.Entry)it.next();
			int value = (int) e.getValue();
			System.out.println(e.getKey()+" : "+printBar('#', value)+" "+value);
		}

	}
	
	public static String printBar(char ch, int value) {
		char[] bar = new char[value];
		for(int i=0; i<bar.length; i++)
			bar[i] = ch;
		return new String(bar);
		//***String(char[] chArr) 라는 생성자가 있음!!!
	}

}
