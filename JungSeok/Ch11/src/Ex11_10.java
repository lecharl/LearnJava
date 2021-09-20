import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Ex11_10 {

	public static void main(String[] args) {
		Set set = new HashSet();
		
		//**set�� ũ�Ⱑ 6���� ���� ����
		for(int i=0; set.size() < 6; i++) {
			int num = (int)(Math.random()*45 + 1);
			//1<= x < 46
//			set.add(num);	����ڽ�!
			set.add(new Integer(num));
		}
		System.out.println(set);	//***����X

		//***������ �ϱ� ���ؼ� 1. set�� ��� ��Ҹ� list�� �����ؾ� �Ѵ�.
		List list = new LinkedList(set);	//LinkedList(Collection c)
		//2. �� �� list ����!
		Collections.sort(list);		//Collections.sort(List list)
		//***Arrays.sort(�迭) --- Collections.sort(list)
		//3. list ��� 
		System.out.println(list);


	}

}
