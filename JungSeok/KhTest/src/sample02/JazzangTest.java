package sample02;

class Jazzang{
	String sangpumName;
	int sangpumDan;
	int sangpumSu;
	long sangpumMoney;
	
	public String getSangpumName() {
		return sangpumName;
	}
	public void setSangpumName(String sangpumName) {
		this.sangpumName = sangpumName;
	}
	public int getSangpumDan() {
		return sangpumDan;
	}
	public void setSangpumDan(int sangpumDan) {
		this.sangpumDan = sangpumDan;
	}
	public int getSangpumSu() {
		return sangpumSu;
	}
	public void setSangpumSu(int sangpumSu) {
		this.sangpumSu = sangpumSu;
	}
	public long getSangpumMoney() {
		return sangpumMoney = (long)(sangpumDan*sangpumSu);
	}
}

class JazzangProcess{
	String sangpumName;
	int sangpumDan;
	int sangpumSu;
	long sangpumMoney;
	
	void sangpumProcess(Jazzang jz){
		jz.setSangpumName("�����");
		jz.setSangpumDan(5000);
		jz.setSangpumSu(2);
		
		this.sangpumName = jz.getSangpumName();
		this.sangpumDan = jz.getSangpumDan();
		this.sangpumSu = jz.getSangpumSu();
		this.sangpumMoney = jz.getSangpumMoney();
	}
	
	void sangpumDisp(){
		System.out.println("��ǰ�̸� : "+sangpumName);
		System.out.println("��ǰ�ܰ� : "+sangpumDan+"��");
		System.out.println("��ǰ���� : "+sangpumSu+"��");
		System.out.println("�Ǹűݾ� : "+sangpumMoney+"��");
	}
}

public class JazzangTest {

	public static void main(String[] args) {
		Jazzang jz = new Jazzang();
		JazzangProcess jp = new JazzangProcess();
		
		jp.sangpumProcess(jz);
		jp.sangpumDisp();

	}

}
