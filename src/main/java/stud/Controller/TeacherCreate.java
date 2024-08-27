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
import stud.model.Teacher;

/**
 * Servlet implementation class TeacherCreate
 */
public class TeacherCreate extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public TeacherCreate() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String techId=request.getParameter("techId");
		String techName=request.getParameter("techName");
		String email=request.getParameter("email");
		String password=request.getParameter("password");

		Teacher tobj= new Teacher(techId, techName, email, password);
		List<Teacher> tlst=new ArrayList<Teacher>();
		tlst.add(tobj);

		PrintWriter pw=response.getWriter();
		StudentDao tdao=new StudentDaoImpl();
		int i=tdao.TeacherCreate(tlst);
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
