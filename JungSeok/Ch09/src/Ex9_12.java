
public class Ex9_12 {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("01");
		StringBuffer sb2 = sb.append(23);	//'2','3' ��
		sb.append('4').append(56);	//���� StringBuffer�̱� ������ ����
		
		StringBuffer sb3 = sb.append(78);
		sb3.append(9.0);	//'9''.''0'
		
		System.out.println("sb ="+sb);
		System.out.println("sb2="+sb2);
		System.out.println("sb3="+sb3);
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		//�޼ҵ尡 �Ȱ��� ����ǰ�, �� ���� ��ü�� ����Ų��!
		
		System.out.println("sb ="+sb.deleteCharAt(10));
		System.out.println("-> "+sb.capacity());
		System.out.println("-> "+sb.length());
		System.out.println("sb ="+sb.delete(3, 6));	//3~5
		System.out.println("de-> "+sb.capacity());
		System.out.println("-> "+sb.length());
		System.out.println("sb ="+sb.insert(3, "abc"));	//index=3�� a, 4=b, 5=c
		System.out.println("in-> "+sb.capacity());
		System.out.println("-> "+sb.length());
		System.out.println("sb ="+sb.replace(6, sb.length(), "END"));
		
		System.out.println("re-> "+sb.capacity());
		System.out.println("-> "+sb.length());

	}

}
