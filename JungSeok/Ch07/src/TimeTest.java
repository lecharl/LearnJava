class Time {
	private int hour;	// 0~23�� ������ �Ѵ�.-> ���� ����!!
//	private int minute;	// ���� ���� �����ϰ�
//	private int second;
	
	// public �޼ҵ带 ���� ���� ����
	// �� �Է¹���
	public void setHour(int hour) {
		if (isNotValidHour(hour)) {		// alt+shift+m
			return;
		}
		this.hour = hour;
	}
	// �Ű������� ���� hour�� ��ȿ���� Ȯ��
	// ���⼭�� ���̱� ������ private�� ����.
	private boolean isNotValidHour(int hour) {
		return hour < 0 || hour > 23;
	}
	// �Է¹��� �� �б�, ��ȯ
	public int getHour() {
		return hour;
	}
	
}


public class TimeTest {

	public static void main(String[] args) {
		// ���������� Ȱ��
		Time t = new Time();
		//t.hour = 100; <- private�̹Ƿ� ��������.
		t.setHour(20);	//false -> this.hour = 20
		System.out.println(t.getHour());
		t.setHour(100);	//true -> return
		System.out.println(t.getHour());
	}

}
