
public class Ex8_06 {

	public static void main(String[] args) {
		try {
			Exception e = new Exception();	//���� ��ü ����
			throw e;	//�������� ������
//			throw new Exception();	//���ٷ� ���̸�
			
		} catch (Exception e) {	//�갡 �������� ���
			System.out.println("���� �޼��� : "+e.getMessage());
			//���������� �⺻���� null
			e.printStackTrace();
		}
		System.out.println("���α׷��� ��������Ǿ���.");

	}

}
