package stud.Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import stud.dao.StudentDao;
import stud.dao.StudentDaoImpl;
import stud.model.Teacher;

/**
 * Servlet implementation class TeacherLogin
 */
public class TeacherLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public TeacherLogin() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
        session.invalidate();

        String email = request.getParameter("email");
        String password = request.getParameter("password");

        StudentDao tdao = new StudentDaoImpl();
        List<Teacher> tlst = tdao.TeacherLogin(email, password);
        PrintWriter pw = response.getWriter();
        if (!tlst.isEmpty()) {
            // if the login is successful, create a session and store the user's email in it
            session = request.getSession();
            session.setAttribute("email", email);
            pw.println("LOGIN SUCCESSFULLY.....");
            response.sendRedirect("TeacherDashboard.jsp");
        } else {
            // if the login fails, store an error message in the request and forward it to the JSP
            request.setAttribute("error", "Invalid email or password");
            request.getRequestDispatcher("TeacherLogin.jsp").forward(request, response);
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
