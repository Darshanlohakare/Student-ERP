package stud.model;

public class Result {
	private String studId;
	private String studName;
	private String sub1;
	private String sub2;
	private String sub3;
	private String grades;
	
	public Result(String studId, String studName, String sub1, String sub2, String sub3, String grades) {
		super();
		this.studId = studId;
		this.studName = studName;
		this.sub1 = sub1;
		this.sub2 = sub2;
		this.sub3 = sub3;
		this.grades = grades;
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
	public String getSub1() {
		return sub1;
	}
	public void setSub1(String sub1) {
		this.sub1 = sub1;
	}
	public String getSub2() {
		return sub2;
	}
	public void setSub2(String sub2) {
		this.sub2 = sub2;
	}
	public String getSub3() {
		return sub3;
	}
	public void setSub3(String sub3) {
		this.sub3 = sub3;
	}
	public String getGrades() {
		return grades;
	}
	public void setGrades(String grades) {
		this.grades = grades;
	}
	
	
	

}
