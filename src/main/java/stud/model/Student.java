package stud.model;
public class Student {
	private String studId;
	private String studName;
	private String gender;
	private String studMob;
	private String email;
	private String password;
	public Student(String studId, String studName, String gender, String studMob, String email, String password) {
		super();
		this.studId = studId;
		this.studName = studName;
		this.gender = gender;
		this.studMob = studMob;
		this.email = email;
		this.password = password;
	}
	public String getStudId() {
		return studId;
	}
	public void setStudId(String studId) {
		this.studId = studId;
	}
	public String getStudName() {
		return studName;
	}
	public void setStudName(String studName) {
		this.studName = studName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getStudMob() {
		return studMob;
	}
	public void setStudMob(String studMob) {
		this.studMob = studMob;
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
