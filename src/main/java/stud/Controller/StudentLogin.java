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
import stud.model.Student;

/**
 * Servlet implementation class StudentLogin
 */
public class StudentLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentLogin() {
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

        StudentDao sdao = new StudentDaoImpl();
        List<Student> lst = sdao.StudentLogin(email, password);
        PrintWriter pw = response.getWriter();
        if (!lst.isEmpty()) {
            // if the login is successful, create a session and store the user's email in it
            session = request.getSession();
            session.setAttribute("email", email);
            pw.println("LOGIN SUCCESSFULLY.....");
            response.sendRedirect("StudentDashboard.jsp");
        } else {
            // if the login fails, store an error message in the request and forward it to the JSP
            request.setAttribute("error", "Invalid email or password");
            request.getRequestDispatcher("StudentLogin.jsp").forward(request, response);
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
