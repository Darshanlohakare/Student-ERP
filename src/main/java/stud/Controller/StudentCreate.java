package stud.Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import stud.dao.StudentDao;
import stud.dao.StudentDaoImpl;
import stud.model.Student;

/**
 * Servlet implementation class StudentCreate
 */
public class StudentCreate extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public StudentCreate() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String studId=request.getParameter("studId");
		String studName=request.getParameter("studName");
		String gender=request.getParameter("gender");
		String studMob=request.getParameter("studMob");
		String email=request.getParameter("email");
		String password=request.getParameter("password");

		Student sobj= new Student(studId, studName, gender, studMob, email, password);
		List<Student> lst=new ArrayList<Student>();
		lst.add(sobj);

		PrintWriter pw=response.getWriter();
		StudentDao sdao=new StudentDaoImpl();
		int i=sdao.StudentCreate(lst);
		if(i>0)
		{
			pw.println("Record Inserted....");
		}
		else
		{
			pw.println("Record Not Inserted...");
		}



	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
