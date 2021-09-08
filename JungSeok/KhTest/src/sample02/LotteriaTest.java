package sample02;

class Lotteria{
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
//	public void setSangpumMoney(long sangpumMoney) {
//		this.sangpumMoney = sangpumMoney;
//	}
	
}

class LotteriaProcess{
	String sangpumName;
	int sangpumDan;
	int sangpumSu;
	long sangpumMoney;
	
	void sangpumProcess(Lotteria lt){
		lt.setSangpumName("햄버거");
		lt.setSangpumDan(5000);
		lt.setSangpumSu(2);
		
		this.sangpumName = lt.getSangpumName();
		this.sangpumDan = lt.getSangpumDan();
		this.sangpumSu = lt.getSangpumSu();
		this.sangpumMoney = lt.getSangpumMoney();
	}
	
	void sangpumDisp(){
		System.out.println("상품이름 : "+sangpumName);
		System.out.println("상품단가 : "+sangpumDan+"원");
		System.out.println("상품수량 : "+sangpumSu+"개");
		System.out.println("판매금액 : "+sangpumMoney+"원");
	}
}

public class LotteriaTest {

	public static void main(String[] args) {
		Lotteria lt = new Lotteria();
		LotteriaProcess lp = new LotteriaProcess();

		lp.sangpumProcess(lt);
		lp.sangpumDisp();

	}

}
