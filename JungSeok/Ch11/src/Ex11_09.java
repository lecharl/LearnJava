import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex11_09 {

	public static void main(String[] args) {
		Object[] objArr = {"1", new Integer(1), "4", "2", "3", "3", "2", "4", "4"};
		//�ߺ�������� �ʱ� ������ ���� �ϳ�����! "1"�� 1�� �ٸ��� �ߺ��ƴ�
		
		Set set = new HashSet();
		
		//HashSet�� objArr�� ��ҵ��� ����
		for(int i=0; i<objArr.length; i++) {
			set.add(objArr[i]);
		}
		
		//HashSet�� ����� ��ü�� ���
		System.out.println(set);	//�̰� set.toString()�� �����ǰ�??
		
		//Iterator �̿��� ���
		Iterator it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
