package stud.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import stud.db.DbConnection;
import stud.model.Assignment;
import stud.model.Result;
import stud.model.Student;
import stud.model.Teacher;
import stud.model.FeePayment;


public class StudentDaoImpl implements StudentDao{

	Connection con=null;
	//Student Registration
	@Override
	public int StudentCreate(List<Student> lst) {
		int i=0;
		con=DbConnection.getDbConnection();
		try {
			for(Student s:lst) {
				PreparedStatement pstate=con.prepareStatement("insert into Student values(?,?,?,?,?,?)");
				pstate.setString(1,s.getStudId());
				pstate.setString(2,s.getStudName());
				pstate.setString(3,s.getGender());
				pstate.setString(4,s.getStudMob());
				pstate.setString(5,s.getEmail());
				pstate.setString(6,s.getPassword());


				i=pstate.executeUpdate();
				if(i>0)
				{

					System.out.println("Register save...");
				}
				else
				{
					System.out.println("Not Register...");
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		return i;
	}

	@Override
	public List<Student> StudentLogin(String email, String password) {
		List<Student> lst = new ArrayList<Student>();
		Connection con = DbConnection.getDbConnection();
		ResultSet rs = null;

		try {
			PreparedStatement pstate = con.prepareStatement("select * from Student where email=? AND password=?");
			pstate.setString(1,email);
			pstate.setString(2,password);
			rs = pstate.executeQuery();

			while (rs.next()) {
				Student sobj = new Student(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6));
				lst.add(sobj);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return lst;
	}
	
	//Teacher Registration
	@Override
	public int TeacherCreate(List<Teacher> tlst) {
		// TODO Auto-generated method stub
		int i=0;
		con=DbConnection.getDbConnection();
		try {
			for(Teacher t:tlst) {
				PreparedStatement pstate=con.prepareStatement("insert into Teacher values(?,?,?,?)");
				pstate.setString(1,t.getTechId());
				pstate.setString(2,t.getTechName());
				pstate.setString(3,t.getEmail());
				pstate.setString(4,t.getPassword());


				i=pstate.executeUpdate();
				if(i>0)
				{

					System.out.println("Register save...");
				}
				else
				{
					System.out.println("Not Register...");
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		return i;

	}

	@Override
	public List<Teacher> TeacherLogin(String email, String password) {
		// TODO Auto-generated method stub
		List<Teacher> tlst = new ArrayList<Teacher>();
		Connection con = DbConnection.getDbConnection();
		ResultSet rs = null;

		try {
			PreparedStatement pstate = con.prepareStatement("select * from Teacher where email=? AND password=?");
			pstate.setString(1,email);
			pstate.setString(2,password);
			rs = pstate.executeQuery();

			while (rs.next()) {
				Teacher tobj = new Teacher(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4));
				tlst.add(tobj);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return tlst;
	}

	//Teacher Dashboard
	@Override
	public int InsertResult(List<Result> rlst) {
		// TODO Auto-generated method stub
		int i=0;
		con=DbConnection.getDbConnection();
		try {
			for(Result r:rlst) {
				PreparedStatement pstate=con.prepareStatement("insert into Result values(?,?,?,?,?,?)");
				pstate.setString(1,r.getStudId());
				pstate.setString(2,r.getStudName());
				pstate.setString(3,r.getSub1());
				pstate.setString(4,r.getSub2());
				pstate.setString(5,r.getSub3());
				pstate.setString(6,r.getGrades());


				i=pstate.executeUpdate();
				if(i>0)
				{

					System.out.println("Result save...");
				}
				else
				{
					System.out.println("Result Not Inserted...");
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		return i;

	}

	@Override
	public List<Result> UpdateResult(String studId, String sub1, String sub2, String sub3) {
		// TODO Auto-generated method stub
		List<Result> rlst = new ArrayList<Result>();
		Connection con = DbConnection.getDbConnection();
		try {
			PreparedStatement pstate = con.prepareStatement("update Result set sub1=?,sub2=?,sub3=? where studId=?");
			pstate.setString(1,sub1);
			pstate.setString(2,sub2);
			pstate.setString(3,sub3);
			pstate.setString(4,studId);

			int j = pstate.executeUpdate();
			if (j > 0) {
				Result robj = new Result(studId,"", sub1, sub2, sub3, "");
				rlst.add(robj);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return rlst;    

	}

	@Override
	public List<Result> DeleteResult(String studId) {
		// TODO Auto-generated method stub
		int i=0;
		List<Result> rlst = new ArrayList<Result>();
		Connection con=DbConnection.getDbConnection();
		try {
			PreparedStatement pstate=con.prepareStatement("delete from Result where studId=?");
			pstate.setString(1, studId);
			i=pstate.executeUpdate();
			if(i>0)
			{
				System.out.println("Record Deleted..");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rlst;

	}

	@Override
	public List<Student> StudentDetails() {
		// TODO Auto-generated method stub
		Connection con = DbConnection.getDbConnection();
		List<Student> lst = new LinkedList<Student>();
		String str = "select * from Student";
		ResultSet rs =null;
		try {
			Statement stat = con.createStatement();
			rs = stat.executeQuery(str);

			ResultSetMetaData rsmd = rs.getMetaData();
			for (int i = 1; i <= rsmd.getColumnCount(); i++) {
				System.out.print(rsmd.getColumnName(i) + "\t");
			}
			System.out.println("\n=================================================================");

			while (rs.next()) {

				lst.add(new Student(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6)));
			}
		}catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return lst;

	}

	@Override
	public List<Result> ViewResult(String studId) {
		// TODO Auto-generated method stub
		List<Result> lst=null;
		//int i=0;
		Connection con=DbConnection.getDbConnection();
		ResultSet rs=null;

		try {
			PreparedStatement pstate=con.prepareStatement("select * from Result where studID=?");
			pstate.setString(1,studId);
			rs=pstate.executeQuery();

			if(rs.next())
			{
				Result robj=new Result(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6));
				lst=new ArrayList<Result>();
				lst.add(robj);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


		return lst;

	}

	@Override
	public int Assignment(List<Assignment> lst) {
		int i=0;
		con=DbConnection.getDbConnection();
		try {
			for(Assignment A:lst) {
				PreparedStatement pstate=con.prepareStatement("insert into Assignment values(?,?,?,?,?)");
				pstate.setString(1,A.getStudId());
				pstate.setString(2,A.getStudName());
				pstate.setString(3,A.getSub1());
				pstate.setString(4,A.getSub2());
				pstate.setString(5,A.getSub3());


				i=pstate.executeUpdate();
				if(i>0)
				{

					System.out.println("Assignment save...");
				}
				else
				{
					System.out.println("Assignment Not Inserted...");
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		return i;
	}

	@Override
	public List<Assignment> ViewAssignment() {
		Connection con = DbConnection.getDbConnection();
		List<Assignment> lst = new LinkedList<Assignment>();
		String str = "select * from Assignment";
		ResultSet rs =null;
		try {
			Statement stat = con.createStatement();
			rs = stat.executeQuery(str);

			ResultSetMetaData rsmd = rs.getMetaData();
			for (int i = 1; i <= rsmd.getColumnCount(); i++) {
				System.out.print(rsmd.getColumnName(i) + "\t");
			}
			System.out.println("\n=================================================================");

			while (rs.next()) {

				lst.add(new Assignment(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5)));
			}
		}catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return lst;
	}

	@Override
	public int FeePayment(List<FeePayment> lst) {
		int i=0;
		con=DbConnection.getDbConnection();
		try {
			for(FeePayment F:lst) {
				PreparedStatement pstate=con.prepareStatement("insert into FeePayment values(?,?,?,?)");
				pstate.setString(1,F.getStudId());
				pstate.setString(2,F.getStudName());
				pstate.setString(3,F.getCourse());
				pstate.setString(4,F.getFeeAmt());
				


				i=pstate.executeUpdate();
				if(i>0)
				{

					System.out.println("Payment Done Successfully...");
				}
				else
				{
					System.out.println("Payment Not Inserted...");
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		return i;
	}

	@Override
	public List<FeePayment> DisplayFeePayment() {
		Connection con = DbConnection.getDbConnection();
		List<FeePayment> lst = new LinkedList<FeePayment>();
		String str = "select * from FeePayment";
		ResultSet rs =null;
		try {
			Statement stat = con.createStatement();
			rs = stat.executeQuery(str);

			ResultSetMetaData rsmd = rs.getMetaData();
			for (int i = 1; i <= rsmd.getColumnCount(); i++) {
				System.out.print(rsmd.getColumnName(i) + "\t");
			}
			System.out.println("\n=================================================================");

			while (rs.next()) {

				lst.add(new FeePayment(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4)));
			}
		}catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return lst;
	}
	
	
	
	
}
