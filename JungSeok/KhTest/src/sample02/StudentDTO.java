package sample02;

public class StudentDTO {
	private String age;
	private String name;
	private String hakbun;
	//�ʱⰪ�� ����***
	public StudentDTO() {
		this("0", "�̸�����", "0");
	}
	public StudentDTO(String age, String name, String hakbun) {
		this.age = age;
		this.name = name;
		this.hakbun = hakbun;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHakbun() {
		return hakbun;
	}
	public void setHakbun(String hakbun) {
		this.hakbun = hakbun;
	}

}
