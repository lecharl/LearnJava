
public class Ex2_12 {

	public static void main(String[] args) {
		// ����ȯ 
		System.out.println("3".charAt(0));	//����3
		//���ڿ� -> ����
		
		System.out.println(Integer.parseInt("3") + 1);	//����4
		System.out.println(Double.parseDouble("3.14"));//����3.14
		//���ڿ� -> ����
		
		System.out.println(3 + '0');	//3+48
		System.out.println('3' + '0');	//51+48
		System.out.println((char)(3 + '0'));	//51�� ���ڷ�
		//���� -> ����
		
		System.out.println('3' - '0');	//51-48	//����3
		//���� -> ����
		
		System.out.println('3' + "3");		//���ڿ�33
		System.out.println("3" + 3);		//���ڿ�33
		System.out.println("3" + "3");		//���ڿ�33
		//-> ���ڿ�

	}

}
