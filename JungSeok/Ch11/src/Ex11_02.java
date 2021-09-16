import java.util.LinkedList;
import java.util.Queue;
//import java.util.*�� �ѹ濡 �ص� ��
import java.util.Stack;

public class Ex11_02 {

	public static void main(String[] args) {
		Stack st = new Stack();
		Queue q = new LinkedList();	//Queue�������̽��� ����ü LL
		
		st.push("0");
		st.push("1");
		st.push("2");
		
		q.offer("0");
		q.offer("1");
		q.offer("2");
		
		System.out.println("== Stack ==");
		while(!st.empty()) {	//***�� ������
			System.out.println(st.pop());
		}
		System.out.println("st.empty() = "+st.empty());
		
		System.out.println("== Queue ==");
		while(!q.isEmpty()) {
			System.out.println(q.poll());
		}
		System.out.println("q.isEmpty() = "+q.isEmpty());

	}

}
