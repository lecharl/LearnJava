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
		
		//******')'이 많을 경우 EmptyStackException이 생긴다!!!
		//****예외처리
		try {
			for(int i=0; i<expression.length(); i++) {
				char c = expression.charAt(i);	//***
				if(c=='(') {
					st.push(c + "");	
					//***Stack 객체에 넣는거기에 기본형char가 아닌 String이 더 좋다?? 
					
				} else if(c==')') {
					st.pop();
				}
				
			}
			
			if(st.empty()) {
				System.out.println("괄호 쌍이 일치합니다.");
			} else {
				System.out.println("괄호 쌍이 일치하지 않습니다.");
			}
		} catch (EmptyStackException e) {
			System.out.println("EmptyStackException : 괄호 쌍이 일치하지 않습니다.");
		}

	}

}
