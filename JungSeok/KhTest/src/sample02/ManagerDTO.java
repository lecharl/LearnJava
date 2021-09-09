package sample02;

public class ManagerDTO {
	private String age;
	private String name;
	private String part;
	
	public ManagerDTO() {
		this("0", "이름없음", "부서없음");
	}
	public ManagerDTO(String age, String name, String part) {
		this.age = age;
		this.name = name;
		this.part = part;
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
	public String getPart() {
		return part;
	}
	public void setPart(String part) {
		this.part = part;
	}

}
