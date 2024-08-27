package stud.model;

public class Teacher {
	private String techId;
	private String techName;
	private String email;
	private String password;
	public Teacher(String techId, String techName, String email, String password) {
		super();
		this.techId = techId;
		this.techName = techName;
		this.email = email;
		this.password = password;
	}
	public String getTechId() {
		return techId;
	}
	public void setTechId(String techId) {
		this.techId = techId;
	}
	public String getTechName() {
		return techName;
	}
	public void setTechName(String techName) {
		this.techName = techName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
