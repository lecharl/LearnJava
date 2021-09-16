import java.util.LinkedList;
import java.util.Queue;
//import java.util.*로 한방에 해도 됨
import java.util.Stack;

public class Ex11_02 {

	public static void main(String[] args) {
		Stack st = new Stack();
		Queue q = new LinkedList();	//Queue인터페이스의 구현체 LL
		
		st.push("0");
		st.push("1");
		st.push("2");
		
		q.offer("0");
		q.offer("1");
		q.offer("2");
		
		System.out.println("== Stack ==");
		while(!st.empty()) {	//***차 있으면
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
