import java.io.File;

public class Ex8_10 {

	public static void main(String[] args) {
		try {
			File f = createfile(args[0]);	//���⼭ ���� �߻�O/X
			System.out.println(f.getName()+"������ ���������� �����Ǿ����ϴ�.");
			//FileŬ������ getName():���Ͽ� �̸��� ��ȯ. �����̸��� String���� ��ȯ
		} catch (Exception e) {
			System.out.println(e.getMessage()+" �ٽ� �Է��� �ֽʽÿ�.");
			//�Ʒ� �޼ҵ尡 ���� Exception��ü ����
		}

	}
	//������ �����ϴ� �޼ҵ�
	static File createfile(String fileName) throws Exception {
		if((fileName == null) || (fileName.equals(""))) {
			throw new Exception("�����̸��� ��ȿ���� �ʽ��ϴ�.");
			//"�����޼���"�� ��� ���ܰ�üException ���� : ���ܹ߻���Ű��
			//getMessage() = "�����޼���"
		}
		File f = new File(fileName);	
		//��¥�� ���ϻ����� �� �̷��� ��ü������. �� ���� �����̸�
		f.createNewFile();	//FileŬ������ creatNewFile()�޼ҵ�
		//���ϻ����ϴ� �޼ҵ�. boolean��ȯ�ε� ���� �����Ƿ� �޴� ���� ����
		return f;	//�� �ּ� ��ȯ
	}

}
