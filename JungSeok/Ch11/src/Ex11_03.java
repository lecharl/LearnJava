import java.util.EmptyStackException;
import java.util.Stack;

public class Ex11_03 {

	public static void main(String[] args) {
		if(args.length !=1) {
			System.out.println("Usage:java Ex11_03 \"EXPRESSION\"");
			System.out.println("Example:java Ex11_03 \"((2+3)*1)+3\"");
			System.exit(0);
		}
		
		Stack st = new Stack();
		String expression = args[0];
		System.out.println("expression: "+expression);
		
		//******')'�� ���� ��� EmptyStackException�� �����!!!
		//****����ó��
		try {
			for(int i=0; i<expression.length(); i++) {
				char c = expression.charAt(i);	//***
				if(c=='(') {
					st.push(c + "");	
					//***Stack ��ü�� �ִ°ű⿡ �⺻��char�� �ƴ� String�� �� ����?? 
					
				} else if(c==')') {
					st.pop();
				}
				
			}
			
			if(st.empty()) {
				System.out.println("��ȣ ���� ��ġ�մϴ�.");
			} else {
				System.out.println("��ȣ ���� ��ġ���� �ʽ��ϴ�.");
			}
		} catch (EmptyStackException e) {
			System.out.println("EmptyStackException : ��ȣ ���� ��ġ���� �ʽ��ϴ�.");
		}

	}

}
