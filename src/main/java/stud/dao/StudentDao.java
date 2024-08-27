package stud.dao;

import java.util.List;

import stud.model.Result;
import stud.model.Student;
import stud.model.Teacher;
import stud.model.Assignment;
import stud.model.FeePayment;

public interface StudentDao {
	//Student
	public int StudentCreate(List<Student> lst);
	public List<Student> StudentLogin(String email,String password);

	//Teacher
	public int TeacherCreate(List<Teacher> tlst);
	public List<Teacher> TeacherLogin(String email,String password);
	
	//Teacher Dashboard
	public int InsertResult(List<Result> rlst);
	public List<Result> UpdateResult(String studId,String sub1,String sub2,String sub3);
	public List<Result> DeleteResult(String studId);
	public List<Student> StudentDetails();
	
	//Student Dashboard
	public List<Result> ViewResult(String studId);
	
	//Student Assignment Submission
	public int Assignment(List<Assignment> lst);
	public List<Assignment> ViewAssignment();
	
	//Student Fee Payment
	public int FeePayment(List<FeePayment> lst);
	public List<FeePayment> DisplayFeePayment();

}
