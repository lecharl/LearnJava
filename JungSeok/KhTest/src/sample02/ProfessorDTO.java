package sample02;

public class ProfessorDTO {
	private String age;
	private String name;
	private String subject;
	//초기값을 주자***
	public ProfessorDTO() {
		this("0", "이름없음", "과목없음");
	}
	public ProfessorDTO(String age, String name, String subject) {
		this.age = age;
		this.name = name;
		this.subject = subject;
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
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}


}
